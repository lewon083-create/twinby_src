package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f11035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f11037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11038d;

    public uo1(pm1 pm1Var, String str, Object[] objArr) {
        this.f11035a = pm1Var;
        this.f11036b = str;
        this.f11037c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11038d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f11038d = i | (cCharAt2 << i11);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i = this.f11038d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
