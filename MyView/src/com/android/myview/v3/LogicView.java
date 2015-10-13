package com.android.myview.v3;

import java.util.Random;

import com.android.myview.v3.BaseView.MyThread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

public class LogicView extends BaseView {
	private Paint paint = new Paint();
	private float rx=0;
	private RectF oval = new RectF(0, 60, 100, 160);
	private float sweepAngle = 0;

	@Override
	protected void drawSub(Canvas canvas) {
		// TODO Auto-generated method stub
		paint.setTextSize(30);
		canvas.drawText("Logic View", rx, 30, paint);
		
		canvas.drawArc(oval, 0, sweepAngle, true, paint);

	}

	public LogicView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		Random rand = new Random();
		rx+=3;
		
		if (rx>getWidth()) {
			rx=0-paint.measureText("Logic View");
		}
		
		sweepAngle+=2;
		
		if (sweepAngle>360) {
			sweepAngle=0;
		}
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		paint.setARGB(255,r,g,b);
	}

	public LogicView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void logic() {
		// TODO Auto-generated method stub

	}

}
