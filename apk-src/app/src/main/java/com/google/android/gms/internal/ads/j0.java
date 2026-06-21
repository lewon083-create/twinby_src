package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6668c;

    public j0() {
        this.f6666a = 0;
        this.f6667b = 0;
        this.f6668c = 0;
    }

    public static j0 a(q9.g3 g3Var) {
        return g3Var.f31878e ? new j0(3, 0, 0) : g3Var.f31882j ? new j0(2, 0, 0) : g3Var.i ? new j0(0, 0, 0) : new j0(1, g3Var.f31880g, g3Var.f31877d);
    }

    public boolean b() {
        return this.f6666a == 3;
    }

    public j0(int i, int i10, int i11) {
        this.f6666a = i;
        this.f6668c = i10;
        this.f6667b = i11;
    }

    public /* synthetic */ j0(int i, int i10, int i11, boolean z5) {
        this.f6666a = i;
        this.f6667b = i10;
        this.f6668c = i11;
    }
}
