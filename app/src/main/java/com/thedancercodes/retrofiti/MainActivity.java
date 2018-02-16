package com.thedancercodes.retrofiti;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.thedancercodes.retrofiti.adapter.MoviesAdapter;
import com.thedancercodes.retrofiti.model.Movie;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Create the field variables
    private RecyclerView mRecyclerView;
    private MoviesAdapter adapter;
    private List<Movie> mMovieList;
    ProgressDialog pd;
    private SwipeRefreshLayout swipeContainer;
    public static final String LOG_TAG = MoviesAdapter.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.main_content);
        swipeContainer.setColorSchemeResources(android.R.color.holo_orange_dark);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initViews();
                Toast.makeText(MainActivity.this, "Movies Refreshed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public Activity getActivity() {
        Context context = this;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
    // TODO 6a: initViews() Method
    // This method is responsible for initializing the views.
    private void initViews() {

    }

    // TODO 6b: loadJSON() Method
    // This method is responsible for loading JSON data.
    private void loadJSON() {

    }

}