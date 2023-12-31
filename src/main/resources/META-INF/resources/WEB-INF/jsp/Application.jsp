
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/webjars/org.webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Add Application</title>
</head>
<body>
	<div class="container">
    <h1>Enter App Details</h1>
 <form:form method="post" autocomplete="off" modelAttribute = "application">

            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" name="name" id="name" class="form-control" required>
                
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <input name="description" id="description" class="form-control" required></input>
            </div>
  
            <div class="form-group">
                <label for="createBy">Created By:</label>
                <input type="text" name="createBy" id="createBy" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="createDate">Create Date:</label>
                <input type="date" name="createDate" id="createDate" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="lastUpdate">Last Update:</label>
                <input type="text" name="lastUpdate" id="lastUpdate" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="lastUpdateDate">Last Update Date:</label>
                <input type="date" name="lastUpdateDate" id="lastUpdateDate" class="form-control" required>
            </div>
            <br>
            <div class="form-group">
                <input type="submit" value="Submit" class="btn btn-primary">
            </div>
        </form:form>
    
    
    </div>
    <script src="https://cdn.jsdelivr.net/webjars/org.webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/webjars/org.webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>
