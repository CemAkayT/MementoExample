package com.company;

//This is Memento. It prevents updates of the current text by outsiders
public class TextWindowState {

    private String text;

    public TextWindowState(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
