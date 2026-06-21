package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4543f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4548e;

    static {
        e6.a("media3.datasource");
    }

    public db1(Uri uri, long j10, long j11) {
        this(uri, Collections.EMPTY_MAP, j10, j11, 0);
    }

    public final String toString() {
        String string = this.f4544a.toString();
        int length = string.length();
        long j10 = this.f4546c;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f4547d;
        int length3 = String.valueOf(j11).length();
        int i = this.f4548e;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb2.append("DataSpec[GET ");
        sb2.append(string);
        sb2.append(", ");
        sb2.append(j10);
        pe.a.s(sb2, ", ", j11, ", null, ");
        return t.z.d(i, "]", sb2);
    }

    public db1(Uri uri, Map map, long j10, long j11, int i) {
        boolean z5 = false;
        boolean z10 = j10 >= 0;
        ix.o(z10);
        ix.o(z10);
        if (j11 > 0) {
            z5 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z5 = true;
        }
        ix.o(z5);
        uri.getClass();
        this.f4544a = uri;
        this.f4545b = Collections.unmodifiableMap(new HashMap(map));
        this.f4546c = j10;
        this.f4547d = j11;
        this.f4548e = i;
    }
}
