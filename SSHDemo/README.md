# Maven 搭建SSH架构

## 基础配置

 - 新建maven工程
    
 - pom 包管理
    
 - 资源文件配置
    
## 配置jetty运行环境
 - 在pom文件中引入jetty
 > pom中引入插件的关键是plugin
   
   >       <plugin>
   >             <groupId>org.eclipse.jetty</groupId>
   >             <artifactId>jetty-maven-plugin</artifactId>
   >             <version>9.3.10.v20160621</version>
   >       </plugin>

 - maven 工程引入 jetty 运行
 > 选择ideal右上角的配置，选择"Edit Configurations"
 
 ![Edit Configurations](/SSHDemo/imgs/maven1.png)
 
 > 选择左上角的‘+’，然后‘1’中选择 Maven，
 > 在‘2’中添上名字，此时把旁边single instance only 打上勾，
 > 在‘3’中写上运行命令‘jetty:run’
 
 ![Edit Configurations](/SSHDemo/imgs/maven2.png)
 
 > 运行时选择ideal右上工具栏的绿色三角，开始运行
 
## 配置日志环境
 > 我这里用的是log4j,感觉还是不错的,能够配置使用debug,info,error等信息，输出日志文件
 - pom.xml 文件中引入日志文件
 
           <dependency>
                <groupId>log4j</groupId>
                <artifactId>log4j</artifactId>
                <version>${log4j.version}</version>
            </dependency>
            <!-- 格式化对象，方便输出日志 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>1.1.41</version>
            </dependency>
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-api</artifactId>
                <version>${slf4j.version}</version>
            </dependency>
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
                <version>${slf4j.version}</version>
            </dependency>
 - resource中写入配置文件log4j.properties
  
 > 大家如果想更自主的配置，可以在网上搜索下log4j如何配置，可以得到更详细的回答，这里我就不说。个人觉得我这里的配置已经足够用了
         
## 引入spring的自定义拦截器
  
 - 配置
  
 > 在spring-mvc中添加拦截器代码    
    ps:mvc:mapping表示拦截的url，mvc:exclude-mapping表示不受拦截的url，注意静态资源多是不能被拦截的  
    所以如果 mvc:mapping path="/*"时，注意要剔除静态资源
  
 - 拦截器代码解析
  
 > 自定义拦截器实现HandlerInterceptorAdapter接口,主要有preHandle，postHandle，afterCompletion三种方法。
   
 > preHandle 在业务处理器处理请求之前被调用  
   如果返回false  
   从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链 
   如果返回true  
   执行下一个拦截器,直到所有的拦截器都执行完毕  
   再执行被拦截的Controller  
   然后进入拦截器链,  
   从最后一个拦截器往回执行所有的postHandle()  
   接着再从最后一个拦截器往回执行所有的afterCompletion() 
          
 > postHandle 在业务处理器处理请求执行完成后,生成视图之前执行的动作    
   可在modelAndView中加入数据，比如当前时间 
      
  > afterCompletion 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等   
          * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()      

