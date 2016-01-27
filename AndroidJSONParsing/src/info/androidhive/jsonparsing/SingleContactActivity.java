package info.androidhive.jsonparsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleContactActivity extends Activity
{

    // JSON node keys
    private static final String TAG_NAME = "name";
    private static final String TAG_EMAIL = "email";
    private static final String TAG_PHONE_MOBILE = "mobile";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_single_contact);

        // getting intent data
        Intent in = this.getIntent();

        // Get JSON values from previous intent
        String name = in.getStringExtra(TAG_NAME);
        String email = in.getStringExtra(TAG_EMAIL);
        String mobile = in.getStringExtra(TAG_PHONE_MOBILE);

        // Displaying all values on the screen
        TextView lblName = (TextView) this.findViewById(R.id.name_label);
        TextView lblEmail = (TextView) this.findViewById(R.id.email_label);
        TextView lblMobile = (TextView) this.findViewById(R.id.mobile_label);

        lblName.setText(name);
        lblEmail.setText(email);
        lblMobile.setText(mobile);
    }
}
