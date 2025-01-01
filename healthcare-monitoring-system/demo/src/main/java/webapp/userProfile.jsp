<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h2>User Profile</h2>
    <p><strong>Name:</strong> ${name}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Phone:</strong> ${phone}</p>

    <h3>Summary (Using JSTL):</h3>
    <c:if test="${not empty name}">
        <p>Thank you for registering, <c:out value="${name}" />!</p>
    </c:if>
</body>
</html>
