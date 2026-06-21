package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u01 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x01 f10776b;

    public /* synthetic */ u01(x01 x01Var, int i) {
        this.f10775a = i;
        this.f10776b = x01Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final /* synthetic */ ed.d a(Object obj) {
        switch (this.f10775a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x01 x01Var = this.f10776b;
                if (zBooleanValue) {
                    return x01Var.b(0);
                }
                x01Var.f11962d.b(1003);
                return vv.d(w01.f11565c);
            default:
                zy0 zy0Var = (zy0) obj;
                m11 m11Var = this.f10776b.f11961c;
                if (zy0Var.G() == 2) {
                    return m11Var.b(zy0Var.z(), zy0Var.A().D());
                }
                if (zy0Var.G() == 3) {
                    return m11Var.a(zy0Var.z(), zy0Var.B().D(), zy0Var.A().D());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
