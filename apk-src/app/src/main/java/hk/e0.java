package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f20657a;

    static {
        String property;
        h0 h0Var;
        int i = mk.t.f28940a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            ok.e eVar = k0.f20682a;
            ik.d dVar = mk.n.f28934a;
            ik.d dVar2 = dVar.f21368f;
            h0Var = dVar;
            if (dVar == null) {
                h0Var = d0.f20652k;
            }
        } else {
            h0Var = d0.f20652k;
        }
        f20657a = h0Var;
    }
}
