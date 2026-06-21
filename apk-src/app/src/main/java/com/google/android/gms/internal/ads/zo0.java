package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 implements c31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw f13053b;

    public /* synthetic */ zo0(cw cwVar, int i) {
        this.f13052a = i;
        this.f13053b = cwVar;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f13052a) {
            case 0:
                u9.i.f("", (og0) obj);
                t9.c0.m("Failed to get a cache key, reverting to legacy flow.");
                cw cwVar = this.f13053b;
                ap0 ap0Var = new ap0(null, cwVar.w());
                cwVar.f4350f = ap0Var;
                return ap0Var;
            default:
                ku kuVar = (ku) obj;
                ap0 ap0Var2 = new ap0(kuVar, new br0(kuVar.f7305k));
                this.f13053b.f4350f = ap0Var2;
                return ap0Var2;
        }
    }
}
