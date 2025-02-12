# To-Do List Application

## Overview

This is a simple To-Do List application built with Spring Boot and MySQL, allowing users to:

- Add a task
- Mark a task as completed
- Delete a task
- View the list of tasks

## Features

- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **CRUD operations** for managing tasks
- **RESTful APIs** for task management

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 17 or later
- Maven
- MySQL Server
- Postman (optional for API testing)

## Setup Instructions

### Step 1: Clone the Repository

First, clone this repository to your local machine using Git:

```sh
git clone https://github.com/yourusername/todo-basic.git
cd todo-basic
```

### Step 2: Configure MySQL

Ensure MySQL is installed and running on your system.
Create a new database in MySQL:

```sql
CREATE DATABASE todo_db;
```

In the `src/main/resources/application.properties` file, update the database connection settings with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=root
```

### Step 3: Build the Application

You can build the application using Maven:

```sh
mvn clean install
```

### Step 4: Run the Application

Start the application using the following command:

```sh
mvn spring-boot:run
```

### Step 5: Test the API Endpoints

You can use Postman or `curl` to test the API endpoints.

#### List all tasks

```sh
GET http://localhost:8080/tasks
```

#### Get a task by ID

```sh
GET http://localhost:8080/tasks/{id}
```

#### Create a new task

```sh
POST http://localhost:8080/tasks
Content-Type: application/json

{
  "title": "New Task",
  "completed": false
}
```

#### Update task status

```sh
PATCH http://localhost:8080/tasks/{id}/status
Content-Type: application/json

{
  "completed": true
}
```

#### Delete a task

```sh
DELETE http://localhost:8080/tasks/{id}
```

## Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM for database interaction
- **MySQL** - Relational database
- **Lombok** - Reduces boilerplate code in Java
- **Maven** - Build automation tool

## License

This project is licensed under the MIT License.

## Author

[Your Name](https://github.com/yourusername)
