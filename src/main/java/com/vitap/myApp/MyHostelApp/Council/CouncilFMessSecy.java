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


public class CouncilFMessSecy extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar FMessActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> FMessList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        FMessList =new ArrayList<>();
        CouncilUserClass messMem1=new CouncilUserClass("Sathyaraj","Mess Committee","1234567891","sathyaraj@gmail.com",R.drawable.sathyaraj);
        CouncilUserClass messMem2=new CouncilUserClass("Sanjay-dutt","Mess Committee","1234567891","sanjay-dutt@gmail.com",R.drawable.sanjaydutt);
        CouncilUserClass messMem3=new CouncilUserClass("RabirKapoor","Mess Committee","1234567891","ranbir@gmail.com",R.drawable.rabirkapoor);
        CouncilUserClass messMem4=new CouncilUserClass("Ranveer Singh","Mess Committee","1234567891","ranveer@gmail.com",R.drawable.ranveer);
        FMessList.add(messMem1);
        FMessList.add(messMem2);
        FMessList.add(messMem3);
        FMessList.add(messMem4);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, FMessList);
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

        FMessActionBar = getSupportActionBar();
        assert FMessActionBar != null;
        FMessActionBar.setHomeButtonEnabled(true);
        FMessActionBar.setDisplayHomeAsUpEnabled(true);
        FMessActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        FMessActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
