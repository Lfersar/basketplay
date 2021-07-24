# Basket play

It is a test where the instructions are

```text
The three-point shooting contest is an important and exciting event in any all-star weekend of any basketball league.
In this contest, each participant takes 25 shots, from 5 different spots on the court. Each shot scored gives one point for the player, except the last shot gives two points if it is scored.
Make a web application with login, then register the participants, each participant must attach an image along with metadata, the image must be stored in a temporary folder, the metadata has the following entry:
{
               "player":" Player name;# # # # #;# # # # #;# # # # #;# # # # #;# # # # #"
}
The # # # # # represent the five shots at each point; each # is 1 if the shot was scored or 0 if it was missed.
the last shot is worth 2 points if scored.
The player's name is a non-empty sequence of a maximum of 20 symbols, including only letters of the English alphabet and spaces.
No player can have the same name.
A view must be made showing the names of the players and their score, this list must be updated each time a new player enters and must be sorted in descending order of points scored.
in relation to the points scored.
If there is a tie, then sort the names in a case-insensitive lexicographical ascending order.
upload it to a repository, and submit the link for evaluation, the readme describes how to deploy the application.
```

## Prerequisites

* Install the JDK. It is suggested to use the version 1.8 or newer
* Gradle as a build tool. [See](https://gradle.org/install/)
* Node as a build tool. [See](https://nodejs.org/es/)
* It may be helpful to install an IDE (Eclipse, IntelliJ, VS Code, ...)

### Built whit

* [Gradle](https://gradle.org) - Dependency Management
* [Git](https://git-scm.com/downloads) - Software version control
* [Java](https://www.java.com/es/download/) - Programming language
* [Node](https://nodejs.org/es/)

### Author

Luisa Sarmiento - *Initial work* - [Lfersar](https://github.com/Lfersar)
