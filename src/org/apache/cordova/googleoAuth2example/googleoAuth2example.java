package org.apache.cordova.googleoAuth2example;
import android.view.Window;
import android.view.WindowManager;

import android.content.pm.ActivityInfo;
import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class googleoAuth2example extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      
      getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
      
      super.loadUrl("file:///android_asset/www/index.html");

    }
}

