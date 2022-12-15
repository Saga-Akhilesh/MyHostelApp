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


public class CouncilSportsSecy extends AppCompatActivity
        {

            @Override

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> sportsList = new ArrayList<>();
        CouncilUserClass footballSecy=new CouncilUserClass("Ashok","VITAP Institute Football Secretary",""," Ashok@gmail.com",R.drawable.prabhas);
        CouncilUserClass cricketSecy=new CouncilUserClass("Sanjay","VITAP Institute Cricket Secretary",""," Sanjay@gmail.com",R.drawable.prabhas);
        CouncilUserClass volleyballSecy=new CouncilUserClass("Jagapathi","VITAP Institute Volleyball Secretary",""," Jagapathi@gmail.com",R.drawable.prabhas);
        CouncilUserClass hockeySecy=new CouncilUserClass("Sundar","VITAP Institute Hockey Secretary",""," Sundar@gmail.com",R.drawable.prabhas);
        CouncilUserClass badmintonSecy=new CouncilUserClass("Mahesh","VITAP Badminton Secretary","","Mahesh@gmail.com",R.drawable.prabhas);
        CouncilUserClass athleticsSecy=new CouncilUserClass("Alok","VITAP Institute Athletics Secretary",""," Alok@gmail.com",R.drawable.prabhas);
        CouncilUserClass basketballSecy=new CouncilUserClass("kundan Das ","VITAP Institute Basketball Secretary","","kundan Das@gmail.com",R.drawable.prabhas);
        CouncilUserClass ttSecy=new CouncilUserClass("Suresh","VITAP Institute Table Tennis Secretary","","Suresh@gmail.com",R.drawable.prabhas);
        CouncilUserClass boardGamesSecy=new CouncilUserClass("Subhash","VITAP Institute Board Games Secretary",""," Subhash@gmail.com ",R.drawable.prabhas);

        sportsList.add(footballSecy);
        sportsList.add(cricketSecy);
        sportsList.add(volleyballSecy);
        sportsList.add(hockeySecy);
        sportsList.add(badmintonSecy);
        sportsList.add(athleticsSecy);
        sportsList.add(basketballSecy);
        sportsList.add(ttSecy);
        sportsList.add(boardGamesSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, sportsList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar sportsActionBar = getSupportActionBar();
        assert sportsActionBar != null;
        sportsActionBar.setHomeButtonEnabled(true);
        sportsActionBar.setDisplayHomeAsUpEnabled(true);
        sportsActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        sportsActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
