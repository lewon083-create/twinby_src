package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13495b;

    public n1(int i, String str) {
        super(str);
        this.f13495b = i;
    }

    public final yc.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new yc.e(this.f13495b, super.getMessage());
    }

    public n1(String str, IOException iOException, int i) {
        super(str, iOException);
        this.f13495b = i;
    }
}
