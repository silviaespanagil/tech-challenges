# Pokémon Challenge

- This is a Spring Boot Application with all needed dependencies included in the POM file.
- Feel free to change the project architecture or any relevant configuration. 
- You have a docker file to run a postgresDB.
- Add as many tests as you need.

### Exercise

1. **Implement REST API** to retrieve:
   - Pokémon whose name starts with `{parameter}`
   - The 3 heaviest Pokémon
   - The 3 Pokémon with more base experience  

2. **Configure** the heaviest Pokémon endpoint to avoid Spring Security.

3. **Create a SQL script** to create the necessary tables and columns in the DB to store Pokémon information.

4. **Create remaining CRUD endpoints** for Pokémon using DB entities.

### Infrastructure

The required infrastructure is already provided. All you need to do is to install [Docker Engine](https://docs.docker.com/get-docker/) and use docker-compose to start the services.

To start the services, run `docker-compose up`. Use the `-d` option to start in detached mode and run the containers in the background.

For more detailed information about docker-compose commands, refer to the official documentation: [Overview of Docker Compose](https://docs.docker.com/compose/).