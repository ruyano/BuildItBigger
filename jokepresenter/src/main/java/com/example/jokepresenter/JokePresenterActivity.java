package com.example.jokepresenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import org.parceler.Parcels;

public class JokePresenterActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA = "JOKE_EXTRA";

    public static Intent getIntent(Context context, JokePresenterModel jokeModel) {
        Intent intent = new Intent(context, JokePresenterActivity.class);
        intent.putExtra(JOKE_EXTRA, Parcels.wrap(jokeModel));
        return intent;
    }

    private TextView jokeTV;

    private JokePresenterModel jokeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_presenter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getExtras();

        jokeTV = findViewById(R.id.joke_tv);
        jokeTV.setText(jokeModel.getJoke());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

    private void getExtras() {
        jokeModel = Parcels.unwrap(getIntent().getParcelableExtra(JOKE_EXTRA));
    }
}
