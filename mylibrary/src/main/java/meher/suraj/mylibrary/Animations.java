package meher.suraj.mylibrary;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;



public class Animations {
    public static void setAnimation(Context context, View view, Type animation){
        view.startAnimation(chooseAnimation(animation,context));
    }
    public static void setAnimation(Context context, View view, Type animation,long duration){
        view.startAnimation(chooseAnimation(animation,context,duration));
    }
    public static void setAnimation(Dialog view, Type animation){
        view.getWindow().getAttributes().windowAnimations=chooseAnimation(animation);
    }
    public static void setAnimation(FragmentTransaction fragmentTransaction, Type animation){
        chooseAnimation(animation,fragmentTransaction);
    }
    @SuppressLint("ResourceType")
    @NonNull
    private static int chooseAnimation(Type animation) {
        int anim = 0;
        if (animation == Type.ZOOM) {
            anim = R.style.DialogAnimationZoom;
        } else if (animation == Type.FADE) {
            anim = R.style.DialogAnimationFade;
        } else if (animation == Type.CARD) {
            anim = R.style.DialogAnimationCard;
        } else if (animation == Type.SHRINK) {
            anim = R.style.DialogAnimationShrink;
        } else if (animation == Type.SWIPE_LEFT) {
            anim = R.style.DialogAnimationSwipeLeft;
        } else if (animation == Type.SWIPE_RIGHT) {
            anim = R.style.DialogAnimationSwipeRight;
        } else if (animation == Type.IN_OUT) {
            anim = R.style.DialogAnimationInOut;
        } else if (animation == Type.SPIN) {
            anim = R.style.DialogAnimationSpin;
        } else if (animation == Type.SPLIT) {
            anim = R.style.DialogAnimationSplit;
        } else if (animation == Type.DIAGONAL) {
            anim = R.style.DialogAnimationDiagonal;
        } else if (animation == Type.WINDMILL) {
            anim = R.style.DialogAnimationWindMill;
        } else if (animation == Type.SLIDE_UP) {
            anim = R.style.DialogAnimationSlideUp;
        } else if (animation == Type.SLIDE_DOWN) {
            anim = R.style.DialogAnimationSlideDown;
        } else if (animation == Type.SLIDE_LEFT) {
            anim = R.style.DialogAnimationSlideLeft;
        } else if (animation == Type.SLIDE_RIGHT) {
            anim = R.style.DialogAnimationSlideRight;
        } else if (animation == Type.DEFAULT) {
            anim = R.style.DialogAnimation;
        }
        return anim;
    }
    @NonNull
    private static android.view.animation.Animation chooseAnimation(Type animation, Context context) {
        android.view.animation.Animation anim = null;
        if (animation == Type.ZOOM) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_zoom_enter);
            anim.setDuration(1800);
        } else if (animation == Type.FADE) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_fade_enter);
            anim.setDuration(1800);
        } else if (animation == Type.CARD) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_card_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SHRINK) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_shrink_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SWIPE_LEFT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_swipe_left_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SWIPE_RIGHT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_swipe_right_enter);
            anim.setDuration(1800);
        } else if (animation == Type.IN_OUT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_in_out_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SPIN) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_spin_enter);
            anim.setDuration(1800);
            anim.setFillAfter(true);
        } else if (animation == Type.SPLIT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_split_enter);
            anim.setDuration(1800);
        } else if (animation == Type.DIAGONAL) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_diagonal_right_enter);
            anim.setDuration(1800);
        } else if (animation == Type.WINDMILL) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_windmill_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SLIDE_UP) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_up_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SLIDE_DOWN) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_down_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SLIDE_LEFT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_left_enter);
            anim.setDuration(1800);
        } else if (animation == Type.SLIDE_RIGHT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_in_left);
            anim.setDuration(1800);
        } else if (animation == Type.DEFAULT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_down_enter);
            anim.setDuration(1800);
        }
        return anim;
    }

    @NonNull
    private static void chooseAnimation(Type animation, FragmentTransaction fragmentTransaction) {
        if (animation == Type.ZOOM) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_zoom_enter,R.anim.animate_zoom_exit);
        } else if (animation == Type.FADE) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_fade_enter,R.anim.animate_fade_exit);
        } else if (animation == Type.CARD) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_card_enter,R.anim.animate_card_exit);
        } else if (animation == Type.SHRINK) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_shrink_enter,R.anim.animate_shrink_exit);
        } else if (animation == Type.SWIPE_LEFT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_swipe_left_enter,R.anim.animate_swipe_left_exit);
        } else if (animation == Type.SWIPE_RIGHT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_swipe_right_enter,R.anim.animate_swipe_right_exit);
        } else if (animation == Type.IN_OUT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_in_out_enter,R.anim.animate_in_out_exit);
        } else if (animation == Type.SPIN) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_spin_enter,R.anim.animate_spin_exit);
        } else if (animation == Type.SPLIT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_split_enter,R.anim.animate_split_exit);
        } else if (animation == Type.DIAGONAL) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_diagonal_right_enter,R.anim.animate_diagonal_right_exit);
        } else if (animation == Type.WINDMILL) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_windmill_enter,R.anim.animate_windmill_exit);
        } else if (animation == Type.SLIDE_UP) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_slide_up_enter,R.anim.animate_slide_up_exit);
        } else if (animation == Type.SLIDE_DOWN) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_slide_down_enter,R.anim.animate_slide_down_exit);
        } else if (animation == Type.SLIDE_LEFT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_slide_left_enter,R.anim.animate_slide_left_exit);
        } else if (animation == Type.SLIDE_RIGHT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_slide_in_left,R.anim.animate_slide_out_right);
        } else if (animation == Type.DEFAULT) {
            fragmentTransaction.setCustomAnimations(R.anim.animate_slide_down_enter,R.anim.animate_slide_down_exit);
        }
    }

    @NonNull
    private static android.view.animation.Animation chooseAnimation(Type animation, Context context,long duration) {
        android.view.animation.Animation anim = null;
        if (animation == Type.ZOOM) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_zoom_enter);
            anim.setDuration(duration);
        } else if (animation == Type.FADE) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_fade_enter);
            anim.setDuration(duration);
        } else if (animation == Type.CARD) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_card_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SHRINK) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_shrink_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SWIPE_LEFT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_swipe_left_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SWIPE_RIGHT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_swipe_right_enter);
            anim.setDuration(duration);
        } else if (animation == Type.IN_OUT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_in_out_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SPIN) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_spin_enter);
            anim.setDuration(duration);
            anim.setFillAfter(true);
        } else if (animation == Type.SPLIT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_split_enter);
            anim.setDuration(duration);
        } else if (animation == Type.DIAGONAL) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_diagonal_right_enter);
            anim.setDuration(duration);
        } else if (animation == Type.WINDMILL) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_windmill_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SLIDE_UP) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_up_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SLIDE_DOWN) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_down_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SLIDE_LEFT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_left_enter);
            anim.setDuration(duration);
        } else if (animation == Type.SLIDE_RIGHT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_in_left);
            anim.setDuration(duration);
        } else if (animation == Type.DEFAULT) {
            anim = AnimationUtils.loadAnimation(context, R.anim.animate_slide_down_enter);
            anim.setDuration(duration);
        }
        return anim;
    }

}
