package hu.bme.aut.animalfacts.ui.about;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import hu.bme.aut.animalfacts.R;

public class AboutActivity extends AppCompatActivity implements AboutScreen {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	@Override
	protected void onStart() {
		super.onStart();
		AboutPresenter.getInstance().attachScreen(this);
	}

	@Override
	protected void onStop() {
		super.onStop();
		AboutPresenter.getInstance().detachScreen();
	}
}
