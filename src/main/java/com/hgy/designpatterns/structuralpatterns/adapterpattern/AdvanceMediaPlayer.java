package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * 高级媒体播放接口
 * @author Evan
 * @Date 2018/9/8
 */
public interface AdvanceMediaPlayer {

    /**
     * Vlc播放方法
     * @param filename
     */
    void playVlc( String filename);

    /**
     * Mp4播放方法
     * @param filename
     */
    void playMp4( String filename);
}
