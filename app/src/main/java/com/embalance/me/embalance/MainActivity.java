/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.embalance.me.embalance;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * MainActivity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.imageButton14);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setContentView(R.layout.games);
                Button img = (Button) findViewById(R.id.imageButton16);
                img.setBackgroundResource(R.drawable.pong);

                AnimationDrawable myFrameAnimation = (AnimationDrawable) img.getBackground();
                myFrameAnimation.start();


            }
        });

        final Button plansbutton = findViewById(R.id.imageButton16);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setContentView(R.layout.plans);
                ListView listView = (ListView)findViewById(R.id.listview);

                //

                UserAccount tom = new UserAccount("Tom","admin");
                UserAccount jerry = new UserAccount("Jerry","user");
                UserAccount donald = new UserAccount("Donald","guest", false);

                UserAccount[] users = new UserAccount[]{tom,jerry, donald};


                // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
                // used to create a ListView with simple ListItem (Only one TextView).

                ArrayAdapter<UserAccount> arrayAdapter
                        = new ArrayAdapter<UserAccount>(getApplication(), android.R.layout.simple_list_item_1 , users);


                listView.setAdapter(arrayAdapter);
            }
        });

    }
}
