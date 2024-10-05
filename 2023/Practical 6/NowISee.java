import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NowISee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter csv file path: ");
        String filePath = scanner.nextLine();

        List<FlightNode> flightList = new ArrayList<>();
        try {
            Reader reader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(reader);

            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                FlightNode flightNode = new FlightNode(nextRecord[0], nextRecord[1], nextRecord[2]);
                flightList.add(flightNode);
            }

            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PriorityQueue<FlightNode> flightQueue = new PriorityQueue<>();
        flightQueue.addAll(flightList);

        while (!flightQueue.isEmpty()) {
            FlightNode flightNode = flightQueue.remove();
            System.out.println(flightNode.toString());
        }
    }
}