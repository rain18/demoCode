# Maven 搭建SSM框架

## 基础配置

 - 新建maven工程
    
 - pom 包管理
    
 - 资源文件配置
 
 - 配置jetty运行环境
 
 - 配置日志输出
 
## 自动生成实体类和映射文件（mybatis generator）

 - 配置mybatisGenerator
 > 1. 配置资源文件generatorConfig.xml,插件会根据这个配置文件去生成，其中要注意几个参数，慎用。
 
             <table schema="" tableName="rule">
                 <property name="constructorBased" value="true"/>
                 <property name="domainObjectName" value="RuleEntity"/>
                 <property name="modelOnly" value="true"/>
             </table>
   上面是自动生成表对应实体类和映射文件的配置，属性'constructorBased'表示是否实体类是否有构造函数，'domainObjectName'表示实体类的名称，'modelOnly'用于配置是否为表只生成实体类,如果设置为true就不会有Mapper接口。还有很多其他属性，可以参考网上资料进行配置，慎用。
   2. 接着在pom环境引入该插件,具体代码查看我的pom文件
    
 - 运行插件
  > 如下图，只需要双击mybatis-generator那个插件即可，对大工程多个表时，还是非常方便的
  ![mybatis-generator](/SSMDemo/imgs/mybatis_generator.png)
  
 - 总结
 > 1. mybatis用起来还是非常方便，更过的是写sql语句，关注业务逻辑。其中实体类、映射文件、接口什么的基本是重复性工作，此时能有自动生成软件还是是非方便的
   2. 还要说的是慎用，当你加了数据库表时，再次运行此插件时，如果你没有注释掉之前的那张表，就会覆盖掉之前的实体类（一般自动生成实体类还是要修改下的）

## mybatis 查询分页库
 - 在pom中引入包
 >该库时从物理层面实现了分页
 
      <dependency>
          <groupId>com.github.pagehelper</groupId>
          <artifactId>pagehelper</artifactId>
          <version>5.0.0</version>
      </dependency>
      
 - 使用
 > 对该库进行了进一步的封装，得到Page这个实体类，如下调用，pageNum是第几页，pageSize是每页的个数
 
     PageHelper.startPage(pageNum, pageSize);
     List<RuleEntity> result = ruleMapper.getAllByMap(searchMap);
     return new Page<>(result);