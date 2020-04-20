package com.example.interactivestory.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.interactivestory.R;

public class MainActivity extends AppCompatActivity {


    private EditText text;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        text=(EditText)findViewById ( R.id.editText );
        button=(Button)findViewById ( R.id.button2 );
        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String name=text.getText ().toString ();
                Toast.makeText (MainActivity.this,"Hi! "+name,Toast.LENGTH_SHORT).show();
                startStory(name);
            }
        } );
    }

    private void startStory(String name) {
        Intent it =new Intent (this,NewStory.class);
        Resources rs;
        rs = getResources ();
        String key=rs.getString ( R.string.key_name );

        it.putExtra ( key,name );
        startActivity ( it );

    }
}
