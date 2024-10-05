// Surname:     Rubushe
// Name:        Yanga 
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File:        Playlist.java

class Playlist {
    /* Attributes */
    private Track root;// root of the playlist
    private int size; // number of tracks in the playlist
    
    /* Methods */
    public Playlist() {
        root = null;
        size = 0;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public Boolean search(String title) {
        Track current = root;
        while (current != null) {
            if (current.getTitle().equals(title)) {
                return true;
            } else if (current.getTitle().compareTo(title) > 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public void insert(String id, String title, String artist, String album, int minutes, int seconds) {
        Track newTrack = new Track(null, title, artist, album, minutes, seconds);
        if (root == null) {
            root = newTrack;
            size++;
            return;
        }
        Track current = root;
        while (true) {
            if (newTrack.getTitle().compareTo(current.getTitle()) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(newTrack);
                    size++;
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(newTrack);
                    size++;
                    return;
                }
                current = current.getRight();
            }
        }
    }

    public void delete(String title) {
        if(root == null){
            return;
        }
        Track current = root;
        Track parent = null;
        while (current != null) {
            if (current.getTitle().equals(title)) {
                if (current.getLeft() == null && current.getRight() == null) {
                    if (parent == null) {
                        root = null;
                    } else if (parent.getLeft() == current) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                } else if (current.getLeft() == null || current.getRight() == null) {
                    if (parent == null) {
                        if (current.getLeft() != null) {
                            root = current.getLeft();
                        } else {
                            root = current.getRight();
                        }
                    } else if (parent.getLeft() == current) {
                        if (current.getLeft() != null) {
                            parent.setLeft(current.getLeft());
                        } else {
                            parent.setLeft(current.getRight());
                        }
                    } else {
                        if (current.getLeft() != null) {
                            parent.setRight(current.getLeft());
                        } else {
                            parent.setRight(current.getRight());
                        }
                    }
                } else {
                    Track rightMin = current.getRight();
                    while (rightMin.getLeft() != null) {
                        parent = rightMin;
                        rightMin = rightMin.getLeft();
                    }
                    current.setId(rightMin.getId());
                    current.setTitle(rightMin.getTitle());
                    current.setArtist(rightMin.getArtist());
                    current.setAlbum(rightMin.getAlbum());
                    current.setMinutes(rightMin.getMinutes());
                    current.setSeconds(rightMin.getSeconds());
                    parent.setLeft(rightMin.getRight());
                }
                size--;
                return;
            } else if (current.getTitle().compareTo(title) > 0) {
                parent = current;
                current = current.getLeft();
            } else {
                parent = current;
                current = current.getRight();
            }
        }
    }

    public void displayInOrder(Track t) {
        if (t != null) {
            displayInOrder(t.getLeft());
            System.out.println(t.toString());
            displayInOrder(t.getRight());
        }
    }

    public int height(Track t) {
        if (t == null ) {
            return -1;
        } else {
            int leftHeight = height(t.getLeft());
            int rightHeight = height(t.getRight());
            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public Track getRoot() {
        return root;
    }

    public void setRoot(Track root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
