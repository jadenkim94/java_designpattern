package chapter9.after;

import java.util.List;

public class DataSheetView implements Observer{
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update(){ // 점수 리스트 변경을 통보받음
        List<Integer> record = scoreRecord.getScoreRecords(); // 점수 리스트 조회
        displayScores(record, viewCount); // 조회된 점수를 viewCount 만큼만 출력
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for(int i = 0; i < viewCount && i < record.size(); i++){
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
