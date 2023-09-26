# App Structure

## Index
1. About this app
2. Folder structure
3. Libraries
4. Architecture
5. Data repository
6. Custom views
7. Uses case
8. Screens
9. Test
10. Resources


## 1. About this app
A simple Android Project Template with the basic folder structure and some dependencies configured like Hilt.

## 2. Folder Structure
The app has the following folder structure:
```
|- data
|  |- model
|  |- repository
|- domain
|- framework
|- ui
|- utils
|- widget
```

* **data:** Contains all the data of the application. It contains two sub-folders:
    
    * **model:** Contains the local, remote and domain model objects.

    * **repository:** Contains the repositories classes. Here is the logic to transfer data between local, remote, or mock data sources.

* **domain:** Contains all the use cases.

* **framework:** Contains the configurations and managers used by the external frameworks / libraries.

* **ui:** Contains all the UI (Activity and Fragment) including the ViewModel and UIStates.

* **utils:** Contains tools to use with the app.

* **widget:** Contains the custom view that we have created.


## 3. Libraries
This app is made with the following libraries:

* **Hilt:** dependency injection

* **Coil:** image loader

* **Retrofit + Moshi:** networking

* **AndroidX lifecycle:** coroutines with lifecycle aware

* **Google Material 3:** theming


## 4. Architecture
This app is build following the MVVM architecture and repository pattern.

## 5. Data repository
I have created models and repositories for:
* **User**: represent the user logged in. We can get the user by login or register from remote.
* **Note**: represent a note written by the user. They are saved in local database, so this can be get by local datasource.

## 6. Custom View
I already added the following custom view under the widget folder:
* **StickyScrollView**: This allow us to keep a section of scrollview content sticky into the top of view while the user performs scroll.

## 7. Uses case
#### Note
* **GetNotesUseCase**: Retrieve from database a list of notes written by user.
#### User
* **GetUserUseCase**: Return a user given an email and password.

## 8. Screen
The app has the following screens:
* **Main**: Empty screen

## 9. Test
Work in progress

## 10. Resources
To build this app, I used the following tools / resources:

* Material Design 3: https://m3.material.io

* Material Symbol (icons): https://fonts.google.com/icons?icon.platform=web

* Material theme generator: https://m3.material.io/theme-builder#/custom