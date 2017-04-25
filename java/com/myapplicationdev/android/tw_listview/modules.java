package com.myapplicationdev.android.tw_listview;

import android.media.Image;

/**
 * Created by 15056233 on 25/4/2017.
 */

public class modules {
    private String code;
    private boolean prog;

    public modules(String code, boolean prog) {
        this.code = code;
        this.prog = prog;

    }
    public String getCode() {
        return code;

    }

    public boolean isProg() {
        return prog;
    }
}
