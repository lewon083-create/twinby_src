package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14794d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14797c;

    public b0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f14794d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(pe.a.f("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f14795a = strSubstring;
        this.f14796b = str;
        this.f14797c = gf.a.k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f14795a.equals(b0Var.f14795a) && this.f14796b.equals(b0Var.f14796b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14796b, this.f14795a});
    }
}
