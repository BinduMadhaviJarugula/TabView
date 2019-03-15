package com.example.cse.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    final int[] image=new int[]{R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.mipmap.android};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.view);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        for(int i=0;i<tabLayout.getTabCount();i++) {
            tabLayout.getTabAt(i).setIcon(this.getResources().getDrawable(image[i]));
            /*tabLayout.getTabAt(1).setIcon(R.drawable.ic_launcher_foreground);
            tabLayout.getTabAt(2).setIcon(R.mipmap.android);*/
        }

    }
}
