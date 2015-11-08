package libify.androiddevelopersblog.features.homePage;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import libify.androiddevelopersblog.R;
import libify.androiddevelopersblog.features.homePage.services.IFeedApi;
import libify.androiddevelopersblog.utils.IoC.ApplicationCommon;

public class MainActivity extends AppCompatActivity {
    @Inject
    Application app;

    @Inject
    IFeedApi feedApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationCommon.getComponent().inject(this);
    }
}
