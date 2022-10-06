package com.sequential.project.model;

public class ExperimentResult {

    private int executions;
    private long timeMillis;
    private String category;
    private int scenery;

    public ExperimentResult(int executions, long timeMillis, String category, int scenery) {
        this.executions = executions;
        this.timeMillis = timeMillis;
        this.category = category;
        this.scenery = scenery;
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
    public int getScenery() {
		return scenery;
	}

	public void setScenery(int scenery) {
		this.scenery = scenery;
	}

    @Override
    public String toString() {
        return "ExperimentResult [category=" + category + ", executions=" + executions + ", timeMillis=" + timeMillis
                + "]";
    }

	
}
