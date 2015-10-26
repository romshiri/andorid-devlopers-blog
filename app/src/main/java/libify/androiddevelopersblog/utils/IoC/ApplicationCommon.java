package libify.androiddevelopersblog.utils.IoC;

import android.app.Application;

import libify.androiddevelopersblog.utils.IoC.modules.ApplicationModule;

public class ApplicationCommon extends Application {
    private static InjectionComponent injectionComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        injectionComponent = DaggerInjectionComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static InjectionComponent getComponent(){
        return injectionComponent;
    }
}
