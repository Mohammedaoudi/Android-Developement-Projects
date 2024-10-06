package com.tppizza.v1;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tppizza.v1.adapter.PizzaAdapter;
import com.tppizza.v1.beans.Produit;
import com.tppizza.v1.service.ProduitService;

public class ListPizzaActivity extends AppCompatActivity  {


    ListView liste;
    ProduitService ps = ProduitService.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_list_pizza);


        ps.create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.drawable.bbqchikenpizza, 35, "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n-2 cups shredded Gouda cheese\n-1 small red onion, halved and thinly sliced\n-1/4 cup minced fresh cilantro", "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. They're perfect for spur-of-the-moment cookouts and summer dinners on the patio. —Alicia Trevithick, Temecula, California", "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\nSTEP 2:\n\n  Divide dough in half. On a well greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\nSTEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro. Yield: 2 pizzas (4 pieces each)."));
        ps.create(new Produit("BRUSCHETTA PIZZA ", 5, R.drawable.bruschetta, 35 , "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced\n- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n- 1/2 teaspoon balsamic vinegar\n- 1/4 teaspoon salt\n- 1/8 teaspoon pepper\n- Additional fresh basil leaves, optional","You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. It's even better with a homemade, whole wheat crust! —Debra Kell, Owasso, Oklahoma","STEP 1:\n\n  In a small skillet, cook sausage over medium heat until no longer pink; drain. Place crust on an ungreased baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes or until cheese is melted.\n\nSTEP 2:\n\n  In a small bowl, combine the tomatoes, sliced basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza. Garnish with additional basil if desired. Yield: 8 slices."));
        ps.create(new Produit("SPINACH PIZZA", 2, R.drawable.spinach, 25, "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend","This tasty pizza is so easy to prepare. My family, including my young daughter, loves it. What an easy way to make a delicious, veggie filled meal! —Dawn Bartholomew, Raleigh, North Carolina","STEP 1:\n\n  Prepare pizza dough according to package directions. With floured hands, press dough onto a greased 12-in. pizza pan.\n\nSTEP 2:\n\n  Spread Alfredo sauce over dough to within 1 in. of edges. Thinly slice or chop tomatoes; top pizza with spinach, tomatoes and cheese.\n\nSTEP 3:\n\n  Bake at 450° for 10-15 minutes or until cheese is melted and crust is golden brown. Yield: 4-6 servings."));
        ps.create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.drawable.deepdishsausage, 45, "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water (110° to 115°)\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt\n- 1/2 teaspoon onion salt","My Grandma made the tastiest snacks for us when we stayed the night at her farm. Her wonderful pizza, hot from the oven, was covered with cheese and had fragrant herbs in the crust. Now this pizza is frequently a meal for my husband and me and our two young daughters. —Michele Madden, Washington Court House, Ohio","STEP 1:\n\n  In a mixing bowl, dissolve yeast in water. Add 1 cup flour, oil and seasonings; beat until smooth. Add enough remaining flour to form a soft dough. Turn onto a floured surface; knead until smooth and elastic, 6-8 minutes. Place in a greased bowl; turn once to greased top. Cover and let rise in a warm place until doubled, about 1 hour. Punch dough down; roll out into a 15-in. circle. Transfer to a well-greased 12-in. heavy ovenproof skillet, letting dough drape over edges. Sprinkle with 1 cup mozzarella.\n\nSTEP 2:\n\n  In another skillet, saute onion, green peppers and seasonings in oil until tender; drain. Layer half of the mixture over crust. Layer with half of the Parmesan, sausage and tomatoes. Sprinkle with 2 cups mozzarella. Repeat layers. Fold crust over to form an edge. Bake for 400° for 20 minutes. Sprinkle with pepperoni and remaining mozzarella. Bake 10-15 minutes longer or until crust is browned. Let stand 10 minutes before slicing. Yield: 8 slices."));
        ps.create(new Produit("HOMEMADE PIZZA", 4, R.drawable.homemade, 50 , "- 1 package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water (110° to 115°)\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce\n- 1 teaspoon dried basil\n- 1 medium green pepper, diced\n- 2 cups shredded part-skim mozzarella cheese","This recipe is a hearty, zesty main dish with a crisp, golden crust. Feel free to use whatever toppings your family enjoys on these homemade pizzas. —Marianne Edwards, Lake Stevens, Washington","STEP 1:\n\n  In large bowl, dissolve yeast and sugar in water; let stand for 5 minutes. Add oil and salt. Stir in flour, a cup at a time, until a soft dough forms.\n\nSTEP 2:\n\n  Turn onto floured surface; knead until smooth and elastic, about 2-3 minutes. Place in a greased bowl, turning once to grease the top. Cover and let rise in a warm place until doubled, about 45 minutes. Meanwhile, cook beef and onion over medium heat until no longer pink; drain.\n\nSTEP 3:\n\n  Punch down dough; divide in half. Press each into a greased 12-in. pizza pan. Combine the tomato sauce, oregano and basil; spread over each crust. Top with beef mixture, green pepper and cheese.\n\nSTEP 4:\n\n  Bake at 400° for 25-30 minutes or until crust is lightly browned. Yield: 2 pizzas (3 servings each)."));
        ps.create(new Produit("PESTO CHICKEN PIZZA", 3, R.drawable.pestochicken, 50 , "- 2 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2-3/4 cups bread flour\n- 1 tablespoon plus 2 teaspoons olive oil, divided\n- 1 tablespoon sugar\n- 1-1/2 teaspoons salt, divided\n- 1/2 pound boneless skinless chicken breasts, cut into 1/2-inch pieces\n- 1 small onion, halved and thinly sliced\n- 1/2 each small green, sweet red and yellow peppers, julienned\n- 1/2 cup sliced fresh mushrooms\n- 3 tablespoons prepared pesto\n- 1-1/2 cups (6 ounces) shredded part-skim mozzarella cheese\n- 1/4 teaspoon pepper","This is the only pizza I make now. We love it! Keeping the spices simple helps the flavors of the chicken and vegetables come through. The pizza tastes incredible and is good for you, too. —Heather Thompson, Woodland Hills, California","STEP 1:\n\n  In a large bowl, dissolve yeast in warm water. Beat in 1 cup flour, 1 tablespoon oil, sugar and 1 teaspoon salt. Add the remaining flour; beat until combined.\n\nSTEP 2:\n\n  Turn onto a lightly floured surface; knead until smooth and elastic, about 6-8 minutes. Place in a bowl coated with cooking spray, turning once to coat top. Cover and let rise in a warm place until doubled, about 1 hour.\n\nSTEP 3:\n\n  In a large nonstick skillet over medium heat, cook the chicken, onion, peppers and mushrooms in remaining oil until chicken is no longer pink and vegetables are tender. Remove from the heat; set aside.\n\nSTEP 4:\n\n  Punch dough down; roll into a 15-in. circle. Transfer to a 14-in. pizza pan. Build up edges slightly. Spread with pesto. Top with chicken mixture and cheese. Sprinkle with pepper and remaining salt.\n\nSTEP 5:\n\n  Bake at 400° for 18-20 minutes or until crust and cheese are lightly browned. Yield: 8 slices."));
        ps.create(new Produit("LOADED MEXICAN PIZZA", 3, R.drawable.loadedmexican, 30, "- 1 can (15 ounces) black beans, rinsed and drained\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper, chopped\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes, chopped\n- 1 jalapeno pepper, seeded and finely chopped\n- 1 garlic clove, minced\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped romaine\n- 1-1/2 cups coarsely crushed tortilla chips\n- 1 cup (4 ounces) shredded reduced-fat Mexican cheese blend\n- 1/2 cup reduced-fat sour cream\n- 1/4 cup minced fresh cilantro","This pizza is just as crispy and loaded with flavor as any traditional pizza. You won't believe it's actually good for you, too! —Rachel Lewis, Danville, Virginia","STEP 1:\n\n  In a large nonstick skillet coated with cooking spray, cook the beans, onion and yellow pepper over medium heat until vegetables are tender. Stir in the chili powder, cumin and garlic; cook 1 minute longer.\n\nSTEP 2:\n\n  Place crust on a 12-in. pizza pan. Spread bean mixture over crust; top with tomatoes, jalapeno and cheese.\n\nSTEP 3:\n\n  Bake at 450° for 8-10 minutes or until cheese is melted. Top with lettuce, tortilla chips, sour cream and cilantro. Yield: 6 slices."));

        liste = findViewById(R.id.list);

        liste.setAdapter(new PizzaAdapter(ps.findAll(),this ));
        int a =2;
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Produit pSelected = (Produit) parent.getItemAtPosition(position);
                    Intent intent = new Intent(ListPizzaActivity.this, DetailsPizza.class);
                    intent.putExtra("idp", pSelected.getId());
                    startActivity(intent);
            }
        });


    };
    public void onFavoriteClick(View view) {
        Intent intent = new Intent(ListPizzaActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onShareClick(View view) {
        String shareBody = "telecharge l application pizza recipes hub!! c est tres bon";
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Invitation");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
    }


