package com.novianto.merpatibackend.model.flight;

public enum FlightType {
    CUP("Cup Competition"), COMPETITION("Common Competition"), TRAINING("Training"), JUNIOR_COMPETITION("Junior Competition");

    private final String title;

    FlightType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
