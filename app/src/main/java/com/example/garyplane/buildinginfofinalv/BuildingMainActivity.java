package com.example.garyplane.buildinginfofinalv;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class BuildingMainActivity extends ActionBarActivity {

    CardView abbeyCard, bishopsCard, cathedralCard, deansCard, gibneyCard, knightsCard, monksCard,
            sessionsCard, templeCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_main);

        abbeyCard = (CardView) findViewById(R.id.abbey_card_view);
        abbeyCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, AbbeyWindow.class));
            }

        });

        bishopsCard = (CardView) findViewById(R.id.bishops_card_view);
        bishopsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, BishopsWindow.class));
            }

        });

        cathedralCard = (CardView) findViewById(R.id.cathedral_card_view);
        cathedralCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, CathedralWindow.class));
            }

        });

        deansCard = (CardView) findViewById(R.id.deans_card_view);
        deansCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, AbbeyWindow.class));
            }

        });

        gibneyCard = (CardView) findViewById(R.id.gibney_card_view);
        gibneyCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, GibneyWindow.class));
            }

        });

        knightsCard = (CardView) findViewById(R.id.knights_card_view);
        knightsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, KnightsWindow.class));
            }

        });

        monksCard = (CardView) findViewById(R.id.monks_card_view);
        monksCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, MonksWindow.class));
            }

        });

        sessionsCard = (CardView) findViewById(R.id.sessions_card_view);
        sessionsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, SessionsWindow.class));
            }

        });

        templeCard = (CardView) findViewById(R.id.temple_card_view);
        templeCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(BuildingMainActivity.this, TempleWindow.class));
            }

        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_building_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
