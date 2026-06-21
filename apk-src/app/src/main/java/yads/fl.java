package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fl extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0 f38474d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fl(int i, int i10, int i11, int i12, nx0 nx0Var, boolean z5, RuntimeException runtimeException) {
        StringBuilder sbI = t.z.i("AudioTrack init failed ", i, " Config(", i10, ", ");
        com.google.android.gms.internal.ads.om1.t(sbI, i11, ", ", i12, ")");
        sbI.append(z5 ? " (recoverable)" : "");
        super(sbI.toString(), runtimeException);
        this.f38472b = i;
        this.f38473c = z5;
        this.f38474d = nx0Var;
    }
}
