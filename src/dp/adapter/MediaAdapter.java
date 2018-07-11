package dp.adapter;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    MediaAdapter(String audioType){
        if(audioType.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equals("mp4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equals("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }else if(audioType.equals("mp4")){
            advancedMediaPlayer.playMP4(filename);
        }else {
            System.out.println("Invalid audio type.");
        }
    }
}
