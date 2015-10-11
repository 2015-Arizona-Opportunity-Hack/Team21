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
public class AboutFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.about_fragment, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.aboutList);
        List<String> list = new ArrayList<String>();
        list.add("Our Staff");
        list.add("Our Histroy");
        list.add("Board Members");
        list.add("Comments Or Question");
        list.add("Hours Or Location ");
        list.add("NewsLetter SignUp");
        Integer img[] = {
                R.drawable.staff,
                R.drawable.history,
                R.drawable.boardmember,
                R.drawable.question,
                R.drawable.location,
                R.drawable.news
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
                intent.putExtra("name", temp_data);
                Toast.makeText(getContext(),item.getText(), Toast.LENGTH_SHORT).show();
                //startActivity(intent);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}
