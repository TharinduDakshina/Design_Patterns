package structural_patterns.Adaptor_pattern;

public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer=new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.plaVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.plaMp4(fileName);
        }
    }
}
