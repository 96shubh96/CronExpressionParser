package com.project.models.impl;

import com.project.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class HyphenExpression implements Expression {
    @Override
    public String getDetailedData(String str, int minVal, int maxVal) throws Exception {
        int val1;
        int val2;
        try {
            val1 = Integer.parseInt(str.split("-")[0]);
            val2 = Integer.parseInt(str.split("-")[1]);
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
        List<String> values = new ArrayList<>();
        for (int i = val1; i <= val2; i++) {
            values.add(String.valueOf(i));
        }
        return String.join(" ", values);
    }
}
