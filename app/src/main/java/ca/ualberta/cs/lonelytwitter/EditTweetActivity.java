package ca.ualberta.cs.lonelytwitter;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends LonelyTwitterActivity {

    private EditText bodyText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent myIntent = getIntent();
        final int position = myIntent.getIntExtra("position", 0);

        loadFromFile();

        Button saveButton = (Button) findViewById(R.id.saveChange);
        String oldText = tweetList.get(position).getMessage();

        bodyText = (EditText) findViewById(R.id.editBody);
        bodyText.setText(oldText, TextView.BufferType.EDITABLE);

        saveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setResult(RESULT_OK);
                String text = bodyText.getText().toString();
                Tweet newTweet = new NormalTweet(text);
                tweetList.set(position, newTweet);
                adapter.notifyDataSetChanged();
                saveInFile();
            }
        });
    }
}
