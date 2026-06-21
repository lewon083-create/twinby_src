package g0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f19777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f19778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f19779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19781e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19782f = false;

    public u2(h2 h2Var, x2 x2Var, n nVar, List list) {
        this.f19777a = h2Var;
        this.f19778b = x2Var;
        this.f19779c = nVar;
        this.f19780d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.f19777a + ", mUseCaseConfig=" + this.f19778b + ", mStreamSpec=" + this.f19779c + ", mCaptureTypes=" + this.f19780d + ", mAttached=" + this.f19781e + ", mActive=" + this.f19782f + '}';
    }
}
