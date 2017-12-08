package com.elevationstudios.gladerunner;

import android.util.Log;

import com.elevationstudios.framework.Graphics;
import com.elevationstudios.framework.Pixmap;
import com.elevationstudios.framework.Sound;
/**
 * Created by Kenneth on 30-Nov-17.
 */

public class Assets {

    public static Pixmap background;

    //Buttons
    public static Pixmap buyButton;
    public static Pixmap backButton;
    public static Pixmap dieButton;
    public static Pixmap helpButton;
    public static Pixmap menuButton;
    public static Pixmap nextButton;
    public static Pixmap playButton;
    public static Pixmap optionButton;
    public static Pixmap pauseButton;
    public static Pixmap returnButton;
    public static Pixmap shopButton;

    public static Pixmap btnAchievement;
    public static Pixmap btnLeaderboard;

    public static Pixmap checked;
    public static Pixmap unchecked;

    public static Pixmap rocks;
    public static Pixmap spikes;

    public static Pixmap helpMove;

    public static Pixmap health;
    public static Pixmap knife;
    public static Pixmap ninjaSprite[][] = new Pixmap[8][10];
    //0-3 = state, 4-5 = groundattacks, 6-7 = aerialattacks

    public static Pixmap zombieSprite[][] = new Pixmap[3][12];
    //0 = idle, 1 = attack, 2 = dead

}
