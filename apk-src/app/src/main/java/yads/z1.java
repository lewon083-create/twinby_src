package yads;

import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f45219b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z1 f45220c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45221a = new HashMap();

    public final x1 a(long j10) {
        x1 x1Var;
        synchronized (f45219b) {
            x1Var = (x1) this.f45221a.remove(Long.valueOf(j10));
        }
        return x1Var;
    }

    public final void a(long j10, x1 x1Var) {
        synchronized (f45219b) {
            this.f45221a.put(Long.valueOf(j10), x1Var);
            Unit unit = Unit.f27471a;
        }
    }
}
