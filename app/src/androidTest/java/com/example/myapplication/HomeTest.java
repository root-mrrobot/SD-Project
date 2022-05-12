package com.example.myapplication;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;
import android.widget.TextView;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeTest {

    @Rule
    public ActivityTestRule<Home> homeActivityTestRule = new ActivityTestRule<>(Home.class);

    private Home home = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MainActivity.class.getName(),null ,false);

    @Before
    public void setUp() throws Exception {
        home = homeActivityTestRule.getActivity();
    }

    @Test
    public void welcomeTextTest() {
        View view = home.findViewById(R.id.welcomeTextView);
        assertNotNull(view);
    }

    @Test
    public void welcomeTextTest2(){
        TextView textViewTest = home.findViewById(R.id.welcomeTextView);
        String actual = textViewTest.getText().toString();
        String expected = "Welcome to Wits Academy,";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void optionsTextTest() {
        View view = home.findViewById(R.id.optionsTextView);
        assertNotNull(view);
    }

    @Test
    public void optionsTextTest2(){
        TextView textViewTest = home.findViewById(R.id.optionsTextView);
        String actual = textViewTest.getText().toString();
        String expected = "Choose either of the following options to proceed:";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void optionsText2Test() {
        View view = home.findViewById(R.id.optionsTextView2);
        assertNotNull(view);
    }

    @Test
    public void optionsText2Test2(){
        TextView textViewTest = home.findViewById(R.id.optionsTextView2);
        String actual = textViewTest.getText().toString();
        String expected = "Choose either of the following options to proceed:";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void studentTextTest() {
        View view = home.findViewById(R.id.studentBtnTextView);
        assertNotNull(view);
    }

    @Test
    public void studentTextTest2(){
        TextView textViewTest = home.findViewById(R.id.studentBtnTextView);
        String actual = textViewTest.getText().toString();
        String expected = "Student";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void lecturerTextTest() {
        View view = home.findViewById(R.id.lecturerBtnTextView);
        assertNotNull(view);
    }

    @Test
    public void lecturerTextTest2(){
        TextView textViewTest = home.findViewById(R.id.lecturerBtnTextView);
        String actual = textViewTest.getText().toString();
        String expected = "Lecturer";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void noteTextTest() {
        View view = home.findViewById(R.id.noteTextView);
        assertNotNull(view);
    }

    @Test
    public void noteTextTest2(){
        TextView textViewTest = home.findViewById(R.id.noteTextView);
        String actual = textViewTest.getText().toString();
        String expected = "Please Note: You will be able to switch between being a teacher and a student.";

        assertEquals(actual,expected);
        home.finish();
    }

    @Test
    public void testLaunchItems(){
        View optionsText = home.findViewById(R.id.optionsTextView);
        View optionsText2 = home.findViewById(R.id.optionsTextView2);
        View welcomeText = home.findViewById(R.id.welcomeTextView);
        View studentText = home.findViewById(R.id.studentBtnTextView);
        View lecturerText = home.findViewById(R.id.lecturerBtnTextView);
        View noteText = home.findViewById(R.id.noteTextView);
        View btnStudent = home.findViewById(R.id.btnStudent);
        View btnLecturer = home.findViewById(R.id.btnLecturer);

        assertNotNull(optionsText);
        assertNotNull(optionsText2);
        assertNotNull(welcomeText);
        assertNotNull(studentText);
        assertNotNull(lecturerText);
        assertNotNull(noteText);
        assertNotNull(btnStudent);
        assertNotNull(btnLecturer);

        home.finish();
    }

//    @Test
//    public void testLecturerBtn(){
//        onView(withId(R.id.btnLecturer)).perform(click());
//        Activity home = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
//        assertNull(home);
//
//        //home.finish();
//    }

    @Test
    public void testLecturerBtn2() {
        View view = home.findViewById(R.id.btnLecturer);
        assertNotNull(view);
    }

//     @Test
//     public void testLecturerBtn3(){
//         onView(withId(R.id.btnLecturer)).perform(click());
//     }

    @Test
    public void testStudentBtn(){
        onView(withId(R.id.btnStudent)).perform(click());
        Activity home = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
        assertNull(home);

        //home.finish();
    }

    @Test
    public void testStudentBtn2() {
        View view = home.findViewById(R.id.btnStudent);
        assertNotNull(view);
    }

//     @Test
//     public void testStudentBtn3(){
//         onView(withId(R.id.btnStudent)).perform(click());
//     }

    @After
    public void tearDown() throws Exception {
        home = null;
    }
}
