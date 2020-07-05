package com.example.chords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class maj_intent extends AppCompatActivity {
    TextView maj_tv;
    Button c,cs,d,ds,e,f,fs,g,gs,a,as,b;
    Animation a_up,a_dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maj_intent);
        c=(Button) findViewById(R.id.M_c);
        cs=(Button) findViewById(R.id.M_cs);
        d=(Button) findViewById(R.id.M_d);
        ds=(Button) findViewById(R.id.M_ds);
        e=(Button) findViewById(R.id.M_e);
        f=(Button) findViewById(R.id.M_f);
        fs=(Button) findViewById(R.id.M_fs);
        g=(Button) findViewById(R.id.M_g);
        gs=(Button) findViewById(R.id.M_gs);
        a=(Button) findViewById(R.id.M_a);
        as=(Button) findViewById(R.id.M_as);
        b=(Button) findViewById(R.id.M_b);
        maj_tv=findViewById(R.id.maj);

        a_up = AnimationUtils.loadAnimation(this,R.anim.anim);
        a_dw = AnimationUtils.loadAnimation(this,R.anim.anim2);

        maj_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(maj_intent.this,MainActivity.class);
                startActivity(intent);
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this,maj_c.class);
                startActivity(intent);

            }
        });

        c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    c.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    c.startAnimation(a_dw);
                }
                return false;

            }

        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_cs.class);
                startActivity(intent);

            }
        });


        cs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    cs.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    cs.startAnimation(a_dw);
                }
                return false;

            }

        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_d.class);
                startActivity(intent);

            }
        });

        d.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    d.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    d.startAnimation(a_dw);
                }
                return false;

            }

        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_ds.class);
                startActivity(intent);

            }
        });


        ds.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ds.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ds.startAnimation(a_dw);
                }
                return false;

            }

        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_e.class);
                startActivity(intent);

            }
        });

        e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    e.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    e.startAnimation(a_dw);
                }
                return false;

            }

        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_f.class);
                startActivity(intent);

            }
        });


        f.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    f.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    f.startAnimation(a_dw);
                }
                return false;

            }

        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_fs.class);
                startActivity(intent);

            }
        });

        fs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    fs.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    fs.startAnimation(a_dw);
                }
                return false;

            }

        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_g.class);
                startActivity(intent);

            }
        });


        g.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    g.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    g.startAnimation(a_dw);
                }
                return false;

            }

        });

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_gs.class);
                startActivity(intent);

            }
        });

        gs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    gs.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    gs.startAnimation(a_dw);
                }
                return false;

            }

        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_a.class);
                startActivity(intent);

            }
        });


        a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    a.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    a.startAnimation(a_dw);
                }
                return false;

            }

        });

        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_as.class);
                startActivity(intent);

            }
        });

        as.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    as.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    as.startAnimation(a_dw);
                }
                return false;

            }

        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maj_intent.this, maj_b.class);
                startActivity(intent);

            }
        });


        b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    b.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    b.startAnimation(a_dw);
                }
                return false;

            }

        });

    }}