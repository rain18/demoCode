## 搜索模态框

``` javascript
<div class="modal fade" id="searchModal" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div
                    class="modal-content front-no-box-shadow front-no-border front-no-radius"
                    style="background-color: transparent">
                <div style="margin-bottom: 8px">
                    <!-- 搜索关键词区 -->
                    <input type="text" id="keyword" class="form-control front-search-icon input-lg front-no-radius front-no-box-shadow front-no-border" placeholder="输入文件关键字搜索" autocomplete="off">
                </div>

                <div class="panel-body" style="background-color: white">
                    <div class="container-fuild">
                        <div class="form-horizontal front-form-horizontal">
                            <div class="form-group">
                                <label class="col-md-1 control-label">年度</label>
                                <div class="col-md-11">
                                    <div class="panel panel-default front-search-panel front-no-radius front-no-box-shadow front-search-options">
                                        <div id="types" class="panel-body">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="col-md-2">
                                                        <p>开始</p>
                                                    </div>
                                                    <div class="input-group date form-datetime col-md-10" data-date="1979-09-16T05:25:07Z" data-date-format="yyyy" data-link-field="dtp_input1">
                                                        <input class="form-control" style="background-color: transparent" size="16" type="text" id="start-year" value="">
                                                        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                                        <%--<input class="form-control" placeholder="开始年度">--%>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="col-md-2">
                                                        <p>结束</p>
                                                    </div>
                                                    <div class="input-group date form-datetime col-md-10" data-date="1979-09-16T05:25:07Z" data-date-format="yyyy" data-link-field="dtp_input1">
                                                        <input class="form-control" size="16" style="background-color: transparent" type="text" id="end-year" value="" readonly>
                                                        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="form-horizontal front-form-horizontal">
                            <div class="form-group">
                                <label class="col-md-1 control-label">事件</label>
                                <div class="col-md-11">
                                    <select class="form-control col-md-6" id="event">
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="form-horizontal front-form-horizontal">
                            <div class="form-group">
                                <label class="col-md-1 control-label">部门</label>
                                <div class="col-md-11">
                                    <select class="form-control col-md-6" id="department">
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-12 text-right">
                            <!-- 按钮区 -->
                            <a class="btn btn-default" data-dismiss="modal">取消</a>
                            <a class="btn btn-primary" href="javascript:void(0)" onclick="searchFileAdvanced()">搜索</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
```
