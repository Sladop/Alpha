package com.game.scp_clicker.Game;
    /*
    SCP-CLICKER GAME
    Main Game Class
     */


public class Game {
    private long clickCounter = 0;
    private String clickCounterText;


    //public void setClickCounter(long clickCounter){ //Setter for clickCOunter
   //     this.clickCounter = clickCounter;
   // }
  //  public long getClickCounter(){ //Getter for clickCounter
  //      return clickCounter;
  //  }

    public String incClickCounter() { //increases clickCounter 1
        clickCounter++;
        return castString(clickCounter);
    }
    public String castString(long clickCounter){ //Changes long clickCounter into String clickCounterText
        clickCounterText = clickCounterText.valueOf(clickCounter);
        return clickCounterText;
    }





}
