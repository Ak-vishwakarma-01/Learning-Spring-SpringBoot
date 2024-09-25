<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List"%>
<%@ page import="com.Crud.demo.entity.Employee"%>
<html>
<head>
    <title>Employee List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
        }
        h2 {
            color: #333;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #fff;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            color: #0056b3;
        }
        a:visited {
            color: #7a7a7a;
        }
        .add-btn {
            display: inline-block;
            margin-bottom: 15px;
            padding: 10px 15px;
            background-color: cyan;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .add-btn:hover {
            background-color: rgb(66, 245, 150);

        }
    </style>
</head>
<body>
    <h2>Employees</h2>
    <a class="add-btn" href="employees/new">Add New Employee</a>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Employee> employees = (List<Employee>) request.getAttribute("employees");
                if (employees != null) {
                    for (Employee employee : employees) {
            %>
                        <tr>
                            <td><%= employee.getId() %></td>
                            <td><%= employee.getName() %></td>
                            <td><%= employee.getAddress() %></td>
                            <td><%= employee.getSalary() %></td>
                            <td>
                                <a href="employees/update/<%= employee.getId() %>">Edit</a> |
                                <a href="employees/delete/<%= employee.getId() %>" onclick="return confirm('Are you sure?')">Delete</a>
                            </td>
                        </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
</body>
</html>
