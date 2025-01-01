<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>Register User</h2>
    <form action="UserServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>
