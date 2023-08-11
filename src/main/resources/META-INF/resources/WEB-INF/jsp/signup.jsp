<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>LOGIN</title>
<style><%@include file="/WEB-INF/view/style/style.css"%></style>
</head>
<body>
    <!-- Header -->
    <!-- Component Body -->
    <div class="container">
    <div class="title">
            <h1>Sample Application Management System</h1>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="card rounded">
                    <form class="box" autocomplete="off" method="post"  >
                        <h1>SIGN UP</h1>
                        <div>
                    	 <pre>${successmessage}</pre>
                        <pre>${failuremessage}</pre>
                        </div>
                        <div class="block">
                            <label for="username">Username:</label>
                            <input type="text" name="username" placeholder="Username" autocomplete="off" required>
                        </div>
                        <div class="block">
                            <label for="password">Password:</label>
                            <input type="password" name="password" placeholder="Password" autocomplete="off" required>
                        </div>
                        <input type="submit" value="signup">
                        <div class="links">
                            <a href="/login">back to login</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
