public class Song {
    private String artist;
    private String album;
    private double length;
    private String songName;

    public Song(String songN, String artist, String album, double l) {
        this.artist = artist;
        this.album = album;
        this.length = l;
        this.songName = songN;
    }

    public Song getSong() {
        return this.artist + this.album + this.length;
    }

    public String toString() {
        return songName;
    }

}
