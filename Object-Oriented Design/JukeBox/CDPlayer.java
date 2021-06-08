public class CDPlayer {
    private CD c;
    private Playlist p;

    // getters and setters
    public void setCD(CD c) {
        this.c = c;
    }

    public CD getCD() {
        return c;
    }

    public void setPlaylist(Playlist p) {
        this.p = p;
    }

    public Playlist getPlaylist() {
        return p;
    }

    public CDPlayer(CD c) {
        // to set the cd to be played
        this.c = c;
    }

    public void playSong(Song s) {
    }

}
