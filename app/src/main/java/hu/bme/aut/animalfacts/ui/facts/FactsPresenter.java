package hu.bme.aut.animalfacts.ui.facts;

import hu.bme.aut.animalfacts.ui.Presenter;

public class FactsPresenter extends Presenter<FactsScreen> {

	private static FactsPresenter instance = null;

	private FactsPresenter() {
	}

	public static FactsPresenter getInstance() {
		if (instance == null) {
			instance = new FactsPresenter();
		}
		return instance;
	}

	@Override
	public void attachScreen(FactsScreen screen) {
		super.attachScreen(screen);
	}

	@Override
	public void detachScreen() {
		super.detachScreen();
	}
}
