# Retrofiti

Retrofiti is project that serves as an introduction to using Retrofit to connect Web Services with your Android Client.

## Project Setup

This project is built with Gradle, the [Android Gradle plugin](http://tools.android.com/tech-docs/new-build-system/user-guide). Follow the steps below to setup the project localy.

* Clone [Retrofiti](https://github.com/TheDancerCodes/Retrofiti) inside your working folder.
* Start Android Studio
* Select "Open Project" and select the generated root Project folder
* You may be prompted with "Unlinked gradle project" -> Select "Import gradle project" and select
the option to use the gradle wrapper
* You may also be prompted to change to the appropriate SDK folder for your local machine
* Once the project has compiled -> run the project!

## Important!

You need to secure your API key  without pushing to remote repository.

Here are the steps:

1. Create a file named `secrets.properties` in the root folder of the project (i.e below local.properties, app, build, gradle, README.md,etc.)
2.  Paste your API Key in secrets.properties using this format
    * `THE_MOVIE_DB_API_KEY=YOUR-API-KEY`
3. Sync the project or Rebuild.