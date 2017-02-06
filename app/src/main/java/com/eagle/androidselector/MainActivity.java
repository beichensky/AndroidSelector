package com.eagle.androidselector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.eagle.androidselector.activity.LayerListActivity;
import com.eagle.androidselector.activity.SelectorActivity;
import com.eagle.androidselector.activity.ShapeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClicked(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn_selector:
                intent = new Intent(this,SelectorActivity.class);
                break;
            case R.id.btn_shape:
                intent = new Intent(this,ShapeActivity.class);
                break;
            case R.id.btn_layer_list:
                intent = new Intent(this,LayerListActivity.class);
                break;
        }
        startActivity(intent);

    }
}
