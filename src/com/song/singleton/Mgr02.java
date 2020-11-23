package com.song.singleton;

public class Mgr02 {
    private static Mgr02 INSTANCE;
    private Mgr02(){}
    public static Mgr02 getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(()->
                    System.out.println(Mgr02.getINSTANCE().hashCode())).start();
        }
    }
}
