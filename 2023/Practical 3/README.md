# Contact Tracing Program

## Description
This program simulates a simple contact tracing scenario in a crèche (creche). It accepts the number of babies, and their respective arrival and departure times, and calculates how many distinct pairs of babies were in the crèche simultaneously.

## Features
- **Input:** 
  - The number of babies in the crèche.
  - Arrival and departure times for each baby (provided as space-separated integers).
- **Output:**
  - The distinct pairs of babies that were in the crèche simultaneously.
  - The total number of distinct pairs of babies present at the same time.

## Example

### Input
```
Please enter the number of babies in the creche: 3
Please enter the arrival and departure times for baby 1 (space separated): 1 5
Please enter the arrival and departure times for baby 2 (space separated): 2 6
Please enter the arrival and departure times for baby 3 (space separated): 4 8
```

### Output
```
The distinct pairs of babies who are at the creche simultaneously are: 
(1, 2)
(1, 3)
(2, 3)

The number of distinct pairs of babies at the creche simultaneously is: 3
```

## Requirements
- **Java Version**: Java 8 or higher
- **External Libraries**: None (Standard Java libraries)

## How to Run
1. **Clone the repository** (if applicable) or download the code file.
2. **Compile the program**:
    ```bash
    javac contactTracing.java
    ```
3. **Run the program**:
    ```bash
    java contactTracing
    ```

## Topics Covered
This program touches upon several key computer science concepts:
- **Arrays and ArrayLists**: The program uses `ArrayList` to store arrival and departure times.
- **Control Flow and Conditional Statements**: The program uses nested loops to evaluate overlapping time intervals.
- **Scanner for User Input**: The program uses `Scanner` for receiving inputs from the user.
- **Time Complexity**: The nested loops give the algorithm a time complexity of O(n^2).
