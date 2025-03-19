package org.setFrame.queue;

public class Task implements Comparable<Task> {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
