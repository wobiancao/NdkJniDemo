package com.wobiancao.ndkjnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wobiancao.ndkjnidemo.ndk.JniUtils;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.ndk_text);
        String str = JniUtils.getStringFormC();
        String ming = "13550110110";
        String encrypmi = JniUtils.encode(ming);
        String decrypmi = JniUtils.decode(encrypmi);
        textView.setText("来自c的string是:" +  str + "\n加密前：" + ming + "\n加密后：" + encrypmi + "\n解密后：" + decrypmi);
    }
}
