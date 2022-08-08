# Dog License Application

Web Application to save the Dog License Application into in-memory database H2

## Task

Create an Application for a Dog License

## Notes

Created a Spring Boot Application with a JSP page and In-Memory database H2 to persist Dog License Application information.

- Application/Artifact Name -- doglicense
- home.jsp is the UI/View for Dog License Application.
- DogLicenseController is the Controller class to default to home page when application loads and manages the API mapping to save the license application.
- DogLicenseRepo is the repository to persist Dog License Application information into Dog_License table in H2 in-memory database.
- H2 Database and Dog_License is the table to persist Application information.
- H2 Database information is configured in application.properties.


## How to Run the app

- Run the application as Spring Boot App.
- Access http://localhost:8080 for home page and fill the application form to store into H2 in-memory database.
- Access http://localhost:8080/h2-console to view the the database tables and run a query select * from dog_license to see all the persisted applications.
