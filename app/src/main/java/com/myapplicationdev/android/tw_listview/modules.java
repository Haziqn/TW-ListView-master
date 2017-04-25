package com.myapplicationdev.android.tw_listview;

import android.media.Image;

/**
 * Created by 15056233 on 25/4/2017.
 */

public class modules {
    private String code;
    private Image pic;
    public modules(String code, Image pic) {
        this.code = code;
        this.pic = pic;
    }
    public String getCode() {
        return code;
    }
    public Image getPic() {
        return pic;
    }
}
