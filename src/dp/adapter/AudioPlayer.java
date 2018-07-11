package dp.adapter;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String audioType, String filename) {
        MediaAdapter mediaAdapter = new MediaAdapter(audioType);
        mediaAdapter.play(audioType,filename);
    }
}
