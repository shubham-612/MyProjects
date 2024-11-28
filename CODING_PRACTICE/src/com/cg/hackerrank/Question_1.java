package com.cg.hackerrank;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
import java.util.stream.*;
//import javax.print.DocFlavor.STRING;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Filter logs for ERROR or CRITICAL status
        List<List<String>> filteredLogs = logs.stream()
            .filter(log -> log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL"))
            .collect(Collectors.toList());

        // Sort logs by date and time using LocalDateTime for accurate comparison
        filteredLogs.sort((log1, log2) -> {
            LocalDateTime dateTime1 = LocalDateTime.parse(log1.get(0) + " " + log1.get(1), formatter);
            LocalDateTime dateTime2 = LocalDateTime.parse(log2.get(0) + " " + log2.get(1), formatter);
            return dateTime1.compareTo(dateTime2);
        });

        // Return filtered and sorted logs
        return filteredLogs;
    }
}

public class Question_1 {
    @SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int logsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> logs = new ArrayList<>();

        IntStream.range(0, logsRows).forEach(i -> {
            try {
                logs.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<String>> result = Result.extractErrorLogs(logs);

        result.stream()
            .map(
                r -> r.stream()
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}