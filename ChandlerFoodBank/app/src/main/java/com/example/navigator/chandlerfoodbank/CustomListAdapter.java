package com.example.navigator.chandlerfoodbank;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    String data[];
    Integer img[];
    private static LayoutInflater inflater = null;

    public CustomListAdapter(Context context, String[] data,Integer[] img) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.img = img;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.row, null);
        ImageView image_view = (ImageView) vi.findViewById(R.id.imageView);
        TextView text = (TextView) vi.findViewById(R.id.textView2);
        String str = text.toString();
        image_view.setImageResource(img[position]);
        text.setText(data[position]);
        return vi;
    }


}