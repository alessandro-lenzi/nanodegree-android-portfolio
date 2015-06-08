/*
 * *****************************************************************************
 * Copyright (c) 2013-2015 Alessandro Lenzi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ****************************************************************************
 */

package br.com.quamm.nanodegree.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initialize() {

        // Spotify
        Button btnAppSpotity = (Button) findViewById(R.id.btnAppSpotity);
        btnAppSpotity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_spotify, Toast
                        .LENGTH_LONG).show();
            }
        });

        // SuperDuo: Scores
        Button btnAppSuperDuoScores = (Button) findViewById(R.id.btnAppSuperDuoScores);
        btnAppSuperDuoScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_superduo_scores,
                        Toast.LENGTH_LONG).show();
            }
        });

        // SuperDuo: Library App
        Button btnAppSuperDuoLibApp = (Button) findViewById(R.id.btnAppSuperDuoLibApp);
        btnAppSuperDuoLibApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_superduo_libapp,
                        Toast.LENGTH_LONG).show();
            }
        });

        // Built It Bigger
        Button btnAppBuildItBigger = (Button) findViewById(R.id.btnAppBuildItBigger);
        btnAppBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_builditbigger,
                        Toast.LENGTH_LONG).show();
            }
        });

        // XYZ Reader
        Button btnAppXyzReader = (Button) findViewById(R.id.btnAppXyzReader);
        btnAppXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_xyzreader, Toast
                        .LENGTH_LONG).show();
            }
        });

        // Capstone
        Button btnAppCapstone = (Button) findViewById(R.id.btnAppCapstone);
        btnAppCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_launch_app_capstone, Toast
                        .LENGTH_LONG).show();
            }
        });

    }
}
