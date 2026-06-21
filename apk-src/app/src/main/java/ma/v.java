package ma;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f28812d = new v(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f28815c;

    public v(boolean z5, String str, Exception exc) {
        this.f28813a = z5;
        this.f28814b = str;
        this.f28815c = exc;
    }

    public static v b(String str) {
        return new v(false, str, null);
    }

    public static v c(String str, Exception exc) {
        return new v(false, str, exc);
    }

    public String a() {
        return this.f28814b;
    }
}
