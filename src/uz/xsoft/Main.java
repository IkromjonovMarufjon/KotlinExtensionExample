package uz.xsoft;

import uz.xsoft.firstexample.FirstExampleKt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("John");
        list.add("Alisa");
        list.add("Karl");
        FirstExampleKt.swap(list,1,2);
        for (String item : list) {
            System.out.println(item);
        }
    }
}

final class Extentions {
    static class String{
        static void show(){
            System.out.println("show");
        }
    }
}