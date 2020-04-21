package com.FacadePattern;

// defualt 접근제한자
class HelpSystem01 {
    public HelpSystem01() {
        System.out.println(getClass().getName());
    }

    public void process() {
        System.out.println(getClass().getSimpleName());
    }
}
