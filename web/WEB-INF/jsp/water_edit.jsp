
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>修改记录</title>
    <link rel="icon" href="/images/favicon.ico" sizes="32x32" />
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <link rel="stylesheet" href="/css/pg_btn.css">
    <script type="text/javascript" src="./js/jquery-1.3.2.min.js"></script>
    <script src="lib/layui/layui.js"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

</head>

<body>

<div class="x-body">
    <form class="layui-form"  id="f_auto" action="/updateWater" method="post" >
        <input type="hidden" value="${sessionScope.w.w_id}" name="w_id" id="w_id"/>
        <div class="layui-form-item">
            <label for="w_money" class="layui-form-label">
                <span class="f_sp">缴纳金额</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="w_money" name="w_money"
                       autocomplete="off" value="${sessionScope.w.w_money}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="w_time" class="layui-form-label">
                <span class="f_sp">缴纳月份</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="w_time" name="w_time"
                       autocomplete="off" value="${sessionScope.w.w_time}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="w_dormitoryid" class="layui-form-label">
                <span class="f_sp">缴纳宿舍编号</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="w_dormitoryid" name="w_dormitoryid"
                       autocomplete="off" value="${sessionScope.w.w_dormitoryid}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="w_dormbuilding" class="layui-form-label">
                <span class="f_sp">缴纳宿舍楼</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="w_dormbuilding" name="w_dormbuilding"
                       autocomplete="off" value="${sessionScope.w.w_dormbuilding}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" id="btn_xg">
            <button  class="layui-btn" id="btn_on"  lay-submit="" lay-filter="updateClass">
                修改
            </button>
        </div>
    </form>
</div>

<script>

    $('#create_time').datetimepicker();
</script>
</body>
</html>

