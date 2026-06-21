package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f27511a;

    static {
        h0 h0Var = null;
        try {
            h0Var = (h0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (h0Var == null) {
            h0Var = new h0();
        }
        f27511a = h0Var;
    }

    public static i a(Class cls) {
        f27511a.getClass();
        return new i(cls);
    }
}
