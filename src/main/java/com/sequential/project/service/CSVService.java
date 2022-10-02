package com.sequential.project.service;

import com.sequential.project.model.ExperimentResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CSVService {

    private static final String filename = "./data/results-sequential.csv";

    private static void createFile() {
        try {
            Files.createFile(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkFile() {
        if (!Files.exists(Paths.get(filename))) {
            createFile();
        }
    }

    private static void appendToCSV(String line) {
        try {
            Files.write(Paths.get(filename), line.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveResult(ExperimentResult experimentResult) {
        String line = experimentResult.getExecutions() + "," + experimentResult.getTimeMillis() + "," + experimentResult.getCategory() + "\n";
        appendToCSV(line);
    }

    public static void initCSV() {
        checkFile();
        String line = "Executions,TimeMillis,Category\n";
        appendToCSV(line);
    }
}
