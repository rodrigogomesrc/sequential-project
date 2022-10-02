package com.sequential.project;

import com.sequential.project.model.ExperimentResult;
import com.sequential.project.model.SequentialExperiment;

public class Main {
    public static void main(String[] args) {

        SequentialExperiment sequential = new SequentialExperiment();
        ExperimentResult result = sequential.runExperiment(10);

        System.out.println(result);

    }
}