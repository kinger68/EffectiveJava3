package com.effectivejava.items.item2;

public class TestBabsBatterBuilder {
    public static void testBuilderFullyPopulated() {
        BabsBatter bb = new BabsBatter.Builder()
                .power(POWER.EXTREME)
                .speed(SPEED.SIGNIFICANT)
                .average(AVERAGE.MODERATE)
                .pid(545361)
                .firstName("Mike")
                .lastName("Trout")
                .position("8o")
                .teamName("LAA")
                .build();
        System.out.println(bb);
    }

    public static void testBuilderNoSpeed() {
        BabsBatter bb = new BabsBatter.Builder()
                .power(POWER.EXTREME)
                .average(AVERAGE.EXTREME)
                .pid(571448)
                .firstName("Nolan")
                .lastName("Arenado")
                .position("5")
                .teamName("COL")
                .build();
        System.out.println(bb);
    }

    public static void testBuilderNoTeam() {
        BabsBatter bb = new BabsBatter.Builder()
                .power(POWER.EXTREME)
                .average(AVERAGE.EXTREME)
                .pid(571448)
                .firstName("Nolan")
                .lastName("Arenado")
                .position("5")
                .build();
        System.out.println(bb);
    }

    public static void main(String[] args) throws InterruptedException {
        TestBabsBatterBuilder.testBuilderFullyPopulated();
        Thread.sleep(2000);
        TestBabsBatterBuilder.testBuilderNoSpeed();
        Thread.sleep(2000);
        TestBabsBatterBuilder.testBuilderNoTeam();
        Thread.sleep(2000);
    }
}
