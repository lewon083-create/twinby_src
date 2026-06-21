package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends gx1 {

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int[] f7040n1 = {1920, 1600, 1440, 1280, VKApiCodes.CODE_CALL_REQUIRES_AUTH, 854, 640, 540, 480};

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static boolean f7041o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static boolean f7042p1;
    public final Context B0;
    public final boolean C0;
    public final g1 D0;
    public final boolean E0;
    public final v0 F0;
    public final u0 G0;
    public final long H0;
    public final PriorityQueue I0;
    public j0 J0;
    public boolean K0;
    public boolean L0;
    public k1 M0;
    public boolean N0;
    public int O0;
    public List P0;
    public Surface Q0;
    public m0 R0;
    public yk0 S0;
    public boolean T0;
    public int U0;
    public int V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public tu1 f7043a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f7044b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f7045c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f7046d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f7047e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public bs f7048f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public bs f7049g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f7050h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f7051i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public t0 f7052j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public long f7053k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f7054l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f7055m1;

    public k0(i0 i0Var) {
        super(2, (zk) i0Var.f6315e, (bw1) i0Var.f6314d, 30.0f);
        Context applicationContext = ((Context) i0Var.f6313c).getApplicationContext();
        this.B0 = applicationContext;
        this.M0 = null;
        this.D0 = new g1((Handler) i0Var.f6316f, (ht1) i0Var.f6317g, 0);
        this.C0 = this.M0 == null;
        this.F0 = new v0(applicationContext, this);
        this.G0 = new u0(0);
        this.E0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.S0 = yk0.f12649c;
        this.U0 = 1;
        this.V0 = 0;
        this.f7048f1 = bs.f3859d;
        this.f7051i1 = 0;
        this.f7049g1 = null;
        this.f7050h1 = -1000;
        this.f7053k1 = -9223372036854775807L;
        this.f7054l1 = -9223372036854775807L;
        this.I0 = new PriorityQueue();
        this.H0 = -9223372036854775807L;
        this.f7043a1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int s0(com.google.android.gms.internal.ads.dx1 r8, com.google.android.gms.internal.ads.jx1 r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.s0(com.google.android.gms.internal.ads.dx1, com.google.android.gms.internal.ads.jx1):int");
    }

    public static int x0(dx1 dx1Var, jx1 jx1Var) {
        int i = jx1Var.f6976n;
        if (i == -1) {
            return s0(dx1Var, jx1Var);
        }
        List list = jx1Var.f6978p;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean y0(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.y0(java.lang.String):boolean");
    }

    public static List z0(Context context, bw1 bw1Var, jx1 jx1Var, boolean z5, boolean z10) {
        List listA;
        String str = jx1Var.f6975m;
        if (str == null) {
            return r51.f9713f;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c80.i(context)) {
            String strC = mx1.c(jx1Var);
            if (strC == null) {
                listA = r51.f9713f;
            } else {
                bw1Var.getClass();
                listA = mx1.a(strC, z5, z10);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return mx1.b(bw1Var, jx1Var, z5, z10);
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void A() {
        super.A();
        this.I0.clear();
        this.Z0 = 0;
        this.f7044b1 = false;
    }

    public final void A0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Q0;
        g1 g1Var = this.D0;
        if (surface2 == surface) {
            if (surface != null) {
                bs bsVar = this.f7049g1;
                if (bsVar != null) {
                    g1Var.a(bsVar);
                }
                Surface surface3 = this.Q0;
                if (surface3 == null || !this.T0 || (handler = g1Var.f5590a) == null) {
                    return;
                }
                handler.post(new f1(g1Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.Q0 = surface;
        k1 k1Var = this.M0;
        v0 v0Var = this.F0;
        if (k1Var == null) {
            v0Var.c(surface);
        }
        this.T0 = false;
        int i = this.i;
        bx1 bx1Var = this.M;
        if (bx1Var != null && this.M0 == null) {
            dx1 dx1Var = this.T;
            dx1Var.getClass();
            if (!C0(dx1Var) || this.K0) {
                x();
                v();
            } else {
                Surface surfaceD0 = D0(dx1Var);
                if (surfaceD0 != null) {
                    bx1Var.m(surfaceD0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    bx1Var.r();
                }
            }
        }
        if (surface != null) {
            bs bsVar2 = this.f7049g1;
            if (bsVar2 != null) {
                g1Var.a(bsVar2);
            }
        } else {
            this.f7049g1 = null;
            k1 k1Var2 = this.M0;
            if (k1Var2 != null) {
                k1Var2.o();
            }
        }
        if (i == 2) {
            k1 k1Var3 = this.M0;
            if (k1Var3 != null) {
                k1Var3.C0(true);
            } else {
                v0Var.i = true;
                v0Var.f11166h = -9223372036854775807L;
            }
        }
    }

    public final boolean B0(zq1 zq1Var) {
        if (m0() || zq1Var.q(536870912)) {
            return true;
        }
        long j10 = this.f7054l1;
        return j10 == -9223372036854775807L || j10 - (zq1Var.f13081h - this.f5967u0.f5497c) <= 100000;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final cx1 C(IllegalStateException illegalStateException, dx1 dx1Var) {
        Surface surface = this.Q0;
        e0 e0Var = new e0(illegalStateException, dx1Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return e0Var;
    }

    public final boolean C0(dx1 dx1Var) {
        if (this.M0 != null) {
            return true;
        }
        Surface surface = this.Q0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && dx1Var.f4719h) {
            return true;
        }
        if (y0(dx1Var.f4712a)) {
            return false;
        }
        return !dx1Var.f4717f || m0.a(this.B0);
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void D(jx1 jx1Var) throws bt1 {
        k1 k1Var = this.M0;
        if (k1Var == null || k1Var.i()) {
            return;
        }
        try {
            k1Var.G0(jx1Var);
        } catch (j1 e3) {
            throw l(e3, jx1Var, false, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface D0(com.google.android.gms.internal.ads.dx1 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.k1 r0 = r6.M0
            if (r0 == 0) goto L9
            android.view.Surface r7 = r0.n()
            return r7
        L9:
            android.view.Surface r0 = r6.Q0
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r7.f4719h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r0 = r7.f4712a
            boolean r0 = y0(r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L30
            boolean r0 = r7.f4717f
            if (r0 == 0) goto L32
            android.content.Context r0 = r6.B0
            boolean r0 = com.google.android.gms.internal.ads.m0.a(r0)
            if (r0 != 0) goto L32
        L30:
            r0 = r1
            goto L33
        L32:
            r0 = r3
        L33:
            com.google.android.gms.internal.ads.ix.k0(r0)
            com.google.android.gms.internal.ads.m0 r0 = r6.R0
            if (r0 == 0) goto L47
            boolean r4 = r7.f4717f
            boolean r5 = r0.f7702b
            if (r5 == r4) goto L47
            if (r0 == 0) goto L47
            r0.release()
            r6.R0 = r2
        L47:
            com.google.android.gms.internal.ads.m0 r0 = r6.R0
            if (r0 != 0) goto Lc3
            android.content.Context r0 = r6.B0
            boolean r7 = r7.f4717f
            if (r7 == 0) goto L5b
            boolean r0 = com.google.android.gms.internal.ads.m0.a(r0)
            if (r0 == 0) goto L59
        L57:
            r0 = r3
            goto L5e
        L59:
            r0 = r1
            goto L5e
        L5b:
            int r0 = com.google.android.gms.internal.ads.m0.f7700e
            goto L57
        L5e:
            com.google.android.gms.internal.ads.ix.k0(r0)
            com.google.android.gms.internal.ads.l0 r0 = new com.google.android.gms.internal.ads.l0
            java.lang.String r2 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r2, r1)
            if (r7 == 0) goto L6d
            int r7 = com.google.android.gms.internal.ads.m0.f7700e
            goto L6e
        L6d:
            r7 = r1
        L6e:
            r0.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r2.<init>(r4, r0)
            r0.f7354c = r2
            com.google.android.gms.internal.ads.gc0 r4 = new com.google.android.gms.internal.ads.gc0
            r4.<init>(r2)
            r0.f7357f = r4
            monitor-enter(r0)
            android.os.Handler r2 = r0.f7354c     // Catch: java.lang.Throwable -> L9f
            android.os.Message r7 = r2.obtainMessage(r3, r7, r1)     // Catch: java.lang.Throwable -> L9f
            r7.sendToTarget()     // Catch: java.lang.Throwable -> L9f
        L8d:
            android.view.Surface r7 = r0.f7358g     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.m0 r7 = (com.google.android.gms.internal.ads.m0) r7     // Catch: java.lang.Throwable -> L9f
            if (r7 != 0) goto La3
            java.lang.RuntimeException r7 = r0.f7356e     // Catch: java.lang.Throwable -> L9f
            if (r7 != 0) goto La3
            java.lang.Error r7 = r0.f7355d     // Catch: java.lang.Throwable -> L9f
            if (r7 != 0) goto La3
            r0.wait()     // Catch: java.lang.Throwable -> L9f java.lang.InterruptedException -> La1
            goto L8d
        L9f:
            r7 = move-exception
            goto Lc1
        La1:
            r1 = r3
            goto L8d
        La3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto Lad
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        Lad:
            java.lang.RuntimeException r7 = r0.f7356e
            if (r7 != 0) goto Lc0
            java.lang.Error r7 = r0.f7355d
            if (r7 != 0) goto Lbf
            android.view.Surface r7 = r0.f7358g
            com.google.android.gms.internal.ads.m0 r7 = (com.google.android.gms.internal.ads.m0) r7
            r7.getClass()
            r6.R0 = r7
            goto Lc3
        Lbf:
            throw r7
        Lc0:
            throw r7
        Lc1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            throw r7
        Lc3:
            com.google.android.gms.internal.ads.m0 r7 = r6.R0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.D0(com.google.android.gms.internal.ads.dx1):android.view.Surface");
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void E(zq1 zq1Var) {
        int iF = F(zq1Var);
        if (Build.VERSION.SDK_INT < 34 || (iF & 32) == 0) {
            this.Z0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final int F(zq1 zq1Var) {
        return (Build.VERSION.SDK_INT < 34 || this.f7043a1 == null || zq1Var.f13081h >= this.f5951m || B0(zq1Var)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean G(zq1 zq1Var) {
        boolean z5 = false;
        if (!B0(zq1Var)) {
            if (zq1Var.f13081h < this.f5951m) {
                if (!zq1Var.q(268435456)) {
                    if (zq1Var.q(67108864)) {
                        zq1Var.r();
                        z5 = true;
                    }
                    if (z5) {
                        this.f5965t0.f11456e++;
                    }
                }
            }
            return z5;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void H(long j10) {
        super.H(j10);
        this.Z0--;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final int K(bw1 bw1Var, jx1 jx1Var) {
        boolean z5;
        String str = jx1Var.f6975m;
        if (!ra.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z10 = jx1Var.f6979q != null;
        Context context = this.B0;
        List listZ0 = z0(context, bw1Var, jx1Var, z10, false);
        if (z10 && listZ0.isEmpty()) {
            listZ0 = z0(context, bw1Var, jx1Var, false, false);
        }
        if (listZ0.isEmpty()) {
            return VKApiCodes.CODE_INVALID_PHOTO_FORMAT;
        }
        if (jx1Var.L != 0) {
            return 130;
        }
        dx1 dx1Var = (dx1) listZ0.get(0);
        boolean zB = dx1Var.b(jx1Var);
        if (zB) {
            z5 = true;
        } else {
            for (int i10 = 1; i10 < listZ0.size(); i10++) {
                dx1 dx1Var2 = (dx1) listZ0.get(i10);
                if (dx1Var2.b(jx1Var)) {
                    zB = true;
                    z5 = false;
                    dx1Var = dx1Var2;
                    break;
                }
            }
            z5 = true;
        }
        int i11 = true != zB ? 3 : 4;
        int i12 = true != dx1Var.c(jx1Var) ? 8 : 16;
        int i13 = true != dx1Var.f4718g ? 0 : 64;
        int i14 = true != z5 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c80.i(context)) {
            i14 = 256;
        }
        if (zB) {
            List listZ02 = z0(context, bw1Var, jx1Var, z10, true);
            if (!listZ02.isEmpty()) {
                HashMap map = mx1.f8033a;
                ArrayList arrayList = new ArrayList(listZ02);
                Collections.sort(arrayList, new kx1(new pp0(14, jx1Var)));
                dx1 dx1Var3 = (dx1) arrayList.get(0);
                if (dx1Var3.b(jx1Var) && dx1Var3.c(jx1Var)) {
                    i = 32;
                }
            }
        }
        return i11 | i12 | i | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final ArrayList M(bw1 bw1Var, jx1 jx1Var) {
        List listZ0 = z0(this.B0, bw1Var, jx1Var, false, false);
        HashMap map = mx1.f8033a;
        ArrayList arrayList = new ArrayList(listZ0);
        Collections.sort(arrayList, new kx1(new pp0(14, jx1Var)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r1 = null;
     */
    @Override // com.google.android.gms.internal.ads.gx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.z7 O(com.google.android.gms.internal.ads.dx1 r23, com.google.android.gms.internal.ads.jx1 r24, float r25) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.O(com.google.android.gms.internal.ads.dx1, com.google.android.gms.internal.ads.jx1, float):com.google.android.gms.internal.ads.z7");
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final ws1 P(dx1 dx1Var, jx1 jx1Var, jx1 jx1Var2) {
        int i;
        int i10;
        ws1 ws1VarD = dx1Var.d(jx1Var, jx1Var2);
        int i11 = ws1VarD.f11892e;
        j0 j0Var = this.J0;
        j0Var.getClass();
        if (jx1Var2.f6982t > j0Var.f6666a || jx1Var2.f6983u > j0Var.f6667b) {
            i11 |= 256;
        }
        if (x0(dx1Var, jx1Var2) > j0Var.f6668c) {
            i11 |= 64;
        }
        String str = dx1Var.f4712a;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = ws1VarD.f11891d;
        }
        return new ws1(str, jx1Var, jx1Var2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final float R(float f10, jx1 jx1Var, jx1[] jx1VarArr) {
        dx1 dx1Var;
        float fMax = -1.0f;
        for (jx1 jx1Var2 : jx1VarArr) {
            float f11 = jx1Var2.f6986x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f7043a1 == null || (dx1Var = this.T) == null) {
            return f12;
        }
        int i = jx1Var.f6982t;
        int i10 = jx1Var.f6983u;
        float f13 = -3.4028235E38f;
        if (dx1Var.i) {
            float f14 = dx1Var.f4722l;
            if (f14 != -3.4028235E38f && dx1Var.f4720j == i && dx1Var.f4721k == i10) {
                f13 = f14;
            } else {
                f13 = 1024.0f;
                if (!dx1Var.e(i, i10, 1024.0d)) {
                    float f15 = 0.0f;
                    while (true) {
                        float f16 = f13 - f15;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f15;
                        boolean zE = dx1Var.e(i, i10, f17);
                        if (true == zE) {
                            f15 = f17;
                        }
                        if (true != zE) {
                            f13 = f17;
                        }
                    }
                    f13 = f15;
                }
                dx1Var.f4722l = f13;
                dx1Var.f4720j = i;
                dx1Var.f4721k = i10;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void S(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        g1 g1Var = this.D0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            str2 = str;
            handler.post(new c1(g1Var, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.K0 = y0(str2);
        dx1 dx1Var = this.T;
        dx1Var.getClass();
        boolean z5 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(dx1Var.f4713b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = dx1Var.f4715d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z5 = true;
                    break;
                }
                i++;
            }
        }
        this.L0 = z5;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void T(String str) {
        g1 g1Var = this.D0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new c1(g1Var, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void U(Exception exc) {
        rs.H("MediaCodecVideoRenderer", "Video codec error", exc);
        g1 g1Var = this.D0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new c1(g1Var, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final ws1 V(zd1 zd1Var) {
        ws1 ws1VarV = super.V(zd1Var);
        jx1 jx1Var = (jx1) zd1Var.f12972d;
        jx1Var.getClass();
        g1 g1Var = this.D0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new d1(g1Var, jx1Var, ws1VarV, 0));
        }
        return ws1VarV;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void W(jx1 jx1Var, MediaFormat mediaFormat) {
        bx1 bx1Var = this.M;
        if (bx1Var != null) {
            bx1Var.x(this.U0);
        }
        mediaFormat.getClass();
        boolean z5 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z5 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z5 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = jx1Var.f6988z;
        int i = jx1Var.f6987y;
        if (i == 90 || i == 270) {
            f10 = 1.0f / f10;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.f7048f1 = new bs(f10, integer, integer2);
        k1 k1Var = this.M0;
        if (k1Var == null || !this.f7055m1) {
            this.F0.d(jx1Var.f6986x);
        } else {
            ow1 ow1Var = new ow1(jx1Var);
            ow1Var.f8839s = integer;
            ow1Var.f8840t = integer2;
            ow1Var.f8845y = f10;
            jx1 jx1Var2 = new jx1(ow1Var);
            int i11 = this.O0;
            List list = this.P0;
            if (list == null) {
                list = r51.f9713f;
            }
            k1Var.E0(jx1Var2, this.f5967u0.f5496b, i11, list);
            this.O0 = 2;
        }
        this.f7055m1 = false;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void X() {
        k1 k1Var = this.M0;
        if (k1Var != null) {
            k1Var.f();
            long j10 = this.f7053k1;
            if (j10 == -9223372036854775807L) {
                j10 = this.f5967u0.f5496b;
                this.f7053k1 = j10;
            }
            this.M0.D0(-j10);
        } else {
            this.F0.a(2);
        }
        this.f7055m1 = true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean Y(long j10, long j11, bx1 bx1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, jx1 jx1Var) {
        int i12;
        bx1Var.getClass();
        long j13 = j12 - this.f5967u0.f5497c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.I0;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        u0(i13, 0);
        k1 k1Var = this.M0;
        if (k1Var != null) {
            if (!z5 || z10) {
                return k1Var.w0(j12, new g0(this, bx1Var, i, j13));
            }
            t0(bx1Var, i);
            return true;
        }
        long j14 = this.f5967u0.f5496b;
        v0 v0Var = this.F0;
        u0 u0Var = this.G0;
        int iF = v0Var.f(j12, j10, j11, j14, z5, z10, u0Var);
        if (iF == 0) {
            this.f5943h.getClass();
            long jNanoTime = System.nanoTime();
            t0 t0Var = this.f7052j1;
            if (t0Var != null) {
                t0Var.a(j13, jNanoTime, jx1Var, this.O);
            }
            w0(bx1Var, i, jNanoTime);
            v0(u0Var.f10771b);
            return true;
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    return false;
                }
                t0(bx1Var, i);
                v0(u0Var.f10771b);
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            bx1Var.E(i);
            Trace.endSection();
            u0(0, 1);
            v0(u0Var.f10771b);
            return true;
        }
        long j15 = u0Var.f10772c;
        long j16 = u0Var.f10771b;
        if (j15 == this.f7047e1) {
            t0(bx1Var, i);
        } else {
            t0 t0Var2 = this.f7052j1;
            if (t0Var2 != null) {
                i12 = i;
                t0Var2.a(j13, j15, jx1Var, this.O);
            } else {
                i12 = i;
            }
            w0(bx1Var, i12, j15);
        }
        v0(j16);
        this.f7047e1 = j15;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void Z() {
        k1 k1Var = this.M0;
        if (k1Var != null) {
            k1Var.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void a(long j10, boolean z5, boolean z10) {
        k1 k1Var = this.M0;
        if (k1Var != null && !z5) {
            k1Var.u0(true);
        }
        super.a(j10, z5, z10);
        k1 k1Var2 = this.M0;
        v0 v0Var = this.F0;
        if (k1Var2 == null) {
            v0Var.f11160b.e();
            v0Var.f11165g = -9223372036854775807L;
            v0Var.f11163e = -9223372036854775807L;
            v0Var.f11162d = Math.min(v0Var.f11162d, 1);
            v0Var.f11166h = -9223372036854775807L;
        }
        if (z5) {
            k1 k1Var3 = this.M0;
            if (k1Var3 != null) {
                k1Var3.C0(false);
            } else {
                v0Var.i = false;
                v0Var.f11166h = -9223372036854775807L;
            }
        }
        this.Y0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void a0(zq1 zq1Var) {
        if (this.L0) {
            ByteBuffer byteBuffer = zq1Var.i;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        bx1 bx1Var = this.M;
                        bx1Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        bx1Var.j(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nu1
    public final void c(int i, Object obj) {
        if (i == 1) {
            A0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            t0 t0Var = (t0) obj;
            this.f7052j1 = t0Var;
            k1 k1Var = this.M0;
            if (k1Var != null) {
                k1Var.x0(t0Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f7051i1 != iIntValue) {
                this.f7051i1 = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.U0 = iIntValue2;
            bx1 bx1Var = this.M;
            if (bx1Var != null) {
                bx1Var.x(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.V0 = iIntValue3;
            k1 k1Var2 = this.M0;
            if (k1Var2 != null) {
                k1Var2.A0(iIntValue3);
                return;
            }
            a1 a1Var = this.F0.f11160b;
            if (a1Var.f2703h == iIntValue3) {
                return;
            }
            a1Var.f2703h = iIntValue3;
            a1Var.g(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(bq.f3851a)) {
                k1 k1Var3 = this.M0;
                if (k1Var3 == null || !k1Var3.i()) {
                    return;
                }
                k1Var3.c();
                return;
            }
            this.P0 = list;
            k1 k1Var4 = this.M0;
            if (k1Var4 != null) {
                k1Var4.B0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            yk0 yk0Var = (yk0) obj;
            if (yk0Var.f12650a == 0 || yk0Var.f12651b == 0) {
                return;
            }
            this.S0 = yk0Var;
            k1 k1Var5 = this.M0;
            if (k1Var5 != null) {
                Surface surface = this.Q0;
                surface.getClass();
                k1Var5.z0(surface, yk0Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f7050h1 = ((Integer) obj).intValue();
                bx1 bx1Var2 = this.M;
                if (bx1Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f7050h1));
                    bx1Var2.j(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Q0;
                A0(null);
                obj.getClass();
                ((k0) obj).c(1, surface2);
                break;
            case 18:
                boolean z5 = this.f7043a1 != null;
                tu1 tu1Var = (tu1) obj;
                this.f7043a1 = tu1Var;
                if (z5 != (tu1Var != null)) {
                    e0(this.N);
                }
                break;
            default:
                if (i == 11) {
                    pt1 pt1Var = (pt1) obj;
                    pt1Var.getClass();
                    this.I = pt1Var;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void e() {
        this.X0 = 0;
        this.f5943h.getClass();
        this.W0 = SystemClock.elapsedRealtime();
        this.f7045c1 = 0L;
        this.f7046d1 = 0;
        k1 k1Var = this.M0;
        if (k1Var != null) {
            k1Var.h();
        } else {
            this.F0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void f() {
        int i = this.X0;
        g1 g1Var = this.D0;
        if (i > 0) {
            this.f5943h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.W0;
            int i10 = this.X0;
            Handler handler = g1Var.f5590a;
            if (handler != null) {
                handler.post(new e1(g1Var, i10, 0, j10));
            }
            this.X0 = 0;
            this.W0 = jElapsedRealtime;
        }
        int i11 = this.f7046d1;
        if (i11 != 0) {
            long j11 = this.f7045c1;
            Handler handler2 = g1Var.f5590a;
            if (handler2 != null) {
                handler2.post(new c1(g1Var, j11, i11));
            }
            this.f7045c1 = 0L;
            this.f7046d1 = 0;
        }
        k1 k1Var = this.M0;
        if (k1Var != null) {
            k1Var.j();
            return;
        }
        v0 v0Var = this.F0;
        v0Var.f11161c = false;
        v0Var.f11166h = -9223372036854775807L;
        a1 a1Var = v0Var.f11160b;
        a1Var.f2697b = false;
        x0 x0Var = (x0) a1Var.f2713s;
        if (x0Var != null) {
            x0Var.h();
        }
        a1Var.h();
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void g() {
        g1 g1Var = this.D0;
        this.f7049g1 = null;
        this.f7054l1 = -9223372036854775807L;
        this.T0 = false;
        this.f7044b1 = true;
        try {
            super.g();
            vs1 vs1Var = this.f5965t0;
            g1Var.getClass();
            synchronized (vs1Var) {
            }
            Handler handler = g1Var.f5590a;
            if (handler != null) {
                handler.post(new l81(2, g1Var, vs1Var));
            }
            g1Var.a(bs.f3859d);
        } catch (Throwable th2) {
            vs1 vs1Var2 = this.f5965t0;
            g1Var.getClass();
            synchronized (vs1Var2) {
                Handler handler2 = g1Var.f5590a;
                if (handler2 != null) {
                    handler2.post(new l81(2, g1Var, vs1Var2));
                }
                g1Var.a(bs.f3859d);
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void h() {
        try {
            try {
                this.f5940f0 = false;
                b0();
                x();
            } finally {
                this.H = null;
            }
        } finally {
            this.N0 = false;
            this.f7053k1 = -9223372036854775807L;
            m0 m0Var = this.R0;
            if (m0Var != null) {
                m0Var.release();
                this.R0 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void i() {
        k1 k1Var = this.M0;
        if (k1Var == null || !this.C0) {
            return;
        }
        k1Var.G();
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean p(long j10) {
        long j11 = this.f5969v0;
        return j11 == -9223372036854775807L || j10 > j11 - this.f5967u0.f5497c;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void p0(boolean z5, boolean z10) {
        k1 k1Var;
        this.f5965t0 = new vs1(0);
        j();
        vs1 vs1Var = this.f5965t0;
        g1 g1Var = this.D0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new c1(g1Var, vs1Var, 4));
        }
        boolean z11 = this.N0;
        v0 v0Var = this.F0;
        if (!z11) {
            if (this.P0 != null && this.M0 == null) {
                n0 n0Var = new n0(this.B0, v0Var);
                n0Var.f8078b = true;
                long j10 = this.H0;
                n0Var.f8080d = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
                c6 c6Var = this.f5943h;
                c6Var.getClass();
                n0Var.f8083g = c6Var;
                ix.k0(!n0Var.f8079c);
                if (((q0) n0Var.f8082f) == null) {
                    n0Var.f8082f = new q0();
                }
                s0 s0Var = new s0(n0Var);
                n0Var.f8079c = true;
                s0Var.f10119p = 1;
                SparseArray sparseArray = s0Var.f10107c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    k1Var = (k1) sparseArray.get(0);
                } else {
                    o0 o0Var = new o0(s0Var, s0Var.f10105a);
                    s0Var.f10111g.add(o0Var);
                    sparseArray.put(0, o0Var);
                    k1Var = o0Var;
                }
                this.M0 = k1Var;
            }
            this.N0 = true;
        }
        int i = !z10 ? 1 : 0;
        k1 k1Var2 = this.M0;
        if (k1Var2 == null) {
            c6 c6Var2 = this.f5943h;
            c6Var2.getClass();
            v0Var.f11168k = c6Var2;
            v0Var.a(i);
            return;
        }
        k1Var2.F0(new f0(this));
        t0 t0Var = this.f7052j1;
        if (t0Var != null) {
            this.M0.x0(t0Var);
        }
        if (this.Q0 != null && !this.S0.equals(yk0.f12649c)) {
            this.M0.z0(this.Q0, this.S0);
        }
        this.M0.A0(this.V0);
        this.M0.v0(this.K);
        List list = this.P0;
        if (list != null) {
            this.M0.B0(list);
        }
        this.O0 = i;
        this.f5973x0 = true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void q(float f10, float f11) {
        super.q(f10, f11);
        k1 k1Var = this.M0;
        if (k1Var != null) {
            k1Var.v0(f10);
        } else {
            this.F0.g(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void q0(jx1[] jx1VarArr, long j10, long j11, hy1 hy1Var) {
        super.q0(jx1VarArr, j10, j11, hy1Var);
        ci ciVar = this.f5958q;
        if (ciVar.g()) {
            this.f7054l1 = -9223372036854775807L;
        } else {
            this.f7054l1 = ciVar.o(hy1Var.f6299a, new bh()).f3787d;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void r() {
        k1 k1Var = this.M0;
        if (k1Var == null) {
            v0 v0Var = this.F0;
            if (v0Var.f11162d == 0) {
                v0Var.f11162d = 1;
                return;
            }
            return;
        }
        int i = this.O0;
        if (i == 0 || i == 1) {
            this.O0 = 0;
        } else {
            k1Var.B();
        }
    }

    public final boolean r0(long j10, long j11, boolean z5, boolean z10) {
        if (this.M0 != null && this.C0) {
            j11 -= -this.f7053k1;
        }
        if (j10 < -500000 && !z5) {
            gz1 gz1Var = this.f5945j;
            gz1Var.getClass();
            int iM = gz1Var.m(j11 - this.f5949l);
            if (iM != 0) {
                PriorityQueue priorityQueue = this.I0;
                if (z10) {
                    vs1 vs1Var = this.f5965t0;
                    int i = vs1Var.f11456e + iM;
                    vs1Var.f11456e = i;
                    vs1Var.f11458g += this.Z0;
                    vs1Var.f11456e = priorityQueue.size() + i;
                } else {
                    this.f5965t0.f11461k++;
                    u0(priorityQueue.size() + iM, this.Z0);
                }
                if (this.M != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        c0();
                    } else {
                        this.f5975y0 = true;
                    }
                }
                k1 k1Var = this.M0;
                if (k1Var != null) {
                    k1Var.u0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void s(long j10, long j11) throws bt1 {
        k1 k1Var = this.M0;
        if (k1Var != null) {
            try {
                k1Var.y0(j10, j11);
            } catch (j1 e3) {
                throw l(e3, e3.f6674b, false, 7001);
            }
        }
        super.s(j10, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.gx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.jx1 r0 = r7.E
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r7.m0()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f5955o
            goto L18
        Lf:
            com.google.android.gms.internal.ads.gz1 r0 = r7.f5945j
            r0.getClass()
            boolean r0 = r0.j()
        L18:
            if (r0 != 0) goto L3e
            int r0 = r7.f5934c0
            if (r0 < 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L3e
            long r3 = r7.f5930a0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.c6 r0 = r7.f5943h
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f5930a0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.ads.k1 r0 = r7.M0
            if (r0 == 0) goto L48
            boolean r0 = r0.I(r2)
            return r0
        L48:
            if (r2 == 0) goto L50
            com.google.android.gms.internal.ads.bx1 r0 = r7.M
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r1
        L50:
            com.google.android.gms.internal.ads.v0 r0 = r7.F0
            boolean r0 = r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.t():boolean");
    }

    public final void t0(bx1 bx1Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        bx1Var.E(i);
        Trace.endSection();
        this.f5965t0.f11458g++;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean u() {
        if (!this.f5961r0) {
            return false;
        }
        k1 k1Var = this.M0;
        return k1Var == null || k1Var.d();
    }

    public final void u0(int i, int i10) {
        vs1 vs1Var = this.f5965t0;
        vs1Var.i += i;
        int i11 = i + i10;
        vs1Var.f11459h += i11;
        this.X0 += i11;
        int i12 = this.Y0 + i11;
        this.Y0 = i12;
        vs1Var.f11460j = Math.max(i12, vs1Var.f11460j);
    }

    public final void v0(long j10) {
        vs1 vs1Var = this.f5965t0;
        vs1Var.f11462l += j10;
        vs1Var.f11463m++;
        this.f7045c1 += j10;
        this.f7046d1++;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean w(dx1 dx1Var) {
        return C0(dx1Var);
    }

    public final void w0(bx1 bx1Var, int i, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        bx1Var.G(i, j10);
        Trace.endSection();
        this.f5965t0.f11457f++;
        this.Y0 = 0;
        if (this.M0 == null) {
            bs bsVar = this.f7048f1;
            boolean zEquals = bsVar.equals(bs.f3859d);
            g1 g1Var = this.D0;
            if (!zEquals && !bsVar.equals(this.f7049g1)) {
                this.f7049g1 = bsVar;
                g1Var.a(bsVar);
            }
            v0 v0Var = this.F0;
            int i10 = v0Var.f11162d;
            v0Var.f11162d = 3;
            v0Var.f11168k.getClass();
            v0Var.f11164f = cq0.s(SystemClock.elapsedRealtime());
            if (i10 == 3 || (surface = this.Q0) == null) {
                return;
            }
            Handler handler = g1Var.f5590a;
            if (handler != null) {
                handler.post(new f1(g1Var, surface, SystemClock.elapsedRealtime()));
            }
            this.T0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean y() {
        dx1 dx1Var = this.T;
        if (this.M0 != null && dx1Var != null) {
            String str = dx1Var.f4712a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.google.android.gms.internal.ads.gx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.jx1 r0 = r12.N
            long r1 = r12.f7054l1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L24
            r8 = 1
            long r8 = r8 + r1
            com.google.android.gms.internal.ads.fx1 r5 = r12.f5967u0
            long r10 = r5.f5497c
            long r10 = r10 + r1
            long r1 = r12.f5977z0
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L26
        L24:
            r1 = r7
            goto L27
        L26:
            r1 = r6
        L27:
            com.google.android.gms.internal.ads.tu1 r2 = r12.f7043a1
            if (r2 != 0) goto L2c
            goto L41
        L2c:
            boolean r2 = r12.f7044b1
            if (r2 != 0) goto L41
            if (r0 == 0) goto L36
            int r0 = r0.f6977o
            if (r0 > 0) goto L41
        L36:
            if (r1 != 0) goto L41
            com.google.android.gms.internal.ads.fx1 r0 = r12.f5967u0
            long r0 = r0.f5499e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L41
            return r6
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k0.z():boolean");
    }
}
