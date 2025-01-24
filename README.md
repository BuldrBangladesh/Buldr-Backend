# Buldr-Backend

This project is the backend for the Buldr application, built with Java and Spring Boot.

## Architecture

The backend architecture follows a modular and organized structure to ensure scalability and maintainability. The main components of the architecture include:

### Language and Framework

- **Language**: Java
- **Framework**: Spring Boot

### Directory Structure

- **Controllers**: These handle incoming HTTP requests and map them to the appropriate service methods. Each controller corresponds to a specific feature or resource, such as user management or post handling.

- **Entities**: These define the data schema and represent the database tables. Each entity class corresponds to a specific model, such as User or Post, and includes fields and annotations to map to the database.

- **Repositories**: These provide methods to interact with the database. Each repository interface extends Spring Data JPA's `JpaRepository` and corresponds to a specific entity, allowing for CRUD operations and custom queries.

- **Services**: These contain the business logic and interact with repositories to perform operations. Service classes are used by controllers to handle complex operations and ensure separation of concerns.

- **DTOs (Data Transfer Objects)**: These are used to transfer data between different layers of the application. DTOs help in encapsulating the data and ensuring that only necessary information is exposed.

- **Configurations**: These contain configuration files and classes for setting up the application. This includes security configurations, application properties, and other setup-related configurations.

- **Middlewares**: These contain reusable middleware components for tasks such as authentication, error handling, and request validation. Middleware ensures that common functionalities are handled consistently across the application.

- **Utilities**: These contain utility classes and helper functions used throughout the project. Utilities provide common functionalities such as JWT handling, email sending, and other reusable code snippets.

### Key Components

- **Authentication**:
  - Uses JWT (JSON Web Tokens) for secure authentication.
  - Provides endpoints for user registration, login, and password reset.
  - Implements email verification and account activation.

- **User Management**:
  - Supports CRUD operations for user profiles.
  - Implements role-based access control (RBAC) for different user roles.
  - Stores user data in a relational database like PostgreSQL.

- **Social Features**:
  - Provides endpoints for creating, reading, updating, and deleting posts and comments.
  - Supports real-time updates using WebSockets.
  - Implements functionalities such as liking and sharing posts.

- **Notes Management**:
  - Provides endpoints for creating, reading, updating, and deleting notes.
  - Supports rich text content for notes.
  - Stores notes in a relational database.

- **Marketplace**:
  - Provides endpoints for managing products and orders.
  - Integrates with Stripe for payment processing.
  - Supports order tracking and management functionalities.

- **Protected Routes**:
  - Uses middleware to protect routes that require authentication.
  - Ensures that only authorized users can access certain endpoints.

- **Localization**:
  - Supports multiple languages.
  - Stores user language preferences in the database.
  - Provides localized responses based on user preferences.

## Technologies Used

- **Java**: The primary programming language used for the backend development.
- **Spring Boot**: A framework for building production-ready applications with Java, providing features like dependency injection, web MVC, and more.
- **Swagger**: A tool for documenting and testing RESTful APIs.
- **PostgreSQL**: A powerful, open-source relational database system used for storing application data.
- **Hibernate**: An ORM framework used for mapping Java objects to database tables.
- **JWT (JSON Web Tokens)**: Used for secure authentication and authorization.
- **Maven**: A build automation tool used for managing project dependencies and building the application.
- **SLF4J**: A simple logging facade for Java, used with Logback for logging application events and errors.

## Getting Started

### Prerequisites

- Java 11 or higher
- PostgreSQL
- Stripe account (for payment processing)

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/yourusername/buldr-backend.git
   ```

2. Navigate to the project directory:

   ```sh
   cd buldr-backend
   ```

3. Install dependencies and build the project:

   ```sh
   ./mvnw clean install
   ```

### Configuration

1. Create an `application.properties` file in the `src/main/resources` directory and add the following environment variables:

   ```properties
   server.port=8080
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   jwt.secret=your_jwt_secret
   stripe.secret.key=your_stripe_secret_key
   ```

### Running the Application

1. Start the server:

   ```sh
   ./mvnw spring-boot:run
   ```

2. The server will be running at `http://localhost:8080`.

## API Documentation

The API documentation is available at `http://localhost:8080/swagger-ui.html` when the server is running.

## Learn More

To learn more about Java and Spring Boot, check out the following resources:

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
