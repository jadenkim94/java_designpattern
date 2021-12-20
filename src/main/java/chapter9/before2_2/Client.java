package chapter9.before2_2;

public class Client {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.addDataSheetView(dataSheetView3);
        scoreRecord.addDataSheetView(dataSheetView5);
        scoreRecord.setMinMaxView(minMaxView);

        for(int idx = 1; idx <= 5; idx ++){
            int score = idx * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }
    }

}
