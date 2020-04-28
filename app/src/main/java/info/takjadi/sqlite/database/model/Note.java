package info.takjadi.sqlite.database.model;

/**
 * Created by ravi on 20/02/18.
 */

public class Note {


    private int id;
    private String note;
    private String timestamp;
    private String description;
    private byte[] image;




    public Note() {
    }

    public Note(int id, String note, String timestamp,String description) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.description=description;
        this.image=image;
    }


    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }


    public void setImage(byte[] image){
        this.image=image;
    }

    public byte [] getImage() {
        return image;
    }
}
