package com.github.programmerr47.optimizedrecycler;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by m.spitsin on 06.09.2016.
 */
public class CustomApplication extends Application {
    public static final Point SCREEN_SIZE = new Point();

    @Override
    public void onCreate() {
        super.onCreate();

        WindowManager manager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        if (manager != null) {
            Display display = manager.getDefaultDisplay();
            display.getSize(SCREEN_SIZE);
        }
    }
}
