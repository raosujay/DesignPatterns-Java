public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放mp3");
        }else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType);
        }else{
            System.out.println("格式不支持");
        }
    }
}
