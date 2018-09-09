package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * @author Evan
 * @Date 2018/9/8
 */
public class MediaPlayerAdapter implements MediaPlayer {

    public static final String VLC = "vlc";
    public static final String MP4 = "mp4";
    /**
     * 高级播放器
     */
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (VLC .equals(audioType)) {
            advanceMediaPlayer=new  VlcAdvanceMediaPlayerImpl();
        } else if (MP4.equals(audioType)) {
            advanceMediaPlayer =new Mp4AdvanceMediaPlayerImpl();
        }
    }

    /**
     * 播放方法
     *
     * @param audioType
     * @param filename
     */
    @Override
    public void play(String audioType, String filename) {
        if (VLC .equals(audioType)) {
            advanceMediaPlayer.playVlc(filename);
        } else if (MP4.equals(audioType)) {
            advanceMediaPlayer.playMp4(filename);
        }
    }
}
