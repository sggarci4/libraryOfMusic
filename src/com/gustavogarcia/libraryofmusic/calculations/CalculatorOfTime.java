package com.gustavogarcia.libraryofmusic.calculations;

import com.gustavogarcia.libraryofmusic.models.Audio;
import com.gustavogarcia.libraryofmusic.models.Product;

public class CalculatorOfTime {
    private int totalTime;
    private int min;
    private String textTotalTime;

    public String getTextTotalTime() {
        return textTotalTime;
    }
    public void sumOfTimesAudiosProduct(Audio audio){

        this.totalTime += (int) audio.getLength();

        if (this.totalTime > 60){
            this.totalTime = this.totalTime / 60;
            min = this.totalTime % 60;
            textTotalTime = " - " + this.totalTime + " hours, " + min + " minutes";

        }else {
            textTotalTime = " - " + this.totalTime + " minutes";
        }

    }
}
