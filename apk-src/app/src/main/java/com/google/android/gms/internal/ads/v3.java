package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f11221b;

    public v3(int i) {
        this.f11220a = i;
        switch (i) {
            case 1:
                this.f11221b = new w3();
                break;
            default:
                this.f11221b = new u3();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        switch (this.f11220a) {
            case 0:
                return ((u3) this.f11221b).a(a2Var);
            default:
                return ((w3) this.f11221b).a(a2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        switch (this.f11220a) {
            case 0:
                ((u3) this.f11221b).f10798b = b2Var;
                break;
            default:
                ((w3) this.f11221b).f11605b = b2Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
        switch (this.f11220a) {
            case 0:
                ((u3) this.f11221b).c();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        switch (this.f11220a) {
            case 0:
                ((u3) this.f11221b).d(j10, j11);
                break;
            default:
                ((w3) this.f11221b).d(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) {
        switch (this.f11220a) {
            case 0:
                return ((u3) this.f11221b).e(a2Var, e2Var);
            default:
                return ((w3) this.f11221b).e(a2Var, e2Var);
        }
    }

    private final void f() {
    }
}
