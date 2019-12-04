package com.videxedge.fbstdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.UploadTask;

import static com.videxedge.fbstdemo.FBref.refImages;

/**
 * @author		Albert Levy <albert.school2015@gmail.com>
 * @version     1.0
 * @since		4/12/2019
 * Basic application to demonstrate upload & download file to Firebase Storage
 */
public class MainActivity extends AppCompatActivity {

    ImageView iV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iV=(ImageView)findViewById(R.id.iV);
    }

    /**
     * Uploading selected image file to Firebase Storage
     * <p>
     *
     * @param view
     */
    public void upload(View view) {
        Intent si = new Intent();
        si.setType("images/*");
        si.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(si, "Choose image"), 100);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 100) {
                Uri uri = data.getData();
                if (uri != null)
                    iV.setImageURI(uri);

/*                final ProgressDialog pd=ProgressDialog.show(this,"Upload image","Uploading...",true);

                Uri file = data.getData();
                refImages.child("images/aaa.jpg");

                refImages.putFile(file)
                        .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                pd.dismiss();
                                // Get a URL to the uploaded content
                                Uri downloadUrl = taskSnapshot.getUploadSessionUri();
                                Toast.makeText(MainActivity.this, ""+downloadUrl, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception exception) {
                                pd.dismiss();
                                Toast.makeText(MainActivity.this, "Upload failed", Toast.LENGTH_SHORT).show();
                                // Handle unsuccessful uploads
                                // ...
                            }
                        });
*/
            }
        }
    }

    /**
     * Downloading selected image file to Firebase Storage
     * <p>
     *
     * @param view
     */
    public void download(View view) {
        /*
        File localFile = File.createTempFile("images", "jpg");
        riversRef.getFile(localFile)
                .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                        // Successfully downloaded data to local file
                        // ...
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle failed download
                // ...
            }
        });
*/
    }
}
