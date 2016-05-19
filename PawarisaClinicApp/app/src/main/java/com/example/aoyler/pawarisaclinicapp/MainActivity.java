package com.example.aoyler.pawarisaclinicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                login();
            }
        }, 2000);
    }
    public void login() {

        setContentView(R.layout.login);
        //EditText editlogin = (EditText) this.findViewById(R.id.editText);
        final Button btn1 = (Button) findViewById(R.id.button);
        // Perform action on click
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent0 = new Intent(getApplicationContext(),menu.class);
                startActivity(intent0);

            }
        });
        //final Button btn2 = (Button) findViewById(R.id.button2);
        // Perform action on click
        //btn2.setOnClickListener(new View.OnClickListener() {
        //  public void onClick(View v) {
        //     menu();
        //  }
        //});

    }

    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setTitle("ออกจากโปรแกรม...");
        alertDialog.setMessage("คุณต้องการออกจากโปรแกรมใช่หรือไม่ ?");
        //alertDialog.setIcon(R.drawable.bgblood);

        alertDialog.setPositiveButton("ใช่",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //คลิกใช่ ออกจากโปรแกรม
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                    }
                });

        alertDialog.setNegativeButton("ไม่ใช่",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //คลิกไม่ cancel dialog
                        dialog.cancel();
                    }
                });

        alertDialog.show();

    }


}
