package com.mycompany.ultrasemojicombat;

public class UltrasEmojiCombat {

    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        L[1] = new Lutador("Putscript", "Basil", 29, 14, 2, 3, 1.68f, 57.8f);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        L[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93f, 81.6f);
        L[4] = new Lutador("UF0Cobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        L[5] = new Lutador("Neardaart", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);

        Luta UEC01= new Luta();
        
        UEC01.marcarLuta(L[0], L[1]);
        UEC01.lutar();
        L[0].status();
        L[1].status();
    }
}
