package com.example.lookcal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;

public class DiaryFragment extends Fragment implements View.OnClickListener{
    Button objButtonBreakfast;
    Button objButtonLunch;
    Button objButtonDinner;
    Button objButtonSnack;
    BreakfastFragment fragmentBreakfast = new BreakfastFragment();
    LunchFragment fragmentLunch = new LunchFragment();
    DinnerFragment fragmentDinner = new DinnerFragment();
    SnackFragment fragmentSnack = new SnackFragment();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_diary, null);
        objButtonBreakfast = view.findViewById(R.id.buttonBreakfast);
        objButtonLunch = view.findViewById(R.id.buttonLunch);
        objButtonDinner = view.findViewById(R.id.buttonDinner);
        objButtonSnack = view.findViewById(R.id.buttonSnack);
        objButtonBreakfast.setOnClickListener(this);
        objButtonLunch.setOnClickListener(this);
        objButtonDinner.setOnClickListener(this);
        objButtonSnack.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.buttonBreakfast:
                FragmentTransaction transaction_breakfast = getFragmentManager().beginTransaction();
                transaction_breakfast.replace(R.id.fragment_container, fragmentBreakfast);
                transaction_breakfast.commit();
                break;
            case R.id.buttonLunch:
                FragmentTransaction transaction_lunch = getFragmentManager().beginTransaction();
                transaction_lunch.replace(R.id.fragment_container, fragmentLunch);
                transaction_lunch.commit();
                break;
            case R.id.buttonDinner:
                FragmentTransaction transaction_dinner = getFragmentManager().beginTransaction();
                transaction_dinner.replace(R.id.fragment_container, fragmentDinner);
                transaction_dinner.commit();
                break;
            case R.id.buttonSnack:
                FragmentTransaction transaction_snack = getFragmentManager().beginTransaction();
                transaction_snack.replace(R.id.fragment_container, fragmentSnack);
                transaction_snack.commit();
                break;
            default:
                break;
        }
    }

}
