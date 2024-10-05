# Media Management System

## Overview
This project implements a simple media management system using a Binary Search Tree (BST) to store and manage media titles, which can be either movies or TV shows. The system allows for the insertion, removal, and in-order traversal of media titles, as well as the ability to read data from a CSV file.

## Components

### 1. `BinaryNode.java`
This class represents a node in the binary search tree. Each node contains:
- `type`: A string indicating whether the media is a movie or a TV show.
- `title`: The title of the media.
- `releaseYear`: The year the media was released.
- `left`: A reference to the left child node.
- `right`: A reference to the right child node.

The class provides methods to get and set these attributes, as well as a method to print the titles in in-order traversal.

### 2. `BinarySearchTree.java`
This class implements the binary search tree itself. It provides methods to:
- Insert a new media title into the tree.
- Remove a media title from the tree.
- Print all titles in in-order traversal.
- Find a media title in the tree.

The `main` method demonstrates the functionality by inserting a few titles and printing them in order.

### 3. `QuicksortTester.java`
This class implements the Quicksort algorithm and an insertion sort algorithm. It includes:
- A method to perform the Quicksort algorithm on an array of integers.
- A method to perform insertion sort on an array of integers.
- A method to remove duplicates from an array.

The `main` method demonstrates the sorting functionality.

### 4. `DuplicateItemException.java`
This class is a placeholder for a custom exception that can be used to handle cases where duplicate items are encountered in the media management system. Currently, it does not contain any implementation.

## Usage
1. **Compile the Code**: Use the following command to compile all Java files:
   ```
   javac *.java
   ```

2. **Run the Binary Search Tree**: To test the media management functionality, run:
   ```
   java BinarySearchTree
   ```

3. **Run the Quicksort Tester**: To test the sorting functionality, run:
   ```
   java QuicksortTester
   ```

## Requirements
- Java Development Kit (JDK) installed on your machine.
- A CSV file containing media titles (if you want to implement file reading functionality).

## Future Improvements
- Implement the `DuplicateItemException` to handle duplicate media titles.
- Enhance the `BinarySearchTree` class to support additional features such as searching for media by type or release year.
- Improve error handling and input validation when reading from files.

## License
This project is licensed under the MIT License - see the LICENSE file for details.