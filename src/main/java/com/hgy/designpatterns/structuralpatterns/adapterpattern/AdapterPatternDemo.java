package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * 适配器测试类
 *
 * @author Evan
 * @Date 2018/9/8
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayerImpl audioPlayer = new MediaPlayerImpl();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
