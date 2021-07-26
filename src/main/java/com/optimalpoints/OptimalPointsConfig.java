package com.optimalpoints;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

import java.awt.Color;

@ConfigGroup("nmzoptimalpoints")
public interface OptimalPointsConfig extends Config {
    @ConfigItem(
            position = 0,
            keyName = "highlightHull",
            name = "Highlight hull",
            description = "Configures whether or not NPC should be highlighted by hull"
    )
    default boolean highlightHull() {
        return true;
    }

    @ConfigItem(
            position = 1,
            keyName = "highlightOutline",
            name = "Highlight outline",
            description = "Configures whether or not NPC should be highlighted by outline"
    )
    default boolean highlightOutline() {
        return false;
    }

    @ConfigItem(
            position = 2,
            keyName = "highlightTile",
            name = "Highlight tile",
            description = "Configures whether or not NPC should be highlighted by tile"
    )
    default boolean highlightTile() {
        return false;
    }

    @ConfigItem(
            position = 3,
            keyName = "highlightSouthWestTile",
            name = "Highlight south west tile",
            description = "Configures whether or not NPC should be highlighted by south western tile"
    )
    default boolean highlightSouthWestTile() {
        return false;
    }

    @ConfigItem(
            position = 4,
            keyName = "borderWidth",
            name = "Border Width",
            description = "Width of the highlighted NPC border"
    )
    @Range(
            min = 0,
            max = 10
    )
    default int borderWidth()
    {
        return 2;
    }

    @ConfigItem(
            position = 5,
            keyName = "outlineFeather",
            name = "Outline feather",
            description = "Specify between 0-4 how much of the model outline should be faded"
    )
    @Range(
            min = 0,
            max = 4
    )
    default int outlineFeather()
    {
        return 0;
    }

    @ConfigItem(
            position = 6,
            keyName = "rankByDefense",
            name = "Rank By Defense",
            description = "If ticked, ranks enemies based on lowest defense instead of points given.")
    default boolean rankByDefense() { return false; }

    @Range(
            min = 1,
            max = 4
    )
    @ConfigItem(
            position = 7,
            keyName = "maxRankToShow",
            name = "Number of bosses to highlight",
            description = "Number of bosses to highlight in NMZ between 1-4"
    )
    default int maxRankToShow() {
        return 1;
    }

    @ConfigItem(
            position = 8,
            keyName = "npcColor1",
            name = "Highlight Color #1",
            description = "Color of the NPC highlight for the enemy worth the most points"
    )
    @Alpha
    default Color getHighlightColor1() {
        return new Color(255, 223, 0);
    }

    @ConfigItem(
            position = 9,
            keyName = "npcColor2",
            name = "Highlight Color #2",
            description = "Color of the NPC highlight for the enemy worth the second most points"
    )
    @Alpha
    default Color getHighlightColor2() {
        return new Color(192, 192, 192);
    }

    @ConfigItem(
            position = 10,
            keyName = "npcColor3",
            name = "Highlight Color #3",
            description = "Color of the NPC highlight for the enemy worth the third most points"
    )
    @Alpha
    default Color getHighlightColor3() {
        return new Color(205, 127, 50);
    }

    @ConfigItem(
            position = 11,
            keyName = "npcColor4",
            name = "Highlight Color #4",
            description = "Color of the NPC highlight for the enemy worth the least points"
    )
    @Alpha
    default Color getHighlightColor4() {
        return Color.WHITE;
    }
}