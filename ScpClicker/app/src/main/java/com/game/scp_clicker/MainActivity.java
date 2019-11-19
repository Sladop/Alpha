package com.game.scp_clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.game.scp_clicker.Game.Game;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageButton scpClicker = findViewById(R.id.scpClicker); //Imagebutton
    private TextView counterText = findViewById(R.id.counterText); //Text Counter
    private Button infoButton = findViewById(R.id.infoButton);

    Game clickerGame = new Game(); //New Gameobject


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scpClicker.setOnClickListener(this); //Button ClickListener
        infoButton.setOnClickListener(this);

        /*
        scpClicker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { //ClickListener
                counterText.setText(clickerGame.incClickCounter()); //ClickerEvent
            }
        });
        */
    }

    @Override
    public void onClick(View v) { //Button Switch onClick Zuteilung

        switch (v.getId()) {
            case R.id.infoButton:
                setContentView(R.layout.activity_info);
                break;
            case R.id.scpClicker:
                counterText.setText(clickerGame.incClickCounter());
                break;
        }
    }
}
