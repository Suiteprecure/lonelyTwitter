/*
 * Mood
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood.
 * @author team X
 * @version 1.5
 * @see Happy
 * @see Angry
 * @since 1.0
 */
public abstract class Mood {
    private String mood;
    private Date date;

    /**
     * Return date for mood
     *
     * @return date for mood
     */
    public Date getDate(){
        return date;
    }

    /**
     * Set date for mood
     *
     * @param date date mood
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * constructs mood and assign date.
     */
    public Mood(){
        date = new Date();
    }

    /**
     * constructs mood with sited date.
     * @param date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * get mood from Angry and Happy class
     *
     * @return a string represent mood
     */
    public abstract String getMood();

}
