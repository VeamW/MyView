package com.android.myview.v1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	
	//绘制元素
	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setTextSize(30);
		paint.setColor(0xffff0000);
		canvas.drawText("hello", 0, 40,paint );
		//线
		canvas.drawLine(0, 60, 100, 60, paint);
		//圆形
		canvas.drawCircle(30, 100, 30, paint);
		//矩形
		canvas.drawRect(0,140,100,190, paint);
		//圆角矩形
		RectF rect = new RectF(0, 200, 100, 300);
		canvas.drawRoundRect(rect, 10, 10, paint);
		
	}

	
}
