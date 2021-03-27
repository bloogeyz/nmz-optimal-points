package com.optimalpoints;

import lombok.Getter;
import net.runelite.api.NPC;

import java.util.Comparator;

public class CurrentBossData {
    @Getter
    private final Integer points_score;
    @Getter
    private final Integer defense_score;

    private NPC npcData;

    public CurrentBossData(NPC npc, int points_score, int defense_score)
    {
        this.npcData = npc;
        this.points_score = points_score;
        this.defense_score = defense_score;
    }

    // For some reason this doesn't work with the lombok annotation
    public NPC getNpcData() {
        return npcData;
    }
}

class PointsComparer implements Comparator<CurrentBossData> {

    @Override
    public int compare(CurrentBossData o1, CurrentBossData o2) {
        Integer score1 = o1.getPoints_score();
        Integer score2 = o2.getPoints_score();
        return score2.compareTo(score1);
    }
}

class DefenseComparer implements Comparator<CurrentBossData> {

    @Override
    public int compare(CurrentBossData o1, CurrentBossData o2) {
        Integer score1 = o1.getDefense_score();
        Integer score2 = o2.getDefense_score();
        return score1.compareTo(score2);
    }
}

