package oops.problem.comparator.events.timing.sorting;
//Problem Statement
//You have a list of Event objects, each containing:
//eventName (String)
//startTime (Integer) → Time in 24-hour format (e.g., 1330 for 1:30 PM)
//endTime (Integer) → Time in 24-hour format (e.g., 1530 for 3:30 PM)
//Sort the events based on:
//Primary Sort: By startTime in ascending order.
//Secondary Sort: If two events have the same startTime, sort by endTime in ascending order.
//Tertiary Sort: If both times are equal, sort by eventName in alphabetical order
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

import java.util.*;

class Event {

    String eventName;

    LocalTime startTime;

    LocalTime endTime;

    public Event(String eventName, int startTime, int endTime) {

        this.eventName = eventName;

        this.startTime = convertToTime(startTime);

        this.endTime = convertToTime(endTime);

    }

    private LocalTime convertToTime(int time) {

        int hours = time / 100;

        int minutes = time % 100;

        return LocalTime.of(hours, minutes);

    }

    @Override

    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        return eventName + " - " + startTime.format(formatter) + " to " + endTime.format(formatter);

    }

}

public class EventSorter {

    public static void main(String[] args) {

        List<Event> events = new ArrayList<>();

        events.add(new Event("Meeting A", 1330, 1530));

        events.add(new Event("Conference", 1000, 1200));

        events.add(new Event("Workshop", 1000, 1130));

        events.add(new Event("Seminar", 1400, 1500));

        events.add(new Event("Team Lunch", 1330, 1430));

        // Sorting based on startTime, then endTime, then eventName

        events.sort(Comparator.comparing((Event e) -> e.startTime)

                .thenComparing(e -> e.endTime)

                .thenComparing(e -> e.eventName));

        // Printing the sorted list

        for (Event e : events) {

            System.out.println(e);

        }

    }

}

