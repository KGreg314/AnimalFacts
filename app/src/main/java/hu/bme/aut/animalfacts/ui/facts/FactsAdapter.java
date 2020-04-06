package hu.bme.aut.animalfacts.ui.facts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import hu.bme.aut.animalfacts.R;
import hu.bme.aut.animalfacts.model.Fact;

public class FactsAdapter extends RecyclerView.Adapter<FactsAdapter.ViewHolder> {

	private Context context;
	private List<Fact> factsList;

	public FactsAdapter(Context context, List<Fact> factsList) {
		this.context = context;
		this.factsList = factsList;
	}

	public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
		View itemView = LayoutInflater.from(viewGroup.getContext())
				.inflate(R.layout.card_fact, viewGroup, false);
		return new ViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
	}

	@Override
	public int getItemCount() {
		return factsList.size();
	}

	protected static class ViewHolder extends RecyclerView.ViewHolder {
		public ViewHolder(View itemView) {
			super(itemView);
		}
	}
}
