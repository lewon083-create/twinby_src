package i5;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.x2;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import j3.c0;
import j3.d0;
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
import l7.o;
import m3.p;
import m3.z;
import n3.n;
import q4.a0;
import q4.h;
import q4.k;
import q4.l;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final byte[] f21118k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final byte[] f21119l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final byte[] f21120m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final byte[] f21121n0;
    public static final UUID o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Map f21122p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4 f21123a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f21124a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f21125b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f21126b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f21127c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f21128c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21129d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f21130d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21131e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f21132e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n5.k f21133f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f21134f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f21135g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f21136g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f21137h;
    public byte h0;
    public final p i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f21138i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f21139j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public m f21140j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f21141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f21142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f21143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f21144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f21145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f21146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f21147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f21151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f21155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21156z;

    static {
        String str = z.f28608a;
        f21119l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f21120m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f21121n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        o.q(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        o.q(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f21122p0 = Collections.unmodifiableMap(map);
    }

    public e(n5.k kVar, int i) {
        x4 x4Var = new x4(1);
        this.f21149s = -1L;
        this.f21150t = -9223372036854775807L;
        this.f21151u = -9223372036854775807L;
        this.f21152v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f21123a = x4Var;
        x4Var.f12014g = new fe.c(22, this);
        this.f21133f = kVar;
        this.C = new SparseArray();
        this.f21129d = (i & 1) == 0;
        this.f21131e = (i & 2) == 0;
        this.f21125b = new f();
        this.f21127c = new SparseArray();
        this.i = new p(4);
        this.f21139j = new p(ByteBuffer.allocate(4).putInt(-1).array());
        this.f21141k = new p(4);
        this.f21135g = new p(n.f29087a);
        this.f21137h = new p(4);
        this.f21142l = new p();
        this.f21143m = new p();
        this.f21144n = new p(8);
        this.f21145o = new p();
        this.f21146p = new p();
        this.T = new int[1];
        this.f21154x = true;
    }

    public static byte[] h(long j10, long j11, String str) {
        h5.h(j10 != -9223372036854775807L);
        int i = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i) * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i10) * 60000000);
        int i11 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (((long) i11) * 1000000)) / j11)));
        String str3 = z.f28608a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0d2f, code lost:
    
        r5 = true;
        r1 = r1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x0f5e, code lost:
    
        if (r5 == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0f60, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f68, code lost:
    
        if (r0.J == false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0f6a, code lost:
    
        r0.L = r2;
        r45.f4793b = r0.K;
        r0.J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0f76, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0f77, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0f7d, code lost:
    
        if (r0.f21156z == false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0f7f, code lost:
    
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0f83, code lost:
    
        if (r6 == (-1)) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0f85, code lost:
    
        r45.f4793b = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0f8b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0f8c, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0f92, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x0f92, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Type inference failed for: r0v5, types: [fe.c] */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v12, types: [q4.l] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4, types: [q4.l] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.x4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [i5.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r44, com.google.android.gms.internal.ads.e2 r45) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 4890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        if (this.f21131e) {
            mVar = new b7(mVar, this.f21133f);
        }
        this.f21140j0 = mVar;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        e0 e0Var = new e0(12, (byte) 0);
        p pVar = (p) e0Var.f15621d;
        h hVar = (h) lVar;
        long j10 = hVar.f31738d;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i = (int) j11;
        hVar.y(pVar.f28589a, 0, 4, false);
        long jB = pVar.B();
        e0Var.f15620c = 4;
        while (true) {
            if (jB != 440786851) {
                int i10 = e0Var.f15620c + 1;
                e0Var.f15620c = i10;
                if (i10 == i) {
                    break;
                }
                hVar.y(pVar.f28589a, 0, 1, false);
                jB = ((jB << 8) & (-256)) | ((long) (pVar.f28589a[0] & 255));
            } else {
                long jL = e0Var.l(hVar);
                long j12 = e0Var.f15620c;
                if (jL != Long.MIN_VALUE && (j10 == -1 || j12 + jL < j10)) {
                    while (true) {
                        long j13 = e0Var.f15620c;
                        long j14 = j12 + jL;
                        if (j13 < j14) {
                            if (e0Var.l(hVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jL2 = e0Var.l(hVar);
                            if (jL2 < 0 || jL2 > 2147483647L) {
                                break;
                            }
                            if (jL2 != 0) {
                                int i11 = (int) jL2;
                                hVar.a(i11, false);
                                e0Var.f15620c += i11;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e(int i) {
        if (this.D) {
            return;
        }
        throw d0.a(null, "Element " + i + " must be in a Cues");
    }

    public final void f(int i) {
        if (this.f21155y != null) {
            return;
        }
        throw d0.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(i5.d r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.g(i5.d, long, int, int, int):void");
    }

    public final void i() {
        if (!this.f21154x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f21127c;
            if (i >= sparseArray.size()) {
                m mVar = this.f21140j0;
                mVar.getClass();
                mVar.G();
                this.f21154x = false;
                return;
            }
            if (((d) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void j(l lVar, int i) {
        p pVar = this.i;
        if (pVar.f28591c >= i) {
            return;
        }
        byte[] bArr = pVar.f28589a;
        if (bArr.length < i) {
            pVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = pVar.f28589a;
        int i10 = pVar.f28591c;
        lVar.readFully(bArr2, i10, i - i10);
        pVar.L(i);
    }

    public final void k() {
        this.f21124a0 = 0;
        this.f21126b0 = 0;
        this.f21128c0 = 0;
        this.f21130d0 = false;
        this.f21132e0 = false;
        this.f21134f0 = false;
        this.f21136g0 = 0;
        this.h0 = (byte) 0;
        this.f21138i0 = false;
        this.f21142l.J(0);
    }

    public final long l(long j10) throws d0 {
        long j11 = this.f21150t;
        if (j11 == -9223372036854775807L) {
            throw d0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = z.f28608a;
        return z.U(j10, j11, 1000L, RoundingMode.DOWN);
    }

    public final int m(l lVar, d dVar, int i, boolean z5) throws d0 {
        int iC;
        int iC2;
        int i10;
        if ("S_TEXT/UTF8".equals(dVar.f21094c)) {
            n(lVar, f21118k0, i);
            int i11 = this.f21126b0;
            k();
            return i11;
        }
        if ("S_TEXT/ASS".equals(dVar.f21094c) || "S_TEXT/SSA".equals(dVar.f21094c)) {
            n(lVar, f21120m0, i);
            int i12 = this.f21126b0;
            k();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(dVar.f21094c)) {
            n(lVar, f21121n0, i);
            int i13 = this.f21126b0;
            k();
            return i13;
        }
        if (dVar.W) {
            dVar.f21093b0.getClass();
            p pVar = new p(i);
            if (lVar.y(pVar.f28589a, 0, i, true)) {
                lVar.L();
                if (q4.b.l(pVar.i()) == 1 && pVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    pVar.k(bArr, 0, 10);
                    pVar.M(0);
                    int iJ = q4.b.j(bArr);
                    if (iJ > 0 && pVar.a() >= iJ + 4) {
                        pVar.N(iJ);
                        if (q4.b.l(pVar.m()) == 2) {
                            j3.n nVarA = dVar.f21093b0.a();
                            nVarA.f26292m = c0.n("audio/vnd.dts.hd");
                            dVar.f21093b0 = new j3.o(nVarA);
                        }
                    }
                }
            }
            dVar.f21091a0.a(dVar.f21093b0);
            dVar.W = false;
            i();
        }
        a0 a0Var = dVar.f21091a0;
        boolean z10 = this.f21130d0;
        p pVar2 = this.f21142l;
        if (!z10) {
            boolean z11 = dVar.i;
            p pVar3 = this.i;
            if (z11) {
                this.W &= -1073741825;
                if (!this.f21132e0) {
                    lVar.readFully(pVar3.f28589a, 0, 1);
                    this.f21124a0++;
                    byte b2 = pVar3.f28589a[0];
                    if ((b2 & 128) == 128) {
                        throw d0.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b2;
                    this.f21132e0 = true;
                }
                byte b10 = this.h0;
                if ((b10 & 1) == 1) {
                    boolean z12 = (b10 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.f21138i0) {
                        p pVar4 = this.f21144n;
                        lVar.readFully(pVar4.f28589a, 0, 8);
                        this.f21124a0 += 8;
                        this.f21138i0 = true;
                        pVar3.f28589a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        pVar3.M(0);
                        a0Var.e(pVar3, 1, 1);
                        this.f21126b0++;
                        pVar4.M(0);
                        a0Var.e(pVar4, 8, 1);
                        this.f21126b0 += 8;
                    }
                    if (z12) {
                        if (!this.f21134f0) {
                            lVar.readFully(pVar3.f28589a, 0, 1);
                            this.f21124a0++;
                            pVar3.M(0);
                            this.f21136g0 = pVar3.z();
                            this.f21134f0 = true;
                        }
                        int i14 = this.f21136g0 * 4;
                        pVar3.J(i14);
                        lVar.readFully(pVar3.f28589a, 0, i14);
                        this.f21124a0 += i14;
                        short s10 = (short) ((this.f21136g0 / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f21147q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f21147q = ByteBuffer.allocate(i15);
                        }
                        this.f21147q.position(0);
                        this.f21147q.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.f21136g0;
                            if (i16 >= i10) {
                                break;
                            }
                            int iD = pVar3.D();
                            if (i16 % 2 == 0) {
                                this.f21147q.putShort((short) (iD - i17));
                            } else {
                                this.f21147q.putInt(iD - i17);
                            }
                            i16++;
                            i17 = iD;
                        }
                        int i18 = (i - this.f21124a0) - i17;
                        if (i10 % 2 == 1) {
                            this.f21147q.putInt(i18);
                        } else {
                            this.f21147q.putShort((short) i18);
                            this.f21147q.putInt(0);
                        }
                        byte[] bArrArray = this.f21147q.array();
                        p pVar5 = this.f21145o;
                        pVar5.K(i15, bArrArray);
                        a0Var.e(pVar5, i15, 1);
                        this.f21126b0 += i15;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f21101j;
                if (bArr2 != null) {
                    pVar2.K(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(dVar.f21094c) ? z5 : dVar.f21099g > 0) {
                this.W |= 268435456;
                this.f21146p.J(0);
                int i19 = (pVar2.f28591c + i) - this.f21124a0;
                pVar3.J(4);
                byte[] bArr3 = pVar3.f28589a;
                bArr3[0] = (byte) ((i19 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[1] = (byte) ((i19 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[2] = (byte) ((i19 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i19 & KotlinVersion.MAX_COMPONENT_VALUE);
                a0Var.e(pVar3, 4, 2);
                this.f21126b0 += 4;
            }
            this.f21130d0 = true;
        }
        int i20 = i + pVar2.f28591c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f21094c) && !"V_MPEGH/ISO/HEVC".equals(dVar.f21094c)) {
            if (dVar.V != null) {
                h5.r(pVar2.f28591c == 0);
                dVar.V.c(lVar);
            }
            while (true) {
                int i21 = this.f21124a0;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int iA = pVar2.a();
                if (iA > 0) {
                    iC2 = Math.min(i22, iA);
                    a0Var.d(iC2, pVar2);
                } else {
                    iC2 = a0Var.c(lVar, i22, false);
                }
                this.f21124a0 += iC2;
                this.f21126b0 += iC2;
            }
        } else {
            p pVar6 = this.f21137h;
            byte[] bArr4 = pVar6.f28589a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i23 = dVar.f21095c0;
            int i24 = 4 - i23;
            while (this.f21124a0 < i20) {
                int i25 = this.f21128c0;
                if (i25 == 0) {
                    int iMin = Math.min(i23, pVar2.a());
                    lVar.readFully(bArr4, i24 + iMin, i23 - iMin);
                    if (iMin > 0) {
                        pVar2.k(bArr4, i24, iMin);
                    }
                    this.f21124a0 += i23;
                    pVar6.M(0);
                    this.f21128c0 = pVar6.D();
                    p pVar7 = this.f21135g;
                    pVar7.M(0);
                    a0Var.d(4, pVar7);
                    this.f21126b0 += 4;
                } else {
                    int iA2 = pVar2.a();
                    if (iA2 > 0) {
                        iC = Math.min(i25, iA2);
                        a0Var.d(iC, pVar2);
                    } else {
                        iC = a0Var.c(lVar, i25, false);
                    }
                    this.f21124a0 += iC;
                    this.f21126b0 += iC;
                    this.f21128c0 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f21094c)) {
            p pVar8 = this.f21139j;
            pVar8.M(0);
            a0Var.d(4, pVar8);
            this.f21126b0 += 4;
        }
        int i26 = this.f21126b0;
        k();
        return i26;
    }

    public final void n(l lVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        p pVar = this.f21143m;
        byte[] bArr2 = pVar.f28589a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            pVar.getClass();
            pVar.K(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(pVar.f28589a, bArr.length, i);
        pVar.M(0);
        pVar.L(length);
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        x4 x4Var = this.f21123a;
        x4Var.f12010c = 0;
        x4Var.f12009b.clear();
        f fVar = (f) x4Var.f12013f;
        fVar.f21159b = 0;
        fVar.f21160c = 0;
        f fVar2 = this.f21125b;
        fVar2.f21159b = 0;
        fVar2.f21160c = 0;
        k();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f21156z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f21127c;
            if (i >= sparseArray.size()) {
                return;
            }
            x2 x2Var = ((d) sparseArray.valueAt(i)).V;
            if (x2Var != null) {
                x2Var.f11977b = false;
                x2Var.f11978c = 0;
            }
            i++;
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
