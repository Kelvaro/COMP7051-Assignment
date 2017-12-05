package com.example.administrator.gamer;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {






    @Test
    public void beacon_shows() throws Exception{
        boolean status = true;
        MainActivity main = new MainActivity();
        main.beaconStatus = status;
        assertEquals(true, main.beaconStatus);

    }

    @Test
    public void beacon_hides() throws Exception{
        boolean status = false;
        MainActivity main = new MainActivity();
        main.beaconStatus = status;
        assertEquals(false, main.beaconStatus);

    }

    






}