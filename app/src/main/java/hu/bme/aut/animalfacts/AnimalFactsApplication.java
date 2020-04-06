package hu.bme.aut.animalfacts;

import android.app.Application;

import hu.bme.aut.animalfacts.ui.UIModule;

public class AnimalFactsApplication extends Application {

	public static AnimalFactsApplicationComponent injector;

	@Override
	public void onCreate() {
		super.onCreate();

		injector = DaggerAnimalFactsApplicationComponent.builder().
						uIModule(
								new UIModule(this)
						).build();
	}
}
