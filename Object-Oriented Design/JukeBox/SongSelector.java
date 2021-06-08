public class SongSelector {
    private Song currentSong;

    public SongSelector(Song song) {
        this.currentSong = song;
    }

    public void setSong(Song s) {
        currentSong = s;
    }

    public Song getCurrSong() {
        return currentSong;
    }
}
