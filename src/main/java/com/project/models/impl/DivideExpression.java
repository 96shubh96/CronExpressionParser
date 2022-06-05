package com.project.models.impl;

import com.project.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class DivideExpression implements Expression {

    @Override
    public String getDetailedData(String str, int minVal, int maxVal) throws Exception {
        int divider;
        try {
            divider = Integer.parseInt(str.split("/")[1]);
        } catch (Exception e) {
            throw new Exception(e);
        }
        if (divider < minVal || divider > maxVal) {
            String range = String.format("[%s:%s]", minVal, maxVal);
            throw new IllegalAccessException("Value should be within range " + range);
        }
        List<String> values = new ArrayList<>();
        for (int i = minVal; i <= maxVal; i = i + divider) {
            values.add(String.valueOf(i));
        }
        return String.join(" ", values);
    }
}
