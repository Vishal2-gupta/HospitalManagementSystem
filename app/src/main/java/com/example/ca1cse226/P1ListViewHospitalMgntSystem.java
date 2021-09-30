package com.example.ca1cse226;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class P1ListViewHospitalMgntSystem extends AppCompatActivity {
ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1_list_view_hospital_mgnt_system);
        final ArrayList<p1item> patients=new ArrayList<>();
        patients.add(new p1item("Isahya","Arthritis Disease",R.drawable.i3));
        patients.add(new p1item("John","Arboviral Encephalitis",R.drawable.i4));
        patients.add(new p1item("Apolline","Alzheimer's Disease",R.drawable.i5));
        patients.add(new p1item("Ishan","Arboviral Encephalitis",R.drawable.i6));
        patients.add(new p1item("Roman","Heart disease",R.drawable.i7));


        P1MyListAdapter adapter=new P1MyListAdapter(this,R.layout.p1mylist,patients);
        list=(ListView)findViewById(R.id.l1);

        list.setAdapter(adapter);


    }
}