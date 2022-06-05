package com.project.models.impl;

import com.project.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class AsteriskExpression implements Expression {
    @Override
    public String getDetailedData(String str, int minVal, int maxVal) {
        List<String> values = new ArrayList<>();
        for (int i = minVal; i <= maxVal; i++) {
            values.add(String.valueOf(i));
        }
        return String.join(" ", values);
    }
}
