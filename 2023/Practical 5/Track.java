// Surname:     Rubushe
// Name:        Yanga
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File:        Track.java

class Track {
    /* Attributes */
    private String id; // track ID
    private String title;  // track title
    private String artist; // artist name
    private String album; // album title
    private int minutes; // minute component of track length
    private int seconds; // seconds component of track length
    private Track left; // left child
    private Track right; // right child

    /* Methods */
    public Track() {
        // Default constructor
    }

    public Track(String id, String title, String artist, String album, int minutes, int seconds) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Track getLeft() {
        return left;
    }

    public void setLeft(Track left) {
        this.left = left;
    }

    public Track getRight() {
        return right;
    }

    public void setRight(Track right) {
        this.right = right;
    }

    public String toString() {
        return "Track title: " + title + "\n" +
                "Artist name: " + artist + "\n" +
                "Album title: " + album + "\n" +
                "Track time: " + minutes + " min" +" : "+ seconds + " sec"+"\n";
    }
}