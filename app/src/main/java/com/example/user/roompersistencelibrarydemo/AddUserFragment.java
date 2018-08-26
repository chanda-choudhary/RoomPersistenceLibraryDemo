package com.example.user.roompersistencelibrarydemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {

    EditText edtUserId,edtUserName,edtUserEmail;
    Button btnSave;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_user, container, false);
        edtUserId=view.findViewById(R.id.txt_user_id);
        edtUserName=view.findViewById(R.id.txt_user_name);
        edtUserEmail=view.findViewById(R.id.txt_user_email);
        btnSave=view.findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userId= Integer.parseInt(edtUserId.getText().toString());
                String userName=edtUserName.getText().toString();
                String userEmail=edtUserEmail.getText().toString();

                User user=new User();
                user.setId(userId);
                user.setName(userName);
                user.setEmail(userEmail);

                MainActivity.myAppDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(),"User added successfully",Toast.LENGTH_LONG).show();

                edtUserId.setText("");
                edtUserName.setText("");
                edtUserEmail.setText("");
            }
        });
        return view;
    }

}
