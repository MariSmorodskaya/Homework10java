package ru.netology.radio.Homework10java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleStateSet;

public class RadioTest {
    @Test
    public void currentRadioStationZero() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentRadioStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(20);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentRadioStationNormal() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);
        int expected = 6;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    // Методы next  и prev
    @Test
    public void currentRadioStationNext1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void currentRadioStationNext2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void currentRadioStationPrev1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationPrev2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // Тесты на звук
    @Test
    public void setSoundVolume1() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume2() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume3() {
        Radio rad = new Radio();
        rad.setSoundVolume(10);
        int expected = 10;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume4() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume5() {
        Radio rad = new Radio();
        rad.setSoundVolume(101);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume6() {
        Radio rad = new Radio();
        rad.setSoundVolume(99);
        int expected = 99;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume7() {
        Radio rad = new Radio();
        rad.setSoundVolume(1);
        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void upSoundVolume1() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.upSoundVolume();
        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upSoundVolume2() {
        Radio rad = new Radio();
        rad.setSoundVolume(99);
        rad.upSoundVolume();
        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upSoundVolume3() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.upSoundVolume();
        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void downSoundVolume1() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.downSoundVolume();
        int expected = 99;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downSoundVolume2() {
        Radio rad = new Radio();
        rad.setSoundVolume(1);
        rad.downSoundVolume();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downSoundVolume3() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.downSoundVolume();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}









