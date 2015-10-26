package libify.androiddevelopersblog.utils.IoC.modules;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import libify.androiddevelopersblog.features.homePage.services.IFeedApi;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

@Module
public class ApiModule {

    @Provides
    @Singleton
    Retrofit provideRestAdapter(){
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(new OkHttpClient())
                .baseUrl("http://google.com")
                .addConverterFactory(GsonConverterFactory.create());

        return builder.build();
    }

    @Provides
    IFeedApi provideFeedApi(Retrofit restAdapter){
        return restAdapter.create(IFeedApi.class);
    }
}
