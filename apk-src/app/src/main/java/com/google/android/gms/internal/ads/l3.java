package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f7380b;

    public l3(int i) {
        this.f7379a = i;
        switch (i) {
            case 1:
                this.f7380b = new r2(35152, 2, "image/png");
                break;
            default:
                this.f7380b = new r2(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        switch (this.f7379a) {
        }
        return this.f7380b.a(a2Var);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        switch (this.f7379a) {
            case 0:
                this.f7380b.b(b2Var);
                break;
            default:
                this.f7380b.b(b2Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
        int i = this.f7379a;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        switch (this.f7379a) {
            case 0:
                this.f7380b.d(j10, j11);
                break;
            default:
                this.f7380b.d(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) {
        switch (this.f7379a) {
        }
        return this.f7380b.e(a2Var, e2Var);
    }

    private final void f() {
    }

    private final void g() {
    }
}
