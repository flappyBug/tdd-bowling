import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_sum_up_throw_scores_when_all_frames_are_open() {
        BowlingGame game = new BowlingGame();
        List<Integer> throwScores = Collections.nCopies(20, 4);
        assertEquals(80, game.calculateLineScore(throwScores));
    }

    @Test
    void should_get_correct_score_when_all_frames_are_strike() {
        BowlingGame game = new BowlingGame();
        List<Integer> throwScores = Collections.nCopies(12, 10);
        assertEquals(300, game.calculateLineScore(throwScores));
    }
}
