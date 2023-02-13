package com.example.bookline;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookline.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView bookName = (TextView)findViewById(R.id.bookName);
        TextView bookInformation = (TextView)findViewById(R.id.informationBook);
        TextView bestSentence = (TextView)findViewById(R.id.bestSentence);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Book1Information book1Information = new Book1Information();
        bookName.setText(book1Information.getName());
        bookInformation.setText(book1Information.getInformation());
        bestSentence.setText(book1Information.getBestSentence());
        ratingBar.setRating(book1Information.getRating());
    }
}