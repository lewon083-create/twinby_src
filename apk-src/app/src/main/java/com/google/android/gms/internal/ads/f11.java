package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f11 implements c31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f11 f5172b = new f11(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f11 f5173c = new f11(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f11 f5174d = new f11(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f11 f5175e = new f11(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f11 f5176f = new f11(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f11 f5177g = new f11(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5178a;

    public /* synthetic */ f11(int i) {
        this.f5178a = i;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final Object apply(Object obj) {
        switch (this.f5178a) {
            case 0:
                return null;
            case 1:
                return j11.b(5);
            case 2:
                qy1 qy1Var = (qy1) obj;
                int i = jx1.N;
                String str = qy1Var.f9639a;
                String str2 = qy1Var.f9640b;
                return t.z.g(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                z1 z1Var = (z1) obj;
                z1Var.getClass();
                return z1Var.getClass().getSimpleName();
            case 4:
                return x41.v(ix.J(((gy1) obj).g().f8056b, f5177g));
            default:
                mz1 mz1Var = mz1.f8054d;
                return Integer.valueOf(((pi) obj).f9072c);
        }
    }
}
