package com.CompositionRelation;

import java.util.ArrayList;

/**
 * 학생은 한 동아리에만 가입할 수 있다.
 * 한 동아리에는 여러명의 학생들이 있다.
 */

public class Club {
    static ArrayList<Student> stList = new ArrayList<>();
    Student st;

    public Club(String name) {
        this.st = new Student(name);
        stList.add(this.st);
    }
}
