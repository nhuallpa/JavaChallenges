package com.nhuallpa.problems.tricoloring;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tricolorer {

    public static String calculate(int[] numbers) {

        Machine machineR = new Machine("R");
        Machine machineG = new Machine("G");
        Machine machineB = new Machine("B");
        List<Machine> machines = Arrays.asList(machineR, machineG, machineB);
        for (int i = 0; i < numbers.length; i++) {
            Comparator<Machine> comparator = Comparator.comparing(Machine::getTotalTime);
            final int index = i;
            machines.stream().collect(Collectors.minBy(comparator)).ifPresent(machine -> machine.addTask(new Task(index, numbers[index])));
        }

        var orderedColors = new TreeMap<Integer, String>();
        machines.stream()
                .forEach(machine ->
                        machine.getTask().stream().forEach(
                                task -> orderedColors.put(task.getPosition(), machine.getName())
                        ));



        return orderedColors.values().stream()
                .collect(Collectors.joining(""));
    }
}
