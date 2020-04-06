package hu.bme.aut.animalfacts.ui.facts;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import hu.bme.aut.animalfacts.R;

public class FactsFragment extends Fragment implements FactsScreen {


	@Override
	public void onAttach(final Context context) {
		super.onAttach(context);
		FactsPresenter.getInstance().attachScreen(this);
	}

	@Override
	public void onDetach() {
		FactsPresenter.getInstance().detachScreen();
		super. onDetach();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_facts, container, false);
		return view;
	}
}
