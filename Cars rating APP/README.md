# Car Rating Application with RecyclerView in Android

## Description
This application allows users to rate cars. It uses `RecyclerView`, an essential component for efficiently displaying lists in Android applications. The app also includes animations, menus, data filtering, and third-party libraries like Glide for image handling.

## Objectives
The main objectives of this application are:
- Create a splash screen with animations.
- Implement a `RecyclerView` to display a list of cars to be rated.
- Add data filtering and circular images.
- Integrate Glide for efficient image loading.
- Implement a popup to modify the rating of each car.

## Project Setup
The project setup involved the following steps:
1. Creating packages for `adapter`, `beans`, `dao`, and `service`.
2. Creating `ListActivity` and `SplashActivity` to handle the initial app flow.

### Splash Screen
The splash screen includes several animations on the app's logo, such as rotation, scaling, translation, and fading.

### Adapter and ViewHolder
The `CarAdapter` connects data from `CarService` to the `RecyclerView`. Key methods include:
- `onCreateViewHolder()`: Inflates the layout for each item in the `RecyclerView`.
- `onBindViewHolder()`: Binds data to the views in each item.
- `getItemCount()`: Returns the number of items to be displayed in the `RecyclerView`.

## Image Loading Libraries
Several image loading libraries were compared in Android development:
1. **Glide**: Flexible, offers excellent performance, and supports GIFs and animations.
2. **Picasso**: Simple and lightweight, ideal for basic features.
3. **Fresco**: Optimized for memory management, but more complex to use.
4. **Coil**: Modern, based on Kotlin Coroutines, lightweight, and efficient.

### Justification for Choosing Glide
Glide was chosen for this project due to its flexibility, performance, and support for image transformations and animated GIFs. Glide shines as a versatile choice for most image loading needs, making it suitable for projects of all sizes, from simple apps to more complex ones.

## Application Features
- Display a list of cars with filtering options.
- Allow users to rate each car through an interactive dialog.
- Enable sharing of car information.

## Screenshots
Here are some screenshots of the application:
### 1. Splash Screen
<p align="center">
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/1.jpg" width="300" height="600"> 
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/2.jpg" width="300" height="600">
</p>

### 2. Entry Page
<p align="center">
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/3.jpg" width="300" height="600"> 
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/4.jpg" width="300" height="600">
</p>

### 3. Rating Dialog
<p align="center">
 <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/5.jpg" width="300" height="600" style="margin-right: 10px;"> 
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/6.jpg" width="300" height="600" style="margin-right: 10px;">
   <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/7.jpg" width="300" height="600">
</p>

### Searching and Sharing Options
<p align="center">
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/8.jpg" width="300" height="600"> 
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/9.jpg" width="300" height="600">
</p>

### Listing Five-Star Cars
<p align="center">
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/10.jpg" width="300" height="600"> 
  <img src="https://raw.githubusercontent.com/Mohammedaoudi/Android-Developement-TPS/refs/heads/master/Cars%20rating%20APP/ressources/11.jpg" width="300" height="600">
</p>


## Demonstration Video
A video demonstrating the application can be viewed here: 
<div align="center">
  
https://github.com/user-attachments/assets/122071a2-8a67-4439-9ec1-4fbabee29514



</div>

## Conclusion
This application provided an in-depth understanding of how `RecyclerView` works and its advantages over `ListView`. The use of third-party libraries like Glide optimized image loading. These skills are essential for developing efficient and responsive Android applications.
