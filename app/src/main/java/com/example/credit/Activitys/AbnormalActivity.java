package com.example.credit.Activitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.credit.Adapters.AbnormalAdapter;
import com.example.credit.Adapters.Support_CAdapter;
import com.example.credit.Entitys.DataManager;
import com.example.credit.R;
import com.example.credit.Views.MyGridView;
import com.example.credit.Views.MyListView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/**
 * 经营异常界面
 */
public class AbnormalActivity extends BaseActivity {
    @ViewInject(R.id.a_return)
    ImageView a_return;
    @ViewInject(R.id.a_topname)
    TextView a_topname;

    @ViewInject(R.id.a_sc)
    ScrollView a_sc;
    @ViewInject(R.id.aListView1)
    MyListView aListView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal);
        ViewUtils.inject(this);
        a_sc.smoothScrollTo(0, 20);
        a_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.finish_tran_one, R.anim.finish_tran_two);
            }
        });
        AbnormalAdapter hcadapter2 = new AbnormalAdapter(AbnormalActivity.this, DataManager.abnormalInfoList);
        aListView1.setAdapter(hcadapter2);
    }
}
