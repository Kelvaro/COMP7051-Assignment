package com.example.johnny.phototest;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.EspressoKey;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void ensureTextChangesWork() {
        // Type text and then press the button.

        onView(withId(R.id.SearchButton)).perform((click()));

        onView(withId(R.id.dateText)).perform(typeText("20160505"));
        onView(withId(R.id.dateButton)).perform((click()));

        onView(withId(R.id.SearchButton)).perform((click()));

        onView(withId(R.id.locationText)).perform(typeText("Vancouver, BC"));
        onView(withId(R.id.locationButton)).perform((click()));

        onView(withId(R.id.SearchButton)).perform((click()));

        onView(withId(R.id.nameText)).perform(typeText("Johnny Kang"));
        onView(withId(R.id.nameButton)).perform((click()));

        onView(withId(R.id.GridView)).check(matches(isDisplayed()));
        //        .perform(typeText("20160202"), closeSoftKeyboard());
     //   onView(withId(R.id.EndText))
      //          .perform(typeText("20160404"), closeSoftKeyboard());
    //    onView(withId(R.id.SearchButton)).perform(click());
        // Check that the text was changed.
     //   onView(withId(R.id.imageView2)).check(matches(isDisplayed()));
        //onView(withContentDescription("Navigate up")).perform(click());

        
    }






}

