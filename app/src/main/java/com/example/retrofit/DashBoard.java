package com.example.retrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
    private Button searchall,searchempl,regemp,delupdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        searchall = findViewById(R.id.searchall);
        searchempl=findViewById(R.id.searchemp);
        regemp=findViewById(R.id.regemp);
        delupdate=findViewById(R.id.delupdate);


        searchall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, MainActivity.class);
                startActivity(intent);
            }

        });
        searchempl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, SearchEmployee.class);
                startActivity(intent);
            }
        });
        regemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, RegisterEmployee.class);
                startActivity(intent);
            }
        });
        delupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, UpdateEmployee.class);
                startActivity(intent);
            }
        });
    }
}
