/*
 * Happy
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 *
 * Response a happy mood to tweet.
 * @author team X
 * @version 1.5
 * @see Mood
 * @since 1.0
 */
public class Happy extends Mood {
    /**
     * return happy
     *
     * @return represent string Happy for mood
     */
    @Override
    public String getMood(){
        return "Happy";
    }
}
