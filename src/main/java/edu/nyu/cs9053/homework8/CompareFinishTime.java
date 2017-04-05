package edu.nyu.cs9053.homework8;

import java.util.Comparator;

/**
 * Created by kushagraagarwal on 4/5/17.
 */
public class CompareFinishTime implements Comparator<Job> {
    @Override
    public int compare(Job Job0, Job Job1) {
        if (Job0.getFinish() <= Job1.getFinish()) {
            return -1;
        } else {
            return 1;
        }
    }
}