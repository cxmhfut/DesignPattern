package dp.adapter;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file. Name:"+filename);
    }
}
