package com.example.androidproductflavours

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidproductvariants.VariantSpecificActivity

/**Read the complete Explanation to understand the implementation properly*/
//Paste the below code to your app level gradle inside android{}
   /* flavorDimensions "icecream"
    productFlavors {
        strawberry {
            dimension "icecream"
            applicationIdSuffix ".strawberry"
        }
        chocolate {
            dimension "icecream"
            applicationIdSuffix ".chocolate"
        }

    }*/
// Check build.gradle (app) for explanation

//Now to code in a specific variant you have to select that variant first
//To Select a variant : Build->Select Build Variant (It will show you the list of available variants
//In this Example we're making two variants 1. Strawberry 2. Choclate but in the list you will see 4 variants
//because for each variant two modes (debug,release) will be generated
//Suppose you want to make change in Choclate variant then select choclateDebug
    //In this example MainActivity will be common for both the variants and VariantSpecificActivity
    //will be different for each variant,ColorPrimary,ColorPrimaryDark,ColorAccent will also be different
    //for each variant.

/**
 * First we will see how to change colors
 * 1.first change your project view from Android to Project
 * 2.goto project Name->app->src->right click->new->Folder->Java Resources Folder and select Target Source Set
 *   to your variant name (In this case Choclate)
 * 3. Now you will see that a new directory named choclate and inside that resource directory has been created
 * 4. Now you create Android Resource Directory "Values" inside resource directory
 * 5. Now crete colors.xml and paste your desired colors which you want specific to this particular Variant.
 *
 *  Creating Activity Specific to 'choclate variant'
 *
 * 6. Like this you can create Activities,Fragment or Classes specific to this variant.
 * 7. In this example we're creating VariantSpecificActivity
 * 8. To make this follow below steps
 * 9. choclate->right click->new->Folder->Java Folder
 * 10.It will create java directory.
 * 11.Now create a package (this package name should be same as app->src->main->package name
 *    in this case it is (com.example.androidproductflavours)
 * 12.Now you can add any activity,Fragment or class (It will be for this specific variant "choclate" only)
 *
 */

 //In the above steps we wrote code specific to choclate variant where we gave some colors and made one
// activity

//Now to write code specific to some other variant select that variant and make whatever you want.
//Follow the same steps described above.

//In this example second variant is strawberry,In strawberry variant we have set some colors different
//from choclate variant so that one can differentiate between them also this variant also contains
//one activity (VariantSpecificActivity) but this activity has different TextView value which will help
//to recognize the difference between "choclate" and "strawberry" variant.

/**
 * Finally,To Check these variants you will require to install them
 * 1.First Select 'choclate' variant: Build->Select Build Variant->choclateDebug and install
 * 2.Now install 'strawberry variant' (You need to select that variant first)
 *    Build->Select Build Variant->strawberryDebug
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.gotoActivity).setOnClickListener {
            startActivity(Intent(this, VariantSpecificActivity::class.java))
        }
    }
}
