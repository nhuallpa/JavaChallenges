package com.nhuallpa.problems.tricoloring;

import java.util.*;

public class Machine {
    private final HashSet<Task> tasks;
    private final String name;

    public Machine(String name) {
        tasks = new HashSet<Task>();
        this.name = name;
    }

    public Integer getTotalTime() {
        return tasks.stream().map(Task::getValue).reduce(Integer::sum).orElse(0);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTask() {
        return new ArrayList<Task>(tasks);
    }

    public String getName() {
        return name;
    }
}
