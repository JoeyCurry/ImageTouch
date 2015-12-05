package com.cxhd.imagetouchtest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnTouchListener{

    private ImageView man_head,man_neck,man_brest,man_abdomen,man_arm,man_hand,man_briefs,man_legs,man_foot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        man_head = (ImageView) findViewById(R.id.man_head);
        man_neck = (ImageView) findViewById(R.id.man_neck);
        man_brest = (ImageView) findViewById(R.id.man_brest);
        man_abdomen = (ImageView) findViewById(R.id.man_abdomen);
        man_arm = (ImageView) findViewById(R.id.man_arm);
        man_hand = (ImageView) findViewById(R.id.man_hand);
        man_briefs = (ImageView) findViewById(R.id.man_briefs);
        man_legs = (ImageView) findViewById(R.id.man_legs);
        man_foot = (ImageView) findViewById(R.id.man_foot);

        man_head.setAlpha(0);
        man_neck.setAlpha(0);
        man_brest.setAlpha(0);
        man_abdomen.setAlpha(0);
        man_arm.setAlpha(0);
        man_hand.setAlpha(0);
        man_briefs.setAlpha(0);
        man_legs.setAlpha(0);
        man_foot.setAlpha(0);

        man_head.setOnTouchListener(this);
        man_neck.setOnTouchListener(this);
        man_brest.setOnTouchListener(this);
        man_abdomen.setOnTouchListener(this);
        man_arm.setOnTouchListener(this);
        man_hand.setOnTouchListener(this);
        man_briefs.setOnTouchListener(this);
        man_legs.setOnTouchListener(this);
        man_foot.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (v.getId()){
            case R.id.man_head:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_head.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_head.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成头部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_neck:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_neck.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_neck.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成颈部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_brest:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_brest.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_brest.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成胸部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_abdomen:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_abdomen.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_abdomen.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成腹部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_arm:

                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_arm.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_arm.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成手臂", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_hand:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_hand.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_hand.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成手部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_briefs:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_briefs.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_briefs.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成裆部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_legs:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_legs.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    man_legs.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成腿部", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.man_foot:
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    man_foot.setAlpha(0xFF);
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    man_foot.setAlpha(0);
                    Toast.makeText(MainActivity.this, "我组成脚步", Toast.LENGTH_SHORT).show();
                }
                return true;
            default:
                return true;
        }
    }
}
