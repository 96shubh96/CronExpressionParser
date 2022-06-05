package com.project.models.impl.time;

import com.project.enums.TimeFieldName;
import com.project.models.TimeField;

public class WeekDayTimeField extends TimeField {
    public WeekDayTimeField(String str) {
        super(1, 7, str, TimeFieldName.DAY_OF_WEEK);
    }
}
