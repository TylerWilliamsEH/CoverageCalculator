package com.bostik.coveragecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	TextView _eighthinchResult;
	TextView _quarterinchResult;
	TextView _halfinchResult;
	TextView _threequarterinchResult;
	TextView _inchResult;
	TextView _gallonsResult;
	TextView _metalResult;
	TextView _plasticResult;
	Button _button;
	EditText _squareFootageEditText;

	Double _eighthinchCalc;
	Double _quarterinchCalc;
	Double _halfinchCalc;
	Double _threequarterinchCalc;
	Double _inchCalc;
	Double _gallonsCalc;
	Double _metalCalc;
	Double _plasticCalc;

	Double _sqFtEntry;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_eighthinchResult = (TextView) findViewById(R.id.eightinchresult);
		_quarterinchResult = (TextView) findViewById(R.id.quarterinchresult);
		_halfinchResult = (TextView) findViewById(R.id.halfinchresult);
		_threequarterinchResult = (TextView) findViewById(R.id.threequarterinchresult);
		_inchResult = (TextView) findViewById(R.id.inchresult);
		_gallonsResult = (TextView) findViewById(R.id.gallonsresult);
		_metalResult = (TextView) findViewById(R.id.metalresult);
		_plasticResult = (TextView) findViewById(R.id.plasticresult);
		_button = (Button) findViewById(R.id.calculatebutton);
		_squareFootageEditText = (EditText) findViewById(R.id.editText1);

		_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
					_sqFtEntry = Double.parseDouble(_squareFootageEditText
							.getText().toString());
					_eighthinchCalc = _sqFtEntry / 50;
					_quarterinchCalc = _sqFtEntry / 25;
					_halfinchCalc = _sqFtEntry / 12;
					_threequarterinchCalc = _sqFtEntry / 9;
					_inchCalc = _sqFtEntry / 6;
					_gallonsCalc = _sqFtEntry / 400;
					_metalCalc = _sqFtEntry / 15;
					_plasticCalc = _sqFtEntry / 17;
					
					_eighthinchResult.setText(_eighthinchCalc.toString(), null);
					_quarterinchResult.setText(_quarterinchCalc.toString(), null);
					_halfinchResult.setText(_halfinchCalc.toString(), null);
					_threequarterinchResult.setText(_threequarterinchCalc.toString(), null);
					_inchResult.setText(_inchCalc.toString(), null);
					_gallonsResult.setText(_gallonsCalc.toString(), null);
					_metalResult.setText(_metalCalc.toString(), null);
					_plasticResult.setText(_plasticCalc.toString(), null);
					
				}
				catch (Exception e)
				{
					System.out.println(e.toString());
				}
			}
		});
	}

}
