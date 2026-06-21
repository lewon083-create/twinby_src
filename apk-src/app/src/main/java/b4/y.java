package b4;

import ad.b1;
import ad.g0;
import ad.j0;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.internal.measurement.j4;
import j3.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f1966a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((p) arrayList.get(0)).f1907a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(p.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new t(0, new k()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((p) arrayList.get(0)).f1907a)) {
            return;
        }
        arrayList.add((p) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String c(j3.o oVar) {
        Pair pairC;
        String str = oVar.f26335n;
        String str2 = oVar.f26335n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairC = m3.d.c(oVar)) != null) {
            int iIntValue = ((Integer) pairC.first).intValue();
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
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z5, boolean z10) {
        try {
            u uVar = new u(str, z5, z10);
            HashMap map = f1966a;
            List list = (List) map.get(uVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(uVar, new w(z5, z10, str.equals("video/mv-hevc"), 0));
            if (z5) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            j0 j0VarR = j0.r(arrayListF);
            map.put(uVar, j0VarR);
            return j0VarR;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(b4.u r20, b4.w r21) throws b4.v {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.y.f(b4.u, b4.w):java.util.ArrayList");
    }

    public static b1 g(k kVar, j3.o oVar, boolean z5, boolean z10) {
        List listA = kVar.a(oVar.f26335n, z5, z10);
        String strC = c(oVar);
        List listA2 = strC == null ? b1.f768f : kVar.a(strC, z5, z10);
        g0 g0VarQ = j0.q();
        g0VarQ.d(listA);
        g0VarQ.d(listA2);
        return g0VarQ.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (c0.i(str)) {
            return true;
        }
        String strX = j4.x(mediaCodecInfo.getName());
        if (strX.startsWith("arc.")) {
            return false;
        }
        if (strX.startsWith("omx.google.") || strX.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strX.startsWith("omx.sec.") && strX.contains(".sw.")) || strX.equals("omx.qcom.video.decoder.hevcswvdec") || strX.startsWith("c2.android.") || strX.startsWith("c2.google.")) {
            return true;
        }
        return (strX.startsWith("omx.") || strX.startsWith("c2.")) ? false : true;
    }
}
