package com.game.game.alpha;

import java.io.FileOutputStream;

import static android.content.Context.MODE_PRIVATE;

public class MainGame {
    private long counter;
    private String counterText;

    public void setCounter(long counter){
        this.counter = counter;
    }
    public long counter(){
        return counter;
    }
    public void incCounter(){
        counter++;
        counterToString();
    }
    public String counterToString(){
        return counterText.valueOf(counter);

    }
    public void saveInt(){
        String saveTxt = String.valueOf(counter);
        FileOutputStream intSave = openFileOutput("game_save_int_clicker.txt",MODE_PRIVATE);
        intSave.write(saveInt().getBytes());
        intSave.close();
    }



}
