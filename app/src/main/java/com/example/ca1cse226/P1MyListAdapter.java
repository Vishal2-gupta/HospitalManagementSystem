package com.example.ca1cse226;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class P1MyListAdapter extends ArrayAdapter<p1item> {
    Context context;
    ArrayList<p1item> patients;

    public P1MyListAdapter(Context context, int textViewr, ArrayList<p1item> objects) {

        super(context, textViewr, objects);
        this.context= context;
       patients=objects;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        p1item patient=getItem(position);
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView=inflater.inflate(R.layout.p1mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(patients.get(position).getPatientname());
        subtitleText.setText(patients.get(position).getPatientdisease());
        imageView.setImageResource(patients.get(position).getPatientimages());

        final Button b=(Button) rowView.findViewById(R.id.b2);
        b.setTag(position);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                switch (position) {
                    case 0:
                        Intent intent = new Intent(context, P1Patient1.class);
                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent dengue = new Intent(context, P1Patient2.class);
                        context.startActivity(dengue);
                        break;

                    case 2:
                        Toast.makeText(context, " Task to be done as above ", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(context, " Task to be done as above ", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(context, " Task to be done as above ", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

      final Button bt=(Button) rowView.findViewById(R.id.b1);
        bt.setTag(position);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int position = (Integer) view.getTag();
               String s = Integer.toString(position);
               Log.i("position", s);
               LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
               View rowView=inflater.inflate(R.layout.p1customtoast, null,true);
               TextView toastTextView = (TextView) rowView.findViewById(R.id.t1);
               ImageView toastImageView = (ImageView) rowView.findViewById(R.id.i1);
               toastTextView.setText("Patient Data Deleted : "+position);
               toastImageView.setImageResource(R.drawable.i8);
               Toast toast = new Toast(context);
               toast.setDuration(Toast.LENGTH_SHORT);
               toast.setView(rowView);
               toast.show();
               patients.remove(position);
               notifyDataSetChanged();
           }
       });




        return rowView;

    }
}
