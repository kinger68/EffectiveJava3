package com.effectivejava.items.item2;

public enum POWER {
    EXTREME("P+", 5), SIGNIFICANT("PW", 2.5), MODERATE("p", 1);

    private final String impact;
    private double rankingScale;

    POWER(String impact, double rankingScale) {
        this.impact = impact;
        this.rankingScale = rankingScale;
    }

    public String impact() { return impact; }
    public double getRankingScale() { return rankingScale; }
}
