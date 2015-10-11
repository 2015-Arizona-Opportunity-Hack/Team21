package com.example.navigator.chandlerfoodbank;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuFragment extends Fragment {
    Fragment frag;
    FragmentTransaction fragTrans;
    public MenuFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        Button prog_event = (Button)view.findViewById(R.id.prog);
        Button rfp_job = (Button)view.findViewById(R.id.jobs);
        Button  support = (Button)view.findViewById(R.id.support);
        Button  abt_contact = (Button)view.findViewById(R.id.contact);
        final ImageView image_vw = (ImageView)view.findViewById(R.id.chandlerBank);
        final TextView tv = (TextView)view.findViewById(R.id.startLine);

        prog_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(savedInstanceState == null) {
                    frag = new EventFragment();
                    image_vw.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                    fragTrans = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTrans.addToBackStack(null);
                    fragTrans.commit();
                }
            }

        });
        rfp_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(savedInstanceState == null) {
                    frag = new JobFragment();
                    image_vw.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                    fragTrans = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTrans.addToBackStack(null);
                    fragTrans.commit();
                }
            }

        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(savedInstanceState == null) {
                    frag = new SupportFragment();
                    image_vw.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                    fragTrans = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTrans.addToBackStack(null);
                    fragTrans.commit();
                }
            }

        });
        abt_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(savedInstanceState == null) {
                    frag = new AboutFragment();
                    image_vw.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                    fragTrans = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                    fragTrans.commit();
                }
            }

        });

        return view ;

    }
}
