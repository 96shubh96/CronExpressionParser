package com.project.enums;

public enum TimeFieldName {
    MINUTE("minute"),
    HOUR("hour"),
    DAY_OF_MONTH("day of month"),
    MONTH("month"),
    DAY_OF_WEEK("day of week");

    private final String value;
    TimeFieldName(String name) {
        this.value = name;
    }

    public String getValue() {
        return this.value;
    }
}
