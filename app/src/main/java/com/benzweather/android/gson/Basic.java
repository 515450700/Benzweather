package com.benzweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Benz on 2019年5月15日, 0015.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
