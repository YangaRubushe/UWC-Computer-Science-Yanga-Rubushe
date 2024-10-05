// Surname: Rubushe
// Name: Yanga 
// Year: 2023 
// Assignment: Practical 2 Term 2
// File: FlightNode.java

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class FlightNode implements Comparable<FlightNode> {
    private String registration_no;
    private Date departure_date;
    private Date arrival_date;

    public FlightNode() {}

    public FlightNode(String registration_no, String departure_date, String arrival_date) {
        this.registration_no = registration_no;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            this.departure_date = formatter.parse(departure_date);
            this.arrival_date = formatter.parse(arrival_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getRegistration_no() {
        return registration_no;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    @Override
    public String toString() {
        return "Flight registration no.: " + registration_no +
                ",\nDeparture date: " + departure_date +
                ",\nArrival date: " + arrival_date + "\n";
    }

    @Override
    public int compareTo(FlightNode o) {
        return this.arrival_date.compareTo(o.arrival_date);
    }

    public int getPriority() {
        return (int) (arrival_date.getTime() - departure_date.getTime()) / 1000;
    }
}