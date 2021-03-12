package com.example.spotify;

class Song {
  String title;
  String artist;
  int coverImageDrawableId;

  Song(String titleParam, String artistParam, int coverImageDrawableIdParam) {
    this.title = titleParam;
    this.artist = artistParam;
    this.coverImageDrawableId = coverImageDrawableIdParam;
  }
}
