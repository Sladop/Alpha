package com.game.game.alpha;

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


}
