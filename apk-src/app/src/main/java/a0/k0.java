package a0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f136a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f137b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f138c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f139d = 5000;

    public k0(x1 x1Var, int i) {
        a(x1Var, i);
    }

    public final void a(x1 x1Var, int i) {
        f2.g.a("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            this.f136a.add(x1Var);
        }
        if ((i & 2) != 0) {
            this.f137b.add(x1Var);
        }
        if ((i & 4) != 0) {
            this.f138c.add(x1Var);
        }
    }
}
