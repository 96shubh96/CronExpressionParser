package com.project.models;

import com.project.enums.TimeFieldName;
import com.project.factories.ExpressionFactory;
import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public abstract class TimeField {
    private final TimeFieldName name;
    private final int minVal;
    private final int maxVal;
    private final String str;
    private final Expression expression;
    private final ExpressionFactory expressionFactory = new ExpressionFactory();

    public TimeField(int minVal, int maxVal, String str, TimeFieldName name) {
        this.minVal = minVal;
        this.maxVal = maxVal;
        this.str = str;
        this.name = name;
        this.expression = expressionFactory.getExpressionFromString(str);
    }

    @SneakyThrows
    public String getInfo() {
        String info;
        try{
            info = String.join(" ", name.getValue(), expression.getDetailedData(str, minVal, maxVal));
        } catch (Exception e) {
            throw new Exception(String.format("Error in parsing %s field: %s", name.name(), e.getMessage()));
        }
        return info;
    }
}
