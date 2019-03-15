package com.example.user.recycler;

public class AndroidApi {

    String apiname;
    String apiLevel;
    int imgpath;


    public AndroidApi(String apiname, String apiLevel, int imgpath) {
        this.apiname = apiname;
        this.apiLevel = apiLevel;
        this.imgpath = imgpath;
    }


    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public String getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }

    public int getImgpath() {
        return imgpath;
    }

    public void setImgpath(int imgpath) {
        this.imgpath = imgpath;
    }
}
