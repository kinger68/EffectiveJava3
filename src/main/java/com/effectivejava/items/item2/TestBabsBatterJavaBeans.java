package com.effectivejava.items.item2;

import java.util.ArrayList;
import java.util.List;

public class TestBabsBatterJavaBeans {
    public static void testJavaBeanFullyPopulated() {
        BabsBatterJavaBeans bb = getBabsBatterJavaBeans();
        System.out.println(bb);
    }

    public static void testJavaBeanIncompleteObject() {
        BabsBatterJavaBeans bb = getBabsBatterJavaBeansIncomplete();
        System.out.println(bb);
    }

    public static void testJavaBeanSortByLastName() {
        BabsBatterJavaBeans bb1 = getBabsBatterJavaBeansIncomplete();
        bb1.setLastName("Arenado");
        BabsBatterJavaBeans bb = getBabsBatterJavaBeans();
        List<BabsBatterJavaBeans> playerList = new ArrayList<>();
        playerList.add(bb1);
        playerList.add(bb);
        playerList.sort(
                (BabsBatterJavaBeans o1, BabsBatterJavaBeans o2)->
                        o1.getLastName().compareTo(o2.getLastName()));
        System.out.println( "playerList = " + playerList );

    }

    // Sort by last name but... what if the last name wasn't set
    public static void testJavaBeanSortByLastNameBoom() {
        BabsBatterJavaBeans bbInc = getBabsBatterJavaBeansIncomplete();
        BabsBatterJavaBeans bb = getBabsBatterJavaBeans();
        List<BabsBatterJavaBeans> playerList = new ArrayList<>();
        playerList.add(bbInc);
        playerList.add(bb);
        playerList.sort((BabsBatterJavaBeans o1, BabsBatterJavaBeans o2)->
                o1.getLastName().compareTo(o2.getLastName()));
        System.out.println( "playerList = " + playerList );

    }

    public static void main(String[] args) throws InterruptedException {
        TestBabsBatterJavaBeans.testJavaBeanFullyPopulated();
        Thread.sleep(2000);
        TestBabsBatterJavaBeans.testJavaBeanIncompleteObject();
        Thread.sleep(2000);
        TestBabsBatterJavaBeans.testJavaBeanSortByLastName();
        Thread.sleep(2000);
        TestBabsBatterJavaBeans.testJavaBeanSortByLastNameBoom();
        Thread.sleep(2000);
    }

    private static BabsBatterJavaBeans getBabsBatterJavaBeans() {
        BabsBatterJavaBeans bb = new BabsBatterJavaBeans();
        bb.setPid(545361);
        bb.setFirstName("Mike");
        bb.setLastName("Trout");
        bb.setPosition("8o");
        bb.setTeamName("LAA");
        return bb;
    }

    private static BabsBatterJavaBeans getBabsBatterJavaBeansIncomplete() {
        BabsBatterJavaBeans bb = new BabsBatterJavaBeans();
        bb.setPid(571448);
        bb.setFirstName("Nolan");
        bb.setPosition("5");
        bb.setTeamName("COL");
        return bb;
    }
}
