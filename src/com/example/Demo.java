package com.example;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

	public class Demo extends TextView 
	   {
	    Context context;
	    String firstText;  
	    Paint mPaint = new Paint();
		
	
	 public Demo(Context context,AttributeSet attrs)
	   {
	    super(context);
	    this.context = context;
	    this.firstText = attrs.getAttributeValue("http://schemas.android.com/apk/res/com.example", "first_name");
	   }
	
	 
	  public Demo(Context context)
	   {
	  super(context);
	  this.context = context;
	  Log.i("sampletextview", "MyTextView");
	   }
	
	    @Override
	    protected void onDraw(Canvas canvas) 
	    {
	    super.onDraw(canvas);
	    setText(firstText);
	    setTextSize(50);
	    canvas.skew(1.0f, 0.3f);  //change values to suit your needs
	    Rotate3dAnimation skew = new Rotate3dAnimation(-20, 30, 200, 200, 0, false);   //change values to suit your needs
	    startAnimation(skew);	    
	    }
	      
}
