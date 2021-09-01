# login
- developed using Spring, a single API endpoint http://localhost:8080/login to a login page which takes email and password to authenticate user.
  Email=ss@gmail.com
  Password=abc123ABC
- Use the queries.sql to create tables "auth_role", "auth_user", "auth_user_role" in mysql database and execute insert statements to populate few hardcode data.
- You will need to provide the username and password of your local mysql DB in the application.properties file present in src/main/resources/, this is required to query data from mysql database.
- One incorrect credentials, the Endpoint emits incorrect email or password credentials.
- One successful login, home page is displayed.
