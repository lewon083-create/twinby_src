package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30106c;

    public f0(l1 l1Var) {
        super(l1Var);
        ((l1) this.f15951b).B++;
    }

    public final void D() {
        if (!this.f30106c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void E() {
        if (this.f30106c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (F()) {
            return;
        }
        ((l1) this.f15951b).D.incrementAndGet();
        this.f30106c = true;
    }

    public abstract boolean F();
}
