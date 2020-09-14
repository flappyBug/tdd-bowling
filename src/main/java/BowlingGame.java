import java.util.List;

public class BowlingGame {
    public int calculateLineScore(List<Integer> throwScores) {
        return throwScores.stream().reduce(0, Integer::sum);
    }
}
