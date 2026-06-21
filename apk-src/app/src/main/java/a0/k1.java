package a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.google.android.gms.internal.measurement.b4;
import g0.a3;
import g0.w2;
import g0.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends q2 {
    public static final j1 B = new j1();
    public final a7.l A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference f141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rational f144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l0.i f145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0.d2 f146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a1.m f147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f0.s f148y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g0.e2 f149z;

    public k1(g0.g1 g1Var) {
        super(g1Var);
        this.f141r = new AtomicReference(null);
        this.f143t = -1;
        this.f144u = null;
        this.A = new a7.l(2, this);
        g0.g1 g1Var2 = (g0.g1) this.f209h;
        g0.g gVar = g0.g1.M;
        if (g1Var2.h(gVar)) {
            this.f140q = ((Integer) g1Var2.a(gVar)).intValue();
        } else {
            this.f140q = 1;
        }
        this.f142s = ((Integer) g1Var2.g(g0.g1.T, 0)).intValue();
        this.f145v = new l0.i((l0.i) g1Var2.g(g0.g1.V, null));
    }

    public static boolean J(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // a0.q2
    public final void A() {
        l0.i iVar = this.f145v;
        iVar.c();
        iVar.b();
        f0.s sVar = this.f148y;
        if (sVar != null) {
            sVar.b();
        }
        G(false);
        f().m(null);
    }

    public final void G(boolean z5) {
        f0.s sVar;
        Log.d("ImageCapture", "clearPipeline");
        b4.e();
        g0.e2 e2Var = this.f149z;
        if (e2Var != null) {
            e2Var.b();
            this.f149z = null;
        }
        a1.m mVar = this.f147x;
        if (mVar != null) {
            mVar.e();
            this.f147x = null;
        }
        if (!z5 && (sVar = this.f148y) != null) {
            sVar.b();
            this.f148y = null;
        }
        f().i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.d2 H(java.lang.String r22, g0.g1 r23, g0.n r24) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.k1.H(java.lang.String, g0.g1, g0.n):g0.d2");
    }

    public final int I() {
        int iIntValue;
        synchronized (this.f141r) {
            iIntValue = this.f143t;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((g0.g1) this.f209h).g(g0.g1.N, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void K(g0 g0Var, Executor executor, com.google.firebase.messaging.y yVar) {
        Rect rect;
        int iRound;
        int i;
        int i10;
        int i11;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            hl.d.s().execute(new i1(this, g0Var, executor, yVar, 0));
            return;
        }
        b4.e();
        if (I() == 3 && this.f145v.f27741a == null) {
            throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        Log.d("ImageCapture", "takePictureInternal");
        g0.f0 f0VarE = e();
        Rect rect2 = null;
        if (f0VarE == null || !this.f202a) {
            yVar.t(new l1("Not bound to a valid Camera [" + this + "]", null, 4));
            return;
        }
        boolean z5 = ((Integer) this.f209h.g(g0.h1.f19580g, 0)).intValue() != 0;
        if (z5) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        f0.s sVar = this.f148y;
        Objects.requireNonNull(sVar);
        Rect rect3 = this.f211k;
        Size sizeD = d();
        Objects.requireNonNull(sizeD);
        if (rect3 == null) {
            Rational rational = this.f144u;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect3 = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                rect = rect3;
            } else {
                g0.f0 f0VarE2 = e();
                Objects.requireNonNull(f0VarE2);
                int iJ = j(f0VarE2, false);
                Rational rational2 = new Rational(this.f144u.getDenominator(), this.f144u.getNumerator());
                if (!i0.q.d(iJ)) {
                    rational2 = this.f144u;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    com.google.android.gms.internal.auth.g.O("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeD.getWidth();
                    int height = sizeD.getHeight();
                    float f10 = width;
                    float f11 = height;
                    float f12 = f10 / f11;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f12) {
                        int iRound2 = Math.round((f10 / numerator) * denominator);
                        i11 = (height - iRound2) / 2;
                        i10 = iRound2;
                        iRound = width;
                        i = 0;
                    } else {
                        iRound = Math.round((f11 / denominator) * numerator);
                        i = (width - iRound) / 2;
                        i10 = height;
                        i11 = 0;
                    }
                    rect2 = new Rect(i, i11, iRound + i, i10 + i11);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
            }
        } else {
            rect = rect3;
        }
        Matrix matrix = this.f212l;
        int iJ2 = j(f0VarE, false);
        g0.g1 g1Var = (g0.g1) this.f209h;
        g0.g gVar = g0.g1.U;
        if (g1Var.h(gVar)) {
            iIntValue = ((Integer) g1Var.a(gVar)).intValue();
        } else {
            int i12 = this.f140q;
            if (i12 == 0) {
                iIntValue = 100;
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException(u.k(i12, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i13 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.f146w.f19530e);
        f2.g.a("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        f0.f fVar = new f0.f(executor, yVar, g0Var, rect, matrix, iJ2, i13, this.f140q, z5, listUnmodifiableList);
        if (z5) {
            Boolean bool = Boolean.FALSE;
            HashMap map = fVar.f16496b;
            map.put(32, bool);
            map.put(256, bool);
        }
        b4.e();
        sVar.f16552b.offer(fVar);
        sVar.c();
    }

    public final void L() {
        synchronized (this.f141r) {
            try {
                if (this.f141r.get() != null) {
                    return;
                }
                f().g(I());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a0.q2
    public final x2 h(boolean z5, a3 a3Var) {
        B.getClass();
        g0.g1 g1Var = j1.f132a;
        g0.v0 v0VarA = a3Var.a(g1Var.n(), this.f140q);
        if (z5) {
            v0VarA = g0.v0.l(v0VarA, g1Var);
        }
        if (v0VarA == null) {
            return null;
        }
        return new g0.g1(g0.u1.u(((t0) n(v0VarA)).f224b));
    }

    @Override // a0.q2
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // a0.q2
    public final w2 n(g0.v0 v0Var) {
        return new t0(g0.q1.w(v0Var), 1);
    }

    @Override // a0.q2
    public final void t() {
        f2.g.g(e(), "Attached camera cannot be null");
        if (I() == 3) {
            g0.f0 f0VarE = e();
            if ((f0VarE != null ? f0VarE.b().l() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(i());
    }

    @Override // a0.q2
    public final void u() {
        com.google.android.gms.internal.auth.g.e("ImageCapture", "onCameraControlReady");
        L();
        f().m(this.f145v);
    }

    @Override // a0.q2
    public final x2 v(g0.d0 d0Var, w2 w2Var) {
        HashSet<b0.a> hashSet = this.f208g;
        boolean z5 = false;
        if (hashSet != null) {
            int i = 0;
            for (b0.a aVar : hashSet) {
                if (aVar instanceof d0.d) {
                    i = ((d0.d) aVar).f15496a;
                }
            }
            w2Var.a().y(g0.g1.Q, Integer.valueOf(i));
        }
        if (d0Var.r().h(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            g0.q1 q1VarA = w2Var.a();
            g0.g gVar = g0.g1.S;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(q1VarA.g(gVar, bool2))) {
                com.google.android.gms.internal.auth.g.O("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                com.google.android.gms.internal.auth.g.t("ImageCapture", "Requesting software JPEG due to device quirk.");
                w2Var.a().y(gVar, bool2);
            }
        }
        g0.q1 q1VarA2 = w2Var.a();
        Boolean bool3 = Boolean.TRUE;
        g0.g gVar2 = g0.g1.S;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(q1VarA2.g(gVar2, bool4))) {
            if (e() != null) {
                e().i().p();
            }
            Integer num = (Integer) q1VarA2.g(g0.g1.P, null);
            if (num == null || num.intValue() == 256) {
                z5 = true;
            } else {
                com.google.android.gms.internal.auth.g.O("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z5) {
                com.google.android.gms.internal.auth.g.O("ImageCapture", "Unable to support software JPEG. Disabling.");
                q1VarA2.y(gVar2, bool4);
            }
        }
        Integer num2 = (Integer) w2Var.a().g(g0.g1.P, null);
        if (num2 != null) {
            if (e() != null) {
                e().i().p();
            }
            w2Var.a().y(g0.h1.f19579f, Integer.valueOf(z5 ? 35 : num2.intValue()));
        } else {
            g0.q1 q1VarA3 = w2Var.a();
            g0.g gVar3 = g0.g1.Q;
            if (Objects.equals(q1VarA3.g(gVar3, null), 2)) {
                w2Var.a().y(g0.h1.f19579f, 32);
            } else if (Objects.equals(w2Var.a().g(gVar3, null), 3)) {
                w2Var.a().y(g0.h1.f19579f, 32);
                w2Var.a().y(g0.h1.f19580g, 256);
            } else if (Objects.equals(w2Var.a().g(gVar3, null), 1)) {
                w2Var.a().y(g0.h1.f19579f, 4101);
                w2Var.a().y(g0.h1.f19581h, i0.f111c);
            } else if (z5) {
                w2Var.a().y(g0.h1.f19579f, 35);
            } else {
                List list = (List) w2Var.a().g(g0.i1.f19611p, null);
                if (list == null || J(256, list)) {
                    w2Var.a().y(g0.h1.f19579f, 256);
                } else if (J(35, list)) {
                    w2Var.a().y(g0.h1.f19579f, 35);
                }
            }
        }
        return w2Var.b();
    }

    @Override // a0.q2
    public final void x() {
        l0.i iVar = this.f145v;
        iVar.c();
        iVar.b();
        f0.s sVar = this.f148y;
        if (sVar != null) {
            sVar.b();
        }
    }

    @Override // a0.q2
    public final g0.n y(g0.v0 v0Var) {
        this.f146w.a(v0Var);
        Object[] objArr = {this.f146w.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        h3 h3VarB = this.i.b();
        h3VarB.f28255g = v0Var;
        return h3VarB.d();
    }

    @Override // a0.q2
    public final g0.n z(g0.n nVar, g0.n nVar2) {
        com.google.android.gms.internal.auth.g.e("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        g0.d2 d2VarH = H(g(), (g0.g1) this.f209h, nVar);
        this.f146w = d2VarH;
        Object[] objArr = {d2VarH.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        q();
        return nVar;
    }
}
