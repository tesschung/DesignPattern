package com.SingletonPattern;

public class SystemSpeak {

    // 하나만 하기 위해서 static
    static private SystemSpeak instance;
    private int volume;

    // 외부에서 생성 함수를 사용하지 못하도록 private
    private SystemSpeak() {
        volume = 5;
    }

    public static SystemSpeak getInstance() {
        // null 인지 아닌지 체크
        if (instance == null) {
            // 시스템 스피커
            instance = new SystemSpeak();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
