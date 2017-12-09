package www.ltbx.in.practicederekbanas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] favoriteTVShows = {"Pushing Daisies", "Better Off Ted", "Twin Peaks", "Freaks and Geeks", "Orphan Black", "Walking Dead", "Breaking Bad", "The 400", "Alphas", "Life on Mars"};

        ListAdapter theAdapter = new ArrayAdapter<>(this, R.layout.row_layout, favoriteTVShows);
        ListView theListView = findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tvShowPicked = "You selected " + String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
