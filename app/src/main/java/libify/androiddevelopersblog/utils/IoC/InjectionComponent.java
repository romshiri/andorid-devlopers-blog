package libify.androiddevelopersblog.utils.IoC;

import javax.inject.Singleton;

import dagger.Component;
import libify.androiddevelopersblog.features.homePage.MainActivity;
import libify.androiddevelopersblog.utils.IoC.modules.ApiModule;
import libify.androiddevelopersblog.utils.IoC.modules.ApplicationModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ApiModule.class,
})

public interface InjectionComponent {
    void inject(MainActivity injectedObject);
}