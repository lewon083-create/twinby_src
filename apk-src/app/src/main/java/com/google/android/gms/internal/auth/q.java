package com.google.android.gms.internal.auth;

import android.net.Uri;
import com.google.android.gms.internal.measurement.n4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f13280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13281b;

    public /* synthetic */ q(Uri uri, boolean z5, boolean z10) {
        this.f13280a = uri;
        this.f13281b = z5;
    }

    public n4 a(long j10, String str) {
        Long lValueOf = Long.valueOf(j10);
        Object obj = n4.f13887g;
        return new n4(this, str, lValueOf, 0);
    }

    public n4 b(String str, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Object obj = n4.f13887g;
        return new n4(this, str, boolValueOf, 1);
    }

    public void c(long j10, String str) {
        new p(this, str, Long.valueOf(j10), 0);
    }

    public p d(String str, boolean z5) {
        return new p(this, str, Boolean.valueOf(z5), 1);
    }

    public n4 e(String str, String str2) {
        Object obj = n4.f13887g;
        return new n4(this, str, str2, 3);
    }
}
