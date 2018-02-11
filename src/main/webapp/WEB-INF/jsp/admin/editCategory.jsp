<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>Edit Category</title>

<script>
    $(function(){

        $("#editForm").submit(function(){
            if(!checkEmpty("name","Name"))
                return false;

            return true;
        });
    });

</script>

<div class="workingArea">

    <ol class="breadcrumb">
        <li><a href="admin_category_list">All Catogories</a></li>
        <li class="active">Edit Category</li>
    </ol>

    <div class="panel panel-default editDiv">
        <div class="panel-heading">Edit Category</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="admin_category_update" enctype="multipart/form-data">
                <table class="editTable">
                    <tr>
                        <td>Name</td>
                        <td><input id="name" name="name" value="${c.name}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Image</td>
                        <td>
                            <input id="categoryPic" accept="image/*" type="file" name="image" />
                        </td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${c.id}">
                            <button type="submit" class="a-button a-button-primary">Submit</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>