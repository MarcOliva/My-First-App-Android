package oliva.marc.com.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String phones = getString(R.string.first_phone)+
                "\n"+getString(R.string.second_phone)+
                "\n"+getString(R.string.third_phone);
        String direction = getString(R.string.direction)+
                "\n"+getString(R.string.country);

        TextView phonesTexView = (TextView) findViewById(R.id.phones_text_view);
        phonesTexView.setText(phones);

        TextView directionTextView = (TextView) findViewById(R.id.direction_text_view);
        directionTextView.setText(direction);
        ImageView fbImageView = (ImageView)findViewById(R.id.image_facebook);

        fbImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open url facebook
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.facebook_url)));
                startActivity(intent);
            }
        });


    }
}
