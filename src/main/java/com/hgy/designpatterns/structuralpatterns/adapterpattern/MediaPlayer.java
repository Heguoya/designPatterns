package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * 媒体播放接口
 * @author Evan
 * @Date 2018/9/8
 */
public interface MediaPlayer {
    /**
     * 播放方法
     * @param audioType
     * @param filename
     */
    void play(String audioType, String filename);
}
