package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class eb extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4910c;

    public eb(String str, Throwable th2, boolean z5, int i) {
        super(str, th2);
        this.f4909b = z5;
        this.f4910c = i;
    }

    public static eb a(RuntimeException runtimeException, String str) {
        return new eb(str, runtimeException, true, 1);
    }

    public static eb b(String str) {
        return new eb(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z5 = this.f4909b;
        int length2 = String.valueOf(z5).length() + length + 20;
        int i = this.f4910c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z5);
        sb2.append(", dataType=");
        return t.z.d(i, "}", sb2);
    }
}
