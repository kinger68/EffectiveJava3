package com.effectivejava.items.item2;

public enum AVERAGE {
    EXTREME("A+", 5), SIGNIFICANT("AV", 2.5), MODERATE("a", 1);

    private final String impact;
    private double rankingScale;

    AVERAGE(String impact, double rankingScale) {
        this.impact = impact;
        this.rankingScale = rankingScale;
    }

    public String impact() { return impact; }
    public double getRankingScale() { return rankingScale; }
}
