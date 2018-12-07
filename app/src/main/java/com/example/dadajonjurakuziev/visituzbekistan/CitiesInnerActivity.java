package com.example.dadajonjurakuziev.visituzbekistan;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import java.util.ArrayList;
import java.util.List;


public class CitiesInnerActivity extends AppCompatActivity {
    private static final String TAG = "CitiesActivity";
    ExpandableTextView expandableTextView;
    ImageButton imageButton;

    //vars for experiences_RecyclerView
    RecyclerView expRecyclerView;
    ExperiencesViewAdapter expAdapter;
    List<Experiences> experiencesList;

    //vars for NavButtons
    RecyclerView navBtnRV;
    NavButtonsViewAdapter navButtonsViewAdapter;
    List<NavButtons> navButtonsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_inner_view);
        Log.d(TAG, "onCreate: started.");

        expRecyclerView = findViewById(R.id.experience_recyclerView);
        expRecyclerView.setHasFixedSize(true);
        expRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getIncomingIntent();
        expAdapter = new ExperiencesViewAdapter(this, experiencesList);
        expRecyclerView.setAdapter(expAdapter);
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            int cityBg = bundle.getInt("city_bg");
            String cityTitle = bundle.getString("city_title");
            String cityDesc = bundle.getString("city_desc");

            //NavButtons
            navBtnRV = findViewById(R.id.nav_button_recyclerView);
            navBtnRV.setHasFixedSize(true);
            navBtnRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

            assert cityTitle != null;
            //Tashkent
            if(cityTitle.equals("Tashkent")){ Tashkent(); }
            //Bukhara
            if(cityTitle.equals("Bukhara")){ Bukhara(); }
            //Samarkand
            if(cityTitle.equals("Samarkand")){ Samarkand(); }
            //Khiva
            if(cityTitle.equals("Khiva")){ Khiva(); }
            //Nukus
            if(cityTitle.equals("Nukus")){ Nukus(); }
            //Kokand
            if(cityTitle.equals("Kokand")){ Kokand(); }
            //Fergana
            if(cityTitle.equals("Fergana")){ Fergana(); }
            //Termiz
            if(cityTitle.equals("Termiz")){ Termiz(); }
            //Andijon
            if(cityTitle.equals("Andijon")){ Andijon(); }
            //Shakhrisabz
            if(cityTitle.equals("Shakhrisabz")){ Shakhrisabz(); }

            navButtonsViewAdapter = new NavButtonsViewAdapter(this, navButtonsList);
            navBtnRV.setAdapter(navButtonsViewAdapter);

            setImage(cityBg, cityTitle, cityDesc);
        }
    }

    private void setImage(int city_Bg, String cityTitle, String cityDesc){
        Log.d(TAG, "setImage: setting image and name to widgets.");

        ImageView cBG = findViewById(R.id.city_image);
        cBG.setImageResource(city_Bg);
        cBG.setColorFilter(0xffAEAEAE, PorterDuff.Mode.MULTIPLY);


        TextView cTitle = findViewById(R.id.city_title);
        cTitle.setText(cityTitle);

        expandableTextView = findViewById(R.id.expandable_text_view);
        expandableTextView.setText(cityDesc);

        imageButton = findViewById(R.id.expand_collapse);
        imageButton.setColorFilter(0xff78849E, PorterDuff.Mode.SRC_ATOP);
    }

    /**
     * Tashkent Experiences
     */
    private void Tashkent(){
        experiencesList = new ArrayList<>();
        final List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.exp_moyie_mubarek_library_museum,
                        "The primary attraction of Khast Imom square is this library museum, which houses the 7th-century Osman Quran (Uthman Quran), said to be the world’s oldest. This enormous deerskin tome was brought to Samarkand by Timur, then taken to Moscow by the Russians in 1868 before being returned to Tashkent by Lenin in 1924 as an act of goodwill towards Turkestan’s Muslims. It is Tashkent’s most important sight.\n"+
                                "\nThe museum also contains 30 or 40 rare 14th- to 17th-century books among its collection, including one thumb-sized koran in an amulet case. Photos are not allowed. The library is in the southeast of the square, next to the spartan 1856 Telyashayakh Mosque.",
                        "Hours : 9AM - 5PM (Mon - Fri)\n             10AM - 3PM (Sat)\nPrice  : admission 10,000 UZS\nAddress : Khast Imom Sq, Tashkent"));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.exp_chorsu_bazaar,
                        "Tashkent’s most famous farmers market, topped by a giant green dome, is a delightful slice of city life spilling into the streets off the Old Town’s southern edge. There are acres of spices arranged in brightly coloured mountains, Volkswagen-sized sacks of grain, entire warehouses dedicated to sweets, and the freshest bread and fruits around. Souvenir hunters will find kurpacha (colourful sitting mattresses), skullcaps, chapan (traditional heavy quilted cloaks), ceramics and knives here.\n",
                        "Hours: 6AM - 7PM"));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.exp_the_state_museum_of_arts_of_uzbekistan,
                        "The four floors of this excellent museum walk you through 1500 years of art in Uzbekistan, from 7th-century Buddhist relics from Kuva and the Greek-inspired head of Hercules from Khalchayan near Termiz, to the art of Soviet Uzbekistan. There are even a few 19th-century paintings of second-tier Russian and European artists hanging about. There’s an impressive section on Uzbek applied art – notably some lovely ghanch (plaster carvings) from Bukhara, carved wooden doors from Khiva and the silk-on-cotton embroidered hangings called suzani.",
                        "Hours : 10AM - 5PM\nPrice  : admission 10,000 UZS\n             camera 50,000 UZS\n             guide 40,000 UZS\nAddress : 16 Amir Timur St, Tashkent\nTel : (+998) 71 236 74 36\nWebsite : stateartmuseum.uz/en"));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.exp_ilkhom_theatre_art,
                        "Tashkent’s main cultural highlight is this progressive theatre, whose productions often touch on gay themes and racial subjects, to consternation of the more conservative elements of Uzbek society. Alongside the cutting-edge plays (performed in Russian but often with English subtitles) there are also occasional jazz concerts and art exhibitions in the lobby.\n"+
                                "\nThe Ilkhom’s director, Mark Weil, who founded the theatre in 1976, was tragically stabbed to death in 2007, allegedly for blaspheming the Prophet Mohammed in his Pushkin-inspired play Imitations of the Koran. Imitations of the Koran remains in the repertoire today.",
                        "Hours: ticket office 11AM - 6:30PM\n            shows 6:30PM (Tue - Sun)\nPrice : ticket 8,000 - 30,000 UZS\nAddress : 5 Pakhtakor St, Tashkent\nTel : (+998) 71 241 22 41\nWebsite : ilkhom.com/en"));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.exp_alisher_navoi_opera_and_ballet_theatre,
                        "Tashkent's main opera and ballet theatre is worth a visit as much for its impressive interior as its fine opera and ballet performances. Verdi and Puccini are standards, or be bold and try a Soviet Uzbek opera by Mukhtar Ashrafi. The ticket office is hidden in one of the exterior pillars.",
                        "Price : ticket 10,000 - 30,000 UZS\nAddress : Moustafa Kamoul Atatürk 28, Tashkent\nTel : (+998) 71 233 90 81\nWebsite : gabt.uz/en"));

        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Tashkent",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Tashkent",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Tashkent",
                        R.drawable.tashkent));
    }

    /**
     * Bukhara Experiences
     */
    private void Bukhara(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Bukhara",
                        R.drawable.bukhara));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Bukhara",
                        R.drawable.bukhara));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Bukhara",
                        R.drawable.bukhara));
    }

    /**
     * Samarkand Experiences
     */
    private void Samarkand(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Samarkand",
                        R.drawable.samarkand));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Samarkand",
                        R.drawable.samarkand));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Samarkand",
                        R.drawable.samarkand));
    }

    /**
     * Khiva Experiences
     */
    private void Khiva(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Khiva",
                        R.drawable.khiva));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Khiva",
                        R.drawable.khiva));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Khiva",
                        R.drawable.khiva));
    }

    /**
     * Nukus Experiences
     */
    private void Nukus(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Nukus",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Nukus",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Nukus",
                        R.drawable.tashkent));
    }

    /**
     * Kokand Experiences
     */
    private void Kokand(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Kokand",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Kokand",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Kokand",
                        R.drawable.tashkent));
    }

    /**
     * Fergana Experiences
     */
    private void Fergana(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Fergana",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Fergana",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Fergana",
                        R.drawable.tashkent));
    }

    /**
     * Termiz Experiences
     */
    private void Termiz(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Termiz",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Termiz",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Termiz",
                        R.drawable.tashkent));
    }

    /**
     * Andijon Experiences
     */
    private void Andijon(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Andijon",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Andijon",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Andijon",
                        R.drawable.tashkent));
    }

    /**
     * Shakhrisabz Experiences
     */
    private void Shakhrisabz(){ experiencesList = new ArrayList<>();
        //NavButtons
        navButtonsList = new ArrayList<>();
        List<NavButtons> navButtons = navButtonsList;
        navButtons.add(
                new NavButtons(1,
                        R.drawable.sightseeing,
                        "Sights",
                        "in Shakhrisabz",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.paxtagulplate,
                        "Restaurants",
                        "in Shakhrisabz",
                        R.drawable.tashkent));
        navButtons.add(
                new NavButtons(1,
                        R.drawable.map,
                        "Map",
                        "in Shakhrisabz",
                        R.drawable.tashkent));
    }
}
