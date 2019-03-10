<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有课程列表</title>
<link href="/resources/css/common.css" rel="stylesheet">
</head>
<div><input class="add-btn" type="button" value="新增"
    onclick="addCourse()"></div>
<body>
    <div class="grid">
        <table class="grid-table">
            <thead>
               <tr>
                <th>课程ID</th>
                <th>课程名称</th>
                <th>代课老师</th>
                <th>课程说明</th>
                <th>删除</th>
                <th>查看详情</th>
               </tr>
            </thead>

            <tbody>
                <c:forEach var="course" items="${courses}">
                    <%--用EL表达式调用list对象的属性循环输出对象的各个属性值--%>
                    <tr>
                        <td>${course.id}</td>
                        <td>${course.cname}</td>
                        <td>${course.teacher}</td>
                        <td>${course.description}</td>
                        <td><input type="button" value="删除课程"
                            onclick="deleteCourse('${course.id}')"></td>
                        <td><input type="button" value="查看详情"
                            onclick="getCourseDetail('${course.id}')"></td>
                    </tr>

                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="/resources/js/course-list.js" type="text/javascript"></script>
</body>
</html>
