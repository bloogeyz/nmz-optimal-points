package com.optimalpoints;

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Nullable;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class CurrentBossDataTest {

    /**
     * Test that the sort algorithm always returns the same result with draws
     */
    @Test
    public void testSorting(){
        CurrentBossData testBoss1 = new CurrentBossData(new TestNPC(),1 ,1);
        CurrentBossData testBoss2 = new CurrentBossData(new TestNPC(),1 ,2);
        CurrentBossData testBoss3 = new CurrentBossData(new TestNPC(),2 ,1);
        CurrentBossData testBoss4 = new CurrentBossData(new TestNPC(),2 ,2);

        List<CurrentBossData> currentBosses = new ArrayList<>();
        currentBosses.add(testBoss1);
        currentBosses.add(testBoss2);
        currentBosses.add(testBoss3);
        currentBosses.add(testBoss4);

        int count = 0;
        while (count < 10){
            currentBosses.sort(new PointsComparer());
            Assert.assertEquals(currentBosses.get(0), testBoss3);
            Assert.assertEquals(currentBosses.get(1), testBoss4);
            Assert.assertEquals(currentBosses.get(2), testBoss1);
            Assert.assertEquals(currentBosses.get(3), testBoss2);
            count++;
        }

        count = 0;
        while (count < 10) {
            currentBosses.sort(new DefenseComparer());
            Assert.assertEquals(currentBosses.get(0), testBoss3);
            Assert.assertEquals(currentBosses.get(1), testBoss1);
            Assert.assertEquals(currentBosses.get(2), testBoss4);
            Assert.assertEquals(currentBosses.get(3), testBoss2);
            count++;
        }
    }
}

class TestNPC implements NPC{
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Actor getInteracting() {
        return null;
    }

    @Override
    public int getHealthRatio() {
        return 0;
    }

    @Override
    public int getHealthScale() {
        return 0;
    }

    @Override
    public WorldPoint getWorldLocation() {
        return null;
    }

    @Override
    public LocalPoint getLocalLocation() {
        return null;
    }

    @Override
    public int getOrientation() {
        return 0;
    }

    @Override
    public int getCurrentOrientation() {
        return 0;
    }

    @Override
    public int getAnimation() {
        return 0;
    }

    @Override
    public int getPoseAnimation() {
        return 0;
    }

    @Override
    public void setPoseAnimation(int animation) {

    }

    @Override
    public int getIdlePoseAnimation() {
        return 0;
    }

    @Override
    public void setIdlePoseAnimation(int animation) {

    }

    @Override
    public int getIdleRotateLeft() {
        return 0;
    }

    @Override
    public int getIdleRotateRight() {
        return 0;
    }

    @Override
    public int getWalkAnimation() {
        return 0;
    }

    @Override
    public int getWalkRotateLeft() {
        return 0;
    }

    @Override
    public int getWalkRotateRight() {
        return 0;
    }

    @Override
    public int getWalkRotate180() {
        return 0;
    }

    @Override
    public int getRunAnimation() {
        return 0;
    }

    @Override
    public void setAnimation(int animation) {

    }

    @Override
    public int getAnimationFrame() {
        return 0;
    }

    @Override
    public void setActionFrame(int actionFrame) {

    }

    @Override
    public void setAnimationFrame(int frame) {

    }

    @Override
    public int getGraphic() {
        return 0;
    }

    @Override
    public void setGraphic(int graphic) {

    }

    @Override
    public int getSpotAnimFrame() {
        return 0;
    }

    @Override
    public void setSpotAnimFrame(int spotAnimFrame) {

    }

    @Override
    public Polygon getCanvasTilePoly() {
        return null;
    }

    @Nullable
    @Override
    public Point getCanvasTextLocation(Graphics2D graphics, String text, int zOffset) {
        return null;
    }

    @Override
    public Point getCanvasImageLocation(BufferedImage image, int zOffset) {
        return null;
    }

    @Override
    public Point getCanvasSpriteLocation(SpritePixels sprite, int zOffset) {
        return null;
    }

    @Override
    public Point getMinimapLocation() {
        return null;
    }

    @Override
    public int getLogicalHeight() {
        return 0;
    }

    @Override
    public Shape getConvexHull() {
        return null;
    }

    @Override
    public WorldArea getWorldArea() {
        return null;
    }

    @Override
    public String getOverheadText() {
        return null;
    }

    @Override
    public void setOverheadText(String overheadText) {

    }

    @Override
    public int getOverheadCycle() {
        return 0;
    }

    @Override
    public void setOverheadCycle(int cycles) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public int getCombatLevel() {
        return 0;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public NPCComposition getComposition() {
        return null;
    }

    @Nullable
    @Override
    public NPCComposition getTransformedComposition() {
        return null;
    }

    @Override
    public Model getModel() {
        return null;
    }

    @Override
    public int getModelHeight() {
        return 0;
    }

    @Override
    public void setModelHeight(int modelHeight) {

    }

    @Override
    public void draw(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, long hash) {

    }

    @Override
    public Node getNext() {
        return null;
    }

    @Override
    public Node getPrevious() {
        return null;
    }

    @Override
    public long getHash() {
        return 0;
    }
}