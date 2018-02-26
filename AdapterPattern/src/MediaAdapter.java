public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            this.advancedMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer = new Mp4Player();
        }else {
            this.advancedMediaPlayer = null;
        }
    }

    @Override
    public void play(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            this.advancedMediaPlayer.playVlc();
        }else if (audioType.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer.playMp4();
        }else {
            System.out.println("格式不支持");
        }
    }
}
