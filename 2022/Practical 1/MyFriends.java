//Author: Yanga Rubushe

import java.util.Scanner;

public class MyFriends {
    Student[] studentArray;

    static Student[] fillArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many students you want: ");
        int number = input.nextInt();
        input.nextLine();  // Consume the newline character

        Student[] students = new Student[number];
        for (int i = 0; i < number; i++) {
            students[i] = new Student();
            System.out.print("Enter student name: ");
            students[i].setStudentName(input.nextLine());
            System.out.print("Enter student number: ");
            students[i].setStudentNumber(input.nextInt());
            input.nextLine();  // Consume the newline
        }
        return students;
    }

    public static void main(String[] args) {
        Student[] students = fillArray();
        int a = students.length;

        if (a >= 12) {
            System.out.println("You... need more friends....");
        } else {
            System.out.println("Nice, diversity is good");
        }
    }
}
