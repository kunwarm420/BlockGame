package com.mygdx.fallingblocks.entity.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

import static com.mygdx.fallingblocks.GlobalStaticVariables.*;


/**
 * For Android only
 */
public class GesturePlayerController implements GestureDetector.GestureListener {

    private final Body playerBody;
    private final Sound tapSound;

    public GesturePlayerController(Body playerBody){
        this.playerBody=playerBody;
        this.tapSound= Gdx.audio.newSound(Gdx.files.internal("sound/tap.wav"));
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
//        System.out.println("User touched at: "+ x + "  : "+ y);
        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {

        tapSound.play();
        if (Math.abs(velocityX) > Math.abs(velocityY)) {
            if (velocityX > 0) {
                playerBody.setLinearVelocity(new Vector2(PLAYER_MOVEMENT_SPEED, 0));
            } else {
                playerBody.setLinearVelocity(new Vector2(-PLAYER_MOVEMENT_SPEED, 0));
            }

        } else {
            if (velocityY > 0) {
                playerBody.setLinearVelocity(new Vector2(0f, -PLAYER_MOVEMENT_SPEED));
            } else {
                playerBody.setLinearVelocity(new Vector2(0f, PLAYER_MOVEMENT_SPEED));
            }

        }
        return true;

    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    @Override
    public void pinchStop() {

    }
}
