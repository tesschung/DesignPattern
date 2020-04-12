package com.AbstractFactoryPattern02;

import com.AbstractFactoryPattern02.abst.Button;
import com.AbstractFactoryPattern02.abst.GuiFac;
import com.AbstractFactoryPattern02.abst.TextArea;
import com.AbstractFactoryPattern02.concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();

        System.out.println(button.click());
        System.out.println(textArea.getText());
    }
}
