package com.AbstractFactoryPattern02.concrete;

import com.AbstractFactoryPattern02.abst.Button;
import com.AbstractFactoryPattern02.abst.GuiFac;
import com.AbstractFactoryPattern02.abst.TextArea;

public class FactoryInstance {

    public static GuiFac getGuiFac() {

        System.getProperty("os.name");
        switch (getOsCode()) {
            case 0:
                return new LinuxGuiFac();
        }
        return null;
    }

    private static int getOsCode() {
        if(System.getProperty("os.name").equals("Mac OS X")) {
            return 1;
        }
        return 0;
    }
}



class LinuxButton implements Button {
    @Override
    public String click() {
        return "리눅스버튼";
    }
}



class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}


class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스텍스트에어리어";
    }
}
