package com.project.models.impl;

import com.project.models.Expression;

public class CommaSeparationExpression implements Expression {
    @Override
    public String getDetailedData(String str, int minVal, int maxVal) throws Exception {
        String[] split = str.split(",");
        int val1;
        int val2;
        try {
            val1 = Integer.parseInt(split[0]);
            val2 = Integer.parseInt(split[1]);
        } catch (NumberFormatException e) {
            throw new Exception(e);
        }
        if (val1 < minVal || val1 > maxVal) {
            String range = String.format("[%s:%s]", minVal, maxVal);
            throw new IllegalAccessException("Value should be within range " + range);
        }
        if (val2 < minVal || val2 > maxVal) {
            String range = String.format("[%s:%s]", minVal, maxVal);
            throw new IllegalAccessException("Value should be within range " + range);
        }
        return String.join(" ", String.valueOf(val1), String.valueOf(val2));
    }
}
