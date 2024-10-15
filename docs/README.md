# Class Design and Unit Testing

## Project Initialization
To get started, create your own GitHub repository to store you code in.
Simply navigate to https://github.com/new and enter the following details:
- [ ] Owner: You (this will be your GitHub handle)
- [ ] Name: “unit-testing-demo”
- [ ] Select “Public”
- [ ] Select “Add a README file”
- [ ] For “Add .gitignore”, select “Java”
- [ ] For “Choose a license”, select “MIT”
- [ ] Click “Create repository

Once your repository is created, you will need to clone it to begin working on it.
You can clone it via the CLI (remember to replace `your-gh-handle` with your actual GitHub handle):
```shell
> git clone https://github.com/your-gh-handle/unit-testing-demo
```

Your other option is to clone the repository from the integrated development environment (IDE) of your choice.

For IntelliJ, check out the [IntelliJ Project Initialization](intellij-project-init.md) document.

For Visual Studio Code, check out the [Visual Studio Code Project Initialization](vscode-project-init.md) document.

## Create Entities Module
As the course progresses, we'll be using a framework called [Spring Framework](https://spring.io/projects/spring-framework) as a foundation for your projects.
We will go into detail about it later, but the important thing to take note is that it is a framework that assists with getting a modern Java application up and running quickly.
Spring provides a way to generate base project files that both IntelliJ and Visual Studio Code know how to work with.

To get started with this demo, we need to create an entities module.
We can use a tool provided by Spring to generate this base.
Navigate to https://start.spring.io/ and fill out the form with the following details:

- [ ] Project: Maven
- [ ] Spring Boot: 3.3.4
- [ ] Group: com.pointofsales
- [ ] Artifact: app
- [ ] Name: app
- [ ] Description: Simple point of sales application
- [ ] Package: com.pointofsales.app
- [ ] Packaging: Jar
- [ ] Java: The version you have installed on your machine

