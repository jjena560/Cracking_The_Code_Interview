public class JukeBox {
    private CDPlayer cdPlayer;
    private User user;
    private Set<cd> cdCollection;
    private SongSelector ts;

    public JukeBox(CDPlayer cdPlayer, User user, Set<cd> cdCollection, SongSelctor ts) {
        super();
        this.cdPlayer = cdPlayer;
        this.user = user;
        this.cdCollection = cdCollection;
        this.ts = ts;
    }

    public Song getCurrentSong() {
        return ts.currentSong;
    }

    // to set the user who is using the jukebox
    public void setUser(User u) {
        this.user = u;
    }
}
