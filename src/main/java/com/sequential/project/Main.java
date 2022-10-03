package com.sequential.project;

import com.sequential.project.model.ExperimentResult;
import com.sequential.project.model.SequentialExperiment;
import com.sequential.project.service.CSVService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SequentialExperiment sequential = new SequentialExperiment();
        CSVService.initCSV();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de execuções: ");
            int executions = scanner.nextInt();
            System.out.println("Executando...");
            ExperimentResult result = sequential.runExperiment(executions);
            CSVService.saveResult(result);
            System.out.println("Experimento finalizado!");

            System.out.println("Digite 1 para continuar os experimentos ou qualquer outra coisa pra sair: ");
            String option = scanner.next();
            if (!option.equals("1")) {
                break;
            }
        }
    }
}