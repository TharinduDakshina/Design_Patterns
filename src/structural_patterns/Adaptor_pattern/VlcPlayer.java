package structural_patterns.Adaptor_pattern;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void plaVlc(String fileName) {
        System.out.println("Playing vlc file name : " + fileName);
    }

    @Override
    public void plaMp4(String fileName) {
        //do nothing
    }
}
