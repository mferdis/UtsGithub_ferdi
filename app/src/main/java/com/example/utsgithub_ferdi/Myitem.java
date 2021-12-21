package com.example.utsgithub_ferdi;

import android.os.Parcel;
import android.os.Parcelable;

public class Myitem implements Parcelable {
    private int mimageResource;
    private String mText1;
    private String mText2;
    private String mText3;
    private String mText4;
    private String mText5;
    private String mText6;
    private String mText7;
    private String mText8;
    private String mText9;
    private String mText10;

    public Myitem(int mimageResource, String mText1, String mText2, String mText3, String mText4, String mText5, String mText6, String mText7, String mText8, String mText9, String mText10) {
        this.mimageResource = mimageResource;
        this.mText1 = mText1;
        this.mText2 = mText2;
        this.mText3 = mText3;
        this.mText4 = mText4;
        this.mText5 = mText5;
        this.mText6 = mText6;
        this.mText7 = mText7;
        this.mText8 = mText8;
        this.mText9 = mText9;
        this.mText10 = mText10;
    }

    protected Myitem(Parcel in) {
        mimageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
        mText3 = in.readString();
        mText4 = in.readString();
        mText5 = in.readString();
        mText6 = in.readString();
        mText7 = in.readString();
        mText8 = in.readString();
        mText9 = in.readString();
        mText10 = in.readString();
    }

    public static final Creator<Myitem> CREATOR = new Creator<Myitem>() {
        @Override
        public Myitem createFromParcel(Parcel in) {
            return new Myitem(in);
        }

        @Override
        public Myitem[] newArray(int size) {
            return new Myitem[size];
        }
    };

    public int getMimageResource() {
        return mimageResource;
    }

    public void setMimageResource(int mimageResource) {
        this.mimageResource = mimageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public String getmText3() {
        return mText3;
    }

    public void setmText3(String mText3) {
        this.mText3 = mText3;
    }

    public String getmText4() {
        return mText4;
    }

    public void setmText4(String mText4) {
        this.mText4 = mText4;
    }

    public String getmText5() {
        return mText5;
    }

    public void setmText5(String mText5) {
        this.mText5 = mText5;
    }

    public String getmText6() {
        return mText6;
    }

    public void setmText6(String mText6) {
        this.mText6 = mText6;
    }

    public String getmText7() {
        return mText7;
    }

    public void setmText7(String mText7) {
        this.mText7 = mText7;
    }

    public String getmText8() {
        return mText8;
    }

    public void setmText8(String mText8) {
        this.mText8 = mText8;
    }

    public String getmText9() {
        return mText9;
    }

    public void setmText9(String mText9) {
        this.mText9 = mText9;
    }

    public String getmText10() {
        return mText10;
    }

    public void setmText10(String mText10) {
        this.mText10 = mText10;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mimageResource);
        dest.writeString(mText1);
        dest.writeString(mText2);
        dest.writeString(mText3);
        dest.writeString(mText4);
        dest.writeString(mText5);
        dest.writeString(mText6);
        dest.writeString(mText7);
        dest.writeString(mText8);
        dest.writeString(mText9);
        dest.writeString(mText10);
    }
}
