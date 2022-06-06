package com.project.factories;

import com.project.models.Expression;
import com.project.models.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ExpressionFactory {
    private static final Map<Character, Expression> expressionMap = new HashMap<>();

    public ExpressionFactory() {
        expressionMap.put('.', new UnaryInputExpression());
        expressionMap.put('/', new DivideExpression());
        expressionMap.put('*', new AsteriskExpression());
        expressionMap.put('-', new HyphenExpression());
        expressionMap.put(',', new CommaSeparationExpression());
    }

    public Expression getExpressionFromString(String str) {
        if (str.contains("/")) {
            return expressionMap.get('/');
        }
        else if (str.contains(",")) {
            return expressionMap.get(',');
        }
        else if (str.contains("-")) {
            return expressionMap.get('-');
        }
        else if (str.equals("*")) {
            return expressionMap.get('*');
        }
        else {
            return expressionMap.get('.');
        }
    }

}
