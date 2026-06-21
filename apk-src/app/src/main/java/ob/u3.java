package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u3 extends q3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30453d;

    public u3(z3 z3Var) {
        super(z3Var);
        this.f30373c.f30621s++;
    }

    public final void D() {
        if (!this.f30453d) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void E() {
        if (this.f30453d) {
            throw new IllegalStateException("Can't initialize twice");
        }
        F();
        this.f30373c.f30622t++;
        this.f30453d = true;
    }

    public abstract void F();
}
