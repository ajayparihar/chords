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

public class min_f extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7;
    TextView mmf_back;
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7;
    Animation a_up,a_fw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_f);

        button1= findViewById(R.id.f);
        button2= findViewById(R.id.g);
        button3= findViewById(R.id.gs);
        button4= findViewById(R.id.as);
        button5= findViewById(R.id.c);
        button6= findViewById(R.id.cs);
        button7= findViewById(R.id.ds);
        mmf_back=findViewById(R.id.min_f_label);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }   else {
            soundPool= new SoundPool(5, AudioManager.STREAM_MUSIC , 0);
        }
        sound1=soundPool.load(this, R.raw.min_f_f,1);
        sound2=soundPool.load(this, R.raw.min_f_g,1);
        sound3=soundPool.load(this, R.raw.min_f_gs,1);
        sound4=soundPool.load(this, R.raw.min_f_as,1);
        sound5=soundPool.load(this, R.raw.min_f_c,1);
        sound6=soundPool.load(this, R.raw.min_f_cs,1);
        sound7=soundPool.load(this, R.raw.min_f_ds,1);

        a_up = AnimationUtils.loadAnimation(this,R.anim.anim);
        a_fw = AnimationUtils.loadAnimation(this,R.anim.anim2);

        mmf_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(min_f.this,min_intent.class);
                startActivity(intent);
            }
        });


        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button1.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button1.startAnimation(a_fw);
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
                    button2.startAnimation(a_fw);
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
                    button3.startAnimation(a_fw);
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
                    button4.startAnimation(a_fw);
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
                    button5.startAnimation(a_fw);
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
                    button6.startAnimation(a_fw);
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
                    button7.startAnimation(a_fw);
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