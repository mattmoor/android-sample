package com.example.myapplication2;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.R;

/**
 * Created by jacco @ wercker on 9/23/13.
 * Modified by mattmoor @ google on 12/30/13
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.example.myapplication2", MainActivity.class);
    }

    public void testWelcomeText() {
        MainActivity activity;
        activity = (MainActivity) getActivity();

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.introText);
        assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        assertNotNull(introText);

        assertTrue("Check intro text", introText.equals("Hello world!"));
    }
}