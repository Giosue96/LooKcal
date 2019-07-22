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

public class BreakfastFragment extends Fragment implements View.OnClickListener {
    Button backButtonBreakfast;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View break_view = inflater.inflate(R.layout.fragment_breakfast, null);
        backButtonBreakfast = break_view.findViewById(R.id.backButtonBreak);
        backButtonBreakfast.setOnClickListener(this);

        return break_view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.backButtonBreak:
                DiaryFragment fragmentDiary = new DiaryFragment();
                FragmentTransaction transactionBreakfastToDiary = getFragmentManager().beginTransaction();
                transactionBreakfastToDiary.replace(R.id.fragment_container, fragmentDiary);
                transactionBreakfastToDiary.commit();
                break;
            default:
                break;
        }

    }
}