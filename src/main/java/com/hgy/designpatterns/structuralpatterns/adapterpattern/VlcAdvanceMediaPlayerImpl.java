package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * Vlc 实现类
 * @author Evan
 * @Date 2018/9/8
 */
public class VlcAdvanceMediaPlayerImpl implements AdvanceMediaPlayer {
    /**
     * Vlc播放方法
     *
     * @param filename
     */
    @Override
    public void playVlc( String filename) {
        System.out.println("This is Vlc playing"+filename);
    }

    /**
     * Mp4播放方法
     *
     * @param filename
     */
    @Override
    public void playMp4( String filename) {

    }
}
