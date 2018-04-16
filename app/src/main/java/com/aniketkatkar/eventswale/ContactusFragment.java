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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactusFragment extends Fragment {

    Button button1, button2, button3, website;

    public ContactusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contactus,
                container, false);
        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        website = (Button) view.findViewById(R.id.website);

        // add button1 listener
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9699999109"));
                try {
                    startActivity(callIntent);
                    }
                catch (ActivityNotFoundException ex) {
                }

            }

        });

        // add button2 listener

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9699999809"));
                try {
                    startActivity(callIntent);
                    }
                catch (ActivityNotFoundException ex) {
                }

            }

        });

        // add button3 listener

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9699789919"));
                try {
                    startActivity(callIntent);
                    }
                catch (ActivityNotFoundException ex) {

                }

            }

        });

        // open website

        website.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                       webPageIntent.setData(Uri.parse("http://www.eventswale.com"));

                       try {
                           startActivity(webPageIntent);
                       } catch (ActivityNotFoundException ex) {
                       }
                   }
               }

        );

        return view;
    }
}
