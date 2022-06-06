package com.project.models.impl;

import com.project.factories.ExpressionFactory;
import com.project.models.Expression;

import java.util.*;

public class CommaSeparationExpression implements Expression {
    @Override
    public String getDetailedData(String str, int minVal, int maxVal) throws Exception {
        String[] split = str.split(",");
        List<String> listResult;
        try {
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < split.length; i++) {
                Expression expression = new ExpressionFactory().getExpressionFromString(split[i]);
                String data = expression.getDetailedData(split[i], minVal, maxVal);
                String[] split2 = data.split(" ");
                for (int k=0;k< split2.length;k++){
                    set.add(split2[k]);
                }
            }
            listResult = new ArrayList<String>(set);
            Collections.sort(listResult);
        } catch (NumberFormatException e) {
            throw new Exception(e);
        }
        return String.join(" ", listResult);
    }

    private void validate(int i, int minVal, int maxVal) throws IllegalAccessException {
        if (i < minVal || i > maxVal) {
            String range = String.format("[%s:%s]", minVal, maxVal);
            throw new IllegalAccessException("Value should be within range " + range);
        }
    }
}
