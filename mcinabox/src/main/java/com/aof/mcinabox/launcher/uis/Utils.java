package com.aof.mcinabox.launcher.uis;

import android.widget.ListView;
import android.widget.Spinner;

public class Utils {

    /**
     * 【匹配字符串在spinner中的位置】
     **/
    public static int getItemPosByString(String str, Spinner spinner) {
        int count = spinner.getChildCount();
        for (int a = 0; a < count; a++) {
            if (spinner.getItemAtPosition(a).toString().equals(str)) {
                return a;
            }
        }
        return -1;
    }

}
