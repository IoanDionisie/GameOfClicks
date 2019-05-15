package practicaltest01.eim.systems.cs.pub.ro.game13;

import android.os.CountDownTimer;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class CountDown {

    private TextView timerValue, timerValue2;
    private RelativeLayout layout1, layout2;
    public boolean isRunning;
    public int thirteen = 14000;
    public int time = 3000;

    public CountDown(TextView timerValue, TextView timerValue2, RelativeLayout layout1, RelativeLayout layout2) {
        this.timerValue = timerValue;
        this.timerValue2 = timerValue2;
        this.layout1 = layout1;
        this.layout2 = layout2;
        startTimer();
    }

    CountDownTimer cTimer = null;
    CountDownTimer thirteenTimer = null;

    //start timer function
    void startTimer() {
        timerValue.setText("3");
        cTimer = new CountDownTimer(time, 1000) {
            public void onTick(long millisUntilFinished) {
                int time = (int)TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);
                String timeString = Integer.toString(time);
                timerValue.setText(timeString);
            }
            public void onFinish() {
                layout1.setVisibility(View.INVISIBLE);
                cancelTimer(cTimer);
                startSecondTimer();
            }
        };
        cTimer.start();
    }

    void startSecondTimer() {
        layout2.setVisibility(View.VISIBLE);
        timerValue2.setText("13");
        thirteenTimer = new CountDownTimer(thirteen, 1000) {
            public void onTick(long millisUntilFinished) {
                int time = (int)TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);
                String timeString = Integer.toString(time);
                timerValue2.setText(timeString);
            }
            public void onFinish() {
                layout2.setVisibility(View.INVISIBLE);
                cancelTimer(thirteenTimer);
            }
        };
        thirteenTimer.start();
    }

    //cancel timer
    void cancelTimer(CountDownTimer timer) {
        if(timer!=null)
            timer.cancel();
    }
}
