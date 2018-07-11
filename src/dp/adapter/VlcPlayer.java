package dp.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc file. Name:"+filename);
    }

    @Override
    public void playMP4(String filename) {

    }
}
