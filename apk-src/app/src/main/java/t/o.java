package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.internal.measurement.b4;
import g0.r2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements g0.c0 {
    public long A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f33172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.i f33173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33174d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u.i f33175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.d f33176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.d2 f33177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r1 f33178h;
    public final com.google.android.gms.internal.ads.i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f33179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ac.c f33180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.i0 f33181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f33182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z.c f33183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0.r0 f33184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r3.b f33185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0.i f33187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f33188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f33189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f33190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x.a f33191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicLong f33193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile ed.d f33194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f33195z;

    public o(u.i iVar, j0.d dVar, j0.i iVar2, m4.d dVar2, g0.a2 a2Var) {
        g0.d2 d2Var = new g0.d2();
        this.f33177g = d2Var;
        this.f33186q = 0;
        this.f33188s = 0;
        this.f33190u = 2;
        this.f33192w = true;
        this.f33193x = new AtomicLong(0L);
        this.f33194y = k0.l.f26777d;
        this.f33195z = 1;
        this.A = 0L;
        l lVar = new l();
        lVar.f33142a = new HashSet();
        lVar.f33143b = new ArrayMap();
        this.f33175e = iVar;
        this.f33176f = dVar2;
        this.f33173c = iVar2;
        this.f33185p = new r3.b(iVar2);
        m mVar = new m(iVar2);
        this.f33172b = mVar;
        d2Var.f19527b.f19728c = this.f33195z;
        d2Var.f19527b.b(new d1(mVar));
        d2Var.f19527b.b(lVar);
        this.f33181l = new com.google.android.gms.internal.ads.i0(this, iVar, iVar2, 5);
        this.f33178h = new r1(this, dVar, iVar2, a2Var);
        this.i = new com.google.android.gms.internal.ads.i0(this, iVar, iVar2, 6);
        this.f33179j = new j2(this, iVar, iVar2);
        this.f33189t = iVar.b();
        ac.c cVar = new ac.c();
        new AtomicInteger(-1);
        cVar.f739c = new Object();
        boolean zB = ac.c.b(iVar);
        new androidx.lifecycle.d0(-1);
        v1 v1Var = new v1();
        if (zB) {
            a(v1Var);
        }
        this.f33180k = cVar;
        this.f33182m = new p2(iVar, iVar2);
        this.f33191v = new x.a(a2Var, 0);
        this.f33183n = new z.c(this, iVar2);
        this.f33184o = new g0.r0(this, iVar, a2Var, iVar2, dVar);
    }

    public static boolean A(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof r2) && (l10 = (Long) ((r2) tag).f19735a.get("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static int v(u.i iVar, int i) {
        int[] iArr = (int[]) iVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return y(i, iArr) ? i : y(1, iArr) ? 1 : 0;
    }

    public static boolean y(int i, int[] iArr) {
        for (int i10 : iArr) {
            if (i == i10) {
                return true;
            }
        }
        return false;
    }

    public final void B(n nVar) {
        ((HashSet) this.f33172b.f33151b).remove(nVar);
    }

    public final void C(boolean z5) {
        l0.a aVarE;
        com.google.android.gms.internal.auth.g.e("Camera2CameraControlImp", "setActive: isActive = " + z5);
        r1 r1Var = this.f33178h;
        if (z5 != r1Var.f33255d) {
            r1Var.f33255d = z5;
            if (!r1Var.f33255d) {
                r1Var.b(null);
            }
        }
        com.google.android.gms.internal.ads.i0 i0Var = this.i;
        if (i0Var.f6312b != z5) {
            i0Var.f6312b = z5;
            if (!z5) {
                synchronized (((n2) i0Var.f6315e)) {
                    ((n2) i0Var.f6315e).e(1.0f);
                    aVarE = l0.a.e((n2) i0Var.f6315e);
                }
                i0Var.e(aVarE);
                ((m2) i0Var.f6317g).q();
                ((o) i0Var.f6313c).F();
            }
        }
        ac.c cVar = this.f33180k;
        if (cVar.f738b != z5) {
            cVar.f738b = z5;
        }
        j2 j2Var = this.f33179j;
        int i = j2Var.f33132g;
        if (j2Var.f33131f != z5) {
            j2Var.f33131f = z5;
            if (!z5) {
                if (j2Var.i) {
                    j2Var.i = false;
                    j2Var.f33126a.t(0);
                    j2Var.b(0);
                    androidx.lifecycle.d0 d0Var = j2Var.f33128c;
                    Integer numValueOf = Integer.valueOf(i);
                    if (b4.E()) {
                        d0Var.k(numValueOf);
                    } else {
                        d0Var.i(numValueOf);
                    }
                }
                j1.h hVar = j2Var.f33133h;
                if (hVar != null) {
                    hVar.d(new a0.o("Camera is not active."));
                    j2Var.f33133h = null;
                }
            }
        }
        com.google.android.gms.internal.ads.i0 i0Var2 = this.f33181l;
        if (z5 != i0Var2.f6312b) {
            i0Var2.f6312b = z5;
            if (!z5) {
                k1 k1Var = (k1) i0Var2.f6314d;
                synchronized (k1Var.f33137a) {
                    k1Var.f33139c = 0;
                }
                i0Var2.b();
            }
        }
        z.c cVar2 = this.f33183n;
        cVar2.f45770d.execute(new a1.b(6, cVar2, z5));
        if (z5) {
            return;
        }
        this.f33187r = null;
        ((AtomicInteger) this.f33185p.f32189d).set(0);
        com.google.android.gms.internal.auth.g.e("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final void D(boolean z5) {
        synchronized (this.f33180k.f739c) {
            try {
                if (z5) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o.E(java.util.List):void");
    }

    public final long F() {
        this.A = this.f33193x.getAndIncrement();
        ((c0) this.f33176f.f28630b).L();
        return this.A;
    }

    public final void a(n nVar) {
        ((HashSet) this.f33172b.f33151b).add(nVar);
    }

    @Override // g0.c0
    public final void c() {
        r3.b bVar = this.f33185p;
        ((j0.i) bVar.f32188c).execute(new k2(bVar, 0));
    }

    @Override // g0.c0
    public final ed.d d(a0.l0 l0Var) {
        if (!x()) {
            return new k0.l(1, new a0.o("Camera is not active."));
        }
        if (!z()) {
            return new k0.l(1, new a0.o("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        r1 r1Var = this.f33178h;
        r1Var.getClass();
        return k0.j.f(i0.o.w(new oi.i(16, r1Var, l0Var)));
    }

    @Override // g0.c0
    public final ed.d e() {
        if (!x()) {
            return new k0.l(1, new a0.o("Camera is not active."));
        }
        if (!z()) {
            return new k0.l(1, new a0.o("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        r1 r1Var = this.f33178h;
        r1Var.getClass();
        return k0.j.f(i0.o.w(new n1(r1Var, 0)));
    }

    @Override // g0.c0
    public final ed.d f(float f10) {
        ed.d lVar;
        l0.a aVarE;
        if (!x()) {
            return new k0.l(1, new a0.o("Camera is not active."));
        }
        com.google.android.gms.internal.ads.i0 i0Var = this.i;
        synchronized (((n2) i0Var.f6315e)) {
            try {
                ((n2) i0Var.f6315e).e(f10);
                aVarE = l0.a.e((n2) i0Var.f6315e);
            } catch (IllegalArgumentException e3) {
                lVar = new k0.l(1, e3);
            }
        }
        i0Var.e(aVarE);
        lVar = i0.o.w(new oi.i(18, i0Var, aVarE));
        return k0.j.f(lVar);
    }

    @Override // g0.c0
    public final void g(int i) {
        if (!x()) {
            com.google.android.gms.internal.auth.g.O("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f33190u = i;
        com.google.android.gms.internal.auth.g.e("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f33190u);
        p2 p2Var = this.f33182m;
        boolean z5 = true;
        if (this.f33190u != 1 && this.f33190u != 0) {
            z5 = false;
        }
        p2Var.f33224e = z5;
        this.f33194y = k0.j.f(i0.o.w(new k(this, 1)));
    }

    @Override // g0.c0
    public final void h(g0.v0 v0Var) {
        this.f33183n.a(a0.c0.d(v0Var).c()).a(new com.appsflyer.internal.m(6), hl.d.j());
    }

    @Override // g0.c0
    public final void i() {
        this.f33182m.a();
    }

    @Override // g0.c0
    public final ed.d j(final ArrayList arrayList, final int i, final int i10) {
        if (x()) {
            final int i11 = this.f33190u;
            return k0.j.j(k0.d.b(k0.j.f(this.f33194y)), new k0.a() { // from class: t.j
                @Override // k0.a
                public final ed.d apply(Object obj) {
                    g0.r0 r0Var = this.f33116b.f33184o;
                    int i12 = i;
                    int i13 = i11;
                    m0 m0VarF = r0Var.f(i12, i13, i10);
                    k0.d dVarB = k0.d.b(m0VarF.a(i13));
                    e9.d dVar = new e9.d(m0VarF, arrayList, i13, 2);
                    Executor executor = m0VarF.f33156b;
                    k0.b bVarJ = k0.j.j(dVarB, dVar, executor);
                    bVarJ.a(new a0(1, m0VarF), executor);
                    return k0.j.f(bVarJ);
                }
            }, this.f33173c);
        }
        com.google.android.gms.internal.auth.g.O("Camera2CameraControlImp", "Camera is not active.");
        return new k0.l(1, new a0.o("Camera is not active."));
    }

    @Override // g0.c0
    public final ed.d k(boolean z5) {
        ed.d dVarW;
        if (!x()) {
            return new k0.l(1, new a0.o("Camera is not active."));
        }
        j2 j2Var = this.f33179j;
        if (j2Var.f33129d) {
            j2Var.b(z5 ? 1 : 0);
            dVarW = i0.o.w(new zl.d0(j2Var, z5 ? 1 : 0, z5, 3));
        } else {
            com.google.android.gms.internal.auth.g.e("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            dVarW = new k0.l(1, new IllegalStateException("No flash unit"));
        }
        return k0.j.f(dVarW);
    }

    @Override // g0.c0
    public final g0.v0 l() {
        s.b bVar;
        z.c cVar = this.f33183n;
        synchronized (cVar.f45771e) {
            s.a aVar = cVar.f45772f;
            aVar.getClass();
            bVar = new s.b(g0.u1.u(aVar.f32367b));
        }
        return bVar;
    }

    @Override // g0.c0
    public final void m(l0.i iVar) {
        this.f33187r = iVar;
    }

    @Override // g0.c0
    public final ed.d n(int i) {
        if (!x()) {
            return new k0.l(1, new a0.o("Camera is not active."));
        }
        com.google.android.gms.internal.ads.i0 i0Var = this.f33181l;
        k1 k1Var = (k1) i0Var.f6314d;
        if (!k1Var.b()) {
            return new k0.l(1, new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range rangeA = k1Var.a();
        if (rangeA.contains(Integer.valueOf(i))) {
            synchronized (k1Var.f33137a) {
                k1Var.f33139c = i;
            }
            return k0.j.f(i0.o.w(new oc.a(i0Var, i, 4)));
        }
        StringBuilder sbM = l7.o.m(i, "Requested ExposureCompensation ", " is not within valid range [");
        sbM.append(rangeA.getUpper());
        sbM.append("..");
        sbM.append(rangeA.getLower());
        sbM.append("]");
        return new k0.l(1, new IllegalArgumentException(sbM.toString()));
    }

    @Override // g0.c0
    public final void o() {
        z.c cVar = this.f33183n;
        synchronized (cVar.f45771e) {
            cVar.f45772f = new s.a();
        }
        k0.j.f(i0.o.w(new z.a(cVar, 0))).a(new com.appsflyer.internal.m(6), hl.d.j());
    }

    @Override // g0.c0
    public final void p() {
        r3.b bVar = this.f33185p;
        ((j0.i) bVar.f32188c).execute(new k2(bVar, 1));
    }

    @Override // g0.c0
    public final ed.d q(int i) {
        if (x()) {
            return k0.j.j(k0.d.b(k0.j.f(this.f33194y)), new q0.d(this, i, this.f33190u), this.f33173c);
        }
        com.google.android.gms.internal.auth.g.O("Camera2CameraControlImp", "Camera is not active.");
        return new k0.l(1, new a0.o("Camera is not active."));
    }

    @Override // g0.c0
    public final void r(g0.d2 d2Var) {
        StreamConfigurationMap streamConfigurationMap;
        int i;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        g0.r0 r0Var = d2Var.f19527b;
        p2 p2Var = this.f33182m;
        j0.i iVar = p2Var.f33221b;
        u.i iVar2 = p2Var.f33220a;
        p2Var.a();
        if (p2Var.f33223d) {
            r0Var.f19728c = 1;
            return;
        }
        if (p2Var.f33226g) {
            r0Var.f19728c = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) iVar2.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e3) {
            com.google.android.gms.internal.auth.g.k("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e3.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            i = 0;
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i10 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new i0.f(true));
                    map.put(Integer.valueOf(i10), inputSizes[0]);
                }
            }
            i = 0;
        }
        if (p2Var.f33225f && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) iVar2.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i11 = i; i11 < length; i11++) {
                if (validOutputFormatsForInput[i11] == 256) {
                    Size size = (Size) map.get(34);
                    a0.w1 w1Var = new a0.w1(size.getWidth(), size.getHeight(), 34, 9);
                    a0.e2 e2Var = new a0.e2(w1Var);
                    Surface surface = e2Var.getSurface();
                    Objects.requireNonNull(surface);
                    a0.l2 l2Var = new a0.l2(surface, new Size(e2Var.getWidth(), e2Var.getHeight()), 34);
                    ka.k kVar = new ka.k(iVar);
                    p2Var.f33227h = e2Var;
                    p2Var.i = l2Var;
                    p2Var.f33228j = kVar;
                    e2Var.c(new s3.q(10, p2Var), hl.d.o());
                    k0.j.f(l2Var.f19513e).a(new v0(1, e2Var, kVar), iVar);
                    d2Var.b(l2Var, a0.i0.f112d, -1);
                    a0.v1 v1Var = w1Var.f251c;
                    r0Var.b(v1Var);
                    ArrayList arrayList = d2Var.f19530e;
                    if (!arrayList.contains(v1Var)) {
                        arrayList.add(v1Var);
                    }
                    z0 z0Var = new z0(2, kVar);
                    ArrayList arrayList2 = d2Var.f19529d;
                    if (!arrayList2.contains(z0Var)) {
                        arrayList2.add(z0Var);
                    }
                    d2Var.f19532g = new InputConfiguration(e2Var.getWidth(), e2Var.getHeight(), e2Var.e());
                    return;
                }
            }
        }
        r0Var.f19728c = 1;
    }

    public final void s() {
        synchronized (this.f33174d) {
            try {
                int i = this.f33186q;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f33186q = i - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(int i) {
        this.f33188s = i;
        if (i == 0) {
            g0.r0 r0Var = new g0.r0();
            r0Var.f19728c = this.f33195z;
            r0Var.f19727b = true;
            g0.q1 q1VarV = g0.q1.v();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            q1VarV.y(s.b.u(key), Integer.valueOf(v(this.f33175e, 1)));
            q1VarV.y(s.b.u(CaptureRequest.FLASH_MODE), 0);
            r0Var.c(new s.b(g0.u1.u(q1VarV)));
            E(Collections.singletonList(r0Var.e()));
        }
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.h2 u() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o.u():g0.h2");
    }

    public final int w(int i) {
        int[] iArr = (int[]) this.f33175e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (y(i, iArr)) {
            return i;
        }
        if (y(4, iArr)) {
            return 4;
        }
        return y(1, iArr) ? 1 : 0;
    }

    public final boolean x() {
        int i;
        synchronized (this.f33174d) {
            i = this.f33186q;
        }
        return i > 0;
    }

    public final boolean z() {
        try {
            return ((Boolean) i0.o.w(new k(this, 0)).f26173c.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e3) {
            throw new RuntimeException("Unable to check if repeating request is available.", e3);
        }
    }
}
