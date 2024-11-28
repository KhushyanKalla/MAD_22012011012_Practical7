MAD_22012011012_Practical7
This repository contains the implementation of Practical 7 for the Mobile Application Development (MAD) course, focused on demonstrating core Android development concepts. The project utilizes Kotlin programming and follows modern Android development practices.

📁 Project Structure
1. Main Features
RecyclerView: Displays a list of Person objects with data fetched from an online API.
Coroutines: Handles network requests asynchronously.
HTTP Requests: Fetches JSON data using a custom HttpRequest helper.
Intent Handling: Demonstrates navigation between activities (MainActivity and RegisterActivity).
Edge-to-Edge Design: Implements modern window insets handling for immersive UI.
Dynamic JSON Parsing: Parses JSON data into Kotlin objects for display.
2. Activities
MainActivity:
Displays a list of Person objects in a RecyclerView.
Fetches data from a remote API using HttpRequest.
Handles button click navigation to RegisterActivity.
RegisterActivity: Placeholder activity demonstrating activity transitions.
3. API Integration
Fetches data from a public API (https://api.json-generator.com).
Utilizes kotlinx.coroutines for background processing.
4. UI Components
RecyclerView: Displays dynamic data using a custom PersonAdapter.
Buttons and Layouts: User-friendly design with edge-to-edge window insets.
5. Files and Directories
MainActivity.kt: Core logic for fetching and displaying data.
Person.kt: Data class representing the Person object.
HttpRequest.kt: Helper class for making HTTP requests.
PersonAdapter.kt: Adapter for rendering Person objects in the RecyclerView.
res/drawable: Contains the images/icons used in the project.
![Screenshot 2024-11-28 134254](https://github.com/user-attachments/assets/c65244df-8a1c-4490-87a7-317dcc359378)

![Screenshot 2024-11-28 134307](https://github.com/user-attachments/assets/b4f48a0d-7579-4e29-b544-bdfe07185b22)
![Screenshot 2024-11-28 134317](https://github.com/user-attachments/assets/62560d94-ca58-43ef-b80a-8a5304ddfa71)

