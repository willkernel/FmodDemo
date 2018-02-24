package com.willkernel.www.fmoddemo;

import android.Manifest;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS}, 0);
    }

    private void play(final String voicePath, final int type) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                EffectUtils.playFixVoice(voicePath, type);
            }
        }).start();
    }

    public void mFix(View view) {
        String voicePath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar
                + "cb.mp3";
        int type = EffectUtils.TYPE_NORMAL;
        switch (view.getId()) {
            case R.id.btn_record:
                type = EffectUtils.TYPE_NORMAL;
                break;
            case R.id.btn_luoli:
                type = EffectUtils.TYPE_LUOLI;
                break;
            case R.id.btn_dashu:
                type = EffectUtils.TYPE_DASHU;
                break;
            case R.id.btn_jingsong:
                type = EffectUtils.TYPE_JINGSONG;
                break;
            case R.id.btn_gaoguai:
                type = EffectUtils.TYPE_GAOGUAI;
                break;
            case R.id.btn_kongling:
                type = EffectUtils.TYPE_KONGLING;
                break;
        }
        play(voicePath, type);
    }
}
