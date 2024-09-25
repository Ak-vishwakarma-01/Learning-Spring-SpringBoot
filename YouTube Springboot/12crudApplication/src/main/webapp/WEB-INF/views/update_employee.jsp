<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Employee</title>
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
            form {
                background-color: #fff;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
                max-width: 400px;
                margin: auto;
            }
            label {
                display: block;
                margin-bottom: 8px;
                font-weight: bold;
            }
            input[type="text"],
            input[type="number"] {
                width: 100%;
                padding: 10px;
                margin-bottom: 15px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            button {
                background-color: #007BFF;
                color: white;
                padding: 10px 15px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                width: 100%;
            }
            button:hover {
                background-color: #0056b3;
            }
            a {
                text-decoration: none;
                color: #007BFF;
                display: block;
                text-align: center;
                margin-top: 20px;
            }
            a:hover {
                color: #0056b3;
            }
        </style>
</head>
<body>
    <h2>Update Employee</h2>
    <form action="${pageContext.request.contextPath}/employees/update/${employee.id}" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" value="${employee.name}" required><br>

        <label for="address">Address:</label>
        <input type="text" name="address" value="${employee.address}" required><br>

        <label for="salary">Salary:</label>
        <input type="number" name="salary" value="${employee.salary}" required><br>

        <button type="submit">Update</button>
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/employees">Back to List</a>
</body>
</html>
