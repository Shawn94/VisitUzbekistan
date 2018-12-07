package com.example.dadajonjurakuziev.visituzbekistan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {
    private static final String TAG = "RestaurantsActivity";

    //vars for Sights
    RecyclerView restaurantsRecyclerView;
    RestaurantsViewAdapter restaurantsViewAdapter;
    List<Restaurants> restaurantsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        restaurantsRecyclerView = findViewById(R.id.restaurants_recyclerView);
        restaurantsRecyclerView.setHasFixedSize(true);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        restaurantsList = new ArrayList<>();

        getIncomingIntent();

        restaurantsViewAdapter = new RestaurantsViewAdapter(this, restaurantsList);
        restaurantsRecyclerView.setAdapter(restaurantsViewAdapter);
    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String restaurantsCityTitle = bundle.getString("restaurants_city_title");

            assert restaurantsCityTitle != null;
            //Tashkent
            if(restaurantsCityTitle.equals("in Tashkent")){ Tashkent(); }
            //Bukhara
            if(restaurantsCityTitle.equals("in Bukhara")){ Bukhara(); }
            //Samarkand
            if(restaurantsCityTitle.equals("in Samarkand")){ Samarkand(); }
            //Khiva
            if(restaurantsCityTitle.equals("in Khiva")){ Khiva(); }
            //Nukus
            if(restaurantsCityTitle.equals("in Nukus")){ Nukus(); }
            //Kokand
            if(restaurantsCityTitle.equals("in Kokand")){ Kokand(); }
            //Fergana
            if(restaurantsCityTitle.equals("in Fergana")){ Fergana(); }
            //Termiz
            if(restaurantsCityTitle.equals("in Termiz")){ Termiz(); }
            //Andijon
            if(restaurantsCityTitle.equals("in Andijon")){ Andijon(); }
            //Shakhrisabz
            if(restaurantsCityTitle.equals("in Shakhrisabz")){ Shakhrisabz(); }

            setImage(restaurantsCityTitle);
        }
    }

    private void setImage(String restaurantsCityTitle){
        Log.d(TAG, "setImage: setting image and name to widgets.");
        TextView cTitle = findViewById(R.id.restaurants_city);
        cTitle.setText(restaurantsCityTitle);
    }

    private void Tashkent() {
        List<Restaurants> restaurants = restaurantsList;
        restaurants.add(
                new Restaurants(1,
                        "Afsona",
                        "Uzbek",
                        R.drawable.restaurant_one,
                        "Hours : noon - 11PM\nPrice  : mains 22,000 - 47,000 UZS\nAddress : 30 Shevchenko St, Tashkent\nTel : (+998)71 252 56 82",
                        "This well-run restaurant aims to deliver Uzbek cuisine with a contemporary touch, breathing life into old favourites such as pumpkin manty (steamed dumplings), cheburek pastries and hanum (dough roll stuffed with vegetables). The decor is understated, with stylish geometric wood designs favoured over the ethnographic museum approach. The four-course set business lunch is a steal at 30,000 UZS."));
        restaurants.add(
                new Restaurants(1,
                        "Jumanji",
                        "International",
                        R.drawable.restaurant_two,
                        "Hours : noon - 11PM (Mon - Sat)\n              5PM - 11PM (Sun)\nPrice : mains 25,000 - 60,000 UZS\nAddress :  62/2 Yusuf Khos Khodjib St, Tashkent\nTel : (+998)71 255 42 00",
                        "A charming, laid-back and family-friendly environment reigns here. There's a varied and interesting menu that runs from Georgian specialities to Asian dishes and traditional Uzbek dishes like kazan kebab (beef and potatoes), and even a lunchtime salad bar (18,000 UZS), while the coolly efficient staff ensure that this is one of Tashkent's most perennially enjoyable eating experiences."));
        restaurants.add(
                new Restaurants(1,
                        "City Grill",
                        "International",
                        R.drawable.restaurant_three,
                        "Hours : noon - 11PM\nPrice : mains 25,000 - 80,000 UZS\nAddress : 23 Shakhrisabz St, Tashkent\nTel : (+998)71 233 49 72",
                        "The central City Grill is a great spot for a sophisticated and good-value business lunch or a blow-out dinner. Specialising in steak and pasta, the menu here is varied and uses delicious fresh produce. There's also a fantastic selection of salads, soups and other meat grills. Service is discreet and efficient."));
        restaurants.add(
                new Restaurants(1,
                        "National Food",
                        "Uzbek",
                        R.drawable.restaurant_four,
                        "Hours : 6AM - 10PM\nPrice : 5,000 - 15,000 UZS\nAddress : 1 Gafur Gulom St, Tashkent",
                        "You’ll be hard pressed to find a restaurant with more local colour than this bustling eatery opposite the Circus. As you walk through the entrance you'll be greeted by giant kazans (cauldrons) filled with various national specialities. In addition to the requisite plov and laghman, you can sample beshbarmak (noodles with meat and broth), dimlama (braised meat, potatoes, onions and vegetables), halim (meat porridge) and naryn (horsemeat sausage served with cold noodles)."));
        restaurants.add(
                new Restaurants(1,
                        "Central Asian Plov Centre",
                        "Uzbek",
                        R.drawable.restaurant_five,
                        "Hours : 10AM - 14PM\nPrice : plov 7,000 UZS\nAddress : cnr Abdurashidov & Ergashev St",
                        "To sample plov (pilaf) styles from various regions of Uzbekistan head to the celebration of plov that is the Central Asian Plov Centre. Walk past the mob of people crowding around steaming kazans (large plov cauldrons) and take a seat inside, where your group's order will arrive Uzbek-style on a single plate from which everybody eats. Get here before noon for the best selection."));
        restaurants.add(
                new Restaurants(1,
                        "Efendi",
                        "Turkish",
                        R.drawable.restaurant_six,
                        "Hours : 9AM - midnight\nPrice : mains 12,000 - 30,000 UZS\nAddress : 79A Azimov St, Tashkent\nTel : (+998)71 233 15 02",
                        "This sprawling Turkish place has an extensive menu, or you can just saunter inside and pick out a kebab and salad from the refrigerated display case and retire to the shaded outdoor seating. The food is consistently good, from the excellent iskender kebab (lamb with bread, yoghurt and tomato sauce) to the patlican (eggplant) salad, and you can order half portions if you're not that hungry."));
        restaurants.add(
                new Restaurants(1,
                        "Amaretto",
                        "Italian",
                        R.drawable.restaurant_eight,
                        "Hours : noon - 11PM\nPrice : mains 14,000 - 45,000 UZS\nAddress : 28 Shota Rustaveli St, Tashkent\nTel : (+998)71 215 55 57",
                        "The mouth-watering Italian food, professional English-speaking service and subdued, candlelit ambience combine to make this the obvious choice for a romantic dinner. We prefer the outdoor terrace to the rather garish dining rooms inside, but wherever you eat, the excellent pizza and pasta, good salads and large (but pricey) wine list are winners."));
        restaurants.add(
                new Restaurants(1,
                        "II Perfetto",
                        "Italian",
                        R.drawable.restaurants_pizza,
                        "Hours : 10AM - 11PM\nPrice : pizza 30,000 - 40,000 UZS\nAddress : 30 Shevchenko St, Tashkent\nTel : (+998)71 252 56 94",
                        "This popular Italian place boasts an open-plan kitchen, friendly staff and a menu covering classic Italian dishes from pasta and salad to lasagne and steak. Its air-conditioned interior lives up to the name on a hot Tashkent day, although you can eat alfresco in the shade on the street outside as well. Takeaway is available."));
        restaurants.add(
                new Restaurants(1,
                        "Ovqat Bozari",
                        "Uzbek",
                        R.drawable.restaurant_nine,
                        "Hours : 6AM - 8PM\nAddress : Chorsu Bazaar",
                        "After some shopping in Chorsu Bazaar head for this arcade draped with colourful ikat fabrics. It's a good place to get plov, but the various family-run stalls also sell such Uzbek specials as naryn (noodles with horsemeat), hosip (sausage) and some excellent shashlyk."));
        restaurants.add(
                new Restaurants(1,
                        "B&B Coffee House",
                        "Cafe",
                        R.drawable.restaurants_cafe_bb,
                        "Hours : 8AM - 10PM\nPrice : coffee 6,000 - 12,000 UZS\n            snacks 20,000 UZS\nAddress : 30A Shota Rustaveli St, Tashkent\nTel : (+998)71 281 60 60",
                        "'Beans & Brews' is perhaps our favourite cafe in town, with good espresso coffee, juices and sandwiches, plus French toast and oatmeal that knocks the socks off your free hotel breakfast. The decor is modern and hip, with monochrome exposed brick design and outdoor tables. If only it had Wi-Fi."));
    }

    private void Bukhara() { }

    private void Samarkand() {
        List<Restaurants> restaurants = restaurantsList;
        restaurants.add(
                new Restaurants(1,
                        "Platan",
                        "International",
                        R.drawable.restaurant_two,
                        "Hours : 10AM - 11PM\nPrice  : mains 20,000 - 28,000 UZS\nAddress : 2 Pushkin St, Samarkand\nTel : (+998)66 233 80 49\nWebsite : en.platan.uz",
                        "Possibly the best restaurant in Samarkand, Platan has a classy interior and a summer terrace for shady al fresco dining in the summer. The menu includes some Middle Eastern and Thai influences alongside regional dishes like Russian-style red caviar or cooling Uzbek chalop (cucumber, dill, green onion and sour cream soup).\n" +
                                "\nThe salad menu is particularly good: try the excellent lobio (a Georgian bean, walnut, garlic, lemon and parsley salad), the Thai beef salad or the zingy Bloody Mary salad. Reservations are advised for dinner."));
        restaurants.add(
                new Restaurants(1,
                        "Old city",
                        "International",
                        R.drawable.restaurant_one,
                        "Hours : 10AM - 11PM\nPrice  : mains 14,000 - 16,000 UZS\nAddress : 100/1 Abdurahmon Jomi St\nTel : (+998)93 346 80 20",
                        "This charming place in the Russian part of town is recommended for its interesting dishes, such as basturma cold smoked beef, lavash (flat bread) with feta-like brinza cheese, and over 40 salads, including a delicious beetroot and walnut option. Service is friendly and assured, the classy interior has a cosy fireplace, and while it caters largely to tourists, standards are high."));
        restaurants.add(
                new Restaurants(1,
                        "Cafe Magistr",
                        "Cafe",
                        R.drawable.coffee_house,
                        "Hours : 8AM - 11PM\nPrice : mains 10,000 - 17,000 UZS\nAddress : 30/45 Bo'stonsaroy St, Samarkand\nTel : (+998)90 250 15 51\n         (+998)66 210 17 67",
                        "Right in the heart of the city, this bright two-room cafe aimed at students serves everything from real coffee to breakfast pancakes, as well as salads, burgers and pizza (the spicy pizza comes recommended) in a breezy fast-food setting. It's a reliable place that we kept coming back to."));
        restaurants.add(
                new Restaurants(1,
                        "Karimbek",
                        "Uzbek",
                        R.drawable.restaurant_three,
                        "Hours : 8AM - 11PM\nPrice : mains 15,000 - 20,000 UZS\nAddress : 194 Gagarin St, Samarkand\nTel : (+998)66 221 27 56",
                        "This Uzbek theme restaurant remains one of the most popular places for groups and independent travellers alike. The national- and Russian-influenced cuisine can be enjoyed in a variety of settings, from private country hut to airy street-side patio. A nightly belly-dancing show jiggles to life around 8pm. It's a 4,000 UZS cab ride from the centre of town."));
        restaurants.add(
                new Restaurants(1,
                        "Art Cafe Norgis",
                        "Uzbek",
                        R.drawable.restaurant_four,
                        "Hours : 9AM - 10PM\nPrice : mains 7,000 - 10,000 UZS\nAddress : Tashkent St, Samarkand",
                        "A handy place for lunch between the Registan and the Bibi Khanym Mosque, this 'art cafe' is purely the haunt of tour groups, but as the food is decent and there's nothing else around, it's worth a mention. The menu is made up of unexciting Uzbek standards, but a pleasant yoghurt and spice side dish and piping hot fresh bread are highlights."));
        restaurants.add(
                new Restaurants(1,
                        "Samarkand Restaurant",
                        "Uzbek",
                        R.drawable.restaurant_five,
                        "Hours : 11AM - 11PM\nPrice : mains 10,000 - 20,000 UZS\nAddress : 54 Mahmud Kashgari St, Samarkand\nTel : (+998)66 233 35 91",
                        "Everyone seems to love this big bustling place. The top-floor Russian-style room has a ski lodge vibe with bear skins on the walls, but serves up excellent value Gijduvan-style kebabs, salads and even sushi rolls. Expect to get pulled into the dancing by a conga line of Uzbek grannies if there's a thumping wedding party on the ground floor."));
        restaurants.add(
                new Restaurants(1,
                        "Besh Chinor",
                        "Uzbek",
                        R.drawable.restaurant_six,
                        "Hours : 9AM - 10PM\nPrice : mains 5,000 - 8,000 UZS\nAddress : 121 U.Tursunov St, Samarkand\nTel : (+998)91 519 66 26",
                        "This low-key traditional place is a great spot for plov (pilaf), chicken kebab or manty (steamed dumplings). There's beer on tap, a fridge full of cold drinks and a quiet and easily missed back garden area. It's clean and staff are friendly, but there's no English menu."));
        restaurants.add(
                new Restaurants(1,
                        "Kyzyl Chaixona",
                        "Central Asia",
                        R.drawable.restaurant_seven,
                        "Hours : 7AM - 7PM\nPrice : mains 5,000 UZS\nAddress : Siob Bazaar",
                        "The clean 'red teahouse' within the confines of Samarkand's main market has pleasant outdoor tapchans, low prices and plenty of local colour. Expect somsa (samosa), shashlyk, laghman (noodles) and soups amid the chaotic atmosphere of the market traders."));
        restaurants.add(
                new Restaurants(1,
                        "Cafe Labig'or",
                        "Uzbek",
                        R.drawable.restaurant_eight,
                        "Hours : 8AM - 11PM\nPrice : mains 6,000 - 10,000 UZS\nAddress : Registan St, Samarkand",
                        "The best of the few unappealing choices across from the Registan, this two-floor restaurant has a breezy upstairs terrace where fairly mediocre Uzbek standards are served up. On the plus side the location is perfect, the setting is pleasant and they have cold beer."));
    }

    private void Khiva() { }
    private void Nukus() { }
    private void Kokand() { }
    private void Fergana() { }
    private void Termiz() { }
    private void Andijon() { }
    private void Shakhrisabz() { }
}
