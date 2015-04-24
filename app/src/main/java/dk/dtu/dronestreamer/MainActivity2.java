package dk.dtu.dronestreamer;

//https://github.com/vanevery/JavaCV-0.5-Stream-Test
//https://github.com/mackhowell/JavaCV-0.5-Stream-Test
//https://github.com/vanevery/Android-MJPEG-Video-Capture-FFMPEG/blob/master/src/com/mobvcasting/mjpegffmpeg/MJPEGFFMPEGTest.java
//https://code.google.com/p/spydroid-ipcamera/issues/attachmentText?id=2&aid=20000000&name=CameraStreamer.java&token=ABZ6GAdAtAJgaLbOx7ymgQyNRRfzNGBClQ%3A1421978695329

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import android.app.Dialog;

public class MainActivity2 extends Activity {
    private RadioGroup radioGroup;

    TextView BtnSetting;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BtnSetting = (TextView) findViewById(R.id.setting);


        BtnSetting.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity2.this);
                dialog.setContentView(R.layout.item_resolution);
                radioGroup = (RadioGroup) dialog.findViewById(R.id.myRadioGroup);
                dialog.setTitle("Set resolution");

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        group.findViewById(checkedId).setSelected(true);
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });




    }
}