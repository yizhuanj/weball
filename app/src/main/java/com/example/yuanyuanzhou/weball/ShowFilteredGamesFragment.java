package com.example.yuanyuanzhou.weball;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.view.View;
import com.example.yuanyuanzhou.weball.R;

/*public class ShowFilteredGames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_filtered_games);
    }


}*/

public class ShowFilteredGamesFragment extends Fragment {
    ArrayList<Game> lista;
    ListView listViewGame;

    private View root;

    public ShowFilteredGamesFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_show_filtered_games, container, false);
        listViewGame = (ListView) root.findViewById(R.id.listViewGame);
        lista = new ArrayList<Game>();
        lista.add(new Game("Basketball", "5032 Forbes Ave.", "No ball needed. Just come!", "May-04-2018 16:40 - 18:40", 11));
        lista.add(new Game("Basketball", "4614 5TH Ave.", "Bring you own ball.", "May-05-2018 10:00 - 11:30", 2));
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        FilteredGameAdapter adapter = new FilteredGameAdapter(getActivity(), lista);
        listViewGame.setAdapter(adapter);
    }
}