package com.sequential.project.model;

public class ExperimentResult {

    private int executions;
    private long timeMillis;
    private String category;

    public ExperimentResult(int executions, long timeMillis, String category) {
        this.executions = executions;
        this.timeMillis = timeMillis;
        this.category = category;
    }

    public int getExecutions() {
        return executions;
    }

    public void setExecutions(int executions) {
        this.executions = executions;
    }

    public long getTimeMillis() {
        return timeMillis;
    }

    public void setTimeMillis(long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ExperimentResult [category=" + category + ", executions=" + executions + ", timeMillis=" + timeMillis
                + "]";
    }
}
