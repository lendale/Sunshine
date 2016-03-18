package com.example.android.sunshine.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.sunshine.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view for the MainActivity.
 */
public class MainFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    ListView mLvMain;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mLvMain = (ListView) view.findViewById(R.id.lvForecast);

        List<String> weekForecast = new ArrayList<>(Arrays.asList("Today - Sunny - 88 / 63",
                "Tomorrow - Foggy - 70 / 46",
                "Weds - Cloudy - 72 / 63",
                "Thurs - Rainy - 64 / 51",
                "Fri - Foggy - 70 / 46",
                "Sat - Sunny - 76 / 68"));

        mForecastAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast,
                R.id.tvListItemForecast,
                weekForecast);

        mLvMain.setAdapter(mForecastAdapter);
    }
}
