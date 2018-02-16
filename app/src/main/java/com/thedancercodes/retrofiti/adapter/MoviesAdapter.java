package com.thedancercodes.retrofiti.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.thedancercodes.retrofiti.DetailActivity;
import com.thedancercodes.retrofiti.R;
import com.thedancercodes.retrofiti.model.Movie;

import java.util.List;

/**
 * Created by TheDancerCodes on 14/02/2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> mMovieList;

    public MoviesAdapter(Context context, List<Movie> movieList) {
        mContext = context;
        mMovieList = movieList;
    }

    /*
      Binding Data to our Views
     */

    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_card, parent, false);
        return new MyViewHolder(view);
    }

    // TODO 5b: Implement onBindViewHolder
    @Override
    public void onBindViewHolder(final MoviesAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    // TODO 5a: Implement MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {

    }
}