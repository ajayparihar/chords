package com.example.chords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class min_cs extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7;
    TextView mmcs_back;
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7;
    Animation a_up,a_dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_cs);

        button1= findViewById(R.id.cs);
        button2= findViewById(R.id.ds);
        button3= findViewById(R.id.e);
        button4= findViewById(R.id.fs);
        button5= findViewById(R.id.gs);
        button6= findViewById(R.id.a);
        button7= findViewById(R.id.b);
        mmcs_back=findViewById(R.id.min_cs_label);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }   else {
            soundPool= new SoundPool(5, AudioManager.STREAM_MUSIC , 0);
        }
        sound1=soundPool.load(this, R.raw.min_cs_cs,1);
        sound2=soundPool.load(this, R.raw.min_cs_ds,1);
        sound3=soundPool.load(this, R.raw.min_cs_e,1);
        sound4=soundPool.load(this, R.raw.min_cs_fs,1);
        sound5=soundPool.load(this, R.raw.min_cs_gs,1);
        sound6=soundPool.load(this, R.raw.min_cs_a,1);
        sound7=soundPool.load(this, R.raw.min_cs_b,1);

        a_up = AnimationUtils.loadAnimation(this,R.anim.anim);
        a_dw = AnimationUtils.loadAnimation(this,R.anim.anim2);

        mmcs_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(min_cs.this,min_intent.class);
                startActivity(intent);
            }
        });


        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button1.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button1.startAnimation(a_dw);
                }
                return false;

            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound1,1,1,0,0,1);
            }
        });

        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button2.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button2.startAnimation(a_dw);
                }
                return false;

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound2,1,1,0,0,1);
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button3.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button3.startAnimation(a_dw);
                }
                return false;

            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound3,1,1,0,0,1);
            }
        });

        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button4.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button4.startAnimation(a_dw);
                }
                return false;

            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound4,1,1,0,0,1);
            }
        });

        button5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button5.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button5.startAnimation(a_dw);
                }
                return false;

            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound5,1,1,0,0,1);
            }
        });

        button6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button6.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button6.startAnimation(a_dw);
                }
                return false;

            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound6,1,1,0,0,1);
            }
        });

        button7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button7.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button7.startAnimation(a_dw);
                }
                return false;

            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound7,1,1,0,0,1);
            }
        });


    }
}