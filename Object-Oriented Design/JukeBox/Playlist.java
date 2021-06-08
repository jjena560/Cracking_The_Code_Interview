public class Playlist {
    private Song song;
    // songs which are in the queue to be okayed
    private Queue<Song> queue;

    public Playlist(Song s, Queue<Song> q) {
        this.song = s;
        this.queue = q;
    }

    public Song getNextSongToPlay() {
        // returns the song at the front
        return queue.peek();
    }

    public void addSongToQueue(Song so) {
        // add this song to the queue
        queue.add(so);
    }

}
