package chapter9.after;

import chapter4.checkpoint.check1.W;
import java.lang.ref.WeakReference;

public class Client {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        WeakReference<MinMaxView> weakReference = new WeakReference<>(new MinMaxView(scoreRecord));
        scoreRecord.attach(weakReference.get());

        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);
        scoreRecord.attach(minMaxView);

        for (int idx = 1; idx <= 5; idx++) {
            int score = idx * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }

    }


}
