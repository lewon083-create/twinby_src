package a0;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f66e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f67f;

    public e1(r1 r1Var) {
        super(r1Var);
        this.f67f = new AtomicBoolean(false);
    }

    @Override // a0.o0, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.f66e) {
            case 1:
                if (!((AtomicBoolean) this.f67f).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public e1(r1 r1Var, f1 f1Var) {
        super(r1Var);
        this.f67f = new WeakReference(f1Var);
        a(new c1(0, this));
    }
}
