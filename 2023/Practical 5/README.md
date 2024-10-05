# Playlist Management System

This project implements a simple playlist management system using Java. The system allows users to create a playlist, add tracks, display tracks, search for specific tracks, and delete tracks from the playlist.

## File Descriptions

### 1. `Track.java`
This file defines the `Track` class, which represents a music track. It includes attributes such as track ID, title, artist, album, and duration (in minutes and seconds). The class also provides getter and setter methods for each attribute, as well as a `toString` method for displaying track information.

### 2. `Playlist.java`
The `Playlist` class is defined in this file. It manages a collection of `Track` objects. Key functionalities include:
- Inserting new tracks into the playlist.
- Searching for tracks by title.
- Deleting tracks from the playlist.
- Displaying all tracks in ascending order.
- Calculating the height of the playlist (used for balancing purposes).

### 3. `PlayTester.java`
This file contains the `PlayTester` class, which serves as a test driver for the `Playlist` class. It demonstrates how to create a playlist, insert tracks, display them, search for a specific track, and delete a track.

### 4. `Main.java`
The `Main` class is another test driver for the playlist system. It allows users to build a playlist by inserting multiple tracks, displaying the playlist, and performing various operations such as deleting tracks and checking the size and height of the playlist.

### 5. `playtest.java`
This file contains a simple test program that creates a playlist, inserts tracks, displays the playlist, deletes a specific track, and performs search operations for specific tracks.

## Usage
To run the program, compile the Java files and execute the `Main` class. The program will guide you through creating and managing a playlist.

## Requirements
- Java Development Kit (JDK) 8 or higher

## Author
- Yanga Rubushe