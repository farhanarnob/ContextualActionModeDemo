package com.example.sunny.contextualactionmode;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sunny on 5/31/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter <ContactAdapter.ContactViewHolder> {

    ArrayList<Contact> adaplist = new ArrayList<>();
    MainActivity mainActivity;
    Context context;

    public ContactAdapter(ArrayList<Contact> adaplist, Context context) {
        this.adaplist = adaplist;
        this.context = context;
        mainActivity = (MainActivity) context;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view,mainActivity);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.img.setImageResource(adaplist.get(position).getImage_id());
        holder.Name.setText(adaplist.get(position).getName());
        holder.Email.setText(adaplist.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return adaplist.size();
    }


    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView Name,Email;
        CheckBox checkBox;
        MainActivity mainActivity;

        public ContactViewHolder(View itemView, MainActivity mainActivity) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.image_id);
            Name = (TextView) itemView.findViewById(R.id.name);
            Email = (TextView) itemView.findViewById(R.id.email);
            checkBox = (CheckBox) itemView.findViewById(R.id.checklist);
            this.mainActivity = mainActivity;
        }
    }



}
