package structural_patterns.Adaptor_pattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void plaVlc(String fileName) {
        //do nothing
    }

    @Override
    public void plaMp4(String fileName) {
        System.out.println("Playing mp4 file. Name : "+ fileName);
    }
}
