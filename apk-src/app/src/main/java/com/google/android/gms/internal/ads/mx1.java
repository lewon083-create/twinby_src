package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f8033a = new HashMap();

    public static synchronized List a(String str, boolean z5, boolean z10) {
        try {
            hx1 hx1Var = new hx1(str, z5, z10);
            HashMap map = f8033a;
            List list = (List) map.get(hx1Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListD = d(hx1Var, new b4.w(z5, z10, str.equals("video/mv-hevc"), 1));
            if (z5) {
                arrayListD.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListD.size() == 1 && ((dx1) arrayListD.get(0)).f4712a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListD.add(dx1.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                Collections.sort(arrayListD, new kx1(bw1.f3937g));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListD.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((dx1) arrayListD.get(0)).f4712a)) {
                arrayListD.add((dx1) arrayListD.remove(0));
            }
            x41 x41VarV = x41.v(arrayListD);
            map.put(hx1Var, x41VarV);
            return x41VarV;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static r51 b(bw1 bw1Var, jx1 jx1Var, boolean z5, boolean z10) {
        Iterable iterableA;
        String str = jx1Var.f6975m;
        bw1Var.getClass();
        List listA = a(str, z5, z10);
        String strC = c(jx1Var);
        if (strC == null) {
            iterableA = r51.f9713f;
        } else {
            bw1Var.getClass();
            iterableA = a(strC, z5, z10);
        }
        v41 v41Var = x41.f12018c;
        u41 u41Var = new u41(4);
        u41Var.b(listA);
        u41Var.b(iterableA);
        return u41Var.f();
    }

    public static String c(jx1 jx1Var) {
        Pair pairB;
        String str = jx1Var.f6975m;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairB = ea0.b(jx1Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110 A[PHI: r18
      0x0110: PHI (r18v3 int) = (r18v2 int), (r18v5 int) binds: [B:66:0x010e, B:94:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(com.google.android.gms.internal.ads.hx1 r21, b4.w r22) throws com.google.android.gms.internal.ads.ix1 {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mx1.d(com.google.android.gms.internal.ads.hx1, b4.w):java.util.ArrayList");
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ra.a(str)) {
            return true;
        }
        String strH = ix.h(mediaCodecInfo.getName());
        if (strH.startsWith("arc.")) {
            return false;
        }
        if (strH.startsWith("omx.google.") || strH.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strH.startsWith("omx.sec.") && strH.contains(".sw.")) || strH.equals("omx.qcom.video.decoder.hevcswvdec") || strH.startsWith("c2.android.") || strH.startsWith("c2.google.")) {
            return true;
        }
        return (strH.startsWith("omx.") || strH.startsWith("c2.")) ? false : true;
    }
}
