package com.sequential.project.model;

import com.sequential.project.service.RequestsService;

public class SequentialExperiment  {
    public ExperimentResult runExperiment(int executions) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < executions; i++) {
            RequestsService.getString("/test.json");
        }
        long endTime = System.currentTimeMillis();
        long timeMillis = endTime - startTime;
        return new ExperimentResult(executions, timeMillis, "sequencial");
    }
}

