package com.project.builders;

import com.project.models.impl.time.*;

public class Time {
    public static final int TOTAL_FIELDS = 6;
    MinuteTimeField minuteTimeField;
    HourTimeField hourTimeField;
    DayOfMonthTImeField dayOfMonthTImeField;
    MonthTimeField monthTImeField;
    WeekDayTimeField weekDayTimeField;
    String command;

    public String getFinalOutput() {
        return minuteTimeField.getInfo() + System.lineSeparator() +
                hourTimeField.getInfo() + System.lineSeparator() +
                dayOfMonthTImeField.getInfo() + System.lineSeparator() +
                monthTImeField.getInfo() + System.lineSeparator() +
                weekDayTimeField.getInfo() + System.lineSeparator() +
                "comand" + " " + command;
    }

    public static TimeBuilder builder() {
        return new TimeBuilder();
    }

    public static class TimeBuilder {
        protected Time t = new Time();

        public TimeBuilder minuteTimeField(MinuteTimeField minuteTimeField) {
            t.minuteTimeField = minuteTimeField;
            return this;
        }

        public TimeBuilder hourTimeField(HourTimeField hourTimeField) {
            t.hourTimeField = hourTimeField;
            return this;
        }

        public TimeBuilder dayOfMonthTimeField(DayOfMonthTImeField dayOfMonthTImeField) {
            t.dayOfMonthTImeField = dayOfMonthTImeField;
            return this;
        }

        public TimeBuilder monthTimeField(MonthTimeField monthTImeField) {
            t.monthTImeField = monthTImeField;
            return this;
        }

        public TimeBuilder dayOfWeekTimeField(WeekDayTimeField weekDayTimeField) {
            t.weekDayTimeField = weekDayTimeField;
            return this;
        }

        public TimeBuilder command(String str) {
            t.command = str;
            return this;
        }

        public Time build() throws Exception {
            if (t.minuteTimeField == null) {
                throw new Exception("Minute field can't be null");
            }
            if (t.hourTimeField == null) {
                throw new Exception("Hour field can't be null");
            }
            if (t.dayOfMonthTImeField == null) {
                throw new Exception("Day of Month field can't be null");
            }
            if (t.monthTImeField == null) {
                throw new Exception("Month field can't be null");
            }
            if (t.weekDayTimeField == null) {
                throw new Exception("Day of Week field can't be null");
            }
            if (t.command == null) {
                throw new Exception("Command field can't be null");
            }
            return t;
        }
    }
}




