package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ja1 f6790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ja1 f6791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ja1 f6792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ja1 f6793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ja1 f6794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ja1 f6795h;
    public static final ja1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ja1 f6796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ja1 f6797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ja1 f6798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ja1 f6799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ja1 f6800n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6802b;

    static {
        int i10 = 0;
        f6790c = new ja1("TINK", i10);
        f6791d = new ja1("CRUNCHY", i10);
        f6792e = new ja1("NO_PREFIX", i10);
        int i11 = 1;
        f6793f = new ja1("TINK", i11);
        f6794g = new ja1("NO_PREFIX", i11);
        int i12 = 2;
        f6795h = new ja1("TINK", i12);
        i = new ja1("CRUNCHY", i12);
        f6796j = new ja1("NO_PREFIX", i12);
        int i13 = 3;
        f6797k = new ja1("TINK", i13);
        f6798l = new ja1("CRUNCHY", i13);
        f6799m = new ja1("LEGACY", i13);
        f6800n = new ja1("NO_PREFIX", i13);
    }

    public /* synthetic */ ja1(String str, int i10) {
        this.f6801a = i10;
        this.f6802b = str;
    }

    public static ja1 a(tk0 tk0Var) {
        String str;
        tk0Var.G(2);
        int iK = tk0Var.K();
        int i10 = iK >> 1;
        int i11 = iK & 1;
        int iK2 = tk0Var.K() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iK2 | (i11 << 5);
        String str2 = i10 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        String str3 = i12 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(pe.a.b(length + length2, length3, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        sb2.append(i12);
        return new ja1(sb2.toString(), 5);
    }

    public String toString() {
        switch (this.f6801a) {
            case 0:
                return this.f6802b;
            case 1:
                return this.f6802b;
            case 2:
                return this.f6802b;
            case 3:
                return this.f6802b;
            default:
                return super.toString();
        }
    }
}
