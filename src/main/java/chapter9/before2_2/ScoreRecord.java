package chapter9.before2_2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>(); // 점수 저장 리스트
    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MinMaxView minMaxView;

    public void addDataSheetView(DataSheetView dataSheetView){
        this.dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score){ // 새로운 점수 추가
        this.scores.add(score); // 점수 저장 리스트에 점수 추가
        for(DataSheetView dataSheetView : dataSheetViews){ // 목록 형태 출력뷰들에게 변경을 통보
            dataSheetView.update();
        }
        this.minMaxView.update(); // 최대/최소 형태 뷰에 변경을 통보
    }

    public List<Integer> getScoreRecord(){
        return this.scores;
    }
}
