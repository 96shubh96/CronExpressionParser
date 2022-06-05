package com.project.models.impl;

import com.project.models.Expression;

public class UnaryInputExpression implements Expression {
    @Override
    public String getDetailedData(String str, int minVal, int maxVal) throws Exception {
        int val;
        try {
            val = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new Exception(e);
        }

        if (val < minVal || val > maxVal) {
            String range = String.format("[%s:%s]", minVal, maxVal);
            throw new IllegalAccessException("Value should be within range " + range);
        }

        return String.valueOf(val);
    }
}
