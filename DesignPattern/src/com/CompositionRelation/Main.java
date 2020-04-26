package com.CompositionRelation;

public class Main {
    public static void main(String[] args) {

        Club c01 = new Club("st01");
        Club c02 = new Club("st02");

        System.out.println(Club.stList);
        for (Student st : Club.stList) {
            System.out.println(st.getName());
        }

    }
}
