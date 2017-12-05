package com.example.administrator.gamer;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TypeContext() throws Exception {
        // Context of the app under test.
       // Context appContext = InstrumentationRegistry.getTargetContext();

        //assertEquals("com.example.administrator.gamer", appContext.getPackageName());
        onView(withId(R.id.button2)).perform((click()));
        onView(withId(R.id.editGame)).perform(typeText("League of Legends"), closeSoftKeyboard());
        onView(withId(R.id.editLocation)).perform(typeText("Vancouver, Canada"), closeSoftKeyboard());
        //checks alertdialog buttons
        onView(withId(R.id.activateButton)).perform((click()));
        onView(withText("No")).check(matches(isDisplayed())).perform(click());
        onView(withId(R.id.activateButton)).perform((click()));
        onView(withText("Yes")).check(matches(isDisplayed())).perform(click());


    }



    @Test
    public void testIntents() {

        //transitions between Mainactivity and searchPeople
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button)).perform(click());


        //transitions between MainActivity and Contacts
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button)).perform(click());
    }


}





