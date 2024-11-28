package Time;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class TimeDifferenceBetweenTwoTimeZone {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first city time zone
        System.out.print("Enter the first city time zone (e.g., Asia/Kolkata): ");
        String city1 = scanner.nextLine();

        // Prompt user for the second city time zone
        System.out.print("Enter the second city time zone (e.g., Europe/London): ");
        String city2 = scanner.nextLine();

        try {
            // Get the current time for both cities
            ZonedDateTime timeInCity1 = ZonedDateTime.now(ZoneId.of(city1));
            ZonedDateTime timeInCity2 = ZonedDateTime.now(ZoneId.of(city2));

            // Calculate the time difference
            Duration duration = Duration.between(timeInCity1, timeInCity2);
            long hoursDifference = duration.toHours();

            // Output the time difference
            System.out.println("The time difference between " + city1 + " and " + city2 + " is: " + hoursDifference + " hours.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

