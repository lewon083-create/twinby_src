package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f8321e;

    public nj0(String str, String str2, int i, long j10, Integer num) {
        this.f8317a = str;
        this.f8318b = str2;
        this.f8319c = i;
        this.f8320d = j10;
        this.f8321e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f8319c;
        long j10 = this.f8320d;
        String str = this.f8317a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j10).length());
        l7.o.p(i, str, ".", ".", sb2);
        sb2.append(j10);
        String string = sb2.toString();
        String str2 = this.f8318b;
        if (!TextUtils.isEmpty(str2)) {
            string = t.z.g(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Z1)).booleanValue() || (num = this.f8321e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
