package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Charsets;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f45080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f45081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f45082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f45083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f45084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f45085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f45086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45087h;
    public static final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f45088j;

    static {
        zk1 zk1Var = rk2.f42619e;
        f45080a = Pattern.compile("^\\D?(\\d+)$");
        f45081b = new HashMap();
        f45082c = zk1Var.b();
        f45083d = zk1Var.c();
        f45084e = zk1Var.O();
        f45085f = zk1Var.q();
        f45086g = zk1Var.r();
        f45087h = zk1Var.a();
        i = zk1Var.F();
        f45088j = -1;
    }

    public static String a(nx0 nx0Var) {
        Pair pairB;
        if ("audio/eac3-joc".equals(nx0Var.f41375m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(nx0Var.f41375m) || (pairB = b(nx0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(yads.nx0 r31) {
        /*
            Method dump skipped, instruction units count: 2100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yk1.b(yads.nx0):android.util.Pair");
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] bArrDecode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), Charsets.UTF_8).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134 A[Catch: Exception -> 0x017e, TRY_ENTER, TryCatch #3 {Exception -> 0x017e, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:90:0x0153, B:11:0x0031, B:14:0x003c, B:84:0x012c, B:87:0x0134, B:89:0x013a, B:91:0x015b, B:92:0x017c), top: B:103:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(yads.sk1 r21, yads.uk1 r22) throws yads.tk1 {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yk1.a(yads.sk1, yads.uk1):java.util.ArrayList");
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z5, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z5 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = lb3.f40466a;
        if (i10 < 21) {
            byte[] bArrDecode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            byte[] bArrDecode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = Charsets.UTF_8;
            if (new String(bArrDecode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = lb3.f40467b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(lb3.f40468c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = Charsets.UTF_8;
            if (new String(bArrDecode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = lb3.f40467b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = Charsets.UTF_8;
            if (new String(bArrDecode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = lb3.f40467b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            byte[] bArrDecode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = Charsets.UTF_8;
            if ((new String(bArrDecode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(lb3.f40468c)) {
                String str9 = lb3.f40467b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            byte[] bArrDecode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = Charsets.UTF_8;
            if (new String(bArrDecode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(lb3.f40468c)) {
                String str10 = lb3.f40467b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str11 = lb3.f40467b;
            byte[] bArrDecode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = Charsets.UTF_8;
            if (str11.startsWith(new String(bArrDecode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), Charsets.UTF_8).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(kk1 kk1Var) {
        return kk1Var.f40227a.startsWith(rk2.f42619e.K()) ? 1 : 0;
    }

    public static /* synthetic */ int a(kk1 kk1Var) {
        String str = kk1Var.f40227a;
        zk1 zk1Var = rk2.f42619e;
        if (str.startsWith(zk1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (lb3.f40466a >= 26 || !str.equals(zk1Var.G())) ? 0 : -1;
    }

    public static /* synthetic */ int a(nx0 nx0Var, kk1 kk1Var) {
        try {
            return kk1Var.a(nx0Var) ? 1 : 0;
        } catch (tk1 unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(xk1 xk1Var, Object obj, Object obj2) {
        return xk1Var.a(obj2) - xk1Var.a(obj);
    }

    public static void a(ArrayList arrayList, xk1 xk1Var) {
        Collections.sort(arrayList, new b4.t(3, xk1Var));
    }

    public static synchronized List a(String str, boolean z5, boolean z10) {
        uk1 vk1Var;
        try {
            sk1 sk1Var = new sk1(str, z5, z10);
            HashMap map = f45081b;
            List list = (List) map.get(sk1Var);
            if (list != null) {
                return list;
            }
            int i10 = lb3.f40466a;
            if (i10 >= 21) {
                vk1Var = new wk1(z5, z10);
            } else {
                vk1Var = new vk1();
            }
            ArrayList arrayListA = a(sk1Var, vk1Var);
            if (z5 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListA = a(sk1Var, new vk1());
                if (!arrayListA.isEmpty()) {
                    kh1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((kk1) arrayListA.get(0)).f40227a);
                }
            }
            a(str, arrayListA);
            r51 r51VarA = r51.a((Collection) arrayListA);
            map.put(sk1Var, r51VarA);
            return r51VarA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList a(r51 r51Var, nx0 nx0Var) {
        ArrayList arrayList = new ArrayList(r51Var);
        a(arrayList, new yi.f0(19, nx0Var));
        return arrayList;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f45088j == -1) {
            int iMax = 0;
            List listA = a("video/avc", false, false);
            kk1 kk1Var = listA.isEmpty() ? null : (kk1) listA.get(0);
            if (kk1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = kk1Var.f40230d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, lb3.f40466a >= 21 ? 345600 : 172800);
            }
            f45088j = iMax;
        }
        return f45088j;
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (lb3.f40466a < 26) {
                String str2 = lb3.f40467b;
                zk1 zk1Var = rk2.f42619e;
                if (str2.equals(zk1Var.N()) && arrayList.size() == 1 && ((kk1) arrayList.get(0)).f40227a.equals(zk1Var.G())) {
                    arrayList.add(kk1.a(zk1Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new c1(1));
        }
        int i10 = lb3.f40466a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((kk1) arrayList.get(0)).f40227a;
            zk1 zk1Var2 = rk2.f42619e;
            if (zk1Var2.I().equals(str3) || zk1Var2.H().equals(str3) || zk1Var2.J().equals(str3)) {
                a(arrayList, new c1(2));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (rk2.f42619e.M().equals(((kk1) arrayList.get(0)).f40227a)) {
            arrayList.add((kk1) arrayList.remove(0));
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (lb3.f40466a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(jt1.c(str))) {
            return true;
        }
        String strA = ki.a(mediaCodecInfo.getName());
        if (!strA.startsWith("arc.")) {
            byte[] bArrDecode = Base64.decode("b214Lmdvb2dsZS4=", 0);
            Charset charset = Charsets.UTF_8;
            if (strA.startsWith(new String(bArrDecode, charset)) || strA.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
                return true;
            }
            if ((strA.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && strA.contains(".sw.")) || strA.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
                return true;
            }
            if (!strA.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) && !strA.startsWith("c2.")) {
                return true;
            }
        }
        return false;
    }
}
