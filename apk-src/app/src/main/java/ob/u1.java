package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum u1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30443b;

    u1(String str) {
        this.f30443b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f30443b;
    }
}
