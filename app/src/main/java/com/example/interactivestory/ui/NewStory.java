package com.example.interactivestory.ui;
import com.example.interactivestory.model.Page;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.interactivestory.R;
import com.example.interactivestory.model.Story;

public class NewStory extends AppCompatActivity {
    private String name;
    private Story story;
    private ImageView storyImageView;
    private TextView storyText1;
    private TextView storyText2;
    private Button choice1;
    private Button choice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_new_story );
        storyImageView=(ImageView)findViewById ( R.id.storyImageView );
        storyText1=(TextView)findViewById ( R.id.storyTextView1 );
        storyText2=(TextView)findViewById ( R.id.storyTextView2 );
        choice1=(Button)findViewById ( R.id.choice1 );
        choice2=(Button)findViewById ( R.id.choice2 );
        
        Intent it =getIntent ();

        name=it.getStringExtra ( getString (  R.string.key_name ));
        story=new Story ();
        loadPage ( 0 );

    }

    private void loadPage(int pageNumber){
        final Page page = story.getPage ( pageNumber );

        Drawable image= ContextCompat.getDrawable (this,page.getImageId ());
        storyImageView.setImageDrawable (image  );

        if(page.isFinalPage ()){
            choice1.setVisibility ( View.INVISIBLE );
            choice2.setText ( "Wanna Go To Start?" );

            choice2.setOnClickListener ( new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    loadPage ( 0 );
                }
            } );
        }
        else{
            String pageText1=getString ( page.getTextId1 () );

            String pageText2=getString ( page.getTextId2 () );
            choice2.setVisibility ( View.VISIBLE );
            choice1.setVisibility ( View.VISIBLE );
            storyText1.setText ( pageText1 );
            storyText2.setText ( pageText2 );
            choice1.setText ( getString ( page.getC1 ().getTextId () ) );
            choice1.setOnClickListener ( new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    int nextPage=page.getC1 ().getNextPage ();
                    loadPage ( nextPage );
                }
            } );
            choice2.setText ( getString ( page.getC2 ().getTextId (  ) ) );
            choice2.setOnClickListener ( new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    int nextPage=page.getC2 ().getNextPage ();
                    loadPage ( nextPage );
                }
            } );



        }
    }
}
