package chapter9.before2_1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>(); // 점수 저장 리스트
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score){ // 새로운 점수 추가
        this.scores.add(score); // 점수 저장 리스트에 점수 추가
        this.minMaxView.update(); // 리스트가 변경됨을 통보
    }

    public List<Integer> getScoreRecord(){
        return this.scores;
    }
}
