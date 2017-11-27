package com.example.sirwarfox.easydoctor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Sir.WarFox on 20/11/2017.
 */

public class RumahSakitFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rumahsakit,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        view.findViewById(R.id.btnRumahSakitabc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Rumah Sakit abc Pressed", Toast.LENGTH_SHORT).show();
                fragmentRumahSakitControl();
            }
        });

        view.findViewById(R.id.btnRumahSakitAlog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Rumah Sakit Alog Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
                fragmentRumahSakitControl();
            }
        });
        view.findViewById(R.id.btnRumahSakitHaris).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Rumah Sakit Haris Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
                fragmentRumahSakitControl();
            }
        });
        view.findViewById(R.id.btnRumahSakitMele).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Rumah Sakit Mele Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
                fragmentRumahSakitControl();
            }
        });
        view.findViewById(R.id.btnRumahSakitAHM).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Rumah Sakit AHM Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
                fragmentRumahSakitControl();
            }
        });

    }

    public void fragmentRumahSakitControl(){
        Fragment fragment = new RumahSakitAbcFragment();

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
