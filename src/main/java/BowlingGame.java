import java.util.List;
import java.util.stream.IntStream;

public class BowlingGame {
    public int calculateLineScore(List<Integer> throwScores) {
        int throwCount = throwScores.size();
        int[] throwMultiplexer = new int[throwCount];
        int lastFrameStartIndex;
        if (throwScores.get(throwCount - 2) == 10) {
            lastFrameStartIndex = throwCount - 2;
        } else {
            lastFrameStartIndex = throwCount;
        }
        for (int throwIndex = 0; throwIndex < lastFrameStartIndex; throwIndex++) {
            throwMultiplexer[throwIndex] += 1;
            if (throwScores.get(throwIndex) == 10) {
                throwMultiplexer[throwIndex + 1] += 1;
                throwMultiplexer[throwIndex + 2] += 1;
            }
        }
        return IntStream.range(0, throwCount)
                .map(i -> throwScores.get(i) * throwMultiplexer[i])
                .sum();
    }

}
