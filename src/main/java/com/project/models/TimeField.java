package com.project.models;

import com.project.enums.TimeFieldName;
import com.project.factories.ExpressionFactory;
import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public abstract class TimeField {
    public static final int TOTAL_SPACES = 14;
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
        int remainingSpaces = TOTAL_SPACES - name.getValue().length();
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < remainingSpaces; i++) {
            spaces.append(" ");
        }
        try {
            info = String.join(spaces.toString(), name.getValue(), expression.getDetailedData(str, minVal, maxVal));
        } catch (Exception e) {
            throw new Exception(String.format("Error in parsing %s field: %s", name.name(), e.getMessage()));
        }
        return info;
    }
}
