package com.game.game.alpha;

import android.content.Context;

import com.game.alpha.MainActivity;

import java.io.FileOutputStream;

import static android.content.Context.MODE_PRIVATE;

public class MainGame extends MainActivity {
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
    public void saveInt(int toSave){
        try {
            String FILENAME = "gamesave.txt";
            String saveTxt = String.valueOf(toSave);
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            fos.write(saveTxt.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
