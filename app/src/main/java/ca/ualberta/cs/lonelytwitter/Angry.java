/*
 * Angry
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by huiye on 9/13/17.
 */

/**
 * Response a angry mood to tweet.
 * @author team X
 * @version 1.5
 * @see Mood
 * @since 1.0
 */
public class Angry extends Mood {
    /**
     * Return Mood Angry
     *
     * @return it return string type for the angry mood
     */
    @Override
    public String getMood(){
        return "Angry";
    }
}
