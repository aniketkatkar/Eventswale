package com.aniketkatkar.eventswale;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FollowusFragment extends Fragment {

    Button button1, button2, button3;


    public FollowusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_followus,
                container, false);
        button1 = (Button) view.findViewById(R.id.facebook);
        button2 = (Button) view.findViewById(R.id.twitter);
        button3 = (Button) view.findViewById(R.id.instagram);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                webPageIntent.setData(Uri.parse("http://www.facebook.com/eventswaleindia"));

                try {
                    startActivity(webPageIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                webPageIntent.setData(Uri.parse("http://www.facebook.com/eventswaleindia"));

                try {
                    startActivity(webPageIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                webPageIntent.setData(Uri.parse("http://www.facebook.com/eventswaleindia"));

                try {
                    startActivity(webPageIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });


        return view;
    }


}
