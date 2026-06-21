package ke;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f27390f;

    public final c a() {
        if (this.f27390f == 1 && this.f27385a != null && this.f27386b != null && this.f27387c != null && this.f27388d != null) {
            return new c(this.f27385a, this.f27386b, this.f27387c, this.f27388d, this.f27389e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27385a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f27386b == null) {
            sb2.append(" variantId");
        }
        if (this.f27387c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f27388d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f27390f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}
