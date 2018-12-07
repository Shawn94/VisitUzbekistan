package com.example.dadajonjurakuziev.visituzbekistan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

public class CitiesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CitiesViewAdapter adapter;
    List<Cities> citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        recyclerView = findViewById(R.id.citiesRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        citiesList = new ArrayList<>();
        citiesList.add(
                new Cities(
                        1,
                        "Tashkent",
                        R.drawable.tashkent,
                        "Sprawling Tashkent (Toshkent) is Central Asia’s hub and the place where everything in Uzbekistan happens. It's one part newly built national capital, thick with the institutions of power, and one part leafy Soviet city, and yet another part sleepy Uzbek town, where traditionally clad farmers cart their wares through a maze of mud-walled houses to the grinding crowds of the bazaar. Tashkent is a fascinating jumble of contradictions that's well worth exploring over several days.\n" +
                                "\nLike most places that travellers use mainly to get somewhere else, Tashkent doesn't always immediately charm visitors, but it's a surprisingly fun and interesting place, with the best restaurants, museums and nightlife in the country. There’s also plenty of opportunity to escape the metropolis for great hiking, rafting and skiing in Ugam-Chatkal National Park, just a 1½-hour drive away."));

        citiesList.add(
                new Cities(
                        1,
                        "Bukhara",
                        R.drawable.bukhara,
                        "Central Asia’s holiest city, Bukhara (Buxoro) has buildings spanning a thousand years of history, and a thoroughly lived-in and cohesive old centre that hasn’t changed too much in two centuries. It is one of the best places in Central Asia for a glimpse of pre-Russian Turkestan.\n" +
                                "\nMost of the centre is an architectural preserve, full of medressas and minarets, a massive royal fortress and the remnants of a once-vast market complex. Government restoration efforts have been more subtle and less indiscriminate than in flashier Samarkand. The city’s accommodation options are by far the best and most atmospheric in the country.\n" +
                                "\nYou’ll need at least two days to see the main sights. Try to allow time to lose yourself in the old town; it’s easy to overdose on the 140-odd protected buildings and miss the whole for its many parts."));
        citiesList.add(
                new Cities(
                        1,
                        "Samarkand",
                        R.drawable.samarkand,
                        "No name is as evocative of the Silk Road as Samarkand (Samarqand). For most people it has the mythical resonance of Zanzibar or Timbuktu, fixed in the Western popular imagination by imaginative poets and playwrights, few of whom saw the city in the flesh.\n\n" +
                                "On the ground the sublime, larger-than-life monuments of Timur (Tamerlane) and the city’s long, rich history still work some kind of magic. You can visit most of Samarkand’s high-profile attractions in two or three days. If you’re short on time, at least see the Registan, Gur-e-Amir, Bibi-Khanym Mosque and Shah-i-Zinda.\n\n" +
                                "Away from these islands of majesty, Samarkand is a well-groomed modern city, with a large Russian town of broad avenues and parks. The recent walling off of parts of the old town and the pedestrianisation of Toshkent street has led to the 'Disneyfication' of some areas, but there's enough grandeur left to say that Samarkand remains a breathtaking place to visit."));
        citiesList.add(
                new Cities(
                        1,
                        "Khiva",
                        R.drawable.khiva,
                        "Khiva’s name, redolent of slave caravans, barbaric cruelty, terrible desert journeys and steppes infested with raiding Turkmen tribesmen, struck fear into all but the boldest 19th-century hearts. Nowadays it’s a friendly and welcoming Silk Road old town that's well set up for tourism.\n" +
                                "\nThe historic heart of Khiva (Xiva) has been so well preserved that it’s sometimes criticised as lifeless – a ‘museum city’. But walk through the city gates and wander the fabled Ichon-Qala (inner walled city) in all its monotone, mud-walled glory and it's hard not to feel like you are stepping into another era.\n" +
                                "\nTry to spend at least one night in Khiva. The old town is at its best at dawn, sunset and by night, when the moonlit silhouettes of the tilting minarets and medressas, viewed from twisting alleyways, work their real magic."));
        citiesList.add(
                new Cities(
                        1,
                        "Nukus",
                        R.drawable.nukus,
                        "The isolated Soviet creation of Nukus (No'kis) is one of Uzbekistan's least appealing cities and gets few visitors compared to its attractive Silk Road cousins. With its giant boulevards and decaying apartment blocks, in many ways it feels like Uzbekistan 25 years ago. However, as the gateway to the fast-disappearing Aral Sea and home to the remarkable Savitsky Museum – one of the best collections of Soviet art in the world – there is actually a reason to come here, apart from sampling the general sense of hopelessness and desolation."));
        citiesList.add(
                new Cities(
                        1,
                        "Kokand",
                        R.drawable.kokand,
                        "As the valley’s first significant town on the road from Tashkent, and as one of Uzbekistan's three great 19th-century khanates, Kokand (Qo‘qon) is a gateway to the region and stopping point for many travellers. With a historically interesting palace belonging to the former khans, a relaxed vibe and several medressas and mosques hidden in the old town backstreets, it makes for a worthwhile half-day visit."));
        citiesList.add(
                new Cities(
                        1,
                        "Fergana",
                        R.drawable.fergana,
                        "Tree-lined avenues and pastel-plastered tsarist buildings give Fergana (Farg'ona) the feel of a mini-Tashkent. Throw in the best services and accommodation in the region, plus a central location, and you have the most obvious base from which to explore the rest of the valley.\n" +
                                "\nFergana is the valley’s least ancient and least Uzbek city. It began in 1877 as Novy Margelan (New Margilon), a colonial annexe to nearby Margilon, and became Fergana in the 1920s. It’s a nice enough place to hang out, and somewhat cosmopolitan with its relatively high proportion of Russian and Korean inhabitants."));
        citiesList.add(
                new Cities(
                        1,
                        "Termiz",
                        R.drawable.termiz,
                        "The last stop in Uzbekistan on the way to Afghanistan, Termiz is a historic border town with an edgy, Wild West feel. While the present-day city bears few traces of its cosmopolitan history, the surrounding area is full of archaeological clues to the region's Buddhist and Bactrian past, and many of these come together in Termiz's excellent museum.\n" +
                                "\nTermiz is the hottest place in Uzbekistan, so try to avoid coming here in July and August, when temperatures routinely exceed 40°C (104°F)."));
        citiesList.add(
                new Cities(
                        1,
                        "Andijon",
                        R.drawable.andijan,
                        "Andijon – the Fergana Valley’s largest city and its cultural centre – will forever be linked with the uprising and ensuing massacre of 13 May 2005. The very word ‘Andijon’ is a hot potato in Uzbekistan; just mentioning it is enough to stop any conversation in its tracks. That’s a shame because both culturally and linguistically Andijon is probably the country’s most authentic Uzbek city. For travellers it is of interest for its lively bazaars and as the valley's main gateway to Osh in Kyrgyzstan."));
        citiesList.add(
                new Cities(
                        1,
                        "Shakhrisabz",
                        R.drawable.shakhrisabz,
                        "Shakhrisabz (Shahrisabz) is a small, traditional Uzbek town south of Samarkand, across the hills in the Kashkadarya province, and is a lovely drive from Samarkand with some spectacular views. This is Timur’s hometown, and once upon a time it probably put Samarkand itself in the shade.\n" +
                                "\nIn recent years the once charming centre of town was bulldozed and rebuilt as another of Uzbekistan's giant, empty plazas, with a few medieval buildings marooned in the antiseptic blandness. Despite the renovations, it’s an worthwhile day trip from Samarkand, and several agencies in Samarkand offer some interesting add-on hikes and homestays in the surrounding mountains."));

        adapter = new CitiesViewAdapter(this, citiesList);
        recyclerView.setAdapter(adapter);
    }
}
