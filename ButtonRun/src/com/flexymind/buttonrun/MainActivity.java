package com.flexymind.buttonrun;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button runButton = new Button(this);
		runButton.setText("Run away!");
		
		final RelativeLayout runLayout = (RelativeLayout)findViewById(R.id.runLayout);
		runLayout.addView(runButton);
		

		final RelativeLayout.LayoutParams buttonParams = 
				new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		
		runButton.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Random rand = new Random();
				buttonParams.leftMargin = rand.nextInt(runLayout.getWidth() - 100);
				buttonParams.topMargin = rand.nextInt(runLayout.getHeight() - 100);
				
				runButton.setLayoutParams(buttonParams);
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
