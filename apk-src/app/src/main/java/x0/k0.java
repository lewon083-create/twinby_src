package x0;

import a0.g1;
import a0.o2;
import a0.q2;
import a0.t0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import g0.a1;
import g0.a3;
import g0.d2;
import g0.e2;
import g0.i1;
import g0.q1;
import g0.s2;
import g0.t1;
import g0.u1;
import g0.w2;
import g0.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import m.h3;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends q2 {
    public static final i0 E = new i0();
    public boolean A;
    public j0 B;
    public e2 C;
    public final g0.h0 D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1 f35632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q0.m f35633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f35634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d2 f35635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j1.k f35636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o2 f35637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public bb.e f35639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Rect f35640y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35641z;

    public k0(y0.a aVar) {
        super(aVar);
        this.f35634s = j.f35618d;
        this.f35635t = new d2();
        this.f35636u = null;
        this.f35638w = 3;
        this.A = false;
        Map map = Collections.EMPTY_MAP;
        this.D = new g0.h0(3, this);
    }

    public static void G(HashSet hashSet, int i, int i10, Size size, e1.h0 h0Var) {
        if (i > size.getWidth() || i10 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) h0Var.k(i).clamp(Integer.valueOf(i10))).intValue()));
        } catch (IllegalArgumentException e3) {
            com.google.android.gms.internal.auth.g.P("VideoCapture", "No supportedHeights for width: " + i, e3);
        }
        try {
            hashSet.add(new Size(((Integer) h0Var.h(i10).clamp(Integer.valueOf(i))).intValue(), i10));
        } catch (IllegalArgumentException e7) {
            com.google.android.gms.internal.auth.g.P("VideoCapture", "No supportedWidths for height: " + i10, e7);
        }
    }

    public static int H(boolean z5, int i, int i10, Range range) {
        int i11 = i % i10;
        if (i11 != 0) {
            i = z5 ? i - i11 : i + (i10 - i11);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static e1.h0 P(a0.i0 i0Var, e eVar, z0.a aVar) {
        e1.h0 h0VarA = e1.i0.a(d1.e.c(i0Var, eVar, aVar).f15512a);
        if (h0VarA != null) {
            return g1.b.b(h0VarA, aVar != null ? aVar.f45781f.a() : null);
        }
        com.google.android.gms.internal.auth.g.O("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    @Override // a0.q2
    public final void D(Rect rect) {
        this.f211k = rect;
        Q();
    }

    public final void I(d2 d2Var, j jVar, g0.n nVar) {
        a1 a1Var;
        boolean z5 = jVar.f35621a == -1;
        boolean z10 = jVar.f35622b == 1;
        if (z5 && z10) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        d2Var.f19526a.clear();
        ((HashSet) d2Var.f19527b.f19729d).clear();
        a0.i0 i0Var = nVar.f19679c;
        if (!z5 && (a1Var = this.f35632q) != null) {
            if (z10) {
                d2Var.b(a1Var, i0Var, -1);
            } else {
                a1.m mVarA = g0.l.a(a1Var);
                if (i0Var == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                mVarA.f366f = i0Var;
                d2Var.f19526a.add(mVarA.b());
            }
        }
        j1.k kVar = this.f35636u;
        if (kVar != null && kVar.cancel(false)) {
            com.google.android.gms.internal.auth.g.e("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        j1.k kVarW = i0.o.w(new s3.q(21, this, d2Var));
        this.f35636u = kVarW;
        i4 i4Var = new i4();
        i4Var.f13783d = this;
        i4Var.f13782c = kVarW;
        i4Var.f13781b = z10;
        k0.j.a(kVarW, i4Var, hl.d.s());
    }

    public final void J() {
        b4.e();
        e2 e2Var = this.C;
        if (e2Var != null) {
            e2Var.b();
            this.C = null;
        }
        a1 a1Var = this.f35632q;
        if (a1Var != null) {
            a1Var.a();
            this.f35632q = null;
        }
        bb.e eVar = this.f35639x;
        if (eVar != null) {
            eVar.B();
            this.f35639x = null;
        }
        q0.m mVar = this.f35633r;
        if (mVar != null) {
            mVar.c();
            this.f35633r = null;
        }
        this.f35640y = null;
        this.f35637v = null;
        this.f35634s = j.f35618d;
        this.f35641z = 0;
        this.A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d2 K(y0.a aVar, g0.n nVar) {
        Object obj;
        g0.f0 f0Var;
        int i;
        a0.i0 i0Var;
        Rect rect;
        e1.h0 h0Var;
        Size size;
        g0.f0 f0Var2;
        bb.e eVar;
        y0.a aVar2;
        Set hashSet;
        b4.e();
        g0.f0 f0VarE = e();
        f0VarE.getClass();
        Size size2 = nVar.f19677a;
        t.a0 a0Var = new t.a0(13, this);
        Range range = nVar.f19681e;
        if (Objects.equals(range, g0.n.f19676h)) {
            range = nVar.f19680d == 1 ? i0.f35617c : i0.f35616b;
        }
        Range range2 = range;
        ed.d dVarA = M().d().A();
        if (dVarA.isDone()) {
            try {
                obj = dVarA.get();
            } catch (InterruptedException | ExecutionException e3) {
                throw new IllegalStateException(e3);
            }
        } else {
            obj = null;
        }
        e eVar2 = (e) obj;
        Objects.requireNonNull(eVar2);
        int i10 = nVar.f19680d;
        f0 f0VarC = M().c(f0VarE.b(), i10);
        a0.i0 i0Var2 = nVar.f19679c;
        z0.a aVarB = f0VarC.b(size2, i0Var2);
        Objects.requireNonNull((e1.i0) aVar.a(y0.a.N));
        e1.h0 h0VarP = P(i0Var2, eVar2, aVarB);
        this.f35641z = L(f0VarE);
        Rect rect2 = this.f211k;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        if (h0VarP == null || h0VarP.a(rect2.width(), rect2.height())) {
            f0Var = f0VarE;
            i = i10;
            i0Var = i0Var2;
        } else {
            f0Var = f0VarE;
            com.google.android.gms.internal.auth.g.e("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", i0.q.h(rect2), Integer.valueOf(h0VarP.c()), Integer.valueOf(h0VarP.l()), h0VarP.m(), h0VarP.p()));
            e1.h0 f0Var3 = (!(h0VarP.m().contains(Integer.valueOf(rect2.width())) && h0VarP.p().contains(Integer.valueOf(rect2.height()))) && h0VarP.f() && h0VarP.p().contains(Integer.valueOf(rect2.width())) && h0VarP.m().contains(Integer.valueOf(rect2.height()))) ? new e1.f0(h0VarP) : h0VarP;
            int iC = f0Var3.c();
            int iL = f0Var3.l();
            Range rangeM = f0Var3.m();
            Range rangeP = f0Var3.p();
            i = i10;
            int iH = H(true, rect2.width(), iC, rangeM);
            i0Var = i0Var2;
            int iH2 = H(false, rect2.width(), iC, rangeM);
            int iH3 = H(true, rect2.height(), iL, rangeP);
            int iH4 = H(false, rect2.height(), iL, rangeP);
            HashSet hashSet2 = new HashSet();
            G(hashSet2, iH, iH3, size2, f0Var3);
            G(hashSet2, iH, iH4, size2, f0Var3);
            G(hashSet2, iH2, iH3, size2, f0Var3);
            G(hashSet2, iH2, iH4, size2, f0Var3);
            if (hashSet2.isEmpty()) {
                com.google.android.gms.internal.auth.g.O("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet2);
                com.google.android.gms.internal.auth.g.e("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new b4.t(2, rect2));
                com.google.android.gms.internal.auth.g.e("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    com.google.android.gms.internal.auth.g.e("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    f2.g.h(null, width % 2 == 0 && height % 2 == 0 && width <= size2.getWidth() && height <= size2.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int iMax = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = iMax;
                        int i11 = iMax + width;
                        rect3.right = i11;
                        if (i11 > size2.getWidth()) {
                            int width2 = size2.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int iMax2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = iMax2;
                        int i12 = iMax2 + height;
                        rect3.bottom = i12;
                        if (i12 > size2.getHeight()) {
                            int height2 = size2.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    com.google.android.gms.internal.auth.g.e("VideoCapture", "Adjust cropRect from " + i0.q.h(rect2) + " to " + i0.q.h(rect3));
                    rect2 = rect3;
                }
            }
        }
        int i13 = this.f35641z;
        a0.m mVar = this.f35634s.f35623c;
        if (mVar != null) {
            mVar.getClass();
            Size sizeI = i0.q.i(i0.q.g(mVar.f162a), i13);
            rect = new Rect(0, 0, sizeI.getWidth(), sizeI.getHeight());
        } else {
            rect = rect2;
        }
        this.f35640y = rect;
        if (this.f35634s.f35623c == null || rect.equals(rect2)) {
            h0Var = h0VarP;
            size = size2;
        } else {
            float fHeight = rect.height() / rect2.height();
            h0Var = h0VarP;
            size = new Size((int) Math.ceil(size2.getWidth() * fHeight), (int) Math.ceil(size2.getHeight() * fHeight));
        }
        if (this.f35634s.f35623c != null) {
            this.A = true;
        }
        Rect rect4 = this.f35640y;
        int i14 = this.f35641z;
        g0.f0 f0Var4 = f0Var;
        int i15 = i;
        a0.i0 i0Var3 = i0Var;
        boolean zN = N(f0Var4, aVar, i15, rect4, size2, i0Var3);
        if (((SizeCannotEncodeVideoQuirk) c1.a.f2187a.i(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zN) {
                i14 = 0;
            }
            Size sizeI2 = i0.q.i(i0.q.g(rect4), i14);
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                f0Var2 = f0Var4;
                hashSet = new HashSet(Collections.singletonList(new Size(720, 1280)));
            } else {
                f0Var2 = f0Var4;
                hashSet = Collections.EMPTY_SET;
            }
            if (hashSet.contains(sizeI2)) {
                int iL2 = h0Var != null ? h0Var.l() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == sizeI2.getHeight()) {
                    rect5.left += iL2;
                    rect5.right -= iL2;
                } else {
                    rect5.top += iL2;
                    rect5.bottom -= iL2;
                }
                rect4 = rect5;
            }
        } else {
            f0Var2 = f0Var4;
        }
        this.f35640y = rect4;
        g0.f0 f0Var5 = f0Var2;
        if (N(f0Var5, aVar, i15, rect4, size2, i0Var3)) {
            com.google.android.gms.internal.auth.g.e("VideoCapture", "Surface processing is enabled.");
            g0.f0 f0VarE2 = e();
            Objects.requireNonNull(f0VarE2);
            eVar = new bb.e(f0VarE2, new q0.f(i0Var3));
        } else {
            eVar = null;
        }
        this.f35639x = eVar;
        boolean z5 = (f0Var5.n() && this.f35639x == null) ? false : true;
        s2 s2VarM = (this.f35639x == null && f0Var5.n()) ? s2.f19753b : f0Var5.p().m();
        com.google.android.gms.internal.auth.g.e("VideoCapture", "camera timebase = " + f0Var5.p().m() + ", processing timebase = " + s2VarM);
        h3 h3VarB = nVar.b();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        h3VarB.f28250b = size;
        if (range2 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        h3VarB.f28254f = range2;
        g0.n nVarD = h3VarB.d();
        f2.g.h(null, this.f35633r == null);
        q0.m mVar2 = new q0.m(2, 34, nVarD, this.f212l, f0Var5.n(), this.f35640y, this.f35641z, c(), f0Var5.n() && o(f0Var5));
        this.f35633r = mVar2;
        mVar2.a(a0Var);
        if (this.f35639x != null) {
            q0.m mVar3 = this.f35633r;
            int i16 = mVar3.f31599f;
            int i17 = mVar3.f31594a;
            Rect rect6 = mVar3.f31597d;
            s0.b bVar = new s0.b(UUID.randomUUID(), i16, i17, rect6, i0.q.i(i0.q.g(rect6), mVar3.i), mVar3.i, mVar3.f31598e);
            q0.m mVar4 = (q0.m) this.f35639x.I(new q0.c(this.f35633r, Collections.singletonList(bVar))).get(bVar);
            Objects.requireNonNull(mVar4);
            aVar2 = aVar;
            mVar4.a(new s3.q0(this, mVar4, f0Var5, aVar, s2VarM, z5, 1));
            this.f35637v = mVar4.d(f0Var5, true);
            q0.m mVar5 = this.f35633r;
            mVar5.getClass();
            b4.e();
            mVar5.b();
            f2.g.h("Consumer can only be linked once.", !mVar5.f31602j);
            mVar5.f31602j = true;
            q0.l lVar = mVar5.f31604l;
            this.f35632q = lVar;
            k0.j.f(lVar.f19513e).a(new v0(16, this, lVar), hl.d.s());
        } else {
            aVar2 = aVar;
            o2 o2VarD = this.f35633r.d(f0Var5, true);
            this.f35637v = o2VarD;
            this.f35632q = o2VarD.f189m;
        }
        m0 m0Var = (m0) aVar2.a(y0.a.M);
        Objects.requireNonNull(m0Var);
        m0Var.b(this.f35637v, s2VarM, z5);
        Q();
        this.f35632q.f19517j = MediaCodec.class;
        d2 d2VarD = d2.d(aVar2, nVar.f19677a);
        d2VarD.f19533h = i15;
        a(d2VarD, nVar);
        int iO = aVar2.o();
        if (iO != 0) {
            g0.r0 r0Var = d2VarD.f19527b;
            r0Var.getClass();
            if (iO != 0) {
                ((q1) r0Var.f19730e).y(x2.E, Integer.valueOf(iO));
            }
        }
        e2 e2Var = this.C;
        if (e2Var != null) {
            e2Var.b();
        }
        e2 e2Var2 = new e2(new g1(4, this));
        this.C = e2Var2;
        d2VarD.f19531f = e2Var2;
        g0.v0 v0Var = nVar.f19682f;
        if (v0Var != null) {
            d2VarD.f19527b.c(v0Var);
        }
        return d2VarD;
    }

    public final int L(g0.f0 f0Var) {
        boolean zO = o(f0Var);
        int iJ = j(f0Var, zO);
        a0.m mVar = this.f35634s.f35623c;
        if (mVar == null) {
            return iJ;
        }
        Objects.requireNonNull(mVar);
        int i = mVar.f163b;
        if (zO != mVar.f167f) {
            i = -i;
        }
        return i0.q.k(iJ - i);
    }

    public final m0 M() {
        m0 m0Var = (m0) ((y0.a) this.f209h).a(y0.a.M);
        Objects.requireNonNull(m0Var);
        return m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(g0.f0 r4, y0.a r5, int r6, android.graphics.Rect r7, android.util.Size r8, a0.i0 r9) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L5
            return r0
        L5:
            boolean r6 = r4.n()
            if (r6 == 0) goto L20
            g0.g r6 = y0.a.O
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.g(r6, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.util.Objects.requireNonNull(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L20
            goto L97
        L20:
            boolean r5 = r4.n()
            if (r5 == 0) goto L3d
            g0.a2 r5 = c1.a.f2187a
            boolean r5 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r5)
            if (r5 != 0) goto L97
            g0.d0 r5 = r4.p()
            g0.a2 r5 = r5.r()
            boolean r5 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r5)
            if (r5 == 0) goto L3d
            goto L97
        L3d:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk> r5 = androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.class
            g0.a2 r6 = c1.a.f2187a
            g0.w1 r5 = r6.i(r5)
            androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk r5 = (androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk) r5
            boolean r6 = r4.n()
            if (r6 == 0) goto L6d
            if (r5 == 0) goto L6d
            a0.i0 r5 = a0.i0.f112d
            if (r9 == r5) goto L55
            r5 = r1
            goto L56
        L55:
            r5 = r0
        L56:
            java.lang.String r6 = "samsung"
            java.lang.String r9 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L6d
            java.lang.String r6 = "pa3q"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L6d
            if (r5 == 0) goto L6d
            goto L97
        L6d:
            int r5 = r8.getWidth()
            int r6 = r7.width()
            if (r5 != r6) goto L97
            int r5 = r8.getHeight()
            int r6 = r7.height()
            if (r5 == r6) goto L82
            goto L97
        L82:
            boolean r5 = r4.n()
            if (r5 == 0) goto L8f
            boolean r4 = r3.o(r4)
            if (r4 == 0) goto L8f
            return r1
        L8f:
            x0.j r4 = r3.f35634s
            a0.m r4 = r4.f35623c
            if (r4 == 0) goto L96
            return r1
        L96:
            return r0
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.k0.N(g0.f0, y0.a, int, android.graphics.Rect, android.util.Size, a0.i0):boolean");
    }

    public final void O() {
        if (e() == null) {
            return;
        }
        J();
        y0.a aVar = (y0.a) this.f209h;
        g0.n nVar = this.i;
        nVar.getClass();
        d2 d2VarK = K(aVar, nVar);
        this.f35635t = d2VarK;
        I(d2VarK, this.f35634s, this.i);
        Object[] objArr = {this.f35635t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        r();
    }

    public final void Q() {
        g0.f0 f0VarE = e();
        q0.m mVar = this.f35633r;
        if (f0VarE == null || mVar == null) {
            return;
        }
        int iL = L(f0VarE);
        this.f35641z = iL;
        b4.G(new q0.j(mVar, iL, c()));
    }

    @Override // a0.q2
    public final x2 h(boolean z5, a3 a3Var) {
        E.getClass();
        y0.a aVar = i0.f35615a;
        g0.v0 v0VarA = a3Var.a(aVar.n(), 1);
        if (z5) {
            v0VarA = g0.v0.l(v0VarA, aVar);
        }
        if (v0VarA == null) {
            return null;
        }
        return new y0.a(u1.u(((t0) n(v0VarA)).f224b));
    }

    @Override // a0.q2
    public final Set l(g0.d0 d0Var) {
        return M().c(d0Var, 0).a();
    }

    @Override // a0.q2
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // a0.q2
    public final w2 n(g0.v0 v0Var) {
        return new t0(q1.w(v0Var), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    @Override // a0.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.x2 v(g0.d0 r23, g0.w2 r24) {
        /*
            Method dump skipped, instruction units count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.k0.v(g0.d0, g0.w2):g0.x2");
    }

    @Override // a0.q2
    public final void w() {
        this.f202a = true;
        com.google.android.gms.internal.auth.g.e("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + g());
        g0.n nVar = this.i;
        if (nVar == null || this.f35637v != null) {
            return;
        }
        t1 t1VarF = M().f();
        Object obj = j.f35618d;
        ed.d dVarA = t1VarF.A();
        if (dVarA.isDone()) {
            try {
                obj = dVarA.get();
            } catch (InterruptedException | ExecutionException e3) {
                throw new IllegalStateException(e3);
            }
        }
        this.f35634s = (j) obj;
        d2 d2VarK = K((y0.a) this.f209h, nVar);
        this.f35635t = d2VarK;
        I(d2VarK, this.f35634s, nVar);
        Object[] objArr = {this.f35635t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        F(Collections.unmodifiableList(arrayList));
        q();
        M().f().J(hl.d.s(), this.D);
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.b();
        }
        g0.c0 c0VarF = f();
        j0 j0Var2 = new j0();
        j0Var2.f35625b = false;
        j0Var2.f35624a = c0VarF;
        this.B = j0Var2;
        M().g().J(hl.d.s(), this.B);
        if (2 != this.f35638w) {
            this.f35638w = 2;
            M().e(2);
        }
    }

    @Override // a0.q2
    public final void x() {
        com.google.android.gms.internal.auth.g.e("VideoCapture", "VideoCapture#onStateDetached");
        f2.g.h("VideoCapture can only be detached on the main thread.", b4.E());
        if (this.B != null) {
            M().g().v(this.B);
            this.B.b();
            this.B = null;
        }
        if (3 != this.f35638w) {
            this.f35638w = 3;
            M().e(3);
        }
        M().f().v(this.D);
        j1.k kVar = this.f35636u;
        if (kVar != null && kVar.cancel(false)) {
            com.google.android.gms.internal.auth.g.e("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        J();
    }

    @Override // a0.q2
    public final g0.n y(g0.v0 v0Var) {
        this.f35635t.a(v0Var);
        Object[] objArr = {this.f35635t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        g0.n nVar = this.i;
        Objects.requireNonNull(nVar);
        h3 h3VarB = nVar.b();
        h3VarB.f28255g = v0Var;
        return h3VarB.d();
    }

    @Override // a0.q2
    public final g0.n z(g0.n nVar, g0.n nVar2) {
        Size size = nVar.f19677a;
        com.google.android.gms.internal.auth.g.e("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        List list = (List) ((y0.a) this.f209h).g(i1.f19613r, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(size)) {
            com.google.android.gms.internal.auth.g.O("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + arrayList);
        }
        return nVar;
    }
}
