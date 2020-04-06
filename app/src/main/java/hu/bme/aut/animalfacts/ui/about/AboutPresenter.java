package hu.bme.aut.animalfacts.ui.about;

import hu.bme.aut.animalfacts.ui.Presenter;

public class AboutPresenter extends Presenter<AboutScreen> {

	private static AboutPresenter instance = null;

	private AboutPresenter() {
	}

	public static AboutPresenter getInstance() {
		if (instance == null) {
			instance = new AboutPresenter();
		}
		return instance;
	}

	@Override
	public void attachScreen(AboutScreen screen) {
		super.attachScreen(screen);
	}

	@Override
	public void detachScreen() {
		super.detachScreen();
	}
}
