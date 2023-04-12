package org.acme.schooltimetabling.domain;

import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalTime;


@Getter
public class Timeslot {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public Timeslot(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Timeslot(DayOfWeek dayOfWeek, LocalTime startTime) {
        this(dayOfWeek, startTime, startTime.plusMinutes(50));
    }

    @Override
    public String toString() {
        return dayOfWeek + " " + startTime;
    }
}
