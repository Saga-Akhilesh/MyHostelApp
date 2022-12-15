package com.vitap.myApp.MyHostelApp.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.vitap.myApp.MyHostelApp.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilGenSecy extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar genSecyActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> genSecyList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        genSecyList =new ArrayList<>();
        CouncilUserClass genAcSecy=new CouncilUserClass("Mohanlan","Academic General Secretary",""," mohanlal@gmail.com",R.drawable.mohanlal);
        CouncilUserClass genCulSecy=new CouncilUserClass("Chiranjeevi","Cultural General Secretary",""," chiranjeevi@gmail.com",R.drawable.chiranjeevi);
        CouncilUserClass genTechSecy=new CouncilUserClass("Kamal Hassan","Technical General Secretary",""," kamalhassan@gmail.com",R.drawable.kamalhaasan);
        CouncilUserClass genSportSecy=new CouncilUserClass("Prithviraj","Sports General Secretary",""," Prithviraj@gmail.com",R.drawable.prithviraj);
        genSecyList.add(genAcSecy);
        genSecyList.add(genCulSecy);
        genSecyList.add(genSportSecy);
        genSecyList.add(genTechSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, genSecyList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        genSecyActionBar = getSupportActionBar();
        assert genSecyActionBar != null;
        genSecyActionBar.setHomeButtonEnabled(true);
        genSecyActionBar.setDisplayHomeAsUpEnabled(true);
        genSecyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        genSecyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
