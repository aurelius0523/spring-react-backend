# Backend sub module

This project is intended to work as both a standalone Spring project that can serve React sub module from [spring-react-frontend](https://github.com/aurelius0523/spring-react-frontend) that is packaged into a webjar .

To run this on its own without the react pages, simply treat it as a common Spring project and run `mvn spring-boot:run`

To build this project as a .war file that includes both Spring and React submodules run `mvn clean install` from [spring-react-module](https://github.com/aurelius0523/spring-react-module)

It is currently still a work in progress.
