package hu.bme.aut.animalfacts.ui.facts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import hu.bme.aut.animalfacts.R;

public class FactsActivity extends AppCompatActivity implements FactsScreen {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_facts);
	}

	@Override
	protected void onStart() {
		super.onStart();
		FactsPresenter.getInstance().attachScreen(this);
	}

	@Override
	protected void onStop() {
		super.onStop();
		FactsPresenter.getInstance().detachScreen();
	}
}
