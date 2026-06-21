package l4;

import j3.p0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f27880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j3.o f27882e;

    public n(int i, p0 p0Var, int i10) {
        this.f27879b = i;
        this.f27880c = p0Var;
        this.f27881d = i10;
        this.f27882e = p0Var.f26354d[i10];
    }

    public abstract int a();

    public abstract boolean b(n nVar);
}
