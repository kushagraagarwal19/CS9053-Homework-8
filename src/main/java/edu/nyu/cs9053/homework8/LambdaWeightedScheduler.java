/**
 * Created by kushagraagarwal on 4/5/17.
 */

package edu.nyu.cs9053.homework8;

import java.util.Arrays;

public class LambdaWeightedScheduler {
    public static int MaximumWeightOfJobs(Job[] jobs) {
        int[] JobsWeight = new int[jobs.length];
        CompareFinishTime comparator = new CompareFinishTime();
        Arrays.sort(jobs, comparator);

        JobsWeight[0] = jobs[0].getWeight();
        for (int i = 1; i < jobs.length; i++) {
            JobsWeight[i] = Math.max(jobs[i].getWeight(), JobsWeight[i - 1]);
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j].getFinish() <= jobs[i].getStart()) {
                    JobsWeight[i] = Math.max(JobsWeight[i], jobs[i].getWeight() + JobsWeight[j]);
                    break;
                }
            }
        }
        Arrays.sort(JobsWeight);
        return JobsWeight[jobs.length - 1];
    }
}