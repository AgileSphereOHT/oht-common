# Overseas Healthcare Service - Common Library

## Overview

This project is part of a solution for an Overseas Healthcare service commissioned by the UK Department of Health.

With an initial focus on provision for state pensioners living outside their country of origin, it will progressively provide a replacement for the existing Medical Benefits system currently being used to provide overseas healthcare support.

A key requirement of the proposed development is that it is capable of interfacing with the RINA product, developed by EESSI, which acts as the ‘middle man’ in interactions between different member states for registering foreign nationals and reimbursement of claims.

The initial development has successfully delivered a demonstration of this interface working against a deployed instance of RINA, and a front end that is in line with the S1 Request and Registration ‘happy paths' of the prototype being tested against user needs.

## Solution services

The current solution has been developed as three REST based micro services built using Spring Boot running on an embedded Tomcat web container.

    oht-frontend (**cross reference**)
    oht-database (**cross reference**)
    oht-rina-registration (**cross reference**)

There is also a common shared library containing the definitions of system domain data objects.

    oht-common (this project)

## Technologies being used across projects

- Spring MVC
- Thymeleaf
- Spring Security
- OAuth2
- JPA
- Liquibase
- PostgreSQL
- Gradle
- Lombok
- Swagger

## This project

The oht-common library primarily provides definitions of domain objects shared between the frontend and back end services.
They are defined in two packages

    uk.doh.oht.db.domain    for objects being stored in the application PostgreSQL database

    uk.doh.oht.rina.domain  for objects being transferred to/from the RINA messaging service

For the domain objects Lombok is being used to reduce the boilerplate code and keep the code clean.

## Build

Assumes local installation of gradle

From project root

    gradle clean                to clear build dir
    gradle test                 to compile and run unit tests
    gradle jar                  to build jar file
    gradle build                to compile, run tests and create jar file
    gradle publishToMavenLocal  to build and install jar in local maven repo

## License

This document is released under [CC0](LICENSE.md).

## See also

https://oh-alpha-confluence.atlassian.net/wiki/display/OHA/Setting+up+development+environment
