package com.hgy.designpatterns.structuralpatterns.adapterpattern;

/**
 * @author Evan
 * @Date 2018/9/8
 */
public class MediaPlayerImpl implements MediaPlayer {
    /**
     * 媒体播放器适配器
     */
    MediaPlayerAdapter mediaPlayerAdapter;

    /**
     * 播放方法
     *
     * @param audioType
     * @param filename
     */
    @Override
    public void play(String audioType, String filename) {
//播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        }
//mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
