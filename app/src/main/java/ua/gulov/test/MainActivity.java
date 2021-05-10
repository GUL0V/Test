package ua.gulov.test;

import androidx.appcompat.app.AppCompatActivity;
import ua.gulov.test.Publications.VehiclePublication;
import ua.gulov.test.Publications.ImageUrlModel;
import ua.gulov.test.Users.Notification;
import ua.gulov.test.Vehicles.Automobile;

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

        Automobile auto = new Automobile("info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info",
                "info");

        List<ImageUrlModel> images = new ArrayList<>();
        images.add(new ImageUrlModel("url1"));
        images.add(new ImageUrlModel("url2"));
        images.add(new ImageUrlModel("url3"));

        VehiclePublication user = new VehiclePublication(1, "", "", auto,
                null, null, null,
                "n", images, "n", "n",
                "n", "n", "n", "n",
                "n", "n");



        reference.child("accounts").child("users").child("user_id").setValue(user);


    }
}