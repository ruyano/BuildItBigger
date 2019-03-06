package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.jokepresenter.JokePresenterActivity;
import com.example.jokepresenter.JokePresenterModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideLoading();
    }

    public void tellJoke(View view) {
        showLoading();
        new EndpointsAsyncTask().execute(new EndpointsAsyncTask.EndpointsAsyncTaskResult() {
            @Override
            public void result(String joke) {
                startActivity(JokePresenterActivity.getIntent(MainActivity.this, new JokePresenterModel(joke)));
            }
        });
    }

    private void showLoading() {
        findViewById(R.id.fragment).setVisibility(View.GONE);
        findViewById(R.id.progress).setVisibility(View.VISIBLE);
    }

    private void hideLoading() {
        findViewById(R.id.fragment).setVisibility(View.VISIBLE);
        findViewById(R.id.progress).setVisibility(View.GONE);
    }
}
