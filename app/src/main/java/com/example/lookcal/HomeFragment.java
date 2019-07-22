package com.example.lookcal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.navigation.Navigation;

public class HomeFragment extends Fragment implements View.OnClickListener{
    Button obj_AggiungiAlimento;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View homeView = inflater.inflate(R.layout.fragment_home, null);
        obj_AggiungiAlimento = homeView.findViewById(R.id.buttonAggiungiAlimento);
        obj_AggiungiAlimento.setOnClickListener(this);
        return homeView;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.buttonAggiungiAlimento:
                DiaryFragment fragmentDiary = new DiaryFragment();
                FragmentTransaction buttonToDiary = getFragmentManager().beginTransaction();
                buttonToDiary.replace(R.id.fragment_container, fragmentDiary);
                buttonToDiary.commit();
                break;
            default:
                break;
        }
    }
}

