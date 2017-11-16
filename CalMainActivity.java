package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalMainActivity extends Activity implements OnClickListener {

	Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
	EditText disp; 
	int op1; 
	int op2; 
	String optr;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_main);
        one = (Button) findViewById(R.id.One);
        two = (Button) findViewById(R.id.Two); 
        three = (Button) findViewById(R.id.Three);
        four = (Button) findViewById(R.id.Four);
        five = (Button) findViewById(R.id.Five);
        six = (Button) findViewById(R.id.Six); 
        seven = (Button) findViewById(R.id.Seven); 
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine); 
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul); 
        div = (Button) findViewById(R.id.div); 
        cancel = (Button) findViewById(R.id.cancel); 
        equal = (Button) findViewById(R.id.equal); 
        disp = (EditText) findViewById(R.id.display); 

        try{ 
        	one.setOnClickListener(this);
        	two.setOnClickListener(this);
        	three.setOnClickListener(this); 
        	four.setOnClickListener(this); 
        	five.setOnClickListener(this); 
        	six.setOnClickListener(this); 
        	seven.setOnClickListener(this); 
        	eight.setOnClickListener(this); 
        	nine.setOnClickListener(this); 
        	zero.setOnClickListener(this); 
        	cancel.setOnClickListener(this);
        	add.setOnClickListener(this); 
        	sub.setOnClickListener(this);
        	mul.setOnClickListener(this); 
        	div.setOnClickListener(this);
        	equal.setOnClickListener(this); 
        	}
        catch(Exception e){ } }

   
    public void operation()
    {
    	if(optr.equals("+"))
    	{ 
    		op2 = Integer.parseInt(disp.getText().toString());
    		disp.setText("");
    		op1 = op1 + op2; 
    		disp.setText("Result : " + Integer.toString(op1));
    		}
    	else if(optr.equals("-"))
    	{ 
    		op2 = Integer.parseInt(disp.getText().toString());
    		disp.setText("");
    		op1 = op1 - op2; 
    		disp.setText("Result : " + Integer.toString(op1));
    		}
    	else if(optr.equals("*"))
    	{
    		op2 = Integer.parseInt(disp.getText().toString());
    		disp.setText(""); 
    		op1 = op1 * op2;
    		disp.setText("Result : " + Integer.toString(op1));
    		} 
    	else if(optr.equals("/"))
    	{
    		op2 = Integer.parseInt(disp.getText().toString()); 
    		disp.setText(""); 
    		op1 = op1 / op2; 
    		disp.setText("Result : " + Integer.toString(op1)); 
    		} 
    	}

   
    	
    @Override 
    public void onClick(View arg0) 
    {
    	Editable str = disp.getText();
    	switch(arg0.getId())
    	{ 
    	case R.id.One:
    		if(op2 != 0)
    		{
    			op2 = 0; 
    			disp.setText("");
    			} 
    		str = str.append(one.getText());
    		disp.setText(str); 
    		break; 
    		case R.id.Two:
    			if(op2 != 0)
    			{
    				op2 = 0;
    				disp.setText("");
    				} 
    			str = str.append(two.getText());
    			disp.setText(str);
    			break;
    			case R.id.Three:
    				if(op2 != 0)
    				{
    					op2 = 0; disp.setText("");
    					} 
    				str = str.append(three.getText()); 
    				disp.setText(str); 
    				break; 
    				case R.id.Four:
    					if(op2 != 0)
    					{ 
    						op2 = 0;
    						disp.setText("");
    						} 
    					str = str.append(four.getText());
    					disp.setText(str);
    					break; 
    					case R.id.Five: 
    						if(op2 != 0)
    						{ 
    							op2 = 0; 
    							disp.setText("");
    							}
    						str = str.append(five.getText()); 
    						disp.setText(str); 
    						break;
    						case R.id.Six:
    							if(op2 != 0)
    							{
    								op2 = 0;
    								disp.setText(""); 
    								}
    							str = str.append(six.getText()); 
    							disp.setText(str); 
    							break;
    							case R.id.Seven:
    								if(op2 != 0)
    								{
    									op2 = 0;
    									disp.setText(""); 
    									}
    								str = str.append(seven.getText()); 
    								disp.setText(str);
    								break; 
    								case R.id.eight:
    									if(op2 != 0)
    									{
    										op2 = 0; disp.setText("");
    										}
    									str = str.append(eight.getText()); 
    									disp.setText(str);
    									break;
    								case R.id.nine:
    									if(op2 != 0)
    									{ 
    										op2 = 0;
    										disp.setText("");
    										} 
    									str = str.append(nine.getText());
    									disp.setText(str); 
    									break;
    									case R.id.cancel:
    										op1 = 0; 
    										op2 = 0;
    										disp.setText(""); 
    										disp.setHint("Enter values :)"); 
    										break;
    										case R.id.add:
    											optr = "+";
    											if(op1 == 0)
    											{ 
    												op1 = Integer.parseInt(disp.getText().toString());
    												disp.setText(""); 
    												}
    											else if(op2 != 0)
    											{
    												op2 = 0; 
    												disp.setText("");
    												} 
    											else
    											{
    												op2 = Integer.parseInt(disp.getText().toString()); 
    												disp.setText("");
    												op1 = op1 + op2;
    												disp.setText("Result : " + Integer.toString(op1));
    												}
    											break;

    										case R.id.sub: 
    											optr = "-"; 
    										if(op1 == 0)
    										{
    											op1 = Integer.parseInt(disp.getText().toString()); 
    											disp.setText(""); 
    											}
    										else if(op2 != 0)
    										{
    											op2 = 0; disp.setText("");
    											}
    										else{ 
    											op2 = Integer.parseInt(disp.getText().toString());
    										disp.setText(""); 
    										op1 = op1 - op2; 
    										disp.setText("Result : " + Integer.toString(op1)); 
    										}
    										break;
    										case R.id.mul:
    											optr = "*"; 
    											if(op1 == 0)
    											{
    												op1 = Integer.parseInt(disp.getText().toString());
    												disp.setText("");
    												}
    											else if(op2 != 0)
    											{
    												op2 = 0; disp.setText("");
    												}
    											else
    											{
    												op2 = Integer.parseInt(disp.getText().toString()); 
    												disp.setText(""); 
    												op1 = op1 * op2;
    												disp.setText("Result : " + Integer.toString(op1)); 
    												} 
    											break;
    											case R.id.div: 
    												optr = "/";
    											if(op1 == 0)
    											{
    												op1 = Integer.parseInt(disp.getText().toString()); 
    												disp.setText(""); 
    												}
    											else if(op2 != 0)
    											{
    												op2 = 0;
    												disp.setText(""); 
    												}
    											else
    											{
    												op2 = Integer.parseInt(disp.getText().toString());
    												disp.setText("");
    												op1 = op1 / op2;
    												disp.setText("Result : " + Integer.toString(op1)); 
    												}
    											break;
    											case R.id.equal:
    												if(!optr.equals(null))
    												{
    													if(op2 != 0)
    													{
    														if(optr.equals("+"))
    														{
    															disp.setText("");
    															
    															disp.setText("Result : " + Integer.toString(op1));
    															}
    														else if(optr.equals("-"))
    														{
    															disp.setText("");
    												
    															disp.setText("Result : " + Integer.toString(op1));
    															}
    														else if(optr.equals("*"))
    														{
    															disp.setText("");
    												
    															disp.setText("Result : " + Integer.toString(op1)); 
    															}
    														else if(optr.equals("/"))
    														{
    															disp.setText("");
    														
    															disp.setText("Result : " + Integer.toString(op1)); 
    															}
    														}
    													else{
    														operation();
    														}
    													}
    												break;
    												} 
    	}
     

    											

    								

    				   	
    

   
 


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cal_main, menu);
        return true;
    }


	
    
}
