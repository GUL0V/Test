package ua.gulov.test;

import androidx.appcompat.app.AppCompatActivity;
import ua.gulov.test.Users.Notification;
import ua.gulov.test.Users.UserClass;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reference = FirebaseDatabase.getInstance().getReference();
        String [] names = {"1", "2", "3"};
        String [] texts = {"1", "2", "3"};
        List<Notification> notifications = new ArrayList<Notification>();
        notifications.add(new Notification(names[0], texts[0]));
        notifications.add(new Notification(names[1], texts[1]));
        notifications.add(new Notification(names[2], texts[2]));

        String[] searches ={"1", "2", "3"};

        List<String> saved_searches = new ArrayList<String>();
        saved_searches.add(searches[0]);
        saved_searches.add(searches[1]);
        saved_searches.add(searches[2]);


        UserClass user = new UserClass("g", "1",
                "1", "1",
                "1", "1",
                "1", "1",
                1, 1, 1, notifications, saved_searches);



        reference.child("users").child("user_id2").setValue(user);


    }
}