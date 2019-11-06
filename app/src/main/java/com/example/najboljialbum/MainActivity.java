package com.example.najboljialbum;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayerAM;
    private MediaPlayer mediaPlayerVG;
    private MediaPlayer mediaPlayerMD;
    private MediaPlayer mediaPlayerSPS;
    private MediaPlayer mediaPlayerSSS;
    private MediaPlayer mediaPlayerizZNC;
    private MediaPlayer mediaPlayerponedjeljak;
    private MediaPlayer mediaPlayersamoslobodnostilujem;
    private MediaPlayer mediaPlayernestoGanola;
    private MediaPlayer mediaPlayerdzonDoe;
    private MediaPlayer mediaPlayertekSamUstao;
    private MediaPlayer mediaPlayeryodaKralj;
    private MediaPlayer mediaPlayeriznadGrada;
    private MediaPlayer mediaPlayerkrajAprila;
    private MediaPlayer mediaPlayermadeYouLook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeSongs();
        dropSongs();
        //https://stackoverflow.com/questions/18459122/play-sound-on-button-click-android
        //Onclick listener for vrloGanola
        final Button buttonVG = findViewById(R.id.buttonVrloGanola);
        buttonVG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playVrloGanola();
                    }
                }).start();
            }
        });
        //Onclick listener for aMilli
        final Button buttonAM = findViewById(R.id.buttonaMilli);
        buttonAM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playAMilli();
                    }
                }).start();
            }
        });
        //Onclick listener for majDiss
        final Button buttonMD = findViewById(R.id.buttonmajDiss);
        buttonMD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playMajDiss();
                    }
                }).start();
            }
        });
        //Onclick listener for swolePocketShawty
        final Button buttonSPS = findViewById(R.id.buttonswolePocketShawty);
        buttonSPS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playSwolePocketShawty();
                    }
                }).start();
            }
        });
        //Onclick listener for 05042015samoSlobodniStil
        final Button buttonSSS = findViewById(R.id.button05042015samoSlobodniStil);
        buttonSSS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        play05042015SamoSlobodniStil();
                    }
                }).start();
            }
        });
        //Onclick listener for izZNC
        final Button buttonizZNC = findViewById(R.id.buttonizZNC);
        buttonizZNC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playIzZNC();
                    }
                }).start();
            }
        });
        //Onclick listener for ponedjeljak
        final Button buttonponedjeljak = findViewById(R.id.buttonponedjeljak);
        buttonponedjeljak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playPonedjeljak();
                    }
                }).start();
            }
        });
        //Onclick listener for samoslobodnostilujem
        final Button buttonsamoslobodnostilujem = findViewById(R.id.buttonsamoSlobodnoStilujem);
        buttonsamoslobodnostilujem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playSamoSlobodnoStilujem();
                    }
                }).start();
            }
        });
        //Onclick listener for nestoGanola
        final Button buttonnestoGanola = findViewById(R.id.buttonnestoGanola);
        buttonnestoGanola.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playNestoGanola();
                    }
                }).start();
            }
        });
        //Onclick listener for dzonDoe
        final Button buttondzonDoe = findViewById(R.id.buttondzonDoe);
        buttondzonDoe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playDzonDoe();
                    }
                }).start();
            }
        });
        //Onclick listener for tekSamUstao
        final Button buttontekSamUstao = findViewById(R.id.buttontekSamUstao);
        buttontekSamUstao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playTekSamUstao();
                    }
                }).start();
            }
        });
        //Onclick listener for yodaKralj
        final Button buttonyodaKralj = findViewById(R.id.buttonyodaKralj);
        buttonyodaKralj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playYodaKralj();
                    }
                }).start();
            }
        });
        //Onclick listener for iznadGrada
        final Button buttoniznadGrada = findViewById(R.id.buttoniznadGrada);
        buttoniznadGrada.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playIznadGrada();
                    }
                }).start();
            }
        });
        //Onclick listener for krajAprila
        final Button buttonkrajAprila = findViewById(R.id.buttonkrajAprila);
        buttonkrajAprila.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playKrajAprila();
                    }
                }).start();
            }
        });
        //Onclick listener for madeYouLook
        final Button buttonmadeYouLook = findViewById(R.id.buttonmadeYouLook);
        buttonmadeYouLook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playMadeYouLook();
                    }
                }).start();
            }
        });
    }

    private void playAMilli() {
        try {
            if (mediaPlayerAM.isPlaying()) {
                mediaPlayerAM.pause();
            } else {
                mediaPlayerAM.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playVrloGanola() {
        try {
            if (mediaPlayerVG.isPlaying()) {
                mediaPlayerVG.pause();
            } else {
                mediaPlayerVG.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playMajDiss() {
        // Code here executes on main thread after user presses button
        try {
            if (mediaPlayerMD.isPlaying()) {
                mediaPlayerMD.pause();
            } else {
                mediaPlayerMD.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playSwolePocketShawty() {
        try {
            if (mediaPlayerSPS.isPlaying()) {
                mediaPlayerSPS.pause();
            } else {
                mediaPlayerSPS.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void play05042015SamoSlobodniStil() {
        try {
            if (mediaPlayerSSS.isPlaying()) {
                mediaPlayerSSS.pause();
            } else {
                mediaPlayerSSS.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playIzZNC() {
        try {
            if (mediaPlayerizZNC.isPlaying()) {
                mediaPlayerizZNC.pause();
            } else {
                mediaPlayerizZNC.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playPonedjeljak() {
        try {
            if (mediaPlayerponedjeljak.isPlaying()) {
                mediaPlayerponedjeljak.pause();
            } else {
                mediaPlayerponedjeljak.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playSamoSlobodnoStilujem() {
        try {
            if (mediaPlayersamoslobodnostilujem.isPlaying()) {
                mediaPlayersamoslobodnostilujem.pause();
            } else {
                mediaPlayersamoslobodnostilujem.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playNestoGanola() {
        try {
            if (mediaPlayernestoGanola.isPlaying()) {
                mediaPlayernestoGanola.pause();
            } else {
                mediaPlayernestoGanola.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playDzonDoe() {
        try {
            if (mediaPlayerdzonDoe.isPlaying()) {
                mediaPlayerdzonDoe.pause();
            } else {
                mediaPlayerdzonDoe.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playTekSamUstao() {
        try {
            if (mediaPlayertekSamUstao.isPlaying()) {
                mediaPlayertekSamUstao.pause();
            } else {
                mediaPlayertekSamUstao.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playYodaKralj() {
        try {
            if (mediaPlayeryodaKralj.isPlaying()) {
                mediaPlayeryodaKralj.pause();
            } else {
                mediaPlayeryodaKralj.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playIznadGrada() {
        try {
            if (mediaPlayeriznadGrada.isPlaying()) {
                mediaPlayeriznadGrada.pause();
            } else {
                mediaPlayeriznadGrada.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playKrajAprila() {
        try {
            if (mediaPlayerkrajAprila.isPlaying()) {
                mediaPlayerkrajAprila.pause();
            } else {
                mediaPlayerkrajAprila.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playMadeYouLook() {
        try {
            if (mediaPlayermadeYouLook.isPlaying()) {
                mediaPlayermadeYouLook.pause();
            } else {
                mediaPlayermadeYouLook.start();
            } // no need to call prepare(); create() does that for you
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initializeSongs() {
        mediaPlayerAM = MediaPlayer.create(MainActivity.this, R.raw.amilli);
        mediaPlayerVG = MediaPlayer.create(MainActivity.this, R.raw.vrloganola);
        mediaPlayerMD = MediaPlayer.create(MainActivity.this, R.raw.majdiss);
        mediaPlayerSPS = MediaPlayer.create(MainActivity.this, R.raw.swolepocketshawty);
        mediaPlayerSSS = MediaPlayer.create(MainActivity.this, R.raw.samoslobodnistil1);
        mediaPlayerizZNC = MediaPlayer.create(MainActivity.this, R.raw.izznc);
        mediaPlayerponedjeljak = MediaPlayer.create(MainActivity.this, R.raw.ponedjeljak);
        mediaPlayersamoslobodnostilujem = MediaPlayer.create(MainActivity.this, R.raw.samoslobodnostilujem);
        mediaPlayernestoGanola = MediaPlayer.create(MainActivity.this, R.raw.nestoganolanovi);
        mediaPlayerdzonDoe = MediaPlayer.create(MainActivity.this, R.raw.dzondoe);
        mediaPlayertekSamUstao = MediaPlayer.create(MainActivity.this, R.raw.teksamustao);
        mediaPlayeryodaKralj = MediaPlayer.create(MainActivity.this, R.raw.yodakralj);
        mediaPlayeriznadGrada = MediaPlayer.create(MainActivity.this, R.raw.iznadgrada);
        mediaPlayerkrajAprila = MediaPlayer.create(MainActivity.this, R.raw.krajaprila);
        mediaPlayermadeYouLook = MediaPlayer.create(MainActivity.this, R.raw.madeyoulook);
    }

    private void dropSongs() {
     mediaPlayerAM.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.reset();
            }
        });
     mediaPlayerVG.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerMD.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerSPS.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerSSS.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerizZNC.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerponedjeljak.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayersamoslobodnostilujem.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayernestoGanola.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerdzonDoe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayertekSamUstao.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayeryodaKralj.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayeriznadGrada.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayerkrajAprila.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
     mediaPlayermadeYouLook.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             // TODO Auto-generated method stub
             mp.reset();
         }
     });
    }
}
