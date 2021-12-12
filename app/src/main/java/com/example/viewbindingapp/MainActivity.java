package com.example.viewbindingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = binding.name.getText().toString();
                String lastName = binding.lastName.getText().toString();
                String number = binding.number.getText().toString();

                String msg = name + " "+ lastName + " \n"+ " "+ number;
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();

            }
        });
    }
}