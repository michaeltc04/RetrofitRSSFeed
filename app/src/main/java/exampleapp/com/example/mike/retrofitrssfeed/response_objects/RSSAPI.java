package exampleapp.com.example.mike.retrofitrssfeed.response_objects;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RSSAPI {
    @GET("api.json")
    Call<RSSResponseObject> getRSSResponseInformation(@Query("rss_url") String rssUrl);
}