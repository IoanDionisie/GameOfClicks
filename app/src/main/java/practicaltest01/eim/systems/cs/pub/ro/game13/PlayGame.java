package practicaltest01.eim.systems.cs.pub.ro.game13;

import android.app.Activity;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PlayGame extends Activity {

    GridLayout gamegrid;
    Grid grid;
    Level level;
    RelativeLayout startTimer;
    CountDown startGameTimer, startLevelTimer;
    TextView startTimerValue;
    TextView levelNumber;
    int levelNo, levelScore;

    Button blue, red;

    RelativeLayout levelTimer;
    TextView levelTimerValue;


    public void initGrid(int x, int y) {
        gamegrid.removeAllViews();

        gamegrid.setRowCount(y);
        gamegrid.setColumnCount(x);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_play_game);

        levelNo = 1;
        level = new Level(levelNo);

        levelTimer = findViewById(R.id.levelTimer);
        levelTimerValue = findViewById(R.id.levelTimerValue);

        startTimer = findViewById(R.id.startTimer);
        startTimerValue = findViewById(R.id.startTimerValue);

        gamegrid = findViewById(R.id.gameGrid);
        gamegrid.setColumnCount(level.getGridComplexity());
        gamegrid.setRowCount(level.getGridComplexity());
        levelNumber = findViewById(R.id.levelNumber);

        startGameTimer = new CountDown(startTimerValue, levelTimerValue, startTimer, levelTimer);

        grid = new Grid(levelNo + 1);

    }
}
