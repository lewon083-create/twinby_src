package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f4715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4719h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4722l;

    public dx1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z5, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f4712a = str;
        this.f4713b = str2;
        this.f4714c = str3;
        this.f4715d = codecCapabilities;
        this.f4718g = z5;
        this.f4716e = z10;
        this.f4717f = z11;
        this.f4719h = z12;
        this.i = ra.b(str2);
        this.f4722l = -3.4028235E38f;
        this.f4720j = -1;
        this.f4721k = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.dx1 a(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            com.google.android.gms.internal.ads.dx1 r0 = new com.google.android.gms.internal.ads.dx1
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r6 = r1
            goto L11
        L10:
            r6 = r2
        L11:
            if (r12 == 0) goto L18
            java.lang.String r3 = "tunneled-playback"
            r12.isFeatureSupported(r3)
        L18:
            if (r14 != 0) goto L24
            if (r12 == 0) goto L26
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L26
        L24:
            r7 = r1
            goto L27
        L26:
            r7 = r2
        L27:
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r14 < r3) goto L61
            if (r12 == 0) goto L61
            java.lang.String r14 = "detached-surface"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L61
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Xiaomi"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "OPPO"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "realme"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "motorola"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "LENOVO"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L68
        L61:
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r2
            r2 = r10
            goto L6e
        L68:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r1
            r1 = r9
        L6e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dx1.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.gms.internal.ads.dx1");
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        Point pointJ = j(videoCapabilities, i, i10);
        int i11 = pointJ.x;
        int i12 = pointJ.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i11, i12);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i11, i12, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = cq0.f4293a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(jx1 jx1Var) {
        int i;
        String str = jx1Var.f6975m;
        String str2 = this.f4713b;
        if ((!str2.equals(str) && !str2.equals(mx1.c(jx1Var))) || !f(jx1Var, true) || !g(jx1Var)) {
            return false;
        }
        if (this.i) {
            int i10 = jx1Var.f6982t;
            if (i10 > 0 && (i = jx1Var.f6983u) > 0) {
                return e(i10, i, jx1Var.f6986x);
            }
        } else {
            int i11 = jx1Var.F;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4715d;
            if (i11 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i11)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb2.append("sampleRate.support, ");
                    sb2.append(i11);
                    h(sb2.toString());
                    return false;
                }
            }
            int i12 = jx1Var.E;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    String str3 = this.f4712a;
                    StringBuilder sb3 = new StringBuilder(pe.a.b(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i13)));
                    sb3.append("AssumedMaxChannelAdjustment: ");
                    sb3.append(str3);
                    sb3.append(", [");
                    sb3.append(maxInputChannelCount);
                    sb3.append(" to ");
                    sb3.append(i13);
                    sb3.append("]");
                    rs.r("MediaCodecInfo", sb3.toString());
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 22);
                    sb4.append("channelCount.support, ");
                    sb4.append(i12);
                    h(sb4.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(jx1 jx1Var) {
        if (this.i) {
            return this.f4716e;
        }
        Pair pairB = ea0.b(jx1Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final ws1 d(jx1 jx1Var, jx1 jx1Var2) {
        jx1 jx1Var3;
        jx1 jx1Var4;
        int i;
        String str = jx1Var.f6975m;
        String str2 = jx1Var2.f6975m;
        rm1 rm1Var = jx1Var2.C;
        int i10 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (jx1Var.f6987y != jx1Var2.f6987y) {
                i10 |= 1024;
            }
            boolean z5 = (jx1Var.f6982t == jx1Var2.f6982t && jx1Var.f6983u == jx1Var2.f6983u) ? false : true;
            if (!this.f4716e && z5) {
                i10 |= 512;
            }
            rm1 rm1Var2 = jx1Var.C;
            if ((!rm1.a(rm1Var2) || !rm1.a(rm1Var)) && !Objects.equals(rm1Var2, rm1Var)) {
                i10 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f4712a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !jx1Var.b(jx1Var2)) {
                i10 |= 2;
            }
            int i11 = jx1Var.f6984v;
            if (i11 != -1 && (i = jx1Var.f6985w) != -1 && i11 == jx1Var2.f6984v && i == jx1Var2.f6985w && z5) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairB = ea0.b(jx1Var);
                Pair pairB2 = ea0.b(jx1Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i10 = 2;
                }
            }
            if (i10 == 0) {
                return new ws1(str3, jx1Var, jx1Var2, true == jx1Var.b(jx1Var2) ? 3 : 2, 0);
            }
            jx1Var3 = jx1Var;
            jx1Var4 = jx1Var2;
        } else {
            jx1Var3 = jx1Var;
            jx1Var4 = jx1Var2;
            if (jx1Var3.E != jx1Var4.E) {
                i10 |= 4096;
            }
            if (jx1Var3.F != jx1Var4.F) {
                i10 |= 8192;
            }
            if (jx1Var3.G != jx1Var4.G) {
                i10 |= 16384;
            }
            String str4 = this.f4713b;
            if (i10 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairB3 = ea0.b(jx1Var3);
                Pair pairB4 = ea0.b(jx1Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ws1(this.f4712a, jx1Var3, jx1Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new ws1(this.f4712a, jx1Var3, jx1Var4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new ws1(this.f4712a, jx1Var3, jx1Var4, 3, 0);
            }
            if (!jx1Var3.b(jx1Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ws1(this.f4712a, jx1Var3, jx1Var4, 1, 0);
            }
        }
        return new ws1(this.f4712a, jx1Var3, jx1Var4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r12, int r13, double r14) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dx1.e(int, int, double):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r6.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r6.equals("video/av01") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.internal.ads.jx1 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dx1.f(com.google.android.gms.internal.ads.jx1, boolean):boolean");
    }

    public final boolean g(jx1 jx1Var) {
        return (Objects.equals(jx1Var.f6975m, "audio/flac") && jx1Var.G == 22 && Build.VERSION.SDK_INT < 34 && this.f4712a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = cq0.f4293a;
        String str3 = this.f4713b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f4712a;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        l7.o.t(sb2, "NoSupport [", str, "] [", str4);
        l7.o.t(sb2, ", ", str3, "] [", str2);
        sb2.append("]");
        rs.g("MediaCodecInfo", sb2.toString());
    }

    public final String toString() {
        return this.f4712a;
    }
}
