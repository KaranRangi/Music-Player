import org.jaudiotagger.audio.AudioFileIO;

public class Song {
    private String songTitle;
    private String songArtist;
    private String songLength;
    private String filePath;

<<<<<<< HEAD
    public Song() {
        
=======
    public Song(String filePath, String title, String artist, String length) {
        this.filePath = filePath;
        this.songTitle = title;
        this.songArtist = artist;
        this.songLength = length;
    }

    public Song(String filePath, String title) {
        this.filePath = filePath;
        this.songTitle = title;
>>>>>>> 085741678a1795d0fb7cec0e466127305fbd5b48
    }
}