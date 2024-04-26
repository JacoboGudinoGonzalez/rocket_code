# rocket-code technical test

Link: [GitHub-rocket_code](https://github.com/JacoboGudinoGonzalez/rocket_code.git)

Author(s): - Jacobo Gudiño 

Last updated: 2024.04

## Content

- Overview
- Architecture
- Run TaskApplication

## Overview

Monolithic application CRUD MyBatis and thymeleaf
## Architecture

  - Use Java 21 version
  - Use loombok 1.18.32 version
  - Use spring boot 3.2.5 version
  - Use mybatis 3.0.3 version
  - Use mysql 8.9.27 version
  - Use validator 3.2.5 version
  - Use JPA 3.2.5 version
  - Use thymeleaf 3.2.5 version

### Run TaskApplication

1. Import ./Docs/Dump20240426.sql

2. Run the maven command `mvn clean install` or `mvn clean install -DSkipTests` in the project path.

3. Run the maven `mvn spring-boot:run` command to start a Monolithic instance or using the tools provided by the IDE
