import java.util.Scanner;

public class Stud_Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No.of.subjects");
        int sub = scan.nextInt();
        int tot = 0;
        int[] marks = new int[sub];

        for (int i = 0; i < sub; i++) {
            System.out.println("Enter mark for subject" + (i + 1) + ": ");
            marks[i] = scan.nextInt();
            tot += marks[i];
        }

        System.out.println("Total marks obtained: " + tot);
        double avg = tot / sub;
        System.out.println("Percentage obtained: " + String.format("%.2f", avg) + "%");
        if (avg >= 91 && avg <= 100) {
            System.out.println("Corresponding Grade: A");
        } else if (avg >= 81 && avg <= 90) {
            System.out.println("Corresponding Grade: B");
        } else if (avg >= 71 && avg <= 80) {
            System.out.println("Corresponding Grade: C");
        } else if (avg >= 61 && avg <= 70) {
            System.out.println("Corresponding Grade: D");
        } else if (avg >= 51 && avg <= 60) {
            System.out.println("Corresponding Grade: E");
        } else {
            System.out.println("Corresponding Grade:F");
        }

    }
}