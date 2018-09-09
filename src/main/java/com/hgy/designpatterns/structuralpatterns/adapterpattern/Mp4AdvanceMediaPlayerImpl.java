package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * @author Evan
 * @Date 2018/9/8
 */
public class Mp4AdvanceMediaPlayerImpl implements AdvanceMediaPlayer {
    /**
     * Vlc播放方法
     *
     * @param filename
     */
    @Override
    public void playVlc(String filename) {

    }

    /**
     * Mp4播放方法
     *
     * @param filename
     */
    @Override
    public void playMp4(String filename) {
        System.out.println("This is a Mp4 playing"+filename);
    }
}
