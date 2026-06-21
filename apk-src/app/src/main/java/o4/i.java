package o4;

import ad.h0;
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
import com.google.android.gms.internal.ads.a1;
import com.google.android.gms.internal.ads.j0;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.ads.w0;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import i4.c0;
import j3.m0;
import j3.o0;
import j3.x0;
import j3.y0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import s3.b1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b4.s {

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final int[] f29624j2 = {1920, 1600, 1440, 1280, VKApiCodes.CODE_CALL_REQUIRES_AUTH, 854, 640, 540, 480};

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static boolean f29625k2;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static boolean f29626l2;
    public final Context J0;
    public final boolean K0;
    public final v L0;
    public final int M0;
    public final boolean N0;
    public final r O0;
    public final u0 P0;
    public final long Q0;
    public final w0 R0;
    public final PriorityQueue S0;
    public j0 T0;
    public boolean U0;
    public boolean V0;
    public z W0;
    public boolean X0;
    public int Y0;
    public List Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Surface f29627a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public int f29628a2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public j f29629b1;
    public boolean b2;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public m3.q f29630c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public int f29631c2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f29632d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public h f29633d2;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f29634e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public q f29635e2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f29636f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public long f29637f2;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f29638g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public long f29639g2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f29640h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public boolean f29641h2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f29642i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public int f29643i2;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f29644j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public b1 f29645k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f29646l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f29647m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public long f29648n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f29649o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public long f29650p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public y0 f29651q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public y0 f29652r1;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(g gVar) {
        Context context = gVar.f29614a;
        super(context.getApplicationContext(), 2, gVar.f29616c, gVar.f29618e, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.M0 = gVar.f29621h;
        this.W0 = null;
        this.L0 = new v(gVar.f29619f, gVar.f29620g, 0);
        this.K0 = this.W0 == null;
        this.O0 = new r(applicationContext, this, gVar.f29617d);
        this.P0 = new u0(6);
        this.N0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f29630c1 = m3.q.f28592c;
        this.f29634e1 = 1;
        this.f29636f1 = 0;
        this.f29651q1 = y0.f26415d;
        this.f29631c2 = 0;
        this.f29652r1 = null;
        this.f29628a2 = -1000;
        this.f29637f2 = -9223372036854775807L;
        this.f29639g2 = -9223372036854775807L;
        this.S0 = new PriorityQueue();
        this.Q0 = -9223372036854775807L;
        this.R0 = null;
        this.f29645k1 = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.B0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C0(b4.p r11, j3.o r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.C0(b4.p, j3.o):int");
    }

    public static List D0(Context context, b4.k kVar, j3.o oVar, boolean z5, boolean z10) {
        String str = oVar.f26335n;
        if (str == null) {
            return ad.b1.f768f;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !wa.a.o(context)) {
            String strC = b4.y.c(oVar);
            List listA = strC == null ? ad.b1.f768f : kVar.a(strC, z5, z10);
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return b4.y.g(kVar, oVar, z5, z10);
    }

    public static int E0(b4.p pVar, j3.o oVar) {
        int i = oVar.f26336o;
        List list = oVar.f26338q;
        if (i == -1) {
            return C0(pVar, oVar);
        }
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return oVar.f26336o + length;
    }

    @Override // b4.s, s3.a
    public final void A(float f10, float f11) throws s3.i {
        super.A(f10, f11);
        z zVar = this.W0;
        if (zVar != null) {
            zVar.k(f10);
        } else {
            this.O0.h(f10);
        }
        w0 w0Var = this.R0;
        if (w0Var != null) {
            w0Var.c(f10);
        }
    }

    @Override // s3.a
    public final boolean D(long j10) {
        if (this.f1944s0 == -9223372036854775807L || j10 < this.f29646l1) {
            return false;
        }
        long j11 = this.A0;
        return j11 == -9223372036854775807L || j10 > j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface F0(b4.p r6) {
        /*
            r5 = this;
            o4.z r0 = r5.W0
            if (r0 == 0) goto L9
            android.view.Surface r6 = r0.b()
            return r6
        L9:
            android.view.Surface r0 = r5.f29627a1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.f1914h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.N0(r6)
            com.google.android.gms.internal.measurement.h5.r(r0)
            o4.j r0 = r5.f29629b1
            if (r0 == 0) goto L32
            boolean r1 = r0.f29655b
            boolean r3 = r6.f1912f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.f29629b1 = r2
        L32:
            o4.j r0 = r5.f29629b1
            if (r0 != 0) goto Laf
            android.content.Context r0 = r5.J0
            boolean r6 = r6.f1912f
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L47
            boolean r0 = o4.j.b(r0)
            if (r0 == 0) goto L45
            goto L49
        L45:
            r0 = r2
            goto L4a
        L47:
            int r0 = o4.j.f29653e
        L49:
            r0 = r1
        L4a:
            com.google.android.gms.internal.measurement.h5.r(r0)
            com.google.android.gms.internal.ads.l0 r0 = new com.google.android.gms.internal.ads.l0
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3, r1)
            if (r6 == 0) goto L59
            int r6 = o4.j.f29653e
            goto L5a
        L59:
            r6 = r2
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f7354c = r3
            m3.h r4 = new m3.h
            r4.<init>(r3)
            r0.f7357f = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f7354c     // Catch: java.lang.Throwable -> L8b
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L8b
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L8b
        L79:
            android.view.Surface r6 = r0.f7358g     // Catch: java.lang.Throwable -> L8b
            o4.j r6 = (o4.j) r6     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            java.lang.RuntimeException r6 = r0.f7356e     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            java.lang.Error r6 = r0.f7355d     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            r0.wait()     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8d
            goto L79
        L8b:
            r6 = move-exception
            goto Lad
        L8d:
            r2 = r1
            goto L79
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L99
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L99:
            java.lang.RuntimeException r6 = r0.f7356e
            if (r6 != 0) goto Lac
            java.lang.Error r6 = r0.f7355d
            if (r6 != 0) goto Lab
            android.view.Surface r6 = r0.f7358g
            o4.j r6 = (o4.j) r6
            r6.getClass()
            r5.f29629b1 = r6
            goto Laf
        Lab:
            throw r6
        Lac:
            throw r6
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r6
        Laf:
            o4.j r6 = r5.f29629b1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.F0(b4.p):android.view.Surface");
    }

    @Override // b4.s
    public final s3.c G(b4.p pVar, j3.o oVar, j3.o oVar2) {
        int i;
        s3.c cVarB = pVar.b(oVar, oVar2);
        int i10 = cVarB.f32463e;
        j0 j0Var = this.T0;
        j0Var.getClass();
        if (oVar2.f26342u > j0Var.f6666a || oVar2.f26343v > j0Var.f6667b) {
            i10 |= 256;
        }
        if (E0(pVar, oVar2) > j0Var.f6668c) {
            i10 |= 64;
        }
        if (this.f29636f1 != Integer.MIN_VALUE) {
            float f10 = oVar.f26346y;
            if (f10 != -1.0f) {
                float f11 = oVar2.f26346y;
                if (f11 != -1.0f && Math.abs(f11 - f10) > 1.0f && ((i = Build.VERSION.SDK_INT) < 30 || (i == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i10 |= 65536;
                }
            }
        }
        int i11 = i10;
        return new s3.c(pVar.f1907a, oVar, oVar2, i11 != 0 ? 0 : cVarB.f32462d, i11);
    }

    public final boolean G0(b4.p pVar) {
        if (this.W0 != null) {
            return true;
        }
        Surface surface = this.f29627a1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && pVar.f1914h) || N0(pVar);
        }
        return true;
    }

    @Override // b4.s
    public final b4.o H(IllegalStateException illegalStateException, b4.p pVar) {
        Surface surface = this.f29627a1;
        d dVar = new d(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return dVar;
    }

    public final boolean H0(r3.e eVar) {
        if (j() || eVar.c(536870912)) {
            return true;
        }
        long j10 = this.f29639g2;
        return j10 == -9223372036854775807L || j10 - (eVar.f32194h - this.f1958z0.f1925c) <= 100000;
    }

    public final void I0() {
        if (this.f29640h1 > 0) {
            this.f32436h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f29638g1;
            int i = this.f29640h1;
            v vVar = this.L0;
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new u(vVar, i, j10));
            }
            this.f29640h1 = 0;
            this.f29638g1 = jElapsedRealtime;
        }
    }

    public final void J0() {
        b4.m mVar;
        if (this.b2 && (mVar = this.P) != null) {
            this.f29633d2 = new h(this, mVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                mVar.a(bundle);
            }
        }
    }

    public final void K0(b4.m mVar, int i, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mVar.s(i, j10);
        Trace.endSection();
        this.f1956y0.f11457f++;
        this.f29642i1 = 0;
        if (this.W0 == null) {
            y0 y0Var = this.f29651q1;
            boolean zEquals = y0Var.equals(y0.f26415d);
            v vVar = this.L0;
            if (!zEquals && !y0Var.equals(this.f29652r1)) {
                this.f29652r1 = y0Var;
                vVar.b(y0Var);
            }
            r rVar = this.O0;
            boolean z5 = rVar.f29688e != 3;
            rVar.f29688e = 3;
            rVar.f29694l.getClass();
            rVar.f29690g = m3.z.M(SystemClock.elapsedRealtime());
            if (!z5 || (surface = this.f29627a1) == null) {
                return;
            }
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new io.sentry.android.core.n(vVar, surface, SystemClock.elapsedRealtime(), 2));
            }
            this.f29632d1 = true;
        }
    }

    public final void L0(Object obj) throws s3.i {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f29627a1;
        v vVar = this.L0;
        if (surface2 == surface) {
            if (surface != null) {
                y0 y0Var = this.f29652r1;
                if (y0Var != null) {
                    vVar.b(y0Var);
                }
                Surface surface3 = this.f29627a1;
                if (surface3 == null || !this.f29632d1 || (handler = vVar.f29700a) == null) {
                    return;
                }
                handler.post(new io.sentry.android.core.n(vVar, surface3, SystemClock.elapsedRealtime(), 2));
                return;
            }
            return;
        }
        this.f29627a1 = surface;
        z zVar = this.W0;
        r rVar = this.O0;
        if (zVar == null) {
            rVar.g(surface);
        }
        this.f29632d1 = false;
        int i = this.i;
        b4.m mVar = this.P;
        if (mVar != null && this.W0 == null) {
            b4.p pVar = this.W;
            pVar.getClass();
            if (!G0(pVar) || this.U0) {
                l0();
                V();
            } else {
                Surface surfaceF0 = F0(pVar);
                if (surfaceF0 != null) {
                    mVar.F(surfaceF0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    mVar.p();
                }
            }
        }
        if (surface != null) {
            y0 y0Var2 = this.f29652r1;
            if (y0Var2 != null) {
                vVar.b(y0Var2);
            }
        } else {
            this.f29652r1 = null;
            z zVar2 = this.W0;
            if (zVar2 != null) {
                zVar2.l();
            }
        }
        if (i == 2) {
            z zVar3 = this.W0;
            if (zVar3 != null) {
                zVar3.q(true);
            } else {
                rVar.c(true);
            }
        }
        J0();
    }

    @Override // b4.s
    public final int M(r3.e eVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f29645k1 == null && !this.b2) || eVar.f32194h >= this.f32440m || H0(eVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean M0(long j10, long j11, boolean z5, boolean z10) throws s3.i {
        if (this.W0 != null && this.K0) {
            j11 -= -this.f29637f2;
        }
        if (j10 < -500000 && !z5) {
            i4.b1 b1Var = this.f32437j;
            b1Var.getClass();
            int iH = b1Var.h(j11 - this.f32439l);
            if (iH != 0) {
                this.f29646l1 = j11;
                PriorityQueue priorityQueue = this.S0;
                if (z10) {
                    vs1 vs1Var = this.f1956y0;
                    int i = vs1Var.f11456e + iH;
                    vs1Var.f11456e = i;
                    vs1Var.f11458g += this.f29644j1;
                    vs1Var.f11456e = priorityQueue.size() + i;
                } else {
                    this.f1956y0.f11461k++;
                    P0(priorityQueue.size() + iH, this.f29644j1);
                }
                if (this.P != null) {
                    if (v0()) {
                        l0();
                        V();
                    } else if (t0()) {
                        K();
                    } else {
                        this.D0 = true;
                    }
                }
                z zVar = this.W0;
                if (zVar != null) {
                    zVar.n(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // b4.s
    public final float N(float f10, j3.o oVar, j3.o[] oVarArr) {
        b4.p pVar;
        float fMax = -1.0f;
        for (j3.o oVar2 : oVarArr) {
            float f11 = oVar2.f26346y;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f29645k1 == null || (pVar = this.W) == null) {
            return f12;
        }
        int i = oVar.f26342u;
        int i10 = oVar.f26343v;
        float f13 = -3.4028235E38f;
        if (pVar.i) {
            float f14 = pVar.f1917l;
            if (f14 != -3.4028235E38f && pVar.f1915j == i && pVar.f1916k == i10) {
                f13 = f14;
            } else {
                float f15 = 1024.0f;
                if (!pVar.g(i, i10, 1024.0f)) {
                    f13 = 0.0f;
                    while (true) {
                        float f16 = f15 - f13;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f13;
                        if (pVar.g(i, i10, f17)) {
                            f13 = f17;
                        } else {
                            f15 = f17;
                        }
                    }
                } else {
                    f13 = 1024.0f;
                }
                pVar.f1917l = f13;
                pVar.f1915j = i;
                pVar.f1916k = i10;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    public final boolean N0(b4.p pVar) {
        if (this.b2 || B0(pVar.f1907a)) {
            return false;
        }
        return !pVar.f1912f || j.b(this.J0);
    }

    @Override // b4.s
    public final ArrayList O(b4.k kVar, j3.o oVar, boolean z5) {
        boolean z10 = this.b2;
        Context context = this.J0;
        List listD0 = D0(context, kVar, oVar, z5, z10);
        HashMap map = b4.y.f1966a;
        ArrayList arrayList = new ArrayList(listD0);
        Collections.sort(arrayList, new b4.t(0, new a0.y(context, oVar)));
        return arrayList;
    }

    public final void O0(b4.m mVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        mVar.g(i);
        Trace.endSection();
        this.f1956y0.f11458g++;
    }

    public final void P0(int i, int i10) {
        vs1 vs1Var = this.f1956y0;
        vs1Var.i += i;
        int i11 = i + i10;
        vs1Var.f11459h += i11;
        this.f29640h1 += i11;
        int i12 = this.f29642i1 + i11;
        this.f29642i1 = i12;
        vs1Var.f11460j = Math.max(i12, vs1Var.f11460j);
        int i13 = this.M0;
        if (i13 <= 0 || this.f29640h1 < i13) {
            return;
        }
        I0();
    }

    public final void Q0(c0 c0Var) {
        o0 o0Var = this.f32444q;
        if (o0Var.p()) {
            this.f29639g2 = -9223372036854775807L;
            return;
        }
        int iB = o0Var.b(c0Var.f20861a);
        if (iB == -1) {
            this.f29639g2 = -9223372036854775807L;
        } else {
            this.f29639g2 = o0Var.f(iB, new m0(), false).f26277d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        r15 = r9;
     */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q9.o R(b4.p r25, j3.o r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.R(b4.p, j3.o, android.media.MediaCrypto, float):q9.o");
    }

    public final void R0(long j10) {
        vs1 vs1Var = this.f1956y0;
        vs1Var.f11462l += j10;
        vs1Var.f11463m++;
        this.f29648n1 += j10;
        this.f29649o1++;
    }

    @Override // b4.s
    public final void S(r3.e eVar) {
        if (this.V0) {
            ByteBuffer byteBuffer = eVar.i;
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
                        b4.m mVar = this.P;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.a(bundle);
                    }
                }
            }
        }
    }

    @Override // b4.s
    public final boolean X(j3.o oVar) throws s3.i {
        z zVar = this.W0;
        if (zVar == null || zVar.a()) {
            return true;
        }
        try {
            return this.W0.m(oVar);
        } catch (y e3) {
            throw d(e3, oVar, false, 7000);
        }
    }

    @Override // b4.s
    public final void Y(Exception exc) {
        m3.b.f("MediaCodecVideoRenderer", "Video codec error", exc);
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new u(vVar, exc, 1));
        }
    }

    @Override // b4.s
    public final void Z(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            str2 = str;
            handler.post(new u(vVar, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.U0 = B0(str2);
        b4.p pVar = this.W;
        pVar.getClass();
        boolean z5 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(pVar.f1908b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1910d;
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
        this.V0 = z5;
        J0();
    }

    @Override // b4.s
    public final void a0(s3.b bVar) {
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new m3.c0(9, vVar, bVar));
        }
    }

    @Override // b4.s
    public final void b0(String str) {
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new u(vVar, str, 2));
        }
    }

    @Override // b4.s
    public final s3.c c0(r3.b bVar) throws s3.i {
        s3.c cVarC0 = super.c0(bVar);
        j3.o oVar = (j3.o) bVar.f32189d;
        oVar.getClass();
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new m3.c0(vVar, oVar, cVarC0));
        }
        w0 w0Var = this.R0;
        if (w0Var != null) {
            w0Var.b();
        }
        return cVarC0;
    }

    @Override // b4.s
    public final void d0(j3.o oVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        b4.m mVar = this.P;
        if (mVar != null) {
            mVar.setVideoScalingMode(this.f29634e1);
        }
        if (this.b2) {
            i = oVar.f26342u;
            integer = oVar.f26343v;
        } else {
            mediaFormat.getClass();
            boolean z5 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z5 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z5 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f10 = oVar.A;
        int i10 = oVar.f26347z;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer;
            integer = i;
            i = i11;
        }
        this.f29651q1 = new y0(f10, i, integer);
        z zVar = this.W0;
        if (zVar == null || !this.f29641h2) {
            this.O0.f(oVar.f26346y);
        } else {
            j3.n nVarA = oVar.a();
            nVarA.f26299t = i;
            nVarA.f26300u = integer;
            nVarA.f26305z = f10;
            j3.o oVar2 = new j3.o(nVarA);
            int i12 = this.Y0;
            List list = this.Z0;
            if (list == null) {
                h0 h0Var = ad.j0.f818c;
                list = ad.b1.f768f;
            }
            zVar.h(oVar2, this.f1958z0.f1924b, i12, list);
            this.Y0 = 2;
        }
        this.f29641h2 = false;
    }

    @Override // s3.a
    public final void f() {
        z zVar = this.W0;
        if (zVar == null) {
            r rVar = this.O0;
            if (rVar.f29688e == 0) {
                rVar.f29688e = 1;
                return;
            }
            return;
        }
        int i = this.Y0;
        if (i == 0 || i == 1) {
            this.Y0 = 0;
        } else {
            zVar.v();
        }
    }

    @Override // b4.s
    public final void f0(long j10) {
        super.f0(j10);
        if (this.b2) {
            return;
        }
        this.f29644j1--;
    }

    @Override // b4.s
    public final void g0() {
        z zVar = this.W0;
        if (zVar != null) {
            zVar.i();
            if (this.f29637f2 == -9223372036854775807L) {
                this.f29637f2 = this.f1958z0.f1924b;
            }
            this.W0.f(-this.f29637f2);
        } else {
            this.O0.e(2);
        }
        this.f29641h2 = true;
        J0();
    }

    @Override // b4.s
    public final void h0(r3.e eVar) {
        this.f29643i2 = 0;
        int iM = M(eVar);
        if ((Build.VERSION.SDK_INT < 34 || (iM & 32) == 0) && !this.b2) {
            this.f29644j1++;
        }
    }

    @Override // b4.s, s3.a, s3.w0
    public final void handleMessage(int i, Object obj) throws s3.i {
        if (i == 1) {
            L0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            q qVar = (q) obj;
            this.f29635e2 = qVar;
            z zVar = this.W0;
            if (zVar != null) {
                zVar.t(qVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f29631c2 != iIntValue) {
                this.f29631c2 = iIntValue;
                if (this.b2) {
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f29634e1 = iIntValue2;
            b4.m mVar = this.P;
            if (mVar != null) {
                mVar.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f29636f1 = iIntValue3;
            z zVar2 = this.W0;
            if (zVar2 != null) {
                zVar2.j(iIntValue3);
                return;
            }
            a1 a1Var = this.O0.f29685b;
            if (a1Var.f2703h == iIntValue3) {
                return;
            }
            a1Var.f2703h = iIntValue3;
            a1Var.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(x0.f26412a)) {
                z zVar3 = this.W0;
                if (zVar3 == null || !zVar3.a()) {
                    return;
                }
                this.W0.s();
                return;
            }
            this.Z0 = list;
            z zVar4 = this.W0;
            if (zVar4 != null) {
                zVar4.o(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            m3.q qVar2 = (m3.q) obj;
            if (qVar2.f28593a == 0 || qVar2.f28594b == 0) {
                return;
            }
            this.f29630c1 = qVar2;
            z zVar5 = this.W0;
            if (zVar5 != null) {
                Surface surface = this.f29627a1;
                surface.getClass();
                zVar5.g(surface, qVar2);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f29628a2 = ((Integer) obj).intValue();
                b4.m mVar2 = this.P;
                if (mVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f29628a2));
                    mVar2.a(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f29627a1;
                L0(null);
                obj.getClass();
                ((i) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z5 = this.f29645k1 != null;
                b1 b1Var = (b1) obj;
                this.f29645k1 = b1Var;
                if (z5 != (b1Var != null)) {
                    y0(this.Q);
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // s3.a
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // b4.s
    public final boolean j0(long j10, long j11, b4.m mVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, j3.o oVar) {
        int i12;
        mVar.getClass();
        long j13 = j12 - this.f1958z0.f1925c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.S0;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        P0(i13, 0);
        z zVar = this.W0;
        if (zVar != null) {
            if (!z5 || z10) {
                return zVar.u(j12, new f(this, mVar, i, j13));
            }
            O0(mVar, i);
            return true;
        }
        int iA = this.O0.a(j12, j10, j11, this.f1958z0.f1924b, z5, z10, this.P0);
        u0 u0Var = this.P0;
        w0 w0Var = this.R0;
        if (w0Var != null && iA != 5 && iA != 4) {
            w0Var.a(j12, u0Var.f10771b);
        }
        if (iA == 0) {
            this.f32436h.getClass();
            long jNanoTime = System.nanoTime();
            q qVar = this.f29635e2;
            if (qVar != null) {
                qVar.a(j13, jNanoTime, oVar, this.R);
            }
            K0(mVar, i, jNanoTime);
            R0(u0Var.f10771b);
            return true;
        }
        if (iA == 1) {
            long j14 = u0Var.f10772c;
            long j15 = u0Var.f10771b;
            if (j14 == this.f29650p1) {
                O0(mVar, i);
            } else {
                q qVar2 = this.f29635e2;
                if (qVar2 != null) {
                    i12 = i;
                    qVar2.a(j13, j14, oVar, this.R);
                } else {
                    i12 = i;
                }
                K0(mVar, i12, j14);
            }
            R0(j15);
            this.f29650p1 = j14;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            mVar.g(i);
            Trace.endSection();
            P0(0, 1);
            R0(u0Var.f10771b);
            return true;
        }
        if (iA == 3) {
            O0(mVar, i);
            R0(u0Var.f10771b);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // s3.a
    public final boolean k() {
        if (!this.f1948u0) {
            return false;
        }
        z zVar = this.W0;
        return zVar == null || zVar.isEnded();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r7 = this;
            j3.o r0 = r7.G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            boolean r0 = r7.j()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f32442o
            goto L18
        Lf:
            i4.b1 r0 = r7.f32437j
            r0.getClass()
            boolean r0 = r0.isReady()
        L18:
            if (r0 != 0) goto L3d
            int r0 = r7.f1933f0
            if (r0 < 0) goto L20
            r0 = r2
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L3d
            long r3 = r7.f1931d0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3e
            m3.t r0 = r7.f32436h
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f1931d0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3e
        L3d:
            r1 = r2
        L3e:
            o4.z r0 = r7.W0
            if (r0 == 0) goto L47
            boolean r0 = r0.r(r1)
            return r0
        L47:
            if (r1 == 0) goto L52
            b4.m r0 = r7.P
            if (r0 == 0) goto L51
            boolean r0 = r7.b2
            if (r0 == 0) goto L52
        L51:
            return r2
        L52:
            o4.r r0 = r7.O0
            boolean r0 = r0.b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.m():boolean");
    }

    @Override // b4.s
    public final void m0() {
        z zVar = this.W0;
        if (zVar != null) {
            zVar.i();
        }
    }

    @Override // b4.s, s3.a
    public final void n() {
        v vVar = this.L0;
        this.f29652r1 = null;
        this.f29639g2 = -9223372036854775807L;
        J0();
        this.f29632d1 = false;
        this.f29633d2 = null;
        this.f29647m1 = true;
        try {
            super.n();
            vs1 vs1Var = this.f1956y0;
            vVar.getClass();
            synchronized (vs1Var) {
            }
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new m3.c0(12, vVar, vs1Var));
            }
            vVar.b(y0.f26415d);
        } catch (Throwable th2) {
            vs1 vs1Var2 = this.f1956y0;
            vVar.getClass();
            synchronized (vs1Var2) {
                Handler handler2 = vVar.f29700a;
                if (handler2 != null) {
                    handler2.post(new m3.c0(12, vVar, vs1Var2));
                }
                vVar.b(y0.f26415d);
                throw th2;
            }
        }
    }

    @Override // s3.a
    public final void o(boolean z5, boolean z10) {
        z zVar;
        this.f1956y0 = new vs1(1);
        s3.a1 a1Var = this.f32433e;
        a1Var.getClass();
        boolean z11 = a1Var.f32450b;
        h5.r((z11 && this.f29631c2 == 0) ? false : true);
        if (this.b2 != z11) {
            this.b2 = z11;
            l0();
        }
        vs1 vs1Var = this.f1956y0;
        v vVar = this.L0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new u(vVar, vs1Var, 5));
        }
        boolean z12 = this.X0;
        r rVar = this.O0;
        if (!z12) {
            if (this.Z0 != null && this.W0 == null) {
                n0 n0Var = new n0(this.J0, rVar);
                n0Var.f8078b = true;
                long j10 = this.Q0;
                n0Var.f8080d = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
                m3.t tVar = this.f32436h;
                tVar.getClass();
                n0Var.f8083g = tVar;
                h5.r(!n0Var.f8079c);
                if (((n) n0Var.f8082f) == null) {
                    n0Var.f8082f = new n();
                }
                p pVar = new p(n0Var);
                n0Var.f8079c = true;
                if (1 >= pVar.f29683q) {
                    pVar.f29683q = 1;
                }
                SparseArray sparseArray = pVar.f29670c;
                if (m3.z.l(sparseArray, 0)) {
                    zVar = (z) sparseArray.get(0);
                } else {
                    k kVar = new k(pVar, pVar.f29668a);
                    pVar.f29674g.add(kVar);
                    sparseArray.put(0, kVar);
                    zVar = kVar;
                }
                this.W0 = zVar;
            }
            this.X0 = true;
        }
        z zVar2 = this.W0;
        if (zVar2 == null) {
            m3.t tVar2 = this.f32436h;
            tVar2.getClass();
            rVar.f29694l = tVar2;
            rVar.e(!z10 ? 1 : 0);
            return;
        }
        zVar2.c(new e(this));
        q qVar = this.f29635e2;
        if (qVar != null) {
            this.W0.t(qVar);
        }
        if (this.f29627a1 != null && !this.f29630c1.equals(m3.q.f28592c)) {
            this.W0.g(this.f29627a1, this.f29630c1);
        }
        this.W0.j(this.f29636f1);
        this.W0.k(this.N);
        List list = this.Z0;
        if (list != null) {
            this.W0.o(list);
        }
        this.Y0 = !z10 ? 1 : 0;
        this.C0 = true;
    }

    @Override // b4.s
    public final void o0() {
        super.o0();
        this.S0.clear();
        this.f29644j1 = 0;
        this.f29643i2 = 0;
        this.f29647m1 = false;
    }

    @Override // b4.s, s3.a
    public final void p(long j10, boolean z5, boolean z10) throws s3.i {
        z zVar = this.W0;
        if (zVar != null && !z5) {
            zVar.n(true);
        }
        if (z10) {
            this.f29646l1 = j10;
        }
        super.p(j10, z5, z10);
        z zVar2 = this.W0;
        r rVar = this.O0;
        if (zVar2 == null) {
            rVar.f29685b.b();
            rVar.f29691h = -9223372036854775807L;
            rVar.f29689f = -9223372036854775807L;
            rVar.f29688e = Math.min(rVar.f29688e, 1);
            rVar.i = -9223372036854775807L;
        }
        w0 w0Var = this.R0;
        if (w0Var != null) {
            w0Var.b();
        }
        if (z5) {
            z zVar3 = this.W0;
            if (zVar3 != null) {
                zVar3.q(false);
            } else {
                rVar.c(false);
            }
        }
        J0();
        this.f29642i1 = 0;
    }

    @Override // s3.a
    public final void q() {
        z zVar = this.W0;
        if (zVar == null || !this.K0) {
            return;
        }
        zVar.release();
    }

    @Override // s3.a
    public final void r() {
        try {
            try {
                this.f1935i0 = false;
                n0();
                l0();
                ni.i iVar = this.J;
                if (iVar != null) {
                    iVar.A(null);
                }
                this.J = null;
            } catch (Throwable th2) {
                ni.i iVar2 = this.J;
                if (iVar2 != null) {
                    iVar2.A(null);
                }
                this.J = null;
                throw th2;
            }
        } finally {
            this.X0 = false;
            this.f29637f2 = -9223372036854775807L;
            j jVar = this.f29629b1;
            if (jVar != null) {
                jVar.release();
                this.f29629b1 = null;
            }
        }
    }

    @Override // s3.a
    public final void s() {
        this.f29640h1 = 0;
        this.f32436h.getClass();
        this.f29638g1 = SystemClock.elapsedRealtime();
        this.f29648n1 = 0L;
        this.f29649o1 = 0;
        z zVar = this.W0;
        if (zVar != null) {
            zVar.e();
        } else {
            this.O0.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s0(r3.e r13) {
        /*
            r12 = this;
            boolean r0 = r12.H0(r13)
            r1 = 0
            if (r0 == 0) goto L8
            goto L49
        L8:
            long r2 = r13.f32194h
            long r4 = r12.f32440m
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 1
            if (r0 >= 0) goto L13
            r0 = r4
            goto L14
        L13:
            r0 = r1
        L14:
            com.google.android.gms.internal.ads.w0 r5 = r12.R0
            if (r5 == 0) goto L3b
            long r6 = r5.f11555a
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L25
            r2 = r8
            goto L2f
        L25:
            long r10 = r5.f11556b
            double r10 = (double) r10
            long r2 = r2 - r6
            double r2 = (double) r2
            double r5 = r5.f11557c
            double r2 = r2 * r5
            double r2 = r2 + r10
            long r2 = (long) r2
        L2f:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 == 0) goto L3b
            long r5 = r12.Q0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L3b
            r2 = r4
            goto L3c
        L3b:
            r2 = r1
        L3c:
            if (r0 != 0) goto L41
            if (r2 != 0) goto L41
            goto L49
        L41:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            boolean r2 = r13.c(r2)
            if (r2 == 0) goto L4a
        L49:
            return r1
        L4a:
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r2 = r13.c(r2)
            if (r2 == 0) goto L56
            r13.r()
            r1 = r4
        L56:
            if (r1 == 0) goto L72
            if (r0 == 0) goto L62
            com.google.android.gms.internal.ads.vs1 r13 = r12.f1956y0
            int r0 = r13.f11456e
            int r0 = r0 + r4
            r13.f11456e = r0
            goto L72
        L62:
            long r2 = r13.f32194h
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.util.PriorityQueue r0 = r12.S0
            r0.add(r13)
            int r13 = r12.f29643i2
            int r13 = r13 + r4
            r12.f29643i2 = r13
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.s0(r3.e):boolean");
    }

    @Override // s3.a
    public final void t() {
        I0();
        int i = this.f29649o1;
        if (i != 0) {
            long j10 = this.f29648n1;
            v vVar = this.L0;
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new u(vVar, j10, i));
            }
            this.f29648n1 = 0L;
            this.f29649o1 = 0;
        }
        z zVar = this.W0;
        if (zVar != null) {
            zVar.d();
        } else {
            r rVar = this.O0;
            rVar.f29687d = false;
            rVar.i = -9223372036854775807L;
            a1 a1Var = rVar.f29685b;
            a1Var.f2697b = false;
            com.google.android.gms.internal.ads.x0 x0Var = (com.google.android.gms.internal.ads.x0) a1Var.f2713s;
            if (x0Var != null) {
                x0Var.f();
            }
            a1Var.a();
        }
        w0 w0Var = this.R0;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t0() {
        /*
            r12 = this;
            j3.o r0 = r12.Q
            long r1 = r12.f29639g2
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L27
            r8 = 1
            long r8 = r8 + r1
            b4.r r5 = r12.f1958z0
            long r10 = r5.f1925c
            long r10 = r10 + r1
            long r1 = r12.E0
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L25
            goto L27
        L25:
            r1 = r6
            goto L28
        L27:
            r1 = r7
        L28:
            s3.b1 r2 = r12.f29645k1
            if (r2 != 0) goto L2d
            goto L47
        L2d:
            boolean r2 = r12.f29647m1
            if (r2 != 0) goto L47
            boolean r2 = r12.b2
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3b
            int r0 = r0.f26337p
            if (r0 > 0) goto L47
        L3b:
            if (r1 != 0) goto L47
            b4.r r0 = r12.f1958z0
            long r0 = r0.f1927e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L46
            goto L47
        L46:
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.t0():boolean");
    }

    @Override // b4.s, s3.a
    public final void u(j3.o[] oVarArr, long j10, long j11, c0 c0Var) {
        super.u(oVarArr, j10, j11, c0Var);
        Q0(c0Var);
        w0 w0Var = this.R0;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // b4.s
    public final boolean u0(b4.p pVar) {
        return G0(pVar);
    }

    @Override // s3.a
    public final void v() {
        c0 c0Var = this.f32445r;
        if (c0Var != null) {
            Q0(c0Var);
        }
    }

    @Override // b4.s
    public final boolean v0() {
        b4.p pVar = this.W;
        if (this.W0 != null && pVar != null) {
            String str = pVar.f1907a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.v0();
    }

    @Override // b4.s, s3.a
    public final void x(long j10, long j11) throws s3.i {
        z zVar = this.W0;
        if (zVar != null) {
            try {
                zVar.p(j10, j11);
            } catch (y e3) {
                throw d(e3, e3.f29703b, false, 7001);
            }
        }
        super.x(j10, j11);
    }

    @Override // b4.s
    public final int x0(b4.k kVar, j3.o oVar) {
        boolean z5;
        int i = 0;
        if (!j3.c0.m(oVar.f26335n)) {
            return s3.a.b(0, 0, 0, 0);
        }
        boolean z10 = oVar.f26339r != null;
        Context context = this.J0;
        List listD0 = D0(context, kVar, oVar, z10, false);
        if (z10 && listD0.isEmpty()) {
            listD0 = D0(context, kVar, oVar, false, false);
        }
        if (listD0.isEmpty()) {
            return s3.a.b(1, 0, 0, 0);
        }
        int i10 = oVar.O;
        if (i10 != 0 && i10 != 2) {
            return s3.a.b(2, 0, 0, 0);
        }
        b4.p pVar = (b4.p) listD0.get(0);
        boolean zE = pVar.e(context, oVar);
        if (zE) {
            z5 = true;
        } else {
            for (int i11 = 1; i11 < listD0.size(); i11++) {
                b4.p pVar2 = (b4.p) listD0.get(i11);
                if (pVar2.e(context, oVar)) {
                    z5 = false;
                    zE = true;
                    pVar = pVar2;
                    break;
                }
            }
            z5 = true;
        }
        int i12 = zE ? 4 : 3;
        int i13 = pVar.f(oVar) ? 16 : 8;
        int i14 = pVar.f1913g ? 64 : 0;
        int i15 = z5 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(oVar.f26335n) && !wa.a.o(context)) {
            i15 = 256;
        }
        if (zE) {
            List listD02 = D0(context, kVar, oVar, z10, true);
            if (!listD02.isEmpty()) {
                HashMap map = b4.y.f1966a;
                ArrayList arrayList = new ArrayList(listD02);
                Collections.sort(arrayList, new b4.t(i, new a0.y(context, oVar)));
                b4.p pVar3 = (b4.p) arrayList.get(0);
                if (pVar3.e(context, oVar) && pVar3.f(oVar)) {
                    i = 32;
                }
            }
        }
        return i12 | i13 | i | i14 | i15;
    }
}
