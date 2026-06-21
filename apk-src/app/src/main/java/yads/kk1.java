package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f40230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40234h;

    public kk1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z5, boolean z10, boolean z11) {
        this.f40227a = (String) ni.a((Object) str);
        this.f40228b = str2;
        this.f40229c = str3;
        this.f40230d = codecCapabilities;
        this.f40233g = z5;
        this.f40231e = z10;
        this.f40232f = z11;
        this.f40234h = jt1.f(str2);
    }

    public final void a(String str) {
        StringBuilder sbP = com.google.android.gms.internal.ads.om1.p("NoSupport [", str, "] [");
        sbP.append(this.f40227a);
        sbP.append(", ");
        sbP.append(this.f40228b);
        sbP.append("] [");
        sbP.append(lb3.f40470e);
        sbP.append("]");
        kh1.a("MediaCodecInfo", sbP.toString());
    }

    public final boolean b(nx0 nx0Var) {
        if (this.f40234h) {
            return this.f40231e;
        }
        Pair pairB = yk1.b(nx0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f40227a;
    }

    public final Point a(int i, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40230d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = lb3.f40466a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final va0 a(nx0 nx0Var, nx0 nx0Var2) {
        nx0 nx0Var3;
        nx0 nx0Var4;
        int i = !lb3.a(nx0Var.f41375m, nx0Var2.f41375m) ? 8 : 0;
        if (this.f40234h) {
            if (nx0Var.f41383u != nx0Var2.f41383u) {
                i |= 1024;
            }
            if (!this.f40231e && (nx0Var.f41380r != nx0Var2.f41380r || nx0Var.f41381s != nx0Var2.f41381s)) {
                i |= 512;
            }
            if (!lb3.a(nx0Var.f41387y, nx0Var2.f41387y)) {
                i |= 2048;
            }
            String str = this.f40227a;
            String str2 = lb3.f40469d;
            lk1 lk1Var = rk2.f42617c;
            if (str2.startsWith(lk1Var.b()) && lk1Var.a().equals(str) && !nx0Var.a(nx0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new va0(this.f40227a, nx0Var, nx0Var2, nx0Var.a(nx0Var2) ? 3 : 2, 0);
            }
            nx0Var3 = nx0Var;
            nx0Var4 = nx0Var2;
        } else {
            nx0Var3 = nx0Var;
            nx0Var4 = nx0Var2;
            if (nx0Var3.f41388z != nx0Var4.f41388z) {
                i |= 4096;
            }
            if (nx0Var3.A != nx0Var4.A) {
                i |= 8192;
            }
            if (nx0Var3.B != nx0Var4.B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f40228b)) {
                Pair pairB = yk1.b(nx0Var3);
                Pair pairB2 = yk1.b(nx0Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new va0(this.f40227a, nx0Var3, nx0Var4, 3, 0);
                    }
                }
            }
            if (!nx0Var3.a(nx0Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f40228b)) {
                i |= 2;
            }
            if (i == 0) {
                return new va0(this.f40227a, nx0Var3, nx0Var4, 1, 0);
            }
        }
        return new va0(this.f40227a, nx0Var3, nx0Var4, 0, i);
    }

    public final boolean a(nx0 nx0Var) {
        int i;
        Pair pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f40228b.equals(nx0Var.f41375m) && !this.f40228b.equals(yk1.a(nx0Var))) {
            return false;
        }
        int i10 = 16;
        if (nx0Var.f41372j != null && (pairB = yk1.b(nx0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i11 = 8;
            if ("video/dolby-vision".equals(nx0Var.f41375m)) {
                if ("video/avc".equals(this.f40228b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f40228b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f40234h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40230d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (lb3.f40466a <= 23 && "video/x-vnd.on2.vp9".equals(this.f40228b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f40230d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i11 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i11 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i11 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i11 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i11 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i11 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i11 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i11 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i11;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        if ("video/hevc".equals(this.f40228b) && 2 == iIntValue) {
                            byte[] bArrDecode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = Charsets.UTF_8;
                            String str = new String(bArrDecode, charset);
                            String str2 = lb3.f40467b;
                            if (str.equals(str2) || new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + nx0Var.f41372j + ", " + this.f40229c);
                return false;
            }
        }
        if (this.f40234h) {
            int i12 = nx0Var.f41380r;
            if (i12 <= 0 || (i = nx0Var.f41381s) <= 0) {
                return true;
            }
            if (lb3.f40466a >= 21) {
                return a(i12, i, nx0Var.f41382t);
            }
            boolean z5 = i12 * i <= yk1.a();
            if (!z5) {
                a("legacyFrameSize, " + nx0Var.f41380r + "x" + nx0Var.f41381s);
            }
            return z5;
        }
        int i13 = lb3.f40466a;
        if (i13 >= 21) {
            int i14 = nx0Var.A;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f40230d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                        a("sampleRate.support, " + i14);
                    }
                }
                return false;
            }
            int i15 = nx0Var.f41388z;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f40230d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str3 = this.f40227a;
                        String str4 = this.f40228b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                            if ("audio/ac3".equals(str4)) {
                                i10 = 6;
                            } else if (!"audio/eac3".equals(str4)) {
                                i10 = 30;
                            }
                            kh1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i10 + "]");
                            maxInputChannelCount = i10;
                        }
                        if (maxInputChannelCount < i15) {
                            a("channelCount.support, " + i15);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i, int i10, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40230d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = lb3.f40466a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i12, i13);
        }
        if (!zIsSizeSupported) {
            if (i < i10) {
                String str = this.f40227a;
                byte[] bArrDecode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = Charsets.UTF_8;
                if (!new String(bArrDecode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(lb3.f40467b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i10 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i14 = point2.x;
                    int i15 = point2.y;
                    if (d10 != -1.0d && d10 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i14, i15, Math.floor(d10));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i14, i15);
                    }
                    if (zIsSizeSupported2) {
                        StringBuilder sbI = t.z.i("sizeAndRate.rotated, ", i, "x", i10, "x");
                        sbI.append(d10);
                        StringBuilder sbP = com.google.android.gms.internal.ads.om1.p("AssumedSupport [", sbI.toString(), "] [");
                        sbP.append(this.f40227a);
                        sbP.append(", ");
                        sbP.append(this.f40228b);
                        sbP.append("] [");
                        sbP.append(lb3.f40470e);
                        sbP.append("]");
                        kh1.a("MediaCodecInfo", sbP.toString());
                    }
                }
            }
            StringBuilder sbI2 = t.z.i("sizeAndRate.support, ", i, "x", i10, "x");
            sbI2.append(d10);
            a(sbI2.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.kk1 a(java.lang.String r5, java.lang.String r6, java.lang.String r7, android.media.MediaCodecInfo.CodecCapabilities r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            yads.kk1 r5 = new yads.kk1
            r11 = 1
            r0 = 0
            if (r9 == 0) goto L68
            int r1 = yads.lb3.f40466a
            r2 = 19
            if (r1 < r2) goto L68
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r9.isFeatureSupported(r2)
            if (r2 == 0) goto L68
            r2 = 22
            if (r1 > r2) goto L66
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T0RST0lELVhVMw=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r3)
            java.lang.String r2 = yads.lb3.f40469d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L43
            java.lang.String r1 = new java.lang.String
            java.lang.String r4 = "TmV4dXMgMTA="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            r1.<init>(r4, r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L66
        L43:
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L68
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L66
            goto L68
        L66:
            r1 = r11
            goto L6a
        L68:
            r1 = r11
            r11 = r0
        L6a:
            r2 = 21
            if (r9 == 0) goto L77
            int r3 = yads.lb3.f40466a
            if (r3 < r2) goto L77
            java.lang.String r3 = "tunneled-playback"
            r9.isFeatureSupported(r3)
        L77:
            if (r12 != 0) goto L8a
            if (r9 == 0) goto L88
            int r12 = yads.lb3.f40466a
            if (r12 < r2) goto L88
            java.lang.String r12 = "secure-playback"
            boolean r12 = r9.isFeatureSupported(r12)
            if (r12 == 0) goto L88
            goto L8a
        L88:
            r12 = r0
            goto L8b
        L8a:
            r12 = r1
        L8b:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kk1.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):yads.kk1");
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (lb3.f40466a >= 29 && "video/x-vnd.on2.vp9".equals(this.f40228b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40230d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }
}
