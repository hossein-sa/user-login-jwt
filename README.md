# Spring Boot JWT Authentication with Spring Security & PostgreSQL

This is a sample application that demonstrates how to implement JWT authentication and role-based authorization using Spring Boot, Spring Security, and PostgreSQL. The application provides a user signup and login functionality and uses JSON Web Tokens (JWT) for authentication.

## Application Features

- User registration: New users can sign up by providing their username, email, and password.
- User login: Registered users can log in using their credentials.
- Token-based authentication: Upon successful login, a JWT token is generated and returned to the client. Subsequent requests to protected endpoints require this token to be included in the request headers.
- Role-based authorization: The application supports role-based access control. Each user has one or more roles assigned, which determine the operations they are authorized to perform.

## Prerequisites

To run this application, you need to have the following installed:

- Java Development Kit (JDK) 17
- Apache Maven
- PostgreSQL database

## Getting Started

Follow these steps to get the application up and running:

1. Clone the repository:
git clone https://github.com/hossein-sa/user-login-jwt.git
2. Navigate to the project directory:
cd spring-boot-jwt-authentication
3. Open the `application.properties` file located in `src/main/resources` and modify the database connection properties according to your PostgreSQL configuration.
4. Build the application using Maven:
mvn clean install
5. Run the application:
mvn spring-boot:run


The application will start running on `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- `POST /api/auth/signup`: Register a new user. Requires providing a JSON payload containing the `username`, `email`, and `password`.
- `POST /api/auth/login`: Authenticate and retrieve a JWT token.

## Technologies Used

- Spring Boot 2.7.11
- Spring Security
- Spring MVC
- Spring Data JPA
- JSON Web Tokens (JWT)
- PostgreSQL
- Java 17
- Maven

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

This application is based on the concepts and examples from various online resources and tutorials. Special thanks to the open-source community for their valuable contributions.
