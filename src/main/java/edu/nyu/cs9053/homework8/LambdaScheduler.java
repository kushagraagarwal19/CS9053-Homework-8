/**
 * Created by kushagraagarwal on 4/5/17.
 */
package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaScheduler {
    public static ArrayList<Job> FindMaxNumberOfJobs(Job[] jobs) {
        CompareFinishTime Comparison = new CompareFinishTime();
        Arrays.sort(jobs, Comparison);
        ArrayList<Job> JobList = new ArrayList<>();
        int MaxNumberOfJobs = 0;
        JobList.add(jobs[0]);
        MaxNumberOfJobs++;
        int Previous = 0;
        for (int i = 1; i < jobs.length; i++) {
            if (jobs[i].getStart() >= jobs[Previous].getFinish()) {
                JobList.add(jobs[i]);
                MaxNumberOfJobs++;
                Previous = i;
            }
        }
        return JobList;
    }
}