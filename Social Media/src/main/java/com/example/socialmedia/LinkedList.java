package com.example.socialmedia;

import java.util.ArrayList;

public class LinkedList {
    public class Node{
        private Node next;
        private long fromID;
        private long toID;
        private String content;

        public Node(long fromID, long toID, String content){
            this.fromID = fromID;
            this.toID = toID;
            this.content = content;
        }

        public long getFromID(){
            return fromID;
        }

        public void setFromID(long fromID){
            this.fromID = fromID;
        }

        public long getToID(){
            return toID;
        }

        public void setToID(long toID){
            this.toID = toID;
        }

        public String getContent(){
            return content;
        }

        public void setContent(String content){
            this.content = content;
        }

        public Node getNext(){
            return this.next;
        }

        public void setNext(Node temp){
            this.next = temp;
        }
    }

    private Node first;
    private Node end;

    public LinkedList(){
        this.first = null;
        this.end = null;
    }

    public void insert(long fromID, long toID, String content){
        Node temp = new Node(fromID, toID, content);
        if (first == null){
            first = temp;
            end = temp;
        }

        else {
            end.setNext(temp);
            temp = end;
        }
    }

    public ArrayList search(long fromID, long toID){
        /*
        this function returns the content sent from the input fromID to the input toID
        looks through the linked list and find the node which has the matched
        fromID and toID then returns the content stored in the array list
        the content is stored in array list which is returned
         */
        ArrayList<String> result = new ArrayList<String>();
        return result;

    }
}
