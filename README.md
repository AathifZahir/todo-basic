# To-Do List Application

This is a simple To-Do List application built with Spring Boot and MySQL, which allows users to:

- Add a task.
- Mark a task as completed.
- Delete a task.
- View the list of tasks.

## Features

- Backend: Spring Boot (Java)
- Database: MySQL
- CRUD operations for tasks

## Prerequisites

Before you can run the application, ensure you have the following installed:

- Java 17 or later
- Maven
- MySQL Server
- Postman (optional for testing APIs)

## Setup Instructions

### Step 1: Clone the repository

First, clone this repository to your local machine using Git:

```
git clone https://github.com/yourusername/todo-basic.git
cd todo-basic.git
```

### Step 2: Configure MySQL

1. Ensure MySQL is installed and running on your system.
2. Create a new database in MySQL:

```
CREATE DATABASE todo_db;
```

3. In the `src/main/resources/application.properties` file, update the database connection settings with your MySQL credentials:

```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=root
```

### Step 3: Build the application

You can build the application using Maven:

```
mvn clean install
```

This will compile the code and package it into a `.jar` file in the `target/` folder.

### Step 4: Run the application

Run the application by executing the following command:

```
mvn spring-boot:run
```

The Spring Boot application should start, and you can access it via `http://localhost:8080`.

## Testing with Postman

You can test the CRUD operations using Postman by sending HTTP requests to the following endpoints:

1. **Get all tasks** (GET):

   - URL: `http://localhost:8080/tasks`

2. **Get a task by ID** (GET):

   - URL: `http://localhost:8080/tasks/{id}`

3. **Create a new task** (POST):

   - URL: `http://localhost:8080/tasks`
   - Body (JSON):
     ```json
     {
       "title": "Buy groceries",
       "completed": false
     }
     ```

4. **Update a task** (PUT):

   - URL: `http://localhost:8080/tasks/{id}`
   - Body (JSON):
     ```json
     {
       "title": "Buy groceries and cook dinner",
       "completed": true
     }
     ```

5. **Delete a task** (DELETE):
   - URL: `http://localhost:8080/tasks/{id}`

### Example

To add a new task, send a `POST` request with a JSON body like:

```json
{
  "title": "Go to the gym",
  "completed": false
}
```

## Notes

- The application uses MySQL for storing tasks.
- If you want to test this application locally, ensure you have MySQL running and the database `todo_db` created before running the application.
- You can also modify `application.properties` to connect to a remote MySQL server if needed.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
