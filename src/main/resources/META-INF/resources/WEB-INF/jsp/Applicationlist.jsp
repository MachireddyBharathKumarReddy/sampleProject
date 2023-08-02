
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/webjars/org.webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Application List</title>
</head>
<body>
	<div class="container">
    <h1>Application list</h1>
    <table class=table>
        <tr>
            <th>Application ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created By</th>
            <th>Create Date</th>
            <th>Last Update</th>
            <th>Last Update Date</th>
        </tr>
        <c:forEach items="${getAllApplications}" var="app">
            <tr>
                <td>${app.applicationId}</td>
                <td>${app.name}</td>
                <td>${app.description}</td>
                <td>${app.createBy}</td>
                <td>${app.createDate}</td>
                <td>${app.lastUpdate}</td>
                <td>${app.lastUpdateDate}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="add" class="btn btn-success">Add</a>
    </div>
    <script src="https://cdn.jsdelivr.net/webjars/org.webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/webjars/org.webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>
