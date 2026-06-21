package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g61 f39036a = new g61(eo2.E, eo2.D, eo2.F, eo2.G);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g61 f39037b = new g61(eo2.f38206p, eo2.f38205o, eo2.f38207q, eo2.f38208r);

    public static g61 a(va vaVar) {
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return f39036a;
        }
        if (iOrdinal == 2) {
            return f39037b;
        }
        throw new ij.j();
    }
}
