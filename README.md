# RentalSearch
Rental Search - Android Application

High Level Requirements:
1. Application for Phone/Tablets with 4 screens
2. Screen 1 - Get Region as input
3. Screen 2 - Get Number of Rooms as input
4. Screen 3 - Get Rent Per Week as input
5. Screen 4 - Show search results

Use of open source libraries are allowed. 
Design and implementations are open to engineering/dev teams.
Assume standard Non-Functional requirements 
    * No ANRs, 
    * No config change crashes
    * Handle connectivity errors
    * Be good to Doze/Strict Modes

Objective:
* Demonstrate how to use MVVM with Jetpack Libraries - ViewModel, Navigation, Data Binding, Hilt 
* Use Clean Architecture to demonstrate Testability and Separation of Concerns
* Note: Excuse the UI/UX - The focus is only on Clean Architecutre

Change Log:
1. Initial commit with auto-generated code
2. Added desugaring library to compile against Java 11
3. Added Logging - logback-android
4. Changed source library src/main/kotlin
5. Added presentation module for ViewModels
6. Added fragments for other search inputs and results
7. Added Navigation library with safeargs
8. Enabled click listener for "Next" button for navigation
9. Updated ReadMe.txt
10. ViewModel is now shared
11. Added other modules with respective dependencies
12. Enabled Up navigation

TODO:
1. Use View/Data binding and update layouts 
2. Use RecyclerView with dummy data for search results
3. Use Retrofit to get dummy data via network
4. Use Room to save network / dummy data
5. Use Coroutines to get data from room and update with fresh network calls

Nice to have:
1. Option to save/favorite search queries
2. Display favorite queries in first screen   
3. Background fetching for favorite queries via WorkManager
4. Notify user for changes in favorite query search results
5. Use Splash API 

