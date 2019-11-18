package com.example.widgetsandmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;

public class contactsAdapter extends BaseAdapter {
    private Context context;
    private LinkedList<String> nameList;
    private LinkedList<String> numberList;

    public contactsAdapter(Context context, LinkedList<String> nameList, LinkedList<String> numberList) {
        this.context = context;
        this.nameList = nameList;
        this.numberList = numberList;
    }
    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false);

        TextView name = v.findViewById(R.id.name);
        TextView number = v.findViewById(R.id.number);
        name.setText(nameList.get(position));
        number.setText(numberList.get(position));
        return v;
    }
}
