package com.example.dadajonjurakuziev.visituzbekistan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SightsActivity extends AppCompatActivity {
    private static final String TAG = "SightsActivity";

    //vars for Sights
    RecyclerView sightsRecyclerView;
    SightsViewAdapter sightsViewAdapter;
    List<Sights> sightsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        Log.d(TAG, "onCreate: started SightsActivity.");

        sightsRecyclerView = findViewById(R.id.sights_recyclerView);
        sightsRecyclerView.setHasFixedSize(true);
        sightsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        sightsList = new ArrayList<>();
        getIncomingIntent();
        sightsViewAdapter = new SightsViewAdapter(this, sightsList);
        sightsRecyclerView.setAdapter(sightsViewAdapter);
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String cityTitle = bundle.getString("sights_city_title");

            assert cityTitle != null;
            //Tashkent
            if(cityTitle.equals("in Tashkent")){ Tashkent(); }
            //Bukhara
            if(cityTitle.equals("in Bukhara")){ Bukhara(); }
            //Samarkand
            if(cityTitle.equals("in Samarkand")){ Samarkand(); }
            //Khiva
            if(cityTitle.equals("in Khiva")){ Khiva(); }
            //Nukus
            if(cityTitle.equals("in Nukus")){ Nukus(); }
            //Kokand
            if(cityTitle.equals("in Kokand")){ Kokand(); }
            //Fergana
            if(cityTitle.equals("in Fergana")){ Fergana(); }
            //Termiz
            if(cityTitle.equals("in Termiz")){ Termiz(); }
            //Andijon
            if(cityTitle.equals("in Andijon")){ Andijon(); }
            //Shakhrisabz
            if(cityTitle.equals("in Shakhrisabz")){ Shakhrisabz(); }

            setImage(cityTitle);
        }
    }

    private void setImage(String cityTitle){
        Log.d(TAG, "setImage: setting image and name to widgets.");
        TextView cTitle = findViewById(R.id.sights_desc);
        cTitle.setText(cityTitle);
    }

    private void Tashkent() {
        List<Sights> sights = sightsList;
        sights.add(
                new Sights(1,
                        "History Museum of the People of Uzbekistan",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_history_museum,
                        "Hours : 9.30AM - 6PM (Tue - Sun)\nPrice : admission 10,000 UZS\n            camera 25,000 UZS\n            English guided tour 8,000 UZS\nAddress : 3 Buyuk Turon St, Tashkent\nTel : (+998)71 239 17 79",
                        "The History Museum is a must-visit for anyone looking for a primer on the history of Turkestan from its earliest settlements 5000 years ago to the present. The 2nd floor has some fine Zoroastrian and Buddhist artefacts, including several 1st- to 3rd-century Buddhas and Buddha fragments from Fayoz-Tepe area near Termiz.\n" +
                                "\nOn the 3rd floor English placards walk you through the Russian conquests of the khanates and emirates, and there are some foreboding newspaper clippings of revolts in Andijon being brutally suppressed by the Russians in 1915. On the 4th floor you’ll also find the normal ode to post-independence gas plants and first President Karimov."));
        sights.add(
                new Sights(1,
                        "The state museum of arts of Uzbekistan",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_the_state_museum_of_arts,
                        "Hours : 10AM - 5PM\nPrice : admission 10,000 UZS\n            camera 50,000 UZS\n            guide 40,000 UZS\nAddress : 16 Amir Timur Av, Tashkent\nTel : (+998)71 236 74 36\nWebsite : www.stateartmuseum.uz/en",
                        "The four floors of this excellent museum walk you through 1500 years of art in Uzbekistan, from 7th-century Buddhist relics from Kuva and the Greek-inspired head of Hercules from Khalchayan near Termiz, to the art of Soviet Uzbekistan. There are even a few 19th-century paintings of second-tier Russian and European artists hanging about. There’s an impressive section on Uzbek applied art – notably some lovely ghanch (plaster carvings) from Bukhara, carved wooden doors from Khiva and the silk-on-cotton embroidered hangings called suzani."));
        sights.add(
                new Sights(1,
                        "Chorsu Bazaar",
                        "market in Tashkent",
                        R.drawable.sights_tashkent_chorsu_bazaar,
                        "Hours : 6AM - 7PM\nAddress : Sakichmon St, Tashkent",
                        "Tashkent’s most famous farmers market, topped by a giant green dome, is a delightful slice of city life spilling into the streets off the Old Town’s southern edge. There are acres of spices arranged in brightly coloured mountains, Volkswagen-sized sacks of grain, entire warehouses dedicated to sweets, and the freshest bread and fruits around. Souvenir hunters will find kurpacha (colourful sitting mattresses), skullcaps, chapan (traditional heavy quilted cloaks), ceramics and knives here."));
        sights.add(
                new Sights(1,
                        "Museum of Applied Arts",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_museum_of_applied_arts,
                        "Hours : 9AM - 6PM\nPrice : admission 10,000 UZS\n            camera 6,000 UZS\n            tour 15,000 UZS\nAddress : 15 Rakatboshi St, Tashkent\nTel : (+998)71 256 40 42",
                        "The Museum of Applied Arts occupies an exquisite house full of bright ghanch (carved and painted plaster) and carved wood. It was built in the 1930s, at the height of the Soviet period, but nonetheless serves as a sneak preview of the older architectural highlights lurking in Bukhara and Samarkand. The ceramic and textile exhibits here, with English descriptions, are a fine way to bone up on the regional decorative styles of Uzbekistan. There’s a small cafe and pricey gift shop here too."));
        sights.add(
                new Sights(1,
                        "Earthquake Memorial",
                        "monument in Tashkent",
                        R.drawable.sights_tashkent_earthquake_memorial,
                        "Address : Sharaf Rashidov Av, Tashkent",
                        "The New Soviet men and women who rebuilt Tashkent after the 1966 earthquake are remembered in stone at the Earthquake Memorial just north of Mustaqilik Maydoni. Newlyweds flock here to have their photos taken on weekends."));
        sights.add(
                new Sights(1,
                        "Moyie Mubarek Library Museum",
                        "library in Tashkent",
                        R.drawable.exp_moyie_mubarek_library_museum,
                        "House : 9AM - noon & 2PM - 5PM (Mon - Fri)\n               10AM - 3PM (Sat)\nPrice : admission 10,000 UZS\nAddress : Khast Imom Sq, Tashkent",
                        "The primary attraction of Khast Imom square is this library museum, which houses the 7th-century Osman Quran (Uthman Quran), said to be the world’s oldest. This enormous deerskin tome was brought to Samarkand by Timur, then taken to Moscow by the Russians in 1868 before being returned to Tashkent by Lenin in 1924 as an act of goodwill towards Turkestan’s Muslims. It is Tashkent’s most important sight.\n" +
                                "\nThe museum also contains 30 or 40 rare 14th- to 17th-century books among its collection, including one thumb-sized koran in an amulet case. Photos are not allowed. The library is in the southeast of the square, next to the spartan 1856 Telyashayakh Mosque."));
        sights.add(
                new Sights(1,
                        "Minor Mosque",
                        "mosque in Tashkent",
                        R.drawable.sights_tashkent_minor_mosque,
                        "Hours : dawn-dusk\nAddress : Kichik xalqa yo'li, Tashkent\nTel : (+998)71 235 17 33",
                        "The striking new Minor Mosque, also known as the white mosque for the colour of its marble, is proof that Uzbekistan still knows how to create sublime Islamic architecture. The lovely circular prayer hall has a beautifully ornate mihrab (a niche indicating the direction of Mecca) and ceiling. Walk south back to Minor metro through the nearby Minor Cemetery or the pleasant canal-side path."));
        sights.add(
                new Sights(1,
                        "Assumption Cathedral",
                        "church in Tashkent",
                        R.drawable.sights_tashkent_assumption_cathedral,
                        "Address : 91 Avliyoota St, Tashkent",
                        "It's impossible to miss the handsome gold onion domes, pastel blue walls and 50m bell tower of the impressive Assumption Cathedral. Built in 1958 and renovated in the 1990s, this is the biggest of the four Orthodox churches in Tashkent. It's particularly worth visiting on Sunday when Tashkent's Russian babushkas (old women) flock here to make devotions in a sea of incense."));

    }

    private void Bukhara() {
    }

    private void Samarkand() {
        List<Sights> sights = sightsList;
        sights.add(
                new Sights(1,
                        "Registan",
                        "plaza in Samarkand",
                        R.drawable.sights_samarkand_registan,
                        "Hours : 8AM - 7PM (Apr - Oct)\n             9AM - 5PM (Nov - Mar)\nPrice : admission 30,000 UZS\nAddress : Registan St, Samarkand\nTel : (+998)66 235 38 26\nWebsite : registon.uz/en",
                        "This ensemble of majestic, tilting medressas – a near-overload of majolica, azure mosaics and vast, well-proportioned spaces – is the centrepiece of the city, and arguably the most awesome single sight in Central Asia. The three grand edifices here are among the world’s oldest preserved medressas, anything older having been destroyed by Chinggis Khan.\n" +
                                "\nThe Registan, which translates to ‘Sandy Place’ in Tajik, was medieval Samarkand’s commercial centre and the plaza was probably a wall-to-wall bazaar. The three medressas have taken their knocks over the years courtesy of the frequent earthquakes that buffet the region; that they are still standing is a testament to the incredible craftsmanship of their builders. The Soviets, to their credit, worked feverishly to restore these beleaguered treasures, but they also took some questionable liberties, such as the capricious addition of a blue outer dome to the Tilla-Kari Medressa. For an idea of just how ruined the medressas were at the start of the 20th century, check out the excellent photo exhibit inside the Tilla-Kari Medressa.\n" +
                                "\nThe Ulugbek Medressa, on the western side, is the original medressa, finished in 1420 under Ulugbek who is said to have taught mathematics here (other subjects taught here included theology, astronomy and philosophy). The stars on the portal reflect Ulugbek's love of astronomy. Beneath the little corner domes were lecture halls, now housing displays on Ulugbek, including copies of the 'Zij' (his writings on astronomy) and miniatures depicting Central Asian astronomers at work. At the rear is a large mosque with a beautiful blue painted interior and an austere teaching room to one side. Police guards occasionally offer to clandestinely escort visitors to the top of the medressa's minaret for around US$10.\n" +
                                "\nThe other buildings are rough imitations by the Shaybanid Emir Yalangtush. The entrance portal of the Sher Dor (Lion) Medressa, opposite Ulugbek’s and finished in 1636, is decorated with roaring felines that look like tigers but are meant to be lions. The lions, the deer they are chasing and the Mongolian-faced, Zorostrian-inspired suns rising from their backs are all unusual, flouting Islamic prohibitions against the depiction of live animals. It took 17 years to build but hasn’t held up as well as the Ulugbek Medressa, built in just three years.\n" +
                                "\nIn between them is the Tilla-Kari (Gold-Covered) Medressa, completed in 1660, with a pleasant, gardenlike courtyard. The highlight here is the mosque, which is on the left-hand side of the courtyard and is intricately decorated with blue and gold to symbolise Samarkand’s wealth. The mosque’s delicate ceiling, oozing gold leaf, is flat but its tapered design makes it look domed from the inside. The result is magnificent. Inside the mosque is an interesting picture gallery featuring blown-up B&W photos of old Samarkand. Several shops sell prints of these old photos.\n" +
                                "\nMost of the medressas’ former dormitory rooms are now art and souvenir shops. Be sure to visit the Registan in the evening to see if the impressive sound and light show is being projected. If a large group has paid for the show then other visitors can watch for free.\n" +
                                "\nNote that your entrance ticket is valid all day long, allowing you to come back and photograph the complex at the various times of day needed for the sunlight to be coming from the right direction. However, tell the complex security guards if you'd like to do this, otherwise they will tear your ticket and you won't be able to reuse it."));
        sights.add(
                new Sights(1,
                        "Gur-e-Amir Mausoleum",
                        "mausoleum in Samarkand",
                        R.drawable.sights_samarkand_gur_e_amir,
                        "Hours : 9AM - 7PM (Apr - Oct)\n             9AM - 5PM (Nov - Mar)\nPrice : admission 22,000 UZS\n            camera 5,000 UZS\nAddress : Bo'stonsaroy St, Samarkand",
                        "The beautiful portal and trademark fluted azure dome of the Gur-e-Amir Mausoleum marks the final resting place of Timur (Tamerlane), along with two sons and two grandsons (including Ulugbek). It's a surprisingly modest building, largely because Timur was never expecting to be buried here. The tilework and dome are particularly beautiful; be sure to return at night when the building is spotlit to grand effect.\n" +
                                "\nTimur had built a simple crypt for himself at Shakhrisabz, and had this one built in 1404 for his grandson and proposed heir, Mohammed Sultan, who had died the previous year. But the story goes that when Timur died unexpectedly of pneumonia in Kazakhstan (in the course of planning an expedition against the Chinese) in the winter of 1405, the passes back to Shakhrisabz were snowed in and he was interred here instead.\n" +
                                "\nAs with other Muslim mausoleums, the stones are just markers; the actual crypts are in a chamber beneath. In the centre is Timur’s stone, once a single block of dark-green jade. In 1740 the warlord Nadir Shah carried it off to Persia, where it was accidentally broken in two – from which time Nadir Shah is said to have had a run of very bad luck, including the near death of his son. At the urging of his religious advisers he returned the stone to Samarkand and, of course, his son recovered.\n" +
                                "\nThe plain marble marker to the left of Timur’s is that of Ulugbek; to the right is that of Mir Said Baraka, one of Timur’s spiritual advisors. In front lies Mohammed Sultan. The stones behind Timur’s mark the graves of his sons Shah Rukh (the father of Ulugbek) and Miran Shah. Behind these lies Sheikh Seyid Umar, the most revered of Timur’s teachers, said to be a descendant of the Prophet Mohammed. Timur ordered Gur-e-Amir built around Umar’s tomb.\n" +
                                "\nThe Soviet anthropologist Mikhail Gerasimov opened the crypts in 1941 and, among other things, confirmed that Timur was tall (1.7m) and lame in the right leg and right arm (from injuries suffered when he was 25) – and that Ulugbek died from being beheaded. According to every tour guide’s favourite anecdote, he found on Timur’s grave an inscription to the effect that ‘whoever opens this will be defeated by an enemy more fearsome than I’. The next day, 22 June, Hitler attacked the Soviet Union."));
//        sights.add(
//                new Sights(1,
//                        "Shah-i-Zinda",
//                        "islamic tomb in Samarkand",
//                        R.drawable.sights_samarkand_shah_i_zinda,
//                        "Hours : 7AM - 7PM\nPrice : admission 10,000 UZS\n            camera 7,000 UZS\nAddress : Shah-i-Zinda St, Samarkand\nTel : (+998)71 233 53 82",
//                        "Samarkand’s most moving and beloved site is this stunning avenue of mausoleums, which contains some of the richest tilework in the Muslim world. The name, which means ‘Tomb of the Living King’, refers to its original, innermost and holiest shrine – a complex of cool, quiet rooms around what is probably the grave of Qusam ibn-Abbas, who is said to have brought Islam to this area in the 7th century. The most stunning Timurid-era tilework dates from 14th and 15th centuries.\n" +
//                                "\nA shrine to Qusam, a cousin of the Prophet Mohammed, existed here on the edge of Afrosiab for around seven centuries before Timur (Tamerlane) and later Ulugbek buried their family and favourites near the sanctity of the original shrine.\n" +
//                                "\nThe most beautiful tomb is the Shodi Mulk Oko Mausoleum (1372), resting place of a sister and niece of Timur, second on the left after the entry stairs. The exquisite majolica and terracotta work here – notice the minuscule amount of space between the tiles – was of such exceptional quality that it merited almost no restoration.\n" +
//                                "\nAfter remarkably surviving more than seven centuries with only minor touch-up work, many of the tombs were aggressively and controversially restored in 2005. As a result, much of the brilliant mosaic, majolica and terracotta work you see today is not original.\n" +
//                                "\nShah-i-Zinda is an important place of pilgrimage, so enter with respect and dress conservatively. Just outside the entrance are the foundations of a 15th-century tahorathana (bathhouse). At the end of the pathway between the mausoleums, the complex opens up into Samarkand's main cemetery, which is a fascinating place to walk."));
//        sights.add(
//                new Sights(1,
//                        "Bibi-Khanym Mosque",
//                        "mosque in Samarkand",
//                        R.drawable.sights_samarkand_bibi_khanym,
//                        "Hours : 8AM - 8PM\nPrice : admission 22,000 UZS\n            camera 5,000 UZS\nAddress : Bibikhonim St, Samarqand\nTel : (+998)97 793 46 75",
//                        "The enormous congregational Bibi-Khanym Mosque, northeast of the Registan, was financed from the spoils of Timur's invasion of India and must have been the jewel of his empire. Once one of the Islamic world’s biggest mosques (the cupola of the main mosque is 41m high and the pishtak or entrace portal, 38m), it pushed contemporary construction techniques to the limit, so much so that the dome started crumbling even before construction had finished.\n" +
//                                "\nThe mosque partially collapsed in an earthquake in 1897 before being rebuilt in the 1970s and more rapidly in the years after independence.\n" +
//                                "\nLegend says that Bibi-Khanym, Timur’s Chinese wife, ordered the mosque built as a surprise while he was away. The architect fell madly in love with her and refused to finish the job unless he could give her a kiss. The smooch left a mark and Timur, on seeing it, executed the architect and decreed that women should henceforth wear veils so as not to tempt other men.\n" +
//                                "\nThe interior courtyard contains an enormous marble Quran stand that lends some scale to the place. Local lore has it that any woman who crawls under the stand will have lots of children. The courtyard also contains two smaller mosques. The one on the left as you enter through the enormous main gate has an impressive unrestored interior festooned with Arabic calligraphy."));
//        sights.add(
//                new Sights(1,
//                        "Tilla-Kari Medressa",
//                        "islamic Site in Samarkand",
//                        R.drawable.sights_samarkand_tilla_kari,
//                        "Hours : 8AM - 7PM (Apr - Oct)\n             9AM - 5PM (Nov - Mar)\nAddress : Registan St, Samarkand",
//                        "On the northern side of the Registan is the Tilla-Kari (Gold-Covered) Medressa, completed in 1660, with a pleasant, gardenlike courtyard. The highlight here is the mosque, which is on the left-hand side of the courtyard and is stunningly decorated with blue and gold to symbolise Samarkand’s wealth. The mosque’s delicate ceiling, oozing gold leaf, is flat but its tapered design makes it look domed from the inside. The result is breathtaking.\n" +
//                                "\nInside the mosque is a fascinating picture gallery featuring blown-up B&W photos of old Samarkand. Several shops sell prints of these old photos."));
//        sights.add(
//                new Sights(1,
//                        "Ulugbek Medressa",
//                        "islamic site in Samarkand",
//                        R.drawable.sights_samarkand_ulugbek,
//                        "Hours : 8AM - 7PM (Apr - Oct)\n             9AM - 5PM (Nov - Mar)\nAddress : Registan St, Samarkand",
//                        "The Ulugbek Medressa, on the western side of the Registan, is the square's original medressa, finished in 1420 under Ulugbek who is said to have taught mathematics here (the stars on the portal reflect Ulugbek's love of astronomy). Beneath the little corner domes were lecture halls, now housing displays on Ulugbek, and at the rear there is a large mosque with a beautiful blue painted interior and an austere teaching room to one side.\n" +
//                                "\nPolice guards occasionally offer to clandestinely escort visitors to the top of the medressa's minaret for around US$10."));
//        sights.add(
//                new Sights(1,
//                        "Sher Dor Medressa",
//                        "islamic site in Samarkand",
//                        R.drawable.sights_samarkand_sherdor,
//                        "Hours : 8AM - 7PM (Apr - Oct)\n             9AM - 5PM (Nov - Mar)\nAddress : Registan St, Samarkand",
//                        "The entrance portal of the Registan's Sher Dor (Lion) Medressa, opposite the Ulugbek Medressa and finished in 1636, is decorated with roaring felines that look like tigers but are meant to be lions. The lions, the deer they are chasing and the Mongolian-faced, Zorostrian-inspired suns rising from their backs are all unusual, flouting Islamic prohibitions against the depiction of live animals. It took 17 years to build but hasn’t held up as well as the Ulugbek Medressa, built in just three years."));
//        sights.add(
//                new Sights(1,
//                        "Afrosiab Museum",
//                        "museum in Samarkand",
//                        R.drawable.sights_samarkand_afrosiab,
//                        "Hours : 9AM - 6PM\nPrice : admission 22,000 UZS\n            guide 20,000 UZS\nAddress : Tashkent Road, Samarkand",
//                        "The Afrosiab Museum was built around one of Samarkand’s more important archaeological finds, a chipped 7th-century fresco of the Sogdian King Varkhuman (r 650–670) receiving ranks of foreign dignitaries (including Chinese envoys carrying silk), while sitting astride elephants, camels and horses. You’ll see reproductions of this iconic fresco throughout the country. It was only discovered in 1965 during the construction of Toshkent Road.\n" +
//                                "\nThe left-hand wall depicts red- and white-faced dignitaries leading geese and horses on a sacrificial procession, while the right wall shows the Chinese Tang emperor Gaozong hunting panthers.\n" +
//                                "\nThe 2nd floor of the museum deals with the 11 distinct layers of the archaeological site; at the time of research it was closed due to water damage. It's worth catching the short film explaining the murals and their French-sponsored renovation."));
    }

    private void Khiva() { }

    private void Nukus() { }

    private void Kokand() { }

    private void Fergana() { }

    private void Termiz() { }

    private void Andijon() { }

    private void Shakhrisabz() { }

}
