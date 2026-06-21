package g0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19557a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f19558b;

    public e2(f2 f2Var) {
        this.f19558b = f2Var;
    }

    @Override // g0.f2
    public final void a(h2 h2Var) {
        if (this.f19557a.get()) {
            return;
        }
        this.f19558b.a(h2Var);
    }

    public final void b() {
        this.f19557a.set(true);
    }
}
