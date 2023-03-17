package com.miniweam.miniweamdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.miniweam.miniweamdemo.Adapter.ItemAdapter;

public class ProjectsActivity extends AppCompatActivity {

    Button soaBtn, raBtn;

    ListView listView;
    String[] app_name;
    String[] app_descriptions;
    String[] app_link;

    private static final String TAG = "MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        Log.i(TAG,"onCreate");

        soaBtn = findViewById(R.id.see_other_apps_btn);
        raBtn = findViewById(R.id.rate_app_btn);

        soaBtn.setOnClickListener(view -> {
            try {
                Uri uri1 = Uri.parse("market://search?q=Al");
                Intent goToMarket1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(goToMarket1);
            } catch (ActivityNotFoundException e) {
                Uri uri1 = Uri.parse("http://play.google.com/store/search?q=Al");
                Intent goToMarket1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(goToMarket1);
            }
        });

        raBtn.setOnClickListener(view -> {
            try {
                Uri uri2 = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(goToMarket2);
            } catch (ActivityNotFoundException e) {
                Uri uri2 = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                Intent goToMarket2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(goToMarket2);
            }
        });

        TextInputEditText phoneEditText = findViewById(R.id.phone_tiet);
        if (phoneEditText != null)
            phoneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean handled = false;
                    if (i == EditorInfo.IME_ACTION_SEND) {
                        dialNumber();
                        handled = true;
                    }
                    return handled;
                }

                private void dialNumber() {
                    TextInputEditText phoneEditText = findViewById(R.id.phone_tiet);
                    String phoneNum = null;

                    if (phoneEditText != null) phoneNum = "tel:" + phoneEditText.getText().toString();

                    Log.d(TAG, "dialNumber: " + phoneNum);

                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse(phoneNum));

                    if (i.resolveActivity(getPackageManager()) != null) {
                        startActivity(i);
                    } else {
                        Log.d("ImplicitIntent", "Can't handle this !");
                    }
                }
            });

        Resources res = getResources();
        listView = findViewById(R.id.projects_lv);
        app_name = res.getStringArray(R.array.app_name);
        app_descriptions = res.getStringArray(R.array.app_descriptions);
        app_link = res.getStringArray(R.array.app_link);

        ItemAdapter itemAdapter = new ItemAdapter(this, app_name, app_descriptions, app_link);
        listView.setAdapter(itemAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
//                showDetailActivity.putExtra("com.miniweam.ITEM_INDEX", position);
//                startActivity(showDetailActivity);
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}