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

public class EventFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.event_fragment, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.eventList);
        List<String> list = new ArrayList<String>();
        list.add("Back To School");
        list.add("Operation Santa");
        list.add("Senior Center Activities");
        list.add("A Walk in the Park");
        list.add("I need Assistance");
        list.add("Seniors");
        list.add("Food Bank ");
        list.add("Family Resource center");
        list.add("Community Action Center");
        Integer[] img = {
                R.drawable.school,
                R.drawable.santa,
                R.drawable.activity,
                R.drawable.walking,
                R.drawable.assistance,
                R.drawable.senior,
                R.drawable.food,
                R.drawable.family,
                R.drawable.community,
        };
        String[] data = list.toArray(new String[list.size()]);
        list_view.setAdapter(new CustomListAdapter(getContext(),data,img));
        list_view.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView item = (TextView) view.findViewById(R.id.textView2);
                String temp_data ;
                temp_data = item.getText().toString();
                Intent intent;
                intent = new Intent(getActivity(),LoadingActivity.class);
                intent.putExtra("name",temp_data);
                Toast.makeText(getContext(),item.getText(), Toast.LENGTH_SHORT).show();
                //startActivity(intent);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}