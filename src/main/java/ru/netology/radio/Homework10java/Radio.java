package ru.netology.radio.Homework10java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentRadioStation;
    private int soundVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    //    public Radio (){
//        this.maxStation = 9;
//        this.minStation = 0;
//        this.maxVolume = 100;
//        this.minVolume = 0;
//    }
//
    public Radio(int stationsCount) {
        this.maxStation = maxStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == maxStation) {
            currentRadioStation = minStation;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == minStation) {
            currentRadioStation = maxStation;
        } else {
            currentRadioStation--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minVolume) {
            return;
        }
        if (newSoundVolume > maxVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void upSoundVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void downSoundVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;
        }
    }
}

