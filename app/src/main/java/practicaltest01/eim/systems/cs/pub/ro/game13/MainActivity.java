package practicaltest01.eim.systems.cs.pub.ro.game13;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        startGame = findViewById(R.id.startGameButon);

        startGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent startGameIntent = new Intent(getApplicationContext(), PlayGame.class);
                finish();
                startActivity(startGameIntent);
            }
        });
    }
}
