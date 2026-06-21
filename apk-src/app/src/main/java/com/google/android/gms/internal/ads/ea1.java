package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 implements k81, e80 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ea1 f4895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ea1 f4896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ea1 f4897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ea1 f4898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ea1 f4899h;
    public static final ea1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ea1 f4900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ea1 f4901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ea1 f4902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ea1 f4903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ea1 f4904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ea1 f4905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ea1 f4906p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4908c;

    static {
        int i10 = 0;
        f4895d = new ea1("SHA1", i10);
        f4896e = new ea1("SHA224", i10);
        f4897f = new ea1("SHA256", i10);
        f4898g = new ea1("SHA384", i10);
        f4899h = new ea1("SHA512", i10);
        int i11 = 1;
        i = new ea1("TINK", i11);
        f4900j = new ea1("CRUNCHY", i11);
        f4901k = new ea1("NO_PREFIX", i11);
        int i12 = 2;
        f4902l = new ea1("TINK", i12);
        f4903m = new ea1("NO_PREFIX", i12);
        int i13 = 3;
        f4904n = new ea1("SHA256", i13);
        f4905o = new ea1("SHA384", i13);
        f4906p = new ea1("SHA512", i13);
    }

    public /* synthetic */ ea1(String str, int i10) {
        this.f4907b = i10;
        this.f4908c = str;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        ((k80) obj).b(this.f4908c);
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        p9.k.C.f31302h.e(this.f4908c, th2);
    }

    public String toString() {
        switch (this.f4907b) {
            case 0:
                return this.f4908c;
            case 1:
                return this.f4908c;
            case 2:
                return this.f4908c;
            case 3:
                return this.f4908c;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
    }
}
