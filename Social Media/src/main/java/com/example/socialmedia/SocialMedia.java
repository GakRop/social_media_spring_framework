package com.example.socialmedia;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SocialMedia {
    private long fromID;
    private long toID;
    private String content;

    LinkedList ll = new LinkedList();

    public long getToID() {
        return toID;
    }

    public void setToID(long toID) {
        this.toID = toID;
    }

    public long getFromID(){
        return fromID;
    }

    public void setFromID(long fromID){
        this.fromID = fromID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void store(){
        ll.insert(fromID, toID, content);
    }

    public void search(long fromID, long toID){
        ArrayList array = ll.search(fromID, toID);
        
    }
}
