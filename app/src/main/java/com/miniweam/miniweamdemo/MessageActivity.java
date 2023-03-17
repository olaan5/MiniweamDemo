package com.miniweam.miniweamdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    private Button openMail, shareText;
    private EditText mailEditText, shareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        openMail = findViewById(R.id.open_website_button);
        shareText = findViewById(R.id.share_text_button);

        mailEditText = findViewById(R.id.myEmailAddress_editText);
        shareTextEditText = findViewById(R.id.share_edittext);

        openMail.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body of Email");
            startActivity(emailIntent);
        });

        shareText.setOnClickListener(View -> ShareText());
    }

    private void ShareText() {
        String txt = shareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder.from(this).setType(mimeType).setChooserTitle("Share this text with: ")
                .setText(txt).startChooser();
    }
}