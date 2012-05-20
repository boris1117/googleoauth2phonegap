package org.apache.cordova.googleoAuth2example;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class googleoAuth2example extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}

