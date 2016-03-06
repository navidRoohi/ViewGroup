package com.example.navidroohibroojeni.viewgroupdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {

        Button button = (Button)view;
        LinearLayout innerGrp = (LinearLayout)findViewById(R.id.innerViewGroup);

        if (innerGrp.getVisibility() == View.VISIBLE){
            button.setText("Show View");
            innerGrp.setVisibility(View.INVISIBLE);
        }else{
            button.setText("Hide View");
            innerGrp.setVisibility(View.VISIBLE);
        }

        /*  // This is traditional way
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkboxId);
        TextView userText = (TextView)findViewById(R.id.userId);
        TextView adminText = (TextView)findViewById(R.id.adminId);

        if(checkBox.isChecked()){
            adminText.setVisibility(View.VISIBLE);
            userText.setVisibility(View.GONE);

        }else{
            userText.setVisibility(View.VISIBLE);
            adminText.setVisibility(View.GONE);

            // GONE is different by INVISIBLE -->
            //  View.INVISIBLE   -->  view is invisible, but it still takes up space for layout purposes.
            //  View.GONE        -->  view is invisible, and it doesn't take any space for layout purposes.
        }
        */

        // This is another way, by accessing to view Group childes. and indexing from 0....
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkboxId);
        TextView userText = (TextView)innerGrp.getChildAt(0);
        TextView adminText = (TextView)innerGrp.getChildAt(1);

        if(checkBox.isChecked()){
            adminText.setVisibility(View.VISIBLE);
            userText.setVisibility(View.GONE);

        }else{
            userText.setVisibility(View.VISIBLE);
            adminText.setVisibility(View.GONE);
        }

    }
}
