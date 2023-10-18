package com.example.d_internship;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    Context context;
    ArrayList<person>personArrayList;

    public Myadapter(Context context,ArrayList<person> personArrayList) {

        this.context=context;
        this.personArrayList=personArrayList;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        person person=personArrayList.get(position);
        holder.tv1.setText(person.Name);
        holder.tv2.setText(person.Subname);
        holder.tv3.setText(person.Txt3);
        holder.tv.setText(person.Txt4);
//        holder.imageView.setImageResource(person.image);
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tv1,tv2,tv3,tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.imageView);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
            tv3=itemView.findViewById(R.id.tv3);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
