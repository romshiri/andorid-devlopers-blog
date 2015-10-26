package libify.androiddevelopersblog.features.homePage.services;


import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

public interface IFeedApi {
    @GET("/feeds/all")
    Call<List<Object>> getSomthing();
}
