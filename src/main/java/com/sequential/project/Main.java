package com.sequential.project;

import com.sequential.project.model.ExperimentResult;
import com.sequential.project.model.SequentialExperiment;
import com.sequential.project.service.CSVService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    	final int multiplicator = 20;
    	int sceneryNumber = 0;
    	ArrayList<Integer> scenerys = new ArrayList<Integer>(List.of(10, 100, 500, 1000));
    	CSVService.initCSV();
    	SequentialExperiment sequential = new SequentialExperiment();
    	
    	System.out.println("Iniciando experimentos (Sequencial)");
    	for (int i =0; i < scenerys.size(); i++) {
    		sceneryNumber++;
    		System.out.println("cenário: " + sceneryNumber + " requisições: " + scenerys.get(i));
            for (int j = 0; j < multiplicator; j++) {
            	System.out.println("Executando...");
                ExperimentResult result = sequential.runExperiment(scenerys.get(i), sceneryNumber);
                CSVService.saveResult(result);
            }
    	}
    	System.out.println("Fim dos experimentos");
    }
}