package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c80 implements d2 {
    public static final ih A;
    public static final ih B;
    public static final jo0 L;
    public static final jo0 M;
    public static final /* synthetic */ int O = 0;
    public static final /* synthetic */ int P = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4073c = {2002, 2000, 1920, 1601, 1600, 1001, 1000, VKApiCodes.CODE_CALL_REQUIRES_AUTH, VKApiCodes.CODE_VIDEO_ALREADY_ADDED, VKApiCodes.CODE_VIDEO_ALREADY_ADDED, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4074d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ya f4075e = new ya("gads:afs:csa:experiment_id", "", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ya f4076f = new ya("gads:app_index:experiment_id", "", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ya f4077g = new ya("gads:block_autoclicks_experiment_id", "", 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ya f4078h = new ya("gads:sdk_core_experiment_id", "", 4);
    public static final ya i = new ya("gads:spam_app_context:experiment_id", "", 4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ya f4079j = new ya("gads:temporary_experiment_id:1", "", 4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ya f4080k = new ya("gads:temporary_experiment_id:10", "", 4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ya f4081l = new ya("gads:temporary_experiment_id:11", "", 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ya f4082m = new ya("gads:temporary_experiment_id:12", "", 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ya f4083n = new ya("gads:temporary_experiment_id:13", "", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ya f4084o = new ya("gads:temporary_experiment_id:14", "", 4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ya f4085p = new ya("gads:temporary_experiment_id:15", "", 4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ya f4086q = new ya("gads:temporary_experiment_id:2", "", 4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ya f4087r = new ya("gads:temporary_experiment_id:3", "", 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ya f4088s = new ya("gads:temporary_experiment_id:4", "", 4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ya f4089t = new ya("gads:temporary_experiment_id:5", "", 4);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ya f4090u = new ya("gads:temporary_experiment_id:6", "", 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ya f4091v = new ya("gads:temporary_experiment_id:7", "", 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ya f4092w = new ya("gads:temporary_experiment_id:8", "", 4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ya f4093x = new ya("gads:temporary_experiment_id:9", "", 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ya f4094y = new ya("gads:corewebview:experiment_id", "", 4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ih f4095z = new ih(1);
    public static final ih C = new ih(29);
    public static final q90 D = new q90(7);
    public static final q90 E = new q90(12);
    public static final q90 F = new q90(16);
    public static final q90 G = new q90(20);
    public static final q90 H = new q90(24);
    public static final jo0 I = new jo0(2);
    public static final jo0 J = new jo0(6);
    public static final jo0 K = new jo0(10);
    public static final String[] N = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i10 = 13;
        A = new ih(i10);
        int i11 = 17;
        B = new ih(i11);
        L = new jo0(i10);
        M = new jo0(i11);
    }

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static y7 c(y7 y7Var, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (y7Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (y7) map.get(strArr[0]);
            }
            if (length2 > 1) {
                y7 y7Var2 = new y7();
                while (i10 < length2) {
                    y7Var2.c((y7) map.get(strArr[i10]));
                    i10++;
                }
                return y7Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                y7Var.c((y7) map.get(strArr[0]));
                return y7Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    y7Var.c((y7) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return y7Var;
    }

    public static String d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z5 = false;
        while (it.hasNext()) {
            String str2 = ((j6) it.next()).f6726a.f5670g.f6975m;
            if (ra.b(str2)) {
                return "video/mp4";
            }
            if (ra.a(str2)) {
                z5 = true;
            } else if (ra.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z5 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static Provider e() {
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(N[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static synchronized Executor f() {
        try {
            if (f4072b == null) {
                String str = cq0.f4293a;
                f4072b = Executors.newSingleThreadExecutor(new ew("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4072b;
    }

    public static void g(el elVar, cl clVar, String... strArr) {
        if (clVar == null) {
            return;
        }
        p9.k.C.f31304k.getClass();
        elVar.a(clVar, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean i(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long j(tk0 tk0Var, int i10, int i11) {
        tk0Var.E(i10);
        if (tk0Var.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = tk0Var.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i11 || (iB & 32) == 0 || tk0Var.K() < 7 || tk0Var.B() < 7 || (tk0Var.K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        tk0Var.H(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.j0 k(com.google.android.gms.internal.ads.ik0 r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.h(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.h(r1)
            boolean r2 = r10.g()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.h(r2)
            boolean r5 = r10.g()
            if (r5 == 0) goto L47
            int r5 = r10.h(r4)
            if (r5 <= 0) goto L47
            r10.f(r1)
        L47:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.h(r3)
            int[] r9 = com.google.android.gms.internal.ads.c80.f4073c
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            com.google.android.gms.internal.ads.j0 r1 = new com.google.android.gms.internal.ads.j0
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c80.k(com.google.android.gms.internal.ads.ik0):com.google.android.gms.internal.ads.j0");
    }

    public static void l(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        sh shVar = new sh(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((sh) priorityQueue.peek()).f10292c <= i11 && ((sh) priorityQueue.peek()).f10290a <= j10)) && !priorityQueue.contains(shVar)) {
            priorityQueue.add(shVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t2 m(a2 a2Var, boolean z5, boolean z10) {
        t2 t2Var;
        long j10;
        tk0 tk0Var;
        int i10;
        int i11;
        long j11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        long jR = a2Var.r();
        long j12 = -1;
        long j13 = 4096;
        if (jR != -1 && jR <= 4096) {
            j13 = jR;
        }
        tk0 tk0Var2 = new tk0(64);
        int i16 = (int) j13;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i16) {
            tk0Var2.y(8);
            if (!a2Var.R(tk0Var2.f10641a, i17, 8, true)) {
                break;
            }
            long jP = tk0Var2.P();
            int iB = tk0Var2.b();
            if (jP == 1) {
                j10 = j12;
                a2Var.E(tk0Var2.f10641a, 8, 8);
                i10 = 16;
                tk0Var2.C(16);
                jP = tk0Var2.d();
                tk0Var = tk0Var2;
            } else {
                j10 = j12;
                if (jP == 0) {
                    long jR2 = a2Var.r();
                    if (jR2 != j10) {
                        jP = (jR2 - a2Var.p()) + 8;
                    }
                }
                tk0Var = tk0Var2;
                i10 = 8;
            }
            long j14 = jP;
            long j15 = i10;
            if (j14 < j15) {
                t2Var = null;
                if (iB != 1718773093) {
                    i15 = iB;
                } else if (i10 == 8) {
                    iB = 1718773093;
                    i11 = 1;
                    j11 = 8;
                } else {
                    i15 = 1718773093;
                }
                return new k5(i15, i10, j14, 0);
            }
            t2Var = null;
            i11 = 1;
            j11 = j14;
            i18 += i10;
            if (iB == 1836019574) {
                i16 += (int) j11;
                if (jR != -1 && i16 > jR) {
                    i16 = (int) jR;
                }
                tk0Var2 = tk0Var;
                j12 = j10;
                i17 = 0;
            } else {
                if (iB != 1953653099 && iB != 1835297121 && iB != 1835626086) {
                    if (iB == 1836019558) {
                        i17 = 1;
                        break;
                    }
                    if (iB == 1836475768) {
                        i17 = i11;
                        break;
                    }
                    i19 |= (iB == 1835295092 ? 0 : i11) ^ i11;
                    if (iB != 1937007212) {
                        i13 = iB;
                    } else {
                        if (j11 > 1000000) {
                            i17 = 0;
                            break;
                        }
                        i13 = 1937007212;
                    }
                    tk0 tk0Var3 = tk0Var;
                    if ((((long) i18) + j11) - j15 >= i16) {
                        i17 = 0;
                        break;
                    }
                    int i20 = (int) (j11 - j15);
                    i18 += i20;
                    int i21 = 1718909296;
                    if (i13 == 1718909296) {
                        int i22 = 8;
                        if (i20 < 8) {
                            return new k5(i21, i22, i20, 0);
                        }
                        tk0Var = tk0Var3;
                        tk0Var.y(i20);
                        i12 = 0;
                        a2Var.E(tk0Var.f10641a, 0, i20);
                        int iB2 = tk0Var.b();
                        int i23 = (s(iB2, z10) ? 1 : 0) | i19;
                        tk0Var.G(4);
                        int iB3 = tk0Var.B() / 4;
                        if (i23 == 0 && iB3 > 0) {
                            int[] iArr2 = new int[iB3];
                            int i24 = 0;
                            while (true) {
                                if (i24 >= iB3) {
                                    i14 = i23;
                                    iArr = iArr2;
                                    break;
                                }
                                int iB4 = tk0Var.b();
                                iArr2[i24] = iB4;
                                if (s(iB4, z10)) {
                                    iArr = iArr2;
                                    i14 = 1;
                                    break;
                                }
                                i24++;
                            }
                        } else {
                            i14 = i23;
                            iArr = t2Var;
                        }
                        if (i14 == 0) {
                            return new d8.e0(iB2, 3, iArr);
                        }
                        i19 = i14;
                    } else {
                        tk0Var = tk0Var3;
                        i12 = 0;
                        if (i20 != 0) {
                            a2Var.v(i20);
                        }
                    }
                } else {
                    i12 = 0;
                }
                i17 = i12;
                tk0Var2 = tk0Var;
                j12 = j10;
            }
        }
        t2Var = null;
        return i19 == 0 ? c6.f4043c : z5 != i17 ? i17 != 0 ? y5.f12496d : y5.f12497e : t2Var;
    }

    public static ut n(tk0 tk0Var) {
        tk0Var.G(1);
        int iO = tk0Var.O();
        long j10 = tk0Var.f10642b;
        long j11 = iO;
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jD = tk0Var.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jD;
            jArrCopyOf2[i11] = tk0Var.d();
            tk0Var.G(2);
            i11++;
        }
        tk0Var.G((int) ((j10 + j11) - ((long) tk0Var.f10642b)));
        return new ut(2, jArrCopyOf, jArrCopyOf2);
    }

    public static String o(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            u9.i.e("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static void p(int i10, tk0 tk0Var) {
        tk0Var.y(7);
        byte[] bArr = tk0Var.f10641a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static long q(int i10, long j10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return (i10 & 1) == 0 ? q(i11, j11) % 1073807359 : ((q(i11, j11) % 1073807359) * j10) % 1073807359;
    }

    public static void r(ik0 ik0Var, m1 m1Var) throws eb {
        int iH = ik0Var.h(5);
        ik0Var.f(2);
        if (ik0Var.g()) {
            ik0Var.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            ik0Var.e();
        }
        if (ik0Var.g()) {
            int iH2 = ik0Var.h(3);
            if (m1Var.f7712b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                m1Var.f7712b = iH;
            }
            if (ik0Var.g()) {
                w(ik0Var);
            }
        }
    }

    public static boolean s(int i10, boolean z5) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z5) {
                return true;
            }
            i10 = 1751476579;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f4074d[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static long t(int i10, String[] strArr) {
        long jA = (((long) nz.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jA = (((((long) nz.a(strArr[i11])) + 2147483647L) % 1073807359) + ((jA * 16785407) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static Pair u(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        x(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i11 = -1;
        } else {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, 65535);
            for (int i13 = 0; i13 < iMin; i13++) {
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
            i11 = -1;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    public static void v(ik0 ik0Var, m1 m1Var) throws eb {
        ik0Var.f(2);
        boolean zG = ik0Var.g();
        int iH = ik0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            ik0Var.f(2);
            if (ik0Var.g()) {
                ik0Var.f(5);
            }
            if (zG) {
                ik0Var.f(24);
            } else {
                if (ik0Var.g()) {
                    if (!ik0Var.g()) {
                        ik0Var.f(4);
                    }
                    m1Var.f7713c = ik0Var.h(6) + 1;
                }
                ik0Var.f(4);
            }
        }
        if (ik0Var.g()) {
            ik0Var.f(3);
            if (ik0Var.g()) {
                w(ik0Var);
            }
        }
    }

    public static void w(ik0 ik0Var) throws eb {
        int iH = ik0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw eb.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        ik0Var.f(iH * 8);
    }

    public static void x(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
