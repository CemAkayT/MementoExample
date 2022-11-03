package com.company;

public class Main {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.hitUndo();

        if (textEditor.print().equals("The Memento Design Pattern\nHow to implement it in Java?\n")) {
            System.out.println("Correct");
        } else {
            System.out.println("not correct");
        }
    }
}
