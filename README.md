
# Healthcare Monitoring System

## Overview

The **Healthcare Monitoring System** is a web-based application aimed at simplifying healthcare management. The system offers functionalities for user registration, patient appointment booking, and doctor schedule management, making healthcare services more accessible and organized.

This project uses technologies like Java, JSP, MySQL, and Maven for dependency management. The system also provides an intuitive frontend using HTML, CSS, and JavaScript.

---

## Features

- **User Registration and Login**: Secure user login and registration with role-based access (Admin, Doctor, Patient).
- **Appointment Management**: Patients can book appointments with doctors, and doctors can manage their schedules.
- **Health Record Tracking**: Patients can view their health records, and doctors can update them.
- **Admin Panel**: Admin can manage users, appointments, and system logs.
  
---

## Technologies Used

### Frontend
- **HTML5**: For structuring the web pages.
- **CSS3**: For styling the pages and making them responsive.
- **JavaScript**: For enhancing the UI with interactive elements like form validation and modal pop-ups.

### Backend
- **Java (Servlets, JDBC)**: For server-side logic and database interaction.
- **MySQL**: For storing user and appointment data.
- **JSP (JavaServer Pages)**: For rendering dynamic content.
- **Maven**: For project management and dependencies.

---


## Installation and Setup

### Clone the Repository

```bash
git clone https://github.com/your-username/healthcare-monitoring-system.git
```

### Navigate to the Project Directory

```bash
cd healthcare-monitoring-system/demo/
```

### Set Up the Database

- Import `schema.sql` into MySQL.
- Update the database connection credentials in `DatabaseConnection.java`.

### Build the Project

Use Maven to clean and install dependencies.

```bash
mvn clean install
```

### Deploy to Tomcat

Deploy the `healthcare-monitoring-system.war` file to your Tomcat server by placing it in the `webapps/` directory.

### Run the Application

Access the application by navigating to:

```bash
http://localhost:8080/healthcare-monitoring-system
```

---

## Unit Testing

To run the unit tests for this project, you can use Maven:

```bash
mvn test
```

---

## Frontend Design

### Example HTML Code (index.jsp)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/style.css">
    <title>Healthcare Monitoring System</title>
</head>
<body>
    <header>
        <h1>Welcome to the Healthcare Monitoring System</h1>
    </header>
    <nav>
        <ul>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
        </ul>
    </nav>
    <main>
        <p>Track and manage your healthcare with ease.</p>
    </main>
</body>
</html>
```

### Example CSS Code (style.css)

```css
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f9;
    color: #333;
}

header {
    background-color: #4CAF50;
    color: white;
    text-align: center;
    padding: 1em;
}

nav ul {
    list-style: none;
    padding: 0;
    display: flex;
    justify-content: center;
    background-color: #333;
}

nav ul li {
    margin: 0 15px;
}

nav ul li a {
    color: white;
    text-decoration: none;
}

main {
    text-align: center;
    padding: 2em;
}
```

---

