package com.example.sunny.contextualactionmode;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sunny on 5/31/2017.
 * modified by farhanarnob on 06/02/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter <ContactAdapter.ContactViewHolder> {
    private List<Contact> mContactList;

    public ContactAdapter(List<Contact> contactList){
        mContactList = contactList;
    }



    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,null);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ContactViewHolder holder, int position) {
        Contact contact = mContactList.get(position);
        holder.textView_name.setText(contact.getName());
        holder.textView_email.setText(contact.getEmail());
    }

    @Override
    public int getItemCount() {
        if(mContactList != null){
            return mContactList.size();
        }
        return 0;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView_imageId;
        private TextView textView_name;
        private TextView textView_email;
        private CheckBox checkBox_checkList;

        private ContactViewHolder(View itemView) {
            super(itemView);
            imageView_imageId = (ImageView) itemView.findViewById(R.id.image_id);
            textView_name = (TextView) itemView.findViewById(R.id.name);
            textView_email = (TextView) itemView.findViewById(R.id.email);
            checkBox_checkList = (CheckBox) itemView.findViewById(R.id.checklist);
        }
    }
}
