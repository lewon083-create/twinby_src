package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx1 f5135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5136d;

    public ex1(jx1 jx1Var, ix1 ix1Var, int i) {
        String string = jx1Var.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = jx1Var.f6975m;
        int iAbs = Math.abs(i);
        this(string2, ix1Var, str, null, l7.o.j(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)));
    }

    public ex1(String str, Throwable th2, String str2, dx1 dx1Var, String str3) {
        super(str, th2);
        this.f5134b = str2;
        this.f5135c = dx1Var;
        this.f5136d = str3;
    }
}
