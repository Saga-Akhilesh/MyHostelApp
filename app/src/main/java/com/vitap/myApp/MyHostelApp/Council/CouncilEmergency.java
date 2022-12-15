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


public class CouncilEmergency extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> emergencyList = new ArrayList<>();
        CouncilUserClass plumber=new CouncilUserClass("Shivaji","Plumbing Maintenance","1234567891","",R.drawable.shahrukh);
        CouncilUserClass electrician=new CouncilUserClass("Sachin","Electrical Maintenance","1234567891","",R.drawable.shahrukh);
        CouncilUserClass housekeeping=new CouncilUserClass("Ravi","Hostel Cheif Warden","1234567891","",R.drawable.shahrukh);
        CouncilUserClass securitySupervisor1=new CouncilUserClass("Ashok","Security Supervisor","1234567891","",R.drawable.shahrukh);
        CouncilUserClass securitySupervisor2=new CouncilUserClass("Teja","Security Supervisor","1234567891","",R.drawable.shahrukh);
        CouncilUserClass securitySupervisor3=new CouncilUserClass("Ramachandra","Security Supervisor","1234567891","",R.drawable.shahrukh);
        CouncilUserClass securitySup=new CouncilUserClass("Mallikarjun","Security Superintendent","1234567891","",R.drawable.shahrukh);
        CouncilUserClass medicalEmergency=new CouncilUserClass("VITAP Ambulance","Medical emergency","1234567891","",R.drawable.shahrukh);
        CouncilUserClass lib=new CouncilUserClass("Omprakash","Librarian","1234567891","",R.drawable.shahrukh);
        CouncilUserClass consDept1=new CouncilUserClass("Govind Prabhu","Construction department","1234567891","",R.drawable.shahrukh);
        CouncilUserClass consDept2=new CouncilUserClass("Sharanbasappa","Construction department","1234567891","",R.drawable.shahrukh);
        CouncilUserClass mainGate=new CouncilUserClass("VITAP Main Gate","Security","1234567891","",R.drawable.shahrukh);
        CouncilUserClass backGate=new CouncilUserClass("VITAP 2nd Gate","Security ","1234567891","",R.drawable.shahrukh);
        CouncilUserClass sportsInst=new CouncilUserClass("Gopichand","Sports Instructor","1234567891","",R.drawable.shahrukh);

        emergencyList.add(plumber);
        emergencyList.add(electrician);
        emergencyList.add(housekeeping);
        emergencyList.add(securitySupervisor1);
        emergencyList.add(securitySupervisor2);
        emergencyList.add(securitySupervisor3);
        emergencyList.add(securitySup);
        emergencyList.add(medicalEmergency);
        emergencyList.add(lib);
        emergencyList.add(consDept1);
        emergencyList.add(consDept2);
        emergencyList.add(mainGate);
        emergencyList.add(backGate);
        emergencyList.add(sportsInst);


        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, emergencyList);
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

        androidx.appcompat.app.ActionBar emergencyActionBar = getSupportActionBar();
        assert emergencyActionBar != null;
        emergencyActionBar.setHomeButtonEnabled(true);
        emergencyActionBar.setDisplayHomeAsUpEnabled(true);
        emergencyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        emergencyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
