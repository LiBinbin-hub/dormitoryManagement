
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>修改信息</title>
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
    <form class="layui-form"  id="f_auto" action="/updateVisitor" method="post" >
        <input type="hidden" value="${sessionScope.v.v_id}" name="v_id" id="v_id"/>
        <div class="layui-form-item">
            <label for="v_name" class="layui-form-label">
                <span class="f_sp">访问人员姓名</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="v_name" name="v_name"
                       autocomplete="off" value="${sessionScope.v.v_name}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="v_phone" class="layui-form-label">
                <span class="f_sp">访问人员电话</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="v_phone" name="v_phone"
                       autocomplete="off" value="${sessionScope.v.v_phone}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="v_dormbuilding" class="layui-form-label">
                <span class="f_sp">访问宿舍楼</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="v_dormbuilding" name="v_dormbuilding"
                       autocomplete="off" value="${sessionScope.v.v_dormbuilding}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="v_dormitoryid" class="layui-form-label">
                <span class="f_sp">访问宿舍编号</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="v_dormitoryid" name="v_dormitoryid"
                       autocomplete="off" value="${sessionScope.v.v_dormitoryid}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="create_time" class="layui-form-label">
                <span class="f_sp">访问时间</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="create_time" name="create_time"
                       autocomplete="off" value="${sessionScope.v.create_time}" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="leave_time" class="layui-form-label">
                <span class="f_sp">离开时间</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="leave_time" name="leave_time"
                       autocomplete="off" value="${sessionScope.v.leave_time}" class="layui-input">
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

