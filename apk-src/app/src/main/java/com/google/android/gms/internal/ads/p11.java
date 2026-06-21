package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p11 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q11 f8884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bz0 f8885c;

    public /* synthetic */ p11(q11 q11Var, bz0 bz0Var, int i) {
        this.f8883a = i;
        this.f8884b = q11Var;
        this.f8885c = bz0Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        switch (this.f8883a) {
            case 0:
                q11 q11Var = this.f8884b;
                c91 c91VarA = q11Var.f9284b.a(this.f8885c);
                q11Var.i.e(15303, c91VarA);
                return c91VarA;
            default:
                q11 q11Var2 = this.f8884b;
                c91 c91VarA2 = q11Var2.f9284b.a(this.f8885c);
                q11Var2.i.e(15303, c91VarA2);
                return c91VarA2;
        }
    }
}
