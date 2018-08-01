package com.hack.vesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Goals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);


        final Button updateButton = (Button) findViewById(R.id.update);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText runGoal = findViewById(R.id.runGoal);
                String newRun = runGoal.getText().toString();
                if(!newRun.isEmpty()) {
                    runGoal.setHint(newRun + " (miles)");
                    runGoal.setText("");
                }

                EditText walkGoal = findViewById(R.id.walkGoal);
                String newWalk = walkGoal.getText().toString();
                if(!newWalk.isEmpty()) {
                    walkGoal.setHint(newWalk +" (steps)");
                    walkGoal.setText("");
                }

                EditText swimGoal = findViewById(R.id.swimGoal);
                String newSwim = swimGoal.getText().toString();
                if(!newSwim.isEmpty()) {
                    swimGoal.setHint(newSwim +" (steps)");
                    swimGoal.setText("");
                }

                showToast("Goals updated.");
            }
        });
    }

    private void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                return true;
            case R.id.my_stats:
                Intent intent = new Intent(Goals.this, FeedActivity.class);
                startActivity(intent);
                return true;
            case R.id.family_stats:
                Intent intent2 = new Intent(Goals.this, OthersActivity.class);
                startActivity(intent2);
                return true;
            case R.id.edit_goals:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }
}
