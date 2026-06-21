package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11459h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11463m;

    public /* synthetic */ vs1(int i) {
        this.f11452a = i;
    }

    public synchronized void a() {
    }

    public final String toString() {
        switch (this.f11452a) {
            case 0:
                int i = this.f11453b;
                int i10 = this.f11454c;
                int i11 = this.f11455d;
                int i12 = this.f11456e;
                int i13 = this.f11457f;
                int i14 = this.f11458g;
                int i15 = this.f11459h;
                int i16 = this.i;
                int i17 = this.f11460j;
                int i18 = this.f11461k;
                long j10 = this.f11462l;
                int i19 = this.f11463m;
                String str = cq0.f4293a;
                Locale locale = Locale.US;
                StringBuilder sbI = t.z.i("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
                om1.t(sbI, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
                om1.t(sbI, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
                om1.t(sbI, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
                om1.t(sbI, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
                sbI.append(j10);
                sbI.append("\n videoFrameProcessingOffsetCount=");
                sbI.append(i19);
                sbI.append("\n}");
                return sbI.toString();
            default:
                int i20 = this.f11453b;
                int i21 = this.f11454c;
                int i22 = this.f11455d;
                int i23 = this.f11456e;
                int i24 = this.f11457f;
                int i25 = this.f11458g;
                int i26 = this.f11459h;
                int i27 = this.i;
                int i28 = this.f11460j;
                int i29 = this.f11461k;
                long j11 = this.f11462l;
                int i30 = this.f11463m;
                String str2 = m3.z.f28608a;
                Locale locale2 = Locale.US;
                StringBuilder sbI2 = t.z.i("DecoderCounters {\n decoderInits=", i20, ",\n decoderReleases=", i21, "\n queuedInputBuffers=");
                om1.t(sbI2, i22, "\n skippedInputBuffers=", i23, "\n renderedOutputBuffers=");
                om1.t(sbI2, i24, "\n skippedOutputBuffers=", i25, "\n droppedBuffers=");
                om1.t(sbI2, i26, "\n droppedInputBuffers=", i27, "\n maxConsecutiveDroppedBuffers=");
                om1.t(sbI2, i28, "\n droppedToKeyframeEvents=", i29, "\n totalVideoFrameProcessingOffsetUs=");
                sbI2.append(j11);
                sbI2.append("\n videoFrameProcessingOffsetCount=");
                sbI2.append(i30);
                sbI2.append("\n}");
                return sbI2.toString();
        }
    }
}
