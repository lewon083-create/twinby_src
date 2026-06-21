package ae;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f909h;

    public final b a() {
        if (this.f909h == 3 && this.f903b != 0) {
            return new b(this.f902a, this.f903b, this.f904c, this.f905d, this.f906e, this.f907f, this.f908g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f903b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f909h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f909h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}
