package fr.istic.mmm.scinov.eventdetail;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import fr.istic.mmm.scinov.R;
import fr.istic.mmm.scinov.fragment.DetailFragment;
import fr.istic.mmm.scinov.fragment.MapFragment;

public class EventDetailActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        if(findViewById(R.id.detailFrame) != null) {
            if(savedInstanceState != null) {
                return;
            }

            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setArguments(getIntent().getExtras());

            MapFragment mapFragment = new MapFragment();
            mapFragment.setArguments(getIntent().getExtras());

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
            .add(R.id.detailFrame, detailFragment)
            .add(R.id.mapFrame, mapFragment)
            .commit();

        }
    }

}
