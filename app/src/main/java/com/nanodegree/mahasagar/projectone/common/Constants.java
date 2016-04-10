package com.nanodegree.mahasagar.projectone.common;

/**
 * Created by sagar on 8/2/16.
 */
public class Constants {
    public static final String API_KEY = "*********** API KEY *************";
    public static final String URL_POPULARITY = "http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key="+API_KEY +"#results/7";
    public static final String URL_VOTES="http://api.themoviedb.org/3/discover/movie?sort_by=vote_count.desc&api_key="+API_KEY+"#results/7";
    public static final String IMG_URL = "http://image.tmdb.org/t/p/w500/";
    public static final String TRAILER_URL = "https://api.themoviedb.org/3/movie/293660/videos?api_key=382b15ec50c5e60faff2089c899e2448";
    public static final String REVIEW_URL = "https://api.themoviedb.org/3/movie/293660/reviews?api_key=382b15ec50c5e60faff2089c899e2448";
}
