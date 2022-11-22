package com.portfolio.coronavirustrack.models;

import lombok.Data;

@Data
public class LocationState {
    private String state;
    private String country;
    private int latestTotalCases;

}
