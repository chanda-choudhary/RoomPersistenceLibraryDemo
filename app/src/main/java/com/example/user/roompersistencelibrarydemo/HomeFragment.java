package com.example.user.roompersistencelibrarydemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button btnAddUser,btnViewUser,btnUpdateUser,btnDeleteUser;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        btnAddUser=view.findViewById(R.id.btn_add_user);
        btnViewUser=view.findViewById(R.id.btn_view_user);
        btnUpdateUser=view.findViewById(R.id.btn_update_user);
        btnDeleteUser=view.findViewById(R.id.btn_delete_user);

        btnAddUser.setOnClickListener(this);
        btnViewUser.setOnClickListener(this);
        btnUpdateUser.setOnClickListener(this);
        btnDeleteUser.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).addToBackStack(null).commit();
                break;

        }

    }
}
