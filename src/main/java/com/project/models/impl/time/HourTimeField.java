package com.project.models.impl.time;

import com.project.enums.TimeFieldName;
import com.project.models.TimeField;

public class HourTimeField extends TimeField {
    public HourTimeField(String str) {
        super(0, 23, str, TimeFieldName.HOUR);
    }
}
