package com.naser.omar.androideitserver;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.naser.omar.androideitserver.Common.Common;
import com.naser.omar.androideitserver.Model.User;

public class SingIn extends AppCompatActivity {
EditText edtPhone,edtPassword;
Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        edtPhone=(EditText)findViewById(R.id.edtPhone);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        btnSignIn=(Button)findViewById(R.id.btnSignIn);

        //Init Firebase
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference table_user=database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {



                final ProgressDialog mDialog = new ProgressDialog(SingIn.this);
                mDialog.setMessage("please waiting ...");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child(edtPhone.getText().toString()).exists()){
                        mDialog.dismiss();
                        User user =dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                            user.setPhone(edtPhone.getText().toString());//set phone
                    if(user.getPassword().equals(edtPassword.getText().toString()))
                    {
                            Intent homeintent=new Intent(SingIn.this,Homee.class);
                            Common.currentUser=user;
                            startActivity(homeintent);
                            finish();
                     }else {
                        Toast.makeText(SingIn.this, "Wrong password !!!", Toast.LENGTH_SHORT).show();
                    }
                           // Toast.makeText(SingIn.this, user, Toast.LENGTH_SHORT).show();
                        }else { mDialog.dismiss();
                            Toast.makeText(SingIn.this, "User not exist in Database", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });

    }


}
