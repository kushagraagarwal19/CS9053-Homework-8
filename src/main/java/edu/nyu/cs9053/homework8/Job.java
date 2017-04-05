/**
 * Created by kushagraagarwal on 4/5/17.
 */

package edu.nyu.cs9053.homework8;

public class Job implements Comparable<Job> {
    private final int start;
    private final int finish;
    private final int weight;

    public Job(int start, int finish) {
        this.start = start;
        this.finish = finish;
        this.weight = 1;
    }

    public Job(int start, int finish, int weight) {
        this.start = start;
        this.finish = finish;
        this.weight = weight;
    }

    @Override
    public int compareTo(Job o) {
        return Integer.compare(this.finish, o.finish);
    }

    public int getStart() {
        return this.start;
    }

    public int getFinish() {
        return this.finish;
    }

    public int getWeight() {
        return this.weight;
    }
}