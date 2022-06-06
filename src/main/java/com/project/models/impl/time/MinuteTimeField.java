package com.project.models.impl.time;

import com.project.enums.TimeFieldName;
import com.project.models.TimeField;

public class MinuteTimeField extends TimeField {

    public MinuteTimeField(String str) {
        super(0, 59, str, TimeFieldName.MINUTE);
    }
}
