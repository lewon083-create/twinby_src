package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10495e;

    static {
        String str = cq0.f4293a;
        f10491a = Integer.toString(0, 36);
        f10492b = Integer.toString(1, 36);
        f10493c = Integer.toString(2, 36);
        f10494d = Integer.toString(3, 36);
        f10495e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f10491a, spanned.getSpanStart(obj));
        bundle2.putInt(f10492b, spanned.getSpanEnd(obj));
        bundle2.putInt(f10493c, spanned.getSpanFlags(obj));
        bundle2.putInt(f10494d, i);
        if (bundle != null) {
            bundle2.putBundle(f10495e, bundle);
        }
        return bundle2;
    }
}
