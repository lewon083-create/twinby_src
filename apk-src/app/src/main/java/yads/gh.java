package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh implements ko2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg f38758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f38759b;

    public gh(ij.g gVar, zg zgVar) {
        this.f38758a = zgVar;
        this.f38759b = gVar;
    }

    @Override // yads.ko2
    public final void a(go2 go2Var) {
        if (this.f38758a.a()) {
            try {
                ((IReporter) this.f38759b.getValue()).reportEvent(go2Var.f38838a, go2Var.f38839b);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.ko2
    public final void reportAnr(Map map) {
        if (this.f38758a.a()) {
            try {
                ((IReporter) this.f38759b.getValue()).reportAnr(map);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.sm0
    public final void reportError(String str, Throwable th2) {
        if (this.f38758a.a()) {
            try {
                ((IReporter) this.f38759b.getValue()).reportError(str, th2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.ko2
    public final void reportUnhandledException(Throwable th2) {
        if (this.f38758a.a()) {
            try {
                ((IReporter) this.f38759b.getValue()).reportUnhandledException(th2);
            } catch (Throwable unused) {
            }
        }
    }
}
