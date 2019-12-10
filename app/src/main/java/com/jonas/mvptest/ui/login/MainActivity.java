package com.jonas.mvptest.ui.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jonas.mvptest.R;
import com.jonas.mvptest.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainActivityMVP.View {

    EditText firstName;
    EditText lastName;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initProperties();
    }

    private void initProperties() {
        firstName = findViewById(R.id.edt_first_name);
        lastName = findViewById(R.id.edt_last_name);
        btnLogin = findViewById(R.id.btn_login);
    }

    @Override
    public String getFirstName() {
        return this.firstName.getText().toString();
    }

    @Override
    public String getlastName() {
        return this.lastName.getText().toString();
    }

    @Override
    public void showUserNotAvaliable() {
        Toast.makeText(this, "El usuario no esta disponible", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this,"Error, el nombre y apellido no pueden estar vacios", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this,"Usuario guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName.setText(lastName);
    }
}
