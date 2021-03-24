package com.optimalpoints;

import lombok.Getter;

public class NMZBoss {
    @Getter
    private final String name;
    @Getter
    private final int normalValue;
    @Getter
    private final int hardValue;
    @Getter
    private final int defenseValue;
    @Getter
    private final int defenseHardValue;

    NMZBoss(String name, int pointsValue, int hardPointsValue, int defenseValue, int hardDefenseValue){
        this.name = name;
        this.normalValue = pointsValue;
        this.hardValue = hardPointsValue;
        this.defenseValue = defenseValue;
        this.defenseHardValue = hardDefenseValue;
    }
}
