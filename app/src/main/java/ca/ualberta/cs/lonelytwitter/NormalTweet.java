/*
 * NormalTweet
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
 * Created by huiye on 9/13/17.
 */

public class NormalTweet extends Tweet{


    /**
     * construct a normal tweet object
     *
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }


    /**
     * construct a normal tweet with setted date.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Represent this tweet is an normal tweet not important
     *
     * @return a boolean to represent if it is important.
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
