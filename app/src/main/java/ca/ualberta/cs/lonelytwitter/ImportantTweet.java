/*
 * ImportantTweet
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
 * Represents a Important tweet.
 * @author team X
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet {
    /**
     * Construct an important tweet object with message
     *
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * construct an important tweet object with message and set date.
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Return an boolean to show if the tweet is important
     *
     * @return Return if important
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
