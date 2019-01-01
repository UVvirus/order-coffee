package com.example.udacity;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.text.*;

public class MainActivity extends Activity 
{int quantity=1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void submitOrder(View view){
		//int numberOfCoffee = 2;
		display(quantity);
		displayPrice(quantity*5);
	}
	public void plus(View v){
		
		quantity=quantity+1;
		display(quantity);
	}
public void minus(View v){
	
	quantity=quantity-1;
	display(quantity);
}
	private void display(int number)
	{
		// TODO: Implement this method
		TextView textview=(TextView) findViewById(R.id.textView1);
		textview.setText(""+number);
	}
	private void displayPrice(int number){
		TextView  textView1=(TextView) findViewById(R.id.displayprice);
		textView1.setText(NumberFormat.getCurrencyInstance().format(number));
	}
	
}
