package chapter9.after;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{

    public List<Integer> scores = new ArrayList<>();

    public void addScore(int score){
        this.scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecords() {
        return scores;
    }
}
