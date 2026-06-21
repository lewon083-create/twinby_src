package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class il extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0 f39576d;

    public il(int i, nx0 nx0Var, boolean z5) {
        super(og2.a("AudioTrack write failed: ", i));
        this.f39575c = z5;
        this.f39574b = i;
        this.f39576d = nx0Var;
    }
}
