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
        holder.title.setText(mMovieList.get(position).getOriginalTitle());
        String vote = Double.toString(mMovieList.get(position).getVoteAverage());
        holder.userrating.setText(vote);

        // Use Glide to load Thumbnail
        Glide.with(mContext)
                .load(mMovieList.get(position).getPosterPath())
                .apply(new RequestOptions()
                        .placeholder(R.drawable.load))
                .into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    // TODO 5a: Implement MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, userrating;
        public ImageView thumbnail;

        public MyViewHolder(View itemView) {
            super(itemView);

            // TIP: You can use butterknife here to simply field binding for views.
            title = (TextView) itemView.findViewById(R.id.title);
            userrating = (TextView) itemView.findViewById(R.id.userrating);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);

            // Handle an onClick on every card in the grid layout of the RecyclerView.
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        Movie clickedDataItem = mMovieList.get(pos);

                        Intent intent = new Intent(mContext, DetailActivity.class);
                        intent.putExtra("original_title", mMovieList.get(pos).getOriginalTitle());
                        intent.putExtra("poster_path", mMovieList.get(pos).getPosterPath());
                        intent.putExtra("overview", mMovieList.get(pos).getOverview());
                        intent.putExtra("vote_average", Double.toString(mMovieList.get(pos).getVoteAverage()));
                        intent.putExtra("release_date", mMovieList.get(pos).getReleaseDate());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);
                        Toast.makeText(view.getContext(),
                                "You clicked " + clickedDataItem.getOriginalTitle(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
