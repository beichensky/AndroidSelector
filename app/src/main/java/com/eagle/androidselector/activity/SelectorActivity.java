package com.eagle.androidselector.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.eagle.androidselector.R;

public class SelectorActivity extends AppCompatActivity {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        initActionBar();

        initViews();

    }


    private void initActionBar() {

        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setTitle("Selector界面");
            bar.setDisplayHomeAsUpEnabled(true);
        }

    }

    private void initViews() {

        mBtn = (Button) findViewById(R.id.btn_lamp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnClicked(View view) {

        if (view.getId() == R.id.btn_switch){
            mBtn.setEnabled(!mBtn.isEnabled());
        }

    }
}
