package b4;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.internal.ads.om1;
import j3.c0;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f1910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1914h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1917l;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        str.getClass();
        this.f1907a = str;
        this.f1908b = str2;
        this.f1909c = str3;
        this.f1910d = codecCapabilities;
        this.f1913g = z5;
        this.f1911e = z12;
        this.f1912f = z13;
        this.f1914h = z14;
        this.i = c0.m(str2);
        this.f1917l = -3.4028235E38f;
        this.f1915j = -1;
        this.f1916k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(z.g(i, widthAlignment) * widthAlignment, z.g(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b4.p i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            b4.p r0 = new b4.p
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r2
            goto L11
        L10:
            r8 = r1
        L11:
            if (r14 == 0) goto L19
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L19:
            if (r18 != 0) goto L28
            if (r14 == 0) goto L26
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L26
            goto L28
        L26:
            r9 = r1
            goto L29
        L28:
            r9 = r2
        L29:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L6f
            if (r14 == 0) goto L6f
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L6f
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L64
            goto L6f
        L64:
            r10 = r2
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L79
        L6f:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1 = r11
        L79:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):b4.p");
    }

    public final s3.c b(j3.o oVar, j3.o oVar2) {
        j3.o oVar3;
        j3.o oVar4;
        int i;
        String str = oVar.f26335n;
        j3.g gVar = oVar.D;
        String str2 = oVar2.f26335n;
        j3.g gVar2 = oVar2.D;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (oVar.f26347z != oVar2.f26347z) {
                i10 |= 1024;
            }
            boolean z5 = (oVar.f26342u == oVar2.f26342u && oVar.f26343v == oVar2.f26343v) ? false : true;
            if (!this.f1911e && z5) {
                i10 |= 512;
            }
            if ((!j3.g.e(gVar) || !j3.g.e(gVar2)) && !Objects.equals(gVar, gVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f1907a) && !oVar.b(oVar2)) {
                i10 |= 2;
            }
            int i11 = oVar.f26344w;
            if (i11 != -1 && (i = oVar.f26345x) != -1 && i11 == oVar2.f26344w && i == oVar2.f26345x && z5) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(oVar2.f26335n, "video/dolby-vision")) {
                Pair pairC = m3.d.c(oVar);
                Pair pairC2 = m3.d.c(oVar2);
                if (pairC == null || pairC2 == null || !((Integer) pairC.first).equals(pairC2.first)) {
                    i10 |= 2;
                }
            }
            if (i10 == 0) {
                return new s3.c(this.f1907a, oVar, oVar2, oVar.b(oVar2) ? 3 : 2, 0);
            }
            oVar3 = oVar;
            oVar4 = oVar2;
        } else {
            oVar3 = oVar;
            oVar4 = oVar2;
            if (oVar3.F != oVar4.F) {
                i10 |= 4096;
            }
            if (oVar3.G != oVar4.G) {
                i10 |= 8192;
            }
            if (oVar3.H != oVar4.H) {
                i10 |= 16384;
            }
            String str3 = this.f1908b;
            if (i10 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairC3 = m3.d.c(oVar3);
                Pair pairC4 = m3.d.c(oVar4);
                if (pairC3 != null && pairC4 != null) {
                    int iIntValue = ((Integer) pairC3.first).intValue();
                    int iIntValue2 = ((Integer) pairC4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new s3.c(this.f1907a, oVar3, oVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairC3.equals(pairC4)) {
                        return new s3.c(this.f1907a, oVar3, oVar4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new s3.c(this.f1907a, oVar3, oVar4, 3, 0);
            }
            if (!oVar3.b(oVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new s3.c(this.f1907a, oVar3, oVar4, 1, 0);
            }
        }
        return new s3.c(this.f1907a, oVar3, oVar4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[PHI: r2
      0x00c0: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x000e, B:5:0x0016, B:10:0x002a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.content.Context r19, j3.o r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p.c(android.content.Context, j3.o, boolean):boolean");
    }

    public final boolean d(j3.o oVar) {
        return (Objects.equals(oVar.f26335n, "audio/flac") && oVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.f1907a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, j3.o oVar) {
        int i;
        String str = oVar.f26335n;
        String str2 = this.f1908b;
        if ((!str2.equals(str) && !str2.equals(y.c(oVar))) || !c(context, oVar, true) || !d(oVar)) {
            return false;
        }
        if (this.i) {
            int i10 = oVar.f26342u;
            if (i10 > 0 && (i = oVar.f26343v) > 0) {
                return g(i10, i, oVar.f26346y);
            }
        } else {
            int i11 = oVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1910d;
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
                    h("sampleRate.support, " + i11);
                    return false;
                }
            }
            int i12 = oVar.F;
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
                    m3.b.s("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f1907a + ", [" + maxInputChannelCount + " to " + i13 + "]");
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    h("channelCount.support, " + i12);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(j3.o oVar) {
        if (this.i) {
            return this.f1911e;
        }
        Pair pairC = m3.d.c(oVar);
        return pairC != null && ((Integer) pairC.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r12, int r13, double r14) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder sbP = om1.p("NoSupport [", str, "] [");
        sbP.append(this.f1907a);
        sbP.append(", ");
        sbP.append(this.f1908b);
        sbP.append("] [");
        sbP.append(z.f28608a);
        sbP.append("]");
        m3.b.d("MediaCodecInfo", sbP.toString());
    }

    public final String toString() {
        return this.f1907a;
    }
}
