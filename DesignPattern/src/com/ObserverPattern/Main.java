package com.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Button button = new Button();
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button+"is Clicked");
            }
        });
        button.onClick();
    }
}