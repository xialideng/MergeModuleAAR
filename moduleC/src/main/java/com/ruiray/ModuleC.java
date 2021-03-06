package com.ruiray;

import android.content.Context;
import android.support.annotation.Keep;

import com.ruiray.mergec.BuildConfig;
import com.ruiray.mergec.R;

@Keep
public class ModuleC {

    public static String getAppId() {
        return BuildConfig.APPLICATION_ID;
    }

    public static String getModuleName(Context context) {
        return context.getResources().getString(R.string.app_name_modelC);
    }
}
