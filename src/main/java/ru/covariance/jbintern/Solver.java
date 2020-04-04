package ru.covariance;

import java.util.List;

public interface Solver {
    Solution solve(List<Train> schedule);
}
