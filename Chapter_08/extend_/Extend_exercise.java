package com.extend_;

public class Extend_exercise {
    public static void main(String[] args) {
        PC pc = new PC("intel" , 15 , 500 , "IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("intel" , 15 , 500 , "yello");
        notePad.printInfo2();
    }
}
