package com.example.lizapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

        import java.util.ArrayList;
        import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    TextView txtQuote;
    Button btnNext;

    ArrayList<String> quotes;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQuote = findViewById(R.id.txtQuote);
        btnNext = findViewById(R.id.btnNext);

        quotes = new ArrayList<>();
        quotes.add("Succes in not finnal failure is not fatal");
        quotes.add("heha");
        quotes.add("hiha");
        quotes.add("hoha");
        quotes.add("hahe");
        quotes.add("hahi");
        quotes.add("haho");
        quotes.add("hahu");

        Collections.shuffle(quotes);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index < quotes.size()) {
                    txtQuote.setText(quotes.get(index));
                    index++;
                } else {
                    btnNext.setEnabled(false);
                    btnNext.setText("no more quotes");
                }

            }

        });

        }
    }
pag ako pumasa hindi kita kakalimutan sir loveuuu!!!!!!<3<3                                                                                                                                 
