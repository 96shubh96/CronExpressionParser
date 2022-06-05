package com.project.models.impl.time;

import com.project.enums.TimeFieldName;
import com.project.models.TimeField;

public class MonthTimeField extends TimeField {
    public MonthTimeField(String str) {
        super(1, 12, str, TimeFieldName.MONTH);
    }
}
