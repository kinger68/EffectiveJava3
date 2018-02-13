package com.effectivejava.items.item2;

public class TestBabsBatterTelescoping {
    public static void testBuilderFullyPopulated() {
        BabsBatterTelescoping bb = new BabsBatterTelescoping(
                571448, "Nolan", "Arenado",
                "5", "COL");

        System.out.println("PID:FirstName:LastName:Position:Team");
        System.out.println("====================================");
        System.out.println(bb);
    }

    public static void testBuilderReverseName() {
        // First and Last names reversed.  Hard to see
        BabsBatterTelescoping bb = new BabsBatterTelescoping(
                571448, "Arenado", "Nolan",
                "5", "COL");

        System.out.println("PID:FirstName:LastName:Position:Team");
        System.out.println("====================================");
        System.out.println(bb);
    }

    public static void main(String[] args) {
        TestBabsBatterTelescoping.testBuilderFullyPopulated();
        System.out.println("\n\n");
        TestBabsBatterTelescoping.testBuilderReverseName();
    }
}
