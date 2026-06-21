package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 implements z1 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final byte[] f3579k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final byte[] f3580l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final byte[] f3581m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final byte[] f3582n0;
    public static final UUID o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Map f3583p0;
    public long A;
    public final SparseArray B;
    public boolean C;
    public long D;
    public int E;
    public long F;
    public long G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public int[] S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public long Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5 f3584a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3585a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f3586b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f3587b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3588c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f3589c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3590d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f3591d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z6 f3592e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f3593e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk0 f3594f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f3595f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tk0 f3596g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public byte f3597g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tk0 f3598h;
    public boolean h0;
    public final tk0 i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public b2 f3599i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tk0 f3600j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final x4 f3601j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final tk0 f3602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tk0 f3603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tk0 f3604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tk0 f3605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tk0 f3606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f3607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a5 f3615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3616y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3617z;

    static {
        String str = cq0.f4293a;
        f3580l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f3581m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f3582n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        l7.o.q(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        l7.o.q(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f3583p0 = Collections.unmodifiableMap(map);
    }

    public b5() {
        this(new x4(0), 2, z6.A1);
    }

    public static byte[] p(long j10, long j11, String str) {
        ix.o(j10 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j12 = j10 - (((long) i) * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i10);
        long j13 = j12 - (((long) i10) * 60000000);
        int i11 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (((long) i11) * 1000000)) / j11)));
        String str3 = cq0.f4293a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        d8.e0 e0Var = new d8.e0(2, (byte) 0);
        v1 v1Var = (v1) a2Var;
        long j10 = v1Var.f11178d;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        tk0 tk0Var = (tk0) e0Var.f15621d;
        v1Var.R(tk0Var.f10641a, 0, 4, false);
        long jP = tk0Var.P();
        e0Var.f15620c = 4;
        while (true) {
            if (jP != 440786851) {
                int i = (int) j11;
                int i10 = e0Var.f15620c + 1;
                e0Var.f15620c = i10;
                if (i10 == i) {
                    break;
                }
                v1Var.R(tk0Var.f10641a, 0, 1, false);
                jP = ((jP << 8) & (-256)) | ((long) (tk0Var.f10641a[0] & 255));
            } else {
                long jU = e0Var.u(v1Var);
                long j12 = e0Var.f15620c;
                if (jU != Long.MIN_VALUE) {
                    long j13 = j12 + jU;
                    if (j10 == -1 || j13 < j10) {
                        while (true) {
                            long j14 = e0Var.f15620c;
                            if (j14 < j13) {
                                if (e0Var.u(v1Var) != Long.MIN_VALUE) {
                                    long jU2 = e0Var.u(v1Var);
                                    if (jU2 < 0) {
                                        break;
                                    }
                                    if (jU2 != 0) {
                                        int i11 = (int) jU2;
                                        v1Var.b(i11, false);
                                        e0Var.f15620c += i11;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j14 == j13) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        if (this.f3590d) {
            b2Var = new b7(b2Var, this.f3592e);
        }
        this.f3599i0 = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.L = -9223372036854775807L;
        this.N = 0;
        x4 x4Var = this.f3601j0;
        x4Var.f12010c = 0;
        x4Var.f12009b.clear();
        c5 c5Var = (c5) x4Var.f12013f;
        c5Var.f4027b = 0;
        c5Var.f4028c = 0;
        c5 c5Var2 = this.f3584a;
        c5Var2.f4027b = 0;
        c5Var2.f4028c = 0;
        n();
        this.C = false;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1L;
        if (!this.f3616y) {
            this.B.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f3586b;
            if (i >= sparseArray.size()) {
                return;
            }
            x2 x2Var = ((a5) sparseArray.valueAt(i)).V;
            if (x2Var != null) {
                x2Var.f11977b = false;
                x2Var.f11978c = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x05bd, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0608 A[LOOP:1: B:6:0x001a->B:353:0x0608, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0a4f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0b8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0c41 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Type inference failed for: r14v22, types: [com.google.android.gms.internal.ads.v1] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r45, com.google.android.gms.internal.ads.e2 r46) throws com.google.android.gms.internal.ads.eb, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 3830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b5.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final void f() {
        if (!this.f3614w) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f3586b;
            if (i >= sparseArray.size()) {
                b2 b2Var = this.f3599i0;
                b2Var.getClass();
                b2Var.u();
                this.f3614w = false;
                return;
            }
            if (((a5) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g(int i, long j10) throws eb {
        boolean z5;
        if (i == 240) {
            if (this.f3616y) {
                return;
            }
            i(i);
            if (this.G == -1) {
                this.G = j10;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.f3616y) {
                return;
            }
            i(i);
            if (this.F == -1) {
                this.F = j10;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw eb.a(null, sb2.toString());
        }
        if (i == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw eb.a(null, sb3.toString());
        }
        switch (i) {
            case 131:
                int i10 = (int) j10;
                if (i10 == 1) {
                    h(i);
                    this.f3615x.f2754e = 2;
                    return;
                }
                if (i10 == 2) {
                    h(i);
                    this.f3615x.f2754e = 1;
                    return;
                } else if (i10 == 17) {
                    h(i);
                    this.f3615x.f2754e = 3;
                    return;
                } else if (i10 != 33) {
                    h(i);
                    this.f3615x.f2754e = -1;
                    return;
                } else {
                    h(i);
                    this.f3615x.f2754e = 5;
                    return;
                }
            case 136:
                z5 = j10 == 1;
                h(i);
                this.f3615x.Y = z5;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.P = q(j10);
                return;
            case 159:
                h(i);
                this.f3615x.Q = (int) j10;
                return;
            case 176:
                h(i);
                this.f3615x.f2762n = (int) j10;
                return;
            case 179:
                if (this.f3616y) {
                    return;
                }
                i(i);
                this.D = q(j10);
                return;
            case 186:
                h(i);
                this.f3615x.f2763o = (int) j10;
                return;
            case 215:
                h(i);
                this.f3615x.f2753d = (int) j10;
                return;
            case 231:
                this.L = q(j10);
                return;
            case 238:
                this.W = (int) j10;
                return;
            case 247:
                if (this.f3616y) {
                    return;
                }
                i(i);
                this.E = (int) j10;
                return;
            case 251:
                this.X = true;
                return;
            case 16871:
                h(i);
                this.f3615x.f2757h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw eb.a(null, sb4.toString());
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw eb.a(null, sb5.toString());
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw eb.a(null, sb6.toString());
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw eb.a(null, sb7.toString());
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw eb.a(null, sb8.toString());
            case 21420:
                this.A = j10 + this.f3609r;
                return;
            case 21432:
                int i11 = (int) j10;
                h(i);
                if (i11 == 0) {
                    this.f3615x.f2773y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f3615x.f2773y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f3615x.f2773y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f3615x.f2773y = 3;
                    return;
                }
            case 21680:
                h(i);
                this.f3615x.f2765q = (int) j10;
                return;
            case 21682:
                h(i);
                this.f3615x.f2767s = (int) j10;
                return;
            case 21690:
                h(i);
                this.f3615x.f2766r = (int) j10;
                return;
            case 21930:
                z5 = j10 == 1;
                h(i);
                this.f3615x.X = z5;
                return;
            case 21938:
                h(i);
                a5 a5Var = this.f3615x;
                a5Var.f2774z = true;
                a5Var.f2764p = (int) j10;
                return;
            case 21998:
                h(i);
                this.f3615x.f2756g = (int) j10;
                return;
            case 22186:
                h(i);
                this.f3615x.T = j10;
                return;
            case 22203:
                h(i);
                this.f3615x.U = j10;
                return;
            case 25188:
                h(i);
                this.f3615x.R = (int) j10;
                return;
            case 30114:
                this.Y = j10;
                return;
            case 30321:
                int i12 = (int) j10;
                h(i);
                if (i12 == 0) {
                    this.f3615x.f2768t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f3615x.f2768t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f3615x.f2768t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f3615x.f2768t = 3;
                    return;
                }
            case 2352003:
                h(i);
                this.f3615x.f2755f = (int) j10;
                return;
            case 2807729:
                this.f3610s = j10;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i13 = (int) j10;
                        h(i);
                        if (i13 == 1) {
                            this.f3615x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f3615x.C = 1;
                            return;
                        }
                    case 21946:
                        h(i);
                        int iC = rm1.c((int) j10);
                        if (iC != -1) {
                            this.f3615x.B = iC;
                            return;
                        }
                        return;
                    case 21947:
                        h(i);
                        this.f3615x.f2774z = true;
                        int iB = rm1.b((int) j10);
                        if (iB != -1) {
                            this.f3615x.A = iB;
                            return;
                        }
                        return;
                    case 21948:
                        h(i);
                        this.f3615x.D = (int) j10;
                        return;
                    case 21949:
                        h(i);
                        this.f3615x.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void h(int i) throws eb {
        if (this.f3615x != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 32);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in a TrackEntry");
        throw eb.a(null, sb2.toString());
    }

    public final void i(int i) throws eb {
        if (this.C) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 26);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in a Cues");
        throw eb.a(null, sb2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = p(r11, 10000, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.internal.ads.a5 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b5.k(com.google.android.gms.internal.ads.a5, long, int, int, int):void");
    }

    public final void l(a2 a2Var, int i) {
        tk0 tk0Var = this.f3598h;
        if (tk0Var.f10643c >= i) {
            return;
        }
        byte[] bArr = tk0Var.f10641a;
        if (bArr.length < i) {
            int length = bArr.length;
            tk0Var.A(Math.max(length + length, i));
        }
        byte[] bArr2 = tk0Var.f10641a;
        int i10 = tk0Var.f10643c;
        a2Var.w(bArr2, i10, i - i10);
        tk0Var.C(i);
    }

    public final int m(a2 a2Var, a5 a5Var, int i, boolean z5) throws eb {
        int iF;
        int iF2;
        int i10;
        String str = a5Var.f2751c;
        if ("S_TEXT/UTF8".equals(str)) {
            o(a2Var, f3579k0, i);
            int i11 = this.f3585a0;
            n();
            return i11;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            o(a2Var, f3581m0, i);
            int i12 = this.f3585a0;
            n();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            o(a2Var, f3582n0, i);
            int i13 = this.f3585a0;
            n();
            return i13;
        }
        if (a5Var.W) {
            a5Var.f2750b0.getClass();
            tk0 tk0Var = new tk0(i);
            if (a2Var.R(tk0Var.f10641a, 0, i, true)) {
                a2Var.e();
                if (pn1.a(tk0Var.J()) == 1 && tk0Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    tk0Var.H(bArr, 0, 10);
                    tk0Var.E(0);
                    int iR = pn1.r(bArr);
                    if (tk0Var.B() >= iR + 4) {
                        tk0Var.G(iR);
                        if (pn1.a(tk0Var.b()) == 2) {
                            jx1 jx1Var = a5Var.f2750b0;
                            jx1Var.getClass();
                            ow1 ow1Var = new ow1(jx1Var);
                            ow1Var.e("audio/vnd.dts.hd");
                            a5Var.f2750b0 = new jx1(ow1Var);
                        }
                    }
                }
            }
            a5Var.f2748a0.e(a5Var.f2750b0);
            a5Var.W = false;
            f();
        }
        w2 w2Var = a5Var.f2748a0;
        boolean z10 = this.f3589c0;
        tk0 tk0Var2 = this.f3602k;
        if (!z10) {
            boolean z11 = a5Var.i;
            tk0 tk0Var3 = this.f3598h;
            if (z11) {
                this.V &= -1073741825;
                if (!this.f3591d0) {
                    a2Var.w(tk0Var3.f10641a, 0, 1);
                    this.Z++;
                    byte b2 = tk0Var3.f10641a[0];
                    if ((b2 & 128) == 128) {
                        throw eb.a(null, "Extension bit is set in signal byte");
                    }
                    this.f3597g0 = b2;
                    this.f3591d0 = true;
                }
                byte b10 = this.f3597g0;
                if ((b10 & 1) == 1) {
                    int i14 = b10 & 2;
                    this.V |= 1073741824;
                    if (!this.h0) {
                        tk0 tk0Var4 = this.f3604m;
                        a2Var.w(tk0Var4.f10641a, 0, 8);
                        this.Z += 8;
                        this.h0 = true;
                        tk0Var3.f10641a[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                        tk0Var3.E(0);
                        w2Var.b(tk0Var3, 1, 1);
                        this.f3585a0++;
                        tk0Var4.E(0);
                        w2Var.b(tk0Var4, 8, 1);
                        this.f3585a0 += 8;
                    }
                    if (i14 == 2) {
                        if (!this.f3593e0) {
                            a2Var.w(tk0Var3.f10641a, 0, 1);
                            this.Z++;
                            tk0Var3.E(0);
                            this.f3595f0 = tk0Var3.K();
                            this.f3593e0 = true;
                        }
                        int i15 = this.f3595f0 * 4;
                        tk0Var3.y(i15);
                        a2Var.w(tk0Var3.f10641a, 0, i15);
                        this.Z += i15;
                        int i16 = (this.f3595f0 >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.f3607p;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f3607p = ByteBuffer.allocate(i17);
                        }
                        this.f3607p.position(0);
                        this.f3607p.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i10 = this.f3595f0;
                            if (i18 >= i10) {
                                break;
                            }
                            int iH = tk0Var3.h();
                            int i20 = iH - i19;
                            if (i18 % 2 == 0) {
                                this.f3607p.putShort((short) i20);
                            } else {
                                this.f3607p.putInt(i20);
                            }
                            i18++;
                            i19 = iH;
                        }
                        int i21 = (i - this.Z) - i19;
                        if ((i10 & 1) == 1) {
                            this.f3607p.putInt(i21);
                        } else {
                            this.f3607p.putShort((short) i21);
                            this.f3607p.putInt(0);
                        }
                        byte[] bArrArray = this.f3607p.array();
                        tk0 tk0Var5 = this.f3605n;
                        tk0Var5.z(i17, bArrArray);
                        w2Var.b(tk0Var5, i17, 1);
                        this.f3585a0 += i17;
                    }
                }
            } else {
                byte[] bArr2 = a5Var.f2758j;
                if (bArr2 != null) {
                    tk0Var2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(a5Var.f2751c) ? a5Var.f2756g > 0 : z5) {
                this.V |= 268435456;
                this.f3606o.y(0);
                int i22 = (tk0Var2.f10643c + i) - this.Z;
                tk0Var3.y(4);
                byte[] bArr3 = tk0Var3.f10641a;
                bArr3[0] = (byte) ((i22 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[1] = (byte) ((i22 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[2] = (byte) ((i22 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i22 & KotlinVersion.MAX_COMPONENT_VALUE);
                w2Var.b(tk0Var3, 4, 2);
                this.f3585a0 += 4;
            }
            this.f3589c0 = true;
        }
        int i23 = i + tk0Var2.f10643c;
        String str2 = a5Var.f2751c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (a5Var.V != null) {
                ix.k0(tk0Var2.f10643c == 0);
                a5Var.V.d(a2Var);
            }
            while (true) {
                int i24 = this.Z;
                if (i24 >= i23) {
                    break;
                }
                int i25 = i23 - i24;
                int iB = tk0Var2.B();
                if (iB > 0) {
                    iF2 = Math.min(i25, iB);
                    w2Var.a(iF2, tk0Var2);
                } else {
                    iF2 = w2Var.f(a2Var, i25, false);
                }
                this.Z += iF2;
                this.f3585a0 += iF2;
            }
        } else {
            tk0 tk0Var6 = this.f3596g;
            byte[] bArr4 = tk0Var6.f10641a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = a5Var.f2752c0;
            int i27 = 4 - i26;
            while (this.Z < i23) {
                int i28 = this.f3587b0;
                if (i28 == 0) {
                    int iMin = Math.min(i26, tk0Var2.B());
                    a2Var.w(bArr4, i27 + iMin, i26 - iMin);
                    if (iMin > 0) {
                        tk0Var2.H(bArr4, i27, iMin);
                    }
                    this.Z += i26;
                    tk0Var6.E(0);
                    this.f3587b0 = tk0Var6.h();
                    tk0 tk0Var7 = this.f3594f;
                    tk0Var7.E(0);
                    w2Var.a(4, tk0Var7);
                    this.f3585a0 += 4;
                } else {
                    int iB2 = tk0Var2.B();
                    if (iB2 > 0) {
                        iF = Math.min(i28, iB2);
                        w2Var.a(iF, tk0Var2);
                    } else {
                        iF = w2Var.f(a2Var, i28, false);
                    }
                    this.Z += iF;
                    this.f3585a0 += iF;
                    this.f3587b0 -= iF;
                }
            }
        }
        if ("A_VORBIS".equals(a5Var.f2751c)) {
            tk0 tk0Var8 = this.i;
            tk0Var8.E(0);
            w2Var.a(4, tk0Var8);
            this.f3585a0 += 4;
        }
        int i29 = this.f3585a0;
        n();
        return i29;
    }

    public final void n() {
        this.Z = 0;
        this.f3585a0 = 0;
        this.f3587b0 = 0;
        this.f3589c0 = false;
        this.f3591d0 = false;
        this.f3593e0 = false;
        this.f3595f0 = 0;
        this.f3597g0 = (byte) 0;
        this.h0 = false;
        this.f3602k.y(0);
    }

    public final void o(a2 a2Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i10 = length + i;
        tk0 tk0Var = this.f3603l;
        byte[] bArr2 = tk0Var.f10641a;
        if (bArr2.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10 + i);
            tk0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        a2Var.w(tk0Var.f10641a, length, i);
        tk0Var.E(0);
        tk0Var.C(i10);
    }

    public final long q(long j10) throws eb {
        long j11 = this.f3610s;
        if (j11 != -9223372036854775807L) {
            return cq0.u(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw eb.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public b5(x4 x4Var, int i, z6 z6Var) {
        this.f3609r = -1L;
        this.f3610s = -9223372036854775807L;
        this.f3611t = -9223372036854775807L;
        this.f3612u = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1L;
        this.H = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -9223372036854775807L;
        this.f3601j0 = x4Var;
        x4Var.f12014g = new cf(2, this);
        this.f3592e = z6Var;
        this.B = new SparseArray();
        this.f3588c = true;
        this.f3590d = (i & 2) == 0;
        this.f3584a = new c5(0);
        this.f3586b = new SparseArray();
        this.f3598h = new tk0(4);
        this.i = new tk0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3600j = new tk0(4);
        this.f3594f = new tk0(rs.f10056z);
        this.f3596g = new tk0(4);
        this.f3602k = new tk0();
        this.f3603l = new tk0();
        this.f3604m = new tk0(8);
        this.f3605n = new tk0();
        this.f3606o = new tk0();
        this.S = new int[1];
        this.f3614w = true;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
