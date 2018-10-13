package com.loststarventures.projectx.projectx;

import android.app.Application;

public class ProjectXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupMemoryLeakDetection();
    }


    private void setupMemoryLeakDetection(){
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
