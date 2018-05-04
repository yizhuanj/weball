package com.example.yuanyuanzhou.weball;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tianyuli on 4/28/18.
 */

public class FilteredGameAdapter extends ArrayAdapter<Game> {
    private Activity context;
    private List<Game> gameList;

    public FilteredGameAdapter(Activity context, List<Game> gameList) {
        super(context, R.layout.game_entry, gameList);
        this.context = context;
        this.gameList = gameList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.game_entry, null, true);
        TextView listSport = (TextView) listViewItem.findViewById(R.id.listSport);
        TextView listLocation = (TextView) listViewItem.findViewById(R.id.listLocation);
        TextView listTime = (TextView) listViewItem.findViewById(R.id.listTime);
        TextView listNum = (TextView) listViewItem.findViewById(R.id.listNum);
        TextView listComments = (TextView) listViewItem.findViewById(R.id.listComments);
        final Game game = gameList.get(position);

        listSport.setText(game.getSport());
        listLocation.setText(game.getLocation());
        listTime.setText(game.getTime());
        listNum.setText(game.getNum());
        listComments.setText(game.getComments());


        listViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }

        });

        return listViewItem;
    }
}
