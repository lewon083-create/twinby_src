package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f14171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f14173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14174d;

    public e4(q2 q2Var, String str, Object[] objArr) {
        this.f14171a = q2Var;
        this.f14172b = str;
        this.f14173c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14174d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f14174d = i | (cCharAt2 << i11);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i = this.f14174d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
