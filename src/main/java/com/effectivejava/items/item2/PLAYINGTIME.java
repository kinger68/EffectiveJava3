package com.effectivejava.items.item2;

public enum PLAYINGTIME {
    FULLTIME("F", 5), PARTTIME("M",1.0);

    private final String impact;
    private double rankingScale;

    PLAYINGTIME(String impact, double rankingScale) {
        this.impact = impact;
        this.rankingScale = rankingScale;
    }

    public String impact() { return impact; }
    public double getRankingScale() { return rankingScale; }
}
