package com.example.jokepresenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import org.parceler.Parcels;

public class JokePresenterActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA = "JOKE_EXTRA";

    public static Intent getIntent(Context context, JokePresenterModel jokeModel) {
        Intent intent = new Intent(context, JokePresenterActivity.class);
        intent.putExtra(JOKE_EXTRA, Parcels.wrap(jokeModel));
        return intent;
    }

    private EditText jokeEt;

    private JokePresenterModel jokeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_presenter);

        getExtras();

        jokeEt = findViewById(R.id.joke_et);
        jokeEt.setText(jokeModel.getJoke());
    }

    private void getExtras() {
        jokeModel = Parcels.unwrap(getIntent().getParcelableExtra(JOKE_EXTRA));
    }
}
