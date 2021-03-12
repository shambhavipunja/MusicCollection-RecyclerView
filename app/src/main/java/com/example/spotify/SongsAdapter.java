package com.example.spotify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {

  ArrayList<Song> songArrayList;

  SongsAdapter(ArrayList<Song> songArrayListParam) {
    this.songArrayList = songArrayListParam;
  }

  class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView artist;
    ImageView coverImage;

    public ViewHolder(View itemView) {
      super(itemView);

      title = itemView.findViewById(R.id.title_text);
      artist = itemView.findViewById(R.id.artist_text);
      coverImage = itemView.findViewById(R.id.cover_image);
    }
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
    View itemView = layoutInflater.inflate(R.layout.song_detail, parent, false);
    ViewHolder viewHolder = new ViewHolder(itemView);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Song songItem = songArrayList.get(position);

    String titleString = songItem.title;
    holder.title.setText(titleString);

    String artistString = songItem.artist;
    holder.artist.setText(artistString);

    // Image.
    int imageResourceId = songItem.coverImageDrawableId;
    holder.coverImage.setImageResource(imageResourceId);
  }

  @Override
  public int getItemCount() {
    return songArrayList.size();
  }
}
