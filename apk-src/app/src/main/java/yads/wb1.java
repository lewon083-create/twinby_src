package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wb1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44329c;

    public wb1(String str, String str2) {
        super(str);
        this.f44328b = str;
        this.f44329c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f44328b;
    }
}
