package com.cypressf.perceptivist.models;

import java.util.Date;

/**
 * An entry in a person's mood journal. Has a mood, a reason, a timestamp, and an indication of where the person wants
 * to shift, if they want to change their current mood.
 */
public class Entry {
    private Mood mood;
    private String reason;
    private Date date;
    private Mood.Category goalMoodCategory;

    public Entry(Mood mood, String reason, Date date) {
        this(mood, reason, date, null);
    }

    public Entry(Mood mood, String reason, Date date, Mood.Category goalMoodCategory) {
        this.mood = mood;
        this.reason = reason;
        this.date = date;
        this.goalMoodCategory = goalMoodCategory;
    }
}
