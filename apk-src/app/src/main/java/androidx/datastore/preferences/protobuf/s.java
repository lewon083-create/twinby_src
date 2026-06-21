package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f1469a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f1470b;

    static {
        z0 z0Var = z0.f1519c;
        r rVar = null;
        try {
            rVar = (r) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1470b = rVar;
    }
}
