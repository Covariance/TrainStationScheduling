package ru.covariance.jbintern;

import java.util.List;

public interface Solver {
    Solution solve(List<Train> schedule);
}
