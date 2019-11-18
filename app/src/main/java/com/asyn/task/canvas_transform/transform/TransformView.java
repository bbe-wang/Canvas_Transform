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
 * Created by ThinkPad on 2019/11/14.
 */

public class TransformView extends View{
    private Paint mPaint;



    public TransformView(Context context) {
        super(context);
        init();
    }

    public TransformView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TransformView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init(){
        mPaint=new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(4);
        mPaint.setColor(Color.RED);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

   /* 1,平移操作
      //先绘制一个矩形
        canvas.drawRect(0,0,400,400,mPaint);
        //然后再平移50,50

        canvas.translate(50,50);//============平移后，都从50,50开始绘制
        //然后再画一个灰色的矩形 q
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0,0,400,400,mPaint);
        canvas.drawLine(0,0,600,600,mPaint);*/

        /**
         * 缩放1
         */
/*        canvas.drawRect(200,200,700,700,mPaint);
        canvas.scale(0.5f,0.5f);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(200,200,700,700,mPaint);*/

        /**
         * 缩放2
         */
       /* canvas.drawRect(200, 200, 700, 700, mPaint);
        canvas.scale(0.5f,0.5f,200,200);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(200,200,700,700,mPaint);*/

        /**
         * 旋转操作1
         */
       /* canvas.translate(50,50);
        canvas.drawRect(0, 0, 700, 700, mPaint);
        canvas.rotate(45);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0,0,700,700,mPaint);*/

        /**
         * 旋转操作2
         */

        /*canvas.translate(50,50);
        canvas.drawRect(0, 0, 700, 700, mPaint);
        canvas.rotate(45,350,350);//其中 px  py是旋转中心的坐标
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0,0,700,700,mPaint);*/

        /**
         * 倾斜操作
         */
/*
        canvas.drawRect(50,50,700,700,mPaint);
        canvas.skew(0,1);//在y轴上倾斜45度
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(50,50,700,700,mPaint);*/

        /**
         * 切割==
         */

    /*   canvas.drawRect(200,200,700,700,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(200,800,700,1300,mPaint);
         canvas.clipRect(200,200,700,700);//画布被裁剪
         canvas.drawCircle(100,100,100,mPaint);//坐标超出裁剪区域，无法绘制
         canvas.drawCircle(300,300,100,mPaint);
        canvas.drawCircle(300,800,100,mPaint);
        canvas.drawCircle(300,700,100,mPaint);*/

        /**
         * 切割2  反向裁剪
         */
 /*       canvas.drawRect(200,200,700,700,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(200,800,700,1300,mPaint);
        canvas.clipOutRect(200,200,700,700);//画布裁剪外的区域
        canvas.drawCircle(100,100,100,mPaint);//坐标区域在裁剪范围内，绘制成功
        canvas.drawCircle(300,300,100,mPaint);//坐标区域在裁剪范围外，无法绘制*/


        /**
         * 矩阵
         */
        canvas.drawRect(0,0,700,700,mPaint);
        Matrix matrix = new Matrix();
        matrix.setTranslate(50,50);
        canvas.setMatrix(matrix);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0,0,700,700,mPaint);

    }


}
