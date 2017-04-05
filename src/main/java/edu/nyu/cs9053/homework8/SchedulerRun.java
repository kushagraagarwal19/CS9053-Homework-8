/**
 * Created by kushagraagarwal on 4/5/17.
 */

//This file shows a run for Scheduler

package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.*;

public class SchedulerRun {
    public static void main(String args[]) {

        Job jobs[] = new Job[6];

        jobs[0] = new Job(1, 3);
        jobs[1] = new Job(2, 5);
        jobs[2] = new Job(4, 6);
        jobs[3] = new Job(6, 7);
        jobs[4] = new Job(5, 8);
        jobs[5] = new Job(7, 9);

        System.out.println("Here starts the unweighted scheduler:");
        ArrayList<Job> JobSet = new ArrayList<>();
        LambdaScheduler UnweightedScheduler = new LambdaScheduler();
        JobSet = UnweightedScheduler.FindMaxNumberOfJobs(jobs);
        Iterator iterator = JobSet.iterator();
        while (iterator.hasNext()) {
            Job JobDetail = (Job) iterator.next();
            System.out.println("[" + JobDetail.getStart() + "," + JobDetail.getFinish() + "]");
        }
        System.out.println("The maximum job(s) which we can run is/are: " + JobSet.size());

        System.out.println("");
        System.out.println("Here starts the weighted scheduler");
        jobs[0] = new Job(1, 3, 5);
        jobs[1] = new Job(2, 5, 6);
        jobs[2] = new Job(4, 6, 5);
        jobs[3] = new Job(6, 7, 4);
        jobs[4] = new Job(5, 8, 11);
        jobs[5] = new Job(7, 9, 2);

        LambdaWeightedScheduler WeightedScheduler = new LambdaWeightedScheduler();
        System.out.println(WeightedScheduler.MaximumWeightOfJobs(jobs));

    }
}