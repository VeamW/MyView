package com.android.myview.v4;

import com.android.myview.v3.BaseView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

public class NumTest extends BaseView {

	private Paint paint = new Paint();

	@Override
	protected void drawSub(Canvas canvas) {
		// TODO Auto-generated method stub
		paint.setTextSize(30);
		canvas.drawText("I AM WHY", 0, 30, paint);

	}

	public NumTest(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public NumTest(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void logic() {
		// TODO Auto-generated method stub

	}

}
