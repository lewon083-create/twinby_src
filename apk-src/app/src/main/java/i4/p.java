package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements zc.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20977c;

    public /* synthetic */ p(int i, Object obj) {
        this.f20976b = i;
        this.f20977c = obj;
    }

    @Override // zc.p
    public final Object get() {
        switch (this.f20976b) {
            case 0:
                try {
                    return (b0) ((Class) this.f20977c).getConstructor(null).newInstance(null);
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
            case 1:
                return (s3.g) this.f20977c;
            case 2:
                return (l4.p) this.f20977c;
            default:
                return (b0) this.f20977c;
        }
    }
}
