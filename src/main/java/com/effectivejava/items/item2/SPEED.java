package com.effectivejava.items.item2;

public enum SPEED {
    EXTREME("S+", 5), SIGNIFICANT("SB", 2.5), MODERATE("s", 1);

    private final String impact;
    private double rankingScale;

    SPEED(String impact, double rankingScale) {
        this.impact = impact;
        this.rankingScale = rankingScale;
    }

    public String impact() { return impact; }
    public double getRankingScale() { return rankingScale; }
}
