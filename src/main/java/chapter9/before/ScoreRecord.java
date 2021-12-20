package chapter9.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>(); // 점수 저장 리스트
    private DataSheetView dataSheetView; // 목록 형태로 점수를 출력하는 클래스

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public void addScore(int score){ // 새로운 점수 추가
        this.scores.add(score); // 점수 저장 리스트에 점수 추가
        this.dataSheetView.update(); // 리스트가 변경됨을 통보
    }

    public List<Integer> getScoreRecord(){
        return this.scores;
    }
}
