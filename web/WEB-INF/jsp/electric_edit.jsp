<%--
  Created by IntelliJ IDEA.
  User: 周训凯
  Date: 2019/4/24
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
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
    <form class="layui-form"  id="f_auto" action="/updateElectric" method="post" >
        <input type="hidden" value="${sessionScope.e.e_id}" name="e_id" id="e_id"/>
        <div class="layui-form-item">
            <label for="e_money" class="layui-form-label">
                <span class="f_sp">缴纳金额</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="e_money" name="e_money"
                       autocomplete="off" value="${sessionScope.e.e_money}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="e_time" class="layui-form-label">
                <span class="f_sp">缴纳月份</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="e_time" name="e_time"
                       autocomplete="off" value="${sessionScope.e.e_time}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="e_dormitoryid" class="layui-form-label">
                <span class="f_sp">缴纳宿舍编号</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="e_dormitoryid" name="e_dormitoryid"
                       autocomplete="off" value="${sessionScope.e.e_dormitoryid}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="e_dormbuilding" class="layui-form-label">
                <span class="f_sp">缴纳宿舍楼</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="e_dormbuilding" name="e_dormbuilding"
                       autocomplete="off" value="${sessionScope.e.e_dormbuilding}" class="layui-input">
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

