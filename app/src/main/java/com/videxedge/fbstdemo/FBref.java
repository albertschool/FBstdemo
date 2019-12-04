package com.videxedge.fbstdemo;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FBref {
    public static FirebaseStorage FBST = FirebaseStorage.getInstance();
    public static StorageReference refImages=FBST.getReference("Images");
}
