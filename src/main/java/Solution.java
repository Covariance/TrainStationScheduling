import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    private final double sum;
    private final int n;
    private final int[] trainIDs;

    public Solution(final double sum, final int n, final int[] trainIDs) {
        if (trainIDs.length != n) {
            throw new IllegalArgumentException("Number of trains to unload doesn't match: " +
                    "expected " + n + ", got:" + trainIDs.length);
        }
        this.sum = sum;
        this.n = n;
        this.trainIDs = trainIDs;
    }

    @Override
    public String toString() {
        return Arrays.stream(trainIDs)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ", Double.toString(sum) + '\n' + n + '\n', "")
                );
    }
}
