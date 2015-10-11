package com.example.navigator.chandlerfoodbank;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by navigator on 10/10/15.
 */
public class SupportFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.support_fragment, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.supportList);
        List<String> list = new ArrayList<String>();
        list.add("Home");
        list.add("Donate");
        list.add("Donate Food");
        list.add("Volunteer");
        list.add("Sponsors");
        list.add("LogOut");
        Integer[] img = {
                R.drawable.home,
                R.drawable.donate,
                R.drawable.donatefood,
                R.drawable.volunteer,
                R.drawable.sponsor,
                R.drawable.logout
        };
        String[] data = list.toArray(new String[list.size()]);

        list_view.setAdapter(new CustomListAdapter(getContext(),data,img));
        list_view.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp_data ;
                TextView item = (TextView) view.findViewById(R.id.textView2);
                temp_data = item.getText().toString();
                Intent intent;
                intent = new Intent(getActivity(),LoadingActivity.class);
                intent.putExtra("name",temp_data);
                Toast.makeText(getContext(),temp_data, Toast.LENGTH_SHORT).show();
                //startActivity(intent);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}