package com.travelApplication.demo.enums;

public enum ContinentName {
    AFRICA("Africa"),
    ASIA("Asia");

    private final String displayName;

    ContinentName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
