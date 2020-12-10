
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.itheima.po.Electric" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>后台登录</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="icon" href="/images/favicon.ico" sizes="32x32" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="./js/jquery-1.3.2.min.js"></script>
    <script src="lib/layui/layui.js"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <script src="/layui_exts/excel.js"></script>

    <style type="text/css">
        .layui-table{
            text-align: center;
        }
        .layui-table th{
            text-align: center;
        }
    </style>
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="/findVisitor">水费信息</a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="/getWaterList" title="刷新">
        <i class="layui-icon" style="line-height:30px">刷新</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="/getWaterList" >
            <input class="layui-input" placeholder="请输入宿舍号" name="w_dormitoryid" id="w_dormitoryid">
            <input class="layui-input" placeholder="请输入宿舍楼" name="w_dormbuilding" id="w_dormbuilding">
            <input class="layui-input" placeholder="请输入缴纳月份" name="w_time" id="w_time">

            <input class="layui-input" type="hidden" name="pageIndex" value="1">
            <input class="layui-input" type="hidden" name="pageSize" value="5">
            <button class="layui-btn"  lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <xblock>
        <button id="addStudnetBtn" class="layui-btn layui-btn-normal"> <i class="layui-icon">&#xe654;</i>添加 </button>
        <span class="x-right" style="line-height:40px">共有数据：${pi.totalCount} 条</span>
    </xblock>

    <%--添加模态框--%>
    <div class="layui-row" id="test" style="display: none;">
        <div class="layui-col-md10">
            <form class="layui-form" id="addEmployeeForm">

                <div class="layui-form-item">
                    <label class="layui-form-label">缴纳金额：</label>
                    <div class="layui-input-block">
                        <input type="text" lay-verify="required" name="w_money"  class="layui-input" placeholder="请输入缴纳金额">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">宿舍编号：</label>
                    <div class="layui-input-block">
                        <input type="text"  name="w_dormitoryid"  class="layui-input" placeholder="请输入宿舍编号">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">宿舍楼：</label>
                    <div class="layui-input-block">
                        <input type="text" name="w_dormbuilding"  class="layui-input" placeholder="请输入宿舍楼">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">缴纳时间：</label>
                    <div class="layui-input-block">
                        <input type="text" name="w_time" class="layui-input" placeholder="请输入缴纳月份">
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="formDemo">提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <%--表格数据--%>
    <table class="layui-table">
        <thead>
        <tr>
            <th>ID</th>
            <th>缴纳金额</th>
            <th>宿舍编号</th>
            <th>宿舍楼</th>
            <th>月份</th>
            <th>创建时间</th>
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${pi.list}" var="water">
            <tr>
                <td>${water.w_id}</td>
                <td>${water.w_money}</td>
                <td>${water.w_dormitoryid}</td>
                <td>${water.w_dormbuilding}</td>
                <td>${water.w_time}</td>
                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${water.w_createtime}"/></td>
                <td>
                    <a title="编辑"    id= "updateEdit"    href="/findWaterById?w_id=${water.w_id}">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                    <a title="删除" onclick="member_del(this,'${water.w_id}')" href="javascript:;">
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="" >
        <input type="hidden" id="totalPageCount" value="${pi.pageTotalCount}"/>
        <c:import url="pageBtn.jsp">
            <c:param name="totalCount" value="${pi.totalCount}"/>
            <c:param name="currentPageNo" value="${pi.pageIndex}"/>
            <c:param name="totalPageCount" value="${pi.pageTotalCount}"/>
        </c:import>
    </div>
</div>
<script>

    layui.config({
        base: 'layui_exts/',
    }).extend({
        excel: 'excel',
    });

    layui.use(['jquery', 'excel','form','layer','laydate'], function(){
        var form = layui.form,
            $ = layui.jquery,
            laydate = layui.laydate;
        var excel = parent.layui.excel;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        /*添加弹出框*/
        $("#addStudnetBtn").click(function () {
            layer.open({
                type:1,
                title:"添加水费缴费记录",
                skin:"myclass",
                area:["50%"],
                anim:2,
                content:$("#test").html()
            });
            $("#addEmployeeForm")[0].reset();
            form.on('submit(formDemo)', function(data) {
                // layer.msg('aaa',{icon:1,time:3000});
                var param=data.field;
                // console.log(JSON.stringify(param));
                $.ajax({
                    url: '/addWater',
                    type: "post",
                    data:JSON.stringify(param),
                    contentType: "application/json; charset=utf-8",
                    success:function(){
                        layer.msg('添加成功', {icon: 1, time: 3000});
                        setTimeout(function () {window.location.href='/getWaterList';},2000);
                    },
                    error:function(){
                        layer.msg('添加失败',{icon:0,time:3000});
                        setTimeout(function () {window.location.href='/getWaterList';},2000);
                    }
                });
                // return false;
            });
        });




    });

    function member_del(obj,w_id){
        layer.confirm('确认要删除吗？',function(index){
            //发异步删除数据
            $.get("/delWater",{"w_id":w_id},function (data) {
                if(data =true){
                    layer.msg('删除成功!',{icon:1,time:2000});
                    setTimeout(function () {window.location.href='/getWaterList';},2000);

                }else {
                    layer.msg('删除失败!',{icon:1,time:3000});
                    setTimeout(function () {window.location.href='/getWaterList';},2000);
                }
            });
        });
    }
</script>
</body>
</html>

