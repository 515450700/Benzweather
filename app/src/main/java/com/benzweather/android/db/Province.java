package com.benzweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Benz on 2019年4月22日, 0022.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int procvinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProcvinceCode(){
        return procvinceCode;
    }

    public void setProcvinceCode(int procvinceCode){
        this.procvinceCode = procvinceCode;
    }
}
