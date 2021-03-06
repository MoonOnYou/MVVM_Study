package com.example.mvvmstudy

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun should_alright_string_value_when_call_view_model_test() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.textViewFirst)).check(matches(withText("String1")))
    }
}