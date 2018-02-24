package com.willkernel.www.fmoddemo;


public class EffectUtils {
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_LUOLI = 1;
    public static final int TYPE_DASHU = 2;
    public static final int TYPE_JINGSONG = 3;
    public static final int TYPE_GAOGUAI = 4;
    public static final int TYPE_KONGLING = 5;

    static {
        System.loadLibrary("fmodL");
        System.loadLibrary("fmod");
        System.loadLibrary("native-lib");
    }

    public static native void playFixVoice(String path,int type);
}
