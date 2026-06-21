package b4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f1920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1921e;

    public q(j3.o oVar, v vVar, boolean z5, int i) {
        this("Decoder init failed: [" + i + "], " + oVar, vVar, oVar.f26335n, z5, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public q(String str, Throwable th2, String str2, boolean z5, p pVar, String str3) {
        super(str, th2);
        this.f1918b = str2;
        this.f1919c = z5;
        this.f1920d = pVar;
        this.f1921e = str3;
    }
}
