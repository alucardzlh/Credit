package com.example.credit.Activitys;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.credit.Adapters.MyGridAdapter4;
import com.example.credit.R;
import com.example.credit.Views.MyGridView;

/**
 * Created by alucard on 2016-05-26.
 * 自主公示
 */
public class AutonomyActivity extends BaseActivity {
    TextView auto_title;
    MyGridView auto_mgv;
    MyGridAdapter4 autoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        initview();
    }

    private void initview() {

        auto_title = (TextView) findViewById(R.id.menu_title);
        auto_title.setText("企业自主公示");
        auto_mgv = (MyGridView) findViewById(R.id.myGridView4);
        autoAdapter = new MyGridAdapter4(this, getResources().getStringArray(R.array.autonomy));
        auto_mgv.setAdapter(autoAdapter);
        auto_mgv.setSelector(new ColorDrawable(Color.TRANSPARENT));
        auto_mgv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        findViewById(R.id.b_return).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.finish_tran_one, R.anim.finish_tran_two);
            }
        });

    }


}
