package com.github.programmerr47.optimizedrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * @author Michael Spitsin
 * @since 2016-09-04
 */
public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.GameViewHolder> {
    private final List<Game> games;

    public GameListAdapter(List<Game> games) {
        this.games = games;
    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_game, null, false);
        return new GameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GameViewHolder holder, int position) {
        Game game = games.get(position);
        holder.icon.setImageResource(game.getIconId());
        holder.title.setText(game.getTitle());
        holder.description.setText(game.getDescription());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    final class GameViewHolder extends RecyclerView.ViewHolder {
        public final ImageView icon = bind(R.id.icon);
        public final TextView title = bind(R.id.title);
        public final TextView description = bind(R.id.description);

        public GameViewHolder(View itemView) {
            super(itemView);
        }

        @SuppressWarnings("unchecked")
        private <T> T bind(int resId) {
            return (T) itemView.findViewById(resId);
        }
    }
}
