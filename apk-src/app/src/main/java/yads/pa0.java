package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41858h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41861l;

    public final String toString() {
        int i = this.f41851a;
        int i10 = this.f41852b;
        int i11 = this.f41853c;
        int i12 = this.f41854d;
        int i13 = this.f41855e;
        int i14 = this.f41856f;
        int i15 = this.f41857g;
        int i16 = this.f41858h;
        int i17 = this.i;
        int i18 = this.f41859j;
        long j10 = this.f41860k;
        int i19 = this.f41861l;
        int i20 = lb3.f40466a;
        Locale locale = Locale.US;
        StringBuilder sbI = t.z.i("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        com.google.android.gms.internal.ads.om1.t(sbI, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        com.google.android.gms.internal.ads.om1.t(sbI, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        com.google.android.gms.internal.ads.om1.t(sbI, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        com.google.android.gms.internal.ads.om1.t(sbI, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        sbI.append(j10);
        sbI.append("\n videoFrameProcessingOffsetCount=");
        sbI.append(i19);
        sbI.append("\n}");
        return sbI.toString();
    }
}
