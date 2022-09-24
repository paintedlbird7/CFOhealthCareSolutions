package com.example.android.cfohealthcaresolutions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    //Declare ImageButton inside your activity: (for web intent)
    private ImageButton ImageButton;
    private ImageButton ImageButton3;
    private Button ButtonButton;
    private Button ButtonButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //(for web intent) Initialize imageButton3 inside onCreate method:

        ImageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton = (ImageButton) findViewById(R.id.imageButton);
        ButtonButton = (Button) findViewById(R.id.buttonButton);
        ButtonButton2 = (Button) findViewById(R.id.buttonButton2);


        //Service Button Set on click listener:
        ButtonButton.setOnClickListener(new View.OnClickListener() {

            //Write onclick method:
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cfohealthcaresolutions.com/recent-projects/"));
                startActivity(intent);
            }
        });

        //Second Service Button2 Set on click listener:
        ButtonButton2.setOnClickListener(new View.OnClickListener() {

            //Write onclick method:
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.cfohealthcaresolutions.com/"));
                startActivity(intent);
            }
        });

        //Set on click listener:
        ImageButton3.setOnClickListener(new View.OnClickListener() {

            //Write onclick method:
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.cfohealthcaresolutions.com/"));
                startActivity(intent);
            }
        });

        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                String phno="tel:10digits";

                //to start the dialer via code, without user interaction.  You need Action_Dial,below code it
                //will open Dialer with number specified (Action_Dial doesn't require any permission.)

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1408684-8886");
               startActivity(intent);
            }
        });
    }






    // To send a email
    public void sendEmail(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:info@cfohealthcaresolutions.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact CFO Health Solutions ");
        //intent.putExtra(Intent.EXTRA_TEXT, "Thank you for contacting Ignacio Perez  ");


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
