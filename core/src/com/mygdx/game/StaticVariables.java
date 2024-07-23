package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Logger;

public class StaticVariables {

    //9:18 ratio to ensure it fits on every device
    //Since game is PORTRAIT mode only, the height is longer than width
    public static final float PPM=16;
//    public static final float VIRTUAL_WIDTH = 432;
//    public static final float VIRTUAL_HEIGHT = 864;
    public static final float VIRTUAL_WIDTH = 720;
    public static final float VIRTUAL_HEIGHT = 1440;

    //Loggers
    public static final Logger enemyLogger = new Logger("EnemyLogger", Logger.DEBUG);
    public static final Logger playerLogger = new Logger("PlayerLogger", Logger.DEBUG);

    //CATEGORY BITS FOR CONTACT MANAGER
    public static final short CATEGORY_PLAYER = 0x0001;
    public static final short CATEGORY_ENEMY  = 0x0002;
    public static final short CATEGORY_WALL   = 0x0004;
    public static final short CATEGORY_ENEMY_SPAWN_AREA   = 0x0008;
    public static final short CATEGORY_OUTER_BOUND  = 0x00016;

    //Increasing difficulty
    public static final float STEADY_SPEED_INCREASE =0.1f;
    public static final float BOOST_SPEED_INCREASE =2.5f;
    public static final float BASE_ENEMY_WAIT_TIME= 5;
    public static final Vector2 BASE_SPEED = new Vector2(0.5f, 0.5f);

    //Most enemies that can be in the map at the same time
    public static final int[] scoreThresholds= {2, 15, 20, 40};
    public static final int MAX_ENEMY_THRESHOLD =5;

    public static final int SAME_COLOR_ENEMY_THRESHOLD=15;


}