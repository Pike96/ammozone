<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){ // Check empty for add

        $("#addForm").submit(function(){
            if(!checkEmpty("name","Name"))
                return false;
            if(!checkEmpty("categoryPic","Image"))
                return false;
            return true;
        });
    });

</script>

<title>Categories</title>

<div class="workingArea">
    <h1 class="label label-info" >Categories</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>Images</th>
                <th>Name</th>
                <th>Properties</th>
                <th>Products</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cs}" var="c">

                <tr>
                    <td>${c.id}</td>
                    <td><img height="40px" src="img/category/${c.id}.jpg"></td>
                    <td>${c.name}</td>

                    <td><a href="admin_property_list?cid=${c.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a href="admin_product_list?cid=${c.id}"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
                    <td><a href="admin_category_edit?id=${c.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a deleteLink="true" href="admin_category_delete?id=${c.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-default addDiv">
        <div class="panel-heading">New Category</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_category_add" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>Name</td>
                        <td><input id="name" name="name" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Image</td>
                        <td>
                            <input id="categoryPic" name="image" accept="image/*" type="file"/>
                        </td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <br>
                            <button type="submit" class="a-button a-button-primary">Submit</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>

<%@include file="../include/admin/adminFooter.jsp"%>