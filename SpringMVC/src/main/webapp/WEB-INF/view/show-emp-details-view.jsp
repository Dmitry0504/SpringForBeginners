<%--
  Created by IntelliJ IDEA.
  Date: 31.10.2021
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Show details</title>
</head>
<body>
<h2>Dear employee, you are welcome!</h2>
<br>
<br>
<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
<a href="askDetails">Ask details</a>
</form>
</body>
</html>
