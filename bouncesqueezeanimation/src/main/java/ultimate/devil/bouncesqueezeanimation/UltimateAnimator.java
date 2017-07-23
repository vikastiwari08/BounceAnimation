package ultimate.devil.bouncesqueezeanimation;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by Vikas on 23-Jul-17.
 */

public class UltimateAnimator {
    private Context context;

    public UltimateAnimator(Context mContext){
        this.context = mContext;
    }

    public void startBounceAnimation(View view){
       Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bounce2);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        BounceAnimator interpolator = new BounceAnimator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);
    }

    public void startSqueezeBounceAnimation(View view){

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    startBounceAnimation(view);
                    // Do what you want
                    return true;
                }else if (motionEvent.getAction()== MotionEvent.ACTION_DOWN){
                    Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bounce);
                    view.startAnimation(myAnim);
                    return true;
                }
                return false;
            }
        });
    }

    private class BounceAnimator implements android.view.animation.Interpolator {
        private double mAmplitude = 1;
        private double mFrequency = 10;

        BounceAnimator(double amplitude, double frequency){
            this.mAmplitude = amplitude;
            this.mFrequency = frequency;
        }


        @Override
        public float getInterpolation(float time) {
            return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                    Math.cos(mFrequency * time) + 1);
        }
    }
}
