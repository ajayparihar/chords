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

public class min_intent extends AppCompatActivity {
    Button cm,csm,dm,dsm,em,fm,fsm,gm,gsm,am,asm,bm;
    TextView min_tv;
    Animation a_up,a_dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_intent);
        cm=(Button) findViewById(R.id.m_c);
        csm=(Button) findViewById(R.id.m_cs);
        dm=(Button) findViewById(R.id.m_d);
        dsm=(Button) findViewById(R.id.m_ds);
        em=(Button) findViewById(R.id.m_e);
        fm=(Button) findViewById(R.id.m_f);
        fsm=(Button) findViewById(R.id.m_fs);
        gm=(Button) findViewById(R.id.m_g);
        gsm=(Button) findViewById(R.id.m_gs);
        am=(Button) findViewById(R.id.m_a);
        asm=(Button) findViewById(R.id.m_as);
        bm=(Button) findViewById(R.id.m_b);
        min_tv=findViewById(R.id.min);

        a_up = AnimationUtils.loadAnimation(this,R.anim.anim);
        a_dw = AnimationUtils.loadAnimation(this,R.anim.anim2);

        min_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(min_intent.this,MainActivity.class);
                startActivity(intent);
            }
        });



        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this,min_c.class);
                startActivity(intent);

            }
        });

        cm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    cm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    cm.startAnimation(a_dw);
                }
                return false;

            }

        });

        csm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_cs.class);
                startActivity(intent);

            }
        });


        csm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    csm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    csm.startAnimation(a_dw);
                }
                return false;

            }

        });

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_d.class);
                startActivity(intent);

            }
        });

        dm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    dm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    dm.startAnimation(a_dw);
                }
                return false;

            }

        });

        dsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_ds.class);
                startActivity(intent);

            }
        });


        dsm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    dsm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    dsm.startAnimation(a_dw);
                }
                return false;

            }

        });

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, maj_e.class);
                startActivity(intent);

            }
        });

        em.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    em.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    em.startAnimation(a_dw);
                }
                return false;

            }

        });

        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_f.class);
                startActivity(intent);

            }
        });


        fm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    fm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    fm.startAnimation(a_dw);
                }
                return false;

            }

        });

        fsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, maj_fs.class);
                startActivity(intent);

            }
        });

        fsm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    fsm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    fsm.startAnimation(a_dw);
                }
                return false;

            }

        });

        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_g.class);
                startActivity(intent);

            }
        });


        gm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    gm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    gm.startAnimation(a_dw);
                }
                return false;

            }

        });

        gsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, maj_gs.class);
                startActivity(intent);

            }
        });

        gsm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    gsm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    gsm.startAnimation(a_dw);
                }
                return false;

            }

        });

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_a.class);
                startActivity(intent);

            }
        });


        am.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    am.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    am.startAnimation(a_dw);
                }
                return false;

            }

        });

        asm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, maj_as.class);
                startActivity(intent);

            }
        });

        asm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    asm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    asm.startAnimation(a_dw);
                }
                return false;

            }

        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(min_intent.this, min_b.class);
                startActivity(intent);

            }
        });


        bm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm.startAnimation(a_up);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm.startAnimation(a_dw);
                }
                return false;

            }

        });
    }
}