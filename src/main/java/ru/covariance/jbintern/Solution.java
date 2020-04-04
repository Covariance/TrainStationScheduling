package ru.covariance;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
    private final double sum;
    private final List<Integer> trainIDs;

    public Solution(double sum, List<Integer> trainIDs) {
        this.sum = sum;
        this.trainIDs = trainIDs;
    }

    public double getSum() {
        return sum;
    }

    public List<Integer> getTrainIDs() {
        return trainIDs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution solution = (Solution) obj;
            return this.sum == solution.sum && trainIDs.equals(solution.trainIDs);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hashCode(sum) + Objects.hashCode(trainIDs);
    }

    @Override
    public String toString() {
        return trainIDs.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ",
                        Double.toString(sum) + '\n' + trainIDs.size() + '\n',
                        "")
                );
    }
}
