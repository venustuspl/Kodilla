package com.kodilla.good.patterns.challenges.JetStory;

import java.util.Objects;

public class Flights {
    private Airport start;
    private Airport end;

    public Flights(Airport start, Airport end) {
        this.start = start;
        this.end = end;
    }




    public Airport getStart() {
        return start;
    }

    public void setStart(Airport start) {
        this.start = start;
    }

    public Airport getEnd() {
        return end;
    }

    public void setEnd(Airport end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return start.equals(flights.start) &&
                end.equals(flights.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
