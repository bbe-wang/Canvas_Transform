package com.asyn.task.canvas_transform.transform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ThinkPad on 2019/11/15.
 */

public class SaveRestoreView extends View{
    private Paint mPaint;



    public SaveRestoreView(Context context) {
        super(context);
        init();
    }

    public SaveRestoreView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SaveRestoreView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init(){
        mPaint=new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(4);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       /* canvas.drawRect(200,200,700,700,mPaint);
        canvas.save();
        canvas.translate(50,50);

        canvas.save();
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0,0,500,500,mPaint);

        canvas.restore();
        canvas.restore();
        mPaint.setColor(Color.BLUE);
        canvas.drawLine(0,0,400,400,mPaint);*/

        canvas.drawRect(200,200,600,600,mPaint);

        int mLayerId=canvas.saveLayer(0,0,800,800,mPaint);
        mPaint.setColor(Color.GRAY);
        Matrix matrix=new Matrix();
        matrix.setTranslate(20,20);
        canvas.setMatrix(matrix);
        canvas.drawRect(0,0,700,700,mPaint);
        canvas.restoreToCount(mLayerId);

        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0,0,100,100,mPaint);
    }



}
