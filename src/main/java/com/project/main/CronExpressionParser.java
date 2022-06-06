package com.project.main;

import com.project.builders.Time;
import com.project.models.impl.time.*;

import java.util.Arrays;

public class CronExpressionParser {

    public static void main(String[] args) throws Exception {
        System.out.println("Input:" + System.lineSeparator() + Arrays.toString(args));
        Time t = validateAndReturnTime(args);
        System.out.println(System.lineSeparator());
        System.out.println("Output:" + System.lineSeparator() + t.getFinalOutput());
    }

    private static Time validateAndReturnTime(String[] args) throws Exception {
        if (args.length == 0) {
            throw new Exception("Input args cannot be empty");
        }
        if (args.length < Time.TOTAL_FIELDS){
            throw new Exception("Invalid Arguments !!!");
        }
        StringBuilder command = new StringBuilder();
        for (int j=5;j< args.length;j++){
            command.append(args[j]+" ");
        }
        return Time.builder()
                .minuteTimeField(new MinuteTimeField(args[0]))
                .hourTimeField(new HourTimeField(args[1]))
                .dayOfMonthTimeField(new DayOfMonthTImeField(args[2]))
                .monthTimeField(new MonthTimeField(args[3]))
                .dayOfWeekTimeField(new WeekDayTimeField(args[4]))
                .command(command.toString())
                .build();
    }
}
