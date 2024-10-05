// Authors Surname: Rubushe
// Authors Name: Yanga
// Stident No. : 4142599
// File Description: "NineSoldiers" reads an initial state from "inputD.txt," performs Best-First Search with a heuristic, and outputs the sequence of expanded nodes and the solution state to "OutputB.txt," displaying the number of moves taken to reach the goal state. It uses a parameterized input file, output file, and initial moves to provide flexibility for testing different scenarios.
// CSC311 2024 AI Practical

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class NineSoldiers {
    public static void main(String[] args) {
        try {
            // Read the start state from a file
            Scanner scanner = new Scanner(new File("inputD.txt"));
            int[] initialBoard = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            scanner.close();

            // Initialize the priority queue with the start state
            PriorityQueue<State> frontier = new PriorityQueue<>();
            State initialState = new State(initialBoard);
            frontier.offer(initialState);

            // Initialize the set to store explored states
            Set<List<Integer>> explored = new HashSet<>();

            // Open output file
            PrintStream output = new PrintStream(new FileOutputStream("OutputB.txt"));

            int moves = 2;
            boolean goalFound = false;
            while (!frontier.isEmpty()) {
                State current = frontier.poll();
                if (current.getHValue() == 0) {
                    // Goal state found
                    goalFound = true;
                    current.printState(System.out);
                    output.println("h=" + current.getHValue());
                    printBoard(current.getBoard(), output);
                    System.out.println("Goal state reached in " + moves + " moves.");
                    output.println("Goal state reached in " + moves + " moves.");
                    break;
                }

                moves++;
                explored.add(Arrays.stream(current.getBoard()).boxed().collect(Collectors.toList()));
                output.println("h=" + current.getHValue());
                printBoard(current.getBoard(), output);

                List<State> children = current.generateChildStates();
                for (State child : children) {
                    if (!explored.contains(Arrays.stream(child.getBoard()).boxed().collect(Collectors.toList()))) {
                        frontier.offer(child);
                    }
                }
            }

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printBoard(int[] board, PrintStream out) {
        for (int i = 1; i < board.length; i++) {
            out.print(board[i] + " ");
        }
        out.println();
    }
}