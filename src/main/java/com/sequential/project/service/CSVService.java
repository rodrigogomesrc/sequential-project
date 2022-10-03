package com.sequential.project.service;

import com.sequential.project.model.ExperimentResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CSVService {

    private static final String filename = "results-sequential.csv";

    private static void createFile() {
        try {
            Files.createFile(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkFile() {
        if (!Files.exists(Paths.get(filename))) {
            createFile();
            return false;
        }
        return true;
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
        boolean fileExisted = checkFile();
        if(!fileExisted) {
            String line = "Executions,TimeMillis,Category" + "\n";
            appendToCSV(line);
        }
    }
}
