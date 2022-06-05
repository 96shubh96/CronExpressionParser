package com.project.models.impl.time;

import com.project.enums.TimeFieldName;
import com.project.models.TimeField;

public class DayOfMonthTImeField extends TimeField {
    public DayOfMonthTImeField(String str) {
        super(1, 31, str, TimeFieldName.DAY_OF_MONTH);
    }
}
