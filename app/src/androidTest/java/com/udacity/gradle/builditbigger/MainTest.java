package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(JUnit4.class)
public class MainTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false , false);

    @Test
    public void test() {
        activityTestRule.launchActivity(new Intent());
        onView(withId(R.id.fragment)).check(matches(isDisplayed()));
        onView(withId(R.id.button)).check(matches(isDisplayed()));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.joke_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.joke_tv)).check(matches(not(withText(""))));
    }

}
