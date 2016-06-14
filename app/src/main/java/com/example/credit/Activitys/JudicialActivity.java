package com.example.credit.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.credit.Adapters.CC_List_itemAdapter;
import com.example.credit.R;
import com.example.credit.Views.MyListView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.util.Arrays;
import java.util.List;

/**
 *司法信息主界面
 */
public class JudicialActivity extends BaseActivity {
    @ViewInject(R.id.b_return)
    ImageView b_return;
    @ViewInject(R.id.b_topname)
    TextView b_topname;

    @ViewInject(R.id.jc_sc)
    ScrollView jc_sc;
    @ViewInject(R.id.jListView1)
    MyListView jListView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judicial);
        ViewUtils.inject(this);
        Intent i=getIntent();
        String Tname=i.getStringExtra("Tname");
        b_topname.setText(Tname);
        jc_sc.smoothScrollTo(0,20);
        b_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.finish_tran_one, R.anim.finish_tran_two);
            }
        });
        final List<String> list = Arrays.asList(getResources().getStringArray(R.array.judicial));
        CC_List_itemAdapter adapter=new CC_List_itemAdapter(JudicialActivity.this,list,"judicial",null);
        jListView1.setAdapter(adapter);
        jListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(JudicialActivity.this,Judicial_CActivity.class);
                i.putExtra("position",position);
                i.putExtra("state",list.get(position));
                startActivity(i);
                overridePendingTransition(R.anim.start_tran_one,R.anim.start_tran_two);
            }
        });
    }
}
