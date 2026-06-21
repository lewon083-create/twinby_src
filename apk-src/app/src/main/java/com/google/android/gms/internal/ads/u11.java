package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u11 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v11 f10789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bz0 f10790c;

    public /* synthetic */ u11(v11 v11Var, bz0 bz0Var, int i) {
        this.f10788a = i;
        this.f10789b = v11Var;
        this.f10790c = bz0Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        switch (this.f10788a) {
            case 0:
                v11 v11Var = this.f10789b;
                c91 c91VarA = v11Var.f11205a.a(this.f10790c);
                v11Var.f11208d.e(20303, c91VarA);
                return c91VarA;
            default:
                v11 v11Var2 = this.f10789b;
                c91 c91VarA2 = v11Var2.f11205a.a(this.f10790c);
                v11Var2.f11208d.e(20303, c91VarA2);
                return c91VarA2;
        }
    }
}
