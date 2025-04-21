package com.vlados.inc.vlados;
public class Main {
    public static void main(String[] args) throws Exception {
        VladOSCore vlad = new VladOSCore();

        vlad.createFile("test.vtxt", "Привет, VladOS!");
        vlad.readFile("test.vtxt");
        vlad.listFiles();

        vlad.createFile("hello.vbat", "meow\ncatbot");
        vlad.runScript("hello.vbat");
    }
}
