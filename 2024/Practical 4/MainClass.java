import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.HashSet;

public class MainClass {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MainClass <input_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = "output.txt";

        try {
            int[] initialState = readInitialState(inputFile);
            State goalState = generateGoalState();

            PriorityQueue<State> priorityQueue = new PriorityQueue<>();
            HashSet<String> visitedStates = new HashSet<>();

            State startState = new State(initialState);
            priorityQueue.add(startState);

            int moves = 0;

            while (!priorityQueue.isEmpty()) {
                State currentState = priorityQueue.poll();

                if (currentState.isGoalState(goalState)) {
                    writeSolution(currentState, outputFile);
                    System.out.println("Moves: " + moves);
                    break;
                }

                if (!visitedStates.contains(Arrays.toString(currentState.board))) {
                    visitedStates.add(Arrays.toString(currentState.board));
                    moves++;

                    for (State neighbor : currentState.generateNeighbors()) {
                        priorityQueue.add(neighbor);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] readInitialState(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yanga\\OneDrive\\Documents\\MY CODE\\Assignments\\State A.txt"))) {
            int[] initialState = new int[14];
            for (int i = 1; i <= 9; i++) {
                initialState[i] = Integer.parseInt(reader.readLine());
            }
            return initialState;
        }
    }

    private static State generateGoalState() {
        // Assuming the goal state is soldiers 1 to 9 in cells 1 to 9
        int[] goalBoard = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0};
        return new State(goalBoard);
    }

    private static void writeSolution(State state, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\yanga\\OneDrive\\Documents\\MY CODE\\Assignments\\OutputB.txt")) {
            writer.write("Heuristic Value: " + state.getHValue() + "\n");
            writer.write(Arrays.toString(state.board) + "\n");
        }
    }

}




