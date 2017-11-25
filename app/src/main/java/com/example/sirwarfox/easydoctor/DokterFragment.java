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

public class DokterFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dokter,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btnDokterHarisLogito).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dokter Haris Logito Pressed", Toast.LENGTH_SHORT).show();
                Fragment fragment = new DokterHarisLogitoFragment();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.screen_area, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        view.findViewById(R.id.btnDokterLogitoHaris).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dokter Logito Haris Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.btnDokterAdrianMele).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dokter Adrian Mele Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.btnDokterMeleLogito).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dokter Mele Logito Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.btnDokterSledingers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dokter Sledingers Pressed But Nothing Happen", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
