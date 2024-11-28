package Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ConvertStringToDate {
    public static void main(String[] args) {
        // Example input date string
        String inputDate = "2024/01/01";
        
        // Define the input and output formatters
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Parse the input date string
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        // Format the date into the desired output format
        String outputDate = date.format(outputFormatter);
        // Print the formatted date
        System.out.println("Output: " + outputDate);

    }
}

