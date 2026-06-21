package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface h1 extends b2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f19579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f19580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f19581h;

    static {
        Class cls = Integer.TYPE;
        f19579f = new g("camerax.core.imageInput.inputFormat", cls, null);
        f19580g = new g("camerax.core.imageInput.secondaryInputFormat", cls, null);
        f19581h = new g("camerax.core.imageInput.inputDynamicRange", a0.i0.class, null);
    }

    default a0.i0 i() {
        a0.i0 i0Var = (a0.i0) g(f19581h, a0.i0.f111c);
        i0Var.getClass();
        return i0Var;
    }

    default int k() {
        return ((Integer) a(f19579f)).intValue();
    }
}
