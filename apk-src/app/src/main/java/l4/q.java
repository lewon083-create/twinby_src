package l4;

import j3.p0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f27909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f27910b;

    public q(int i, p0 p0Var, int[] iArr) {
        if (iArr.length == 0) {
            m3.b.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f27909a = p0Var;
        this.f27910b = iArr;
    }
}
