import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private final double sum;
    private final List<Integer> trainIDs;

    public Solution(double sum, List<Integer> trainIDs) {
        this.sum = sum;
        this.trainIDs = trainIDs;
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
