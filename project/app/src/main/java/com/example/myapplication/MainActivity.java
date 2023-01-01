package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {
	
	private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		// Remove this line if you don't want AndroidIDE to show this app's logs
		LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
		// Inflate and get instance of binding
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		
		// Setup toolbar
		setSupportActionBar(binding.toolbar);
		
		// set content view to binding's root
        setContentView(binding.getRoot());
		
		// Use lambdas
		binding.fab.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Replace with your action", Toast.LENGTH_SHORT).show());
    }
}
