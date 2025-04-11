import org.jaudiotagger.audio.AudioFileIO;

public class Song {
    private String songTitle;
    private String songArtist;
    private String songLength;
    private String filePath;

    public Song(String filePath, String title, String artist, String length) {
        this.filePath = filePath;
        this.songTitle = title;
        this.songArtist = artist;
        this.songLength = length;
    }
}