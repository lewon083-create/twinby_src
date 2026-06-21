package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dl1 extends ok1 {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int[] f37798p1 = {1920, 1600, 1440, 1280, VKApiCodes.CODE_CALL_REQUIRES_AUTH, 854, 640, 540, 480};

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static boolean f37799q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static boolean f37800r1;
    public final Context G0;
    public final xh3 H0;
    public final fj3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public bl1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public jd2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f37801a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f37802b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f37803c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f37804d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f37805e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f37806f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f37807g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f37808h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f37809i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f37810j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public rj3 f37811k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f37812l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f37813m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public cl1 f37814n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public qh3 f37815o1;

    public dl1(Context context, ee0 ee0Var, qk1 qk1Var, boolean z5, Handler handler, xn0 xn0Var) {
        super(2, ee0Var, qk1Var, z5, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new xh3(applicationContext);
        this.I0 = new fj3(handler, xn0Var);
        this.L0 = B();
        this.X0 = -9223372036854775807L;
        this.f37807g1 = -1;
        this.f37808h1 = -1;
        this.f37810j1 = -1.0f;
        this.S0 = 1;
        this.f37813m1 = 0;
        A();
    }

    public static boolean B() {
        return rk2.f42621g.Z0().equals(lb3.f40468c);
    }

    public static boolean C() {
        int i = lb3.f40466a;
        if (i <= 28) {
            el1 el1Var = rk2.f42621g;
            String strR = el1Var.r();
            String str = lb3.f40467b;
            if (strR.equals(str) || el1Var.I().equals(str) || el1Var.K().equals(str) || el1Var.J().equals(str) || el1Var.Q0().equals(str) || el1Var.P0().equals(str) || el1Var.d1().equals(str) || el1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i <= 27 && rk2.f42621g.w0().equals(lb3.f40467b)) {
            return true;
        }
        if (i > 26) {
            return false;
        }
        el1 el1Var2 = rk2.f42621g;
        String strA = el1Var2.a();
        String str2 = lb3.f40467b;
        if (!strA.equals(str2) && !el1Var2.b().equals(str2) && !el1Var2.c().equals(str2) && !el1Var2.d().equals(str2) && !el1Var2.e().equals(str2) && !el1Var2.f().equals(str2) && !el1Var2.g().equals(str2) && !el1Var2.h().equals(str2) && !el1Var2.i().equals(str2) && !el1Var2.j().equals(str2) && !el1Var2.k().equals(str2) && !el1Var2.l().equals(str2) && !el1Var2.m().equals(str2) && !el1Var2.s().equals(str2) && !el1Var2.t().equals(str2) && !el1Var2.u().equals(str2) && !el1Var2.v().equals(str2) && !el1Var2.w().equals(str2) && !el1Var2.y().equals(str2) && !el1Var2.z().equals(str2) && !el1Var2.A().equals(str2) && !el1Var2.B().equals(str2) && !el1Var2.C().equals(str2) && !el1Var2.D().equals(str2) && !el1Var2.E().equals(str2) && !el1Var2.F().equals(str2) && !el1Var2.G().equals(str2) && !el1Var2.H().equals(str2) && !el1Var2.L().equals(str2) && !el1Var2.M().equals(str2) && !el1Var2.N().equals(str2) && !el1Var2.O().equals(str2) && !el1Var2.P().equals(str2) && !el1Var2.Q().equals(str2) && !el1Var2.R().equals(str2) && !el1Var2.S().equals(str2) && !el1Var2.T().equals(str2) && !el1Var2.U().equals(str2) && !el1Var2.V().equals(str2) && !el1Var2.W().equals(str2) && !el1Var2.X().equals(str2) && !el1Var2.Y().equals(str2) && !el1Var2.Z().equals(str2) && !el1Var2.a0().equals(str2) && !el1Var2.b0().equals(str2) && !el1Var2.c0().equals(str2) && !el1Var2.d0().equals(str2) && !el1Var2.e0().equals(str2) && !el1Var2.f0().equals(str2) && !el1Var2.g0().equals(str2) && !el1Var2.h0().equals(str2) && !el1Var2.i0().equals(str2) && !el1Var2.j0().equals(str2) && !el1Var2.k0().equals(str2) && !el1Var2.l0().equals(str2) && !el1Var2.m0().equals(str2) && !el1Var2.n0().equals(str2) && !el1Var2.o0().equals(str2) && !el1Var2.p0().equals(str2) && !el1Var2.q0().equals(str2) && !el1Var2.r0().equals(str2) && !el1Var2.s0().equals(str2) && !el1Var2.t0().equals(str2) && !el1Var2.u0().equals(str2) && !el1Var2.v0().equals(str2) && !el1Var2.x0().equals(str2) && !el1Var2.y0().equals(str2) && !el1Var2.z0().equals(str2) && !el1Var2.A0().equals(str2) && !el1Var2.B0().equals(str2) && !el1Var2.C0().equals(str2) && !el1Var2.D0().equals(str2) && !el1Var2.E0().equals(str2) && !el1Var2.F0().equals(str2) && !el1Var2.H0().equals(str2) && !el1Var2.I0().equals(str2) && !el1Var2.K0().equals(str2) && !el1Var2.L0().equals(str2) && !el1Var2.M0().equals(str2) && !el1Var2.N0().equals(str2) && !el1Var2.O0().equals(str2) && !el1Var2.R0().equals(str2) && !el1Var2.S0().equals(str2) && !el1Var2.T0().equals(str2) && !el1Var2.U0().equals(str2) && !el1Var2.V0().equals(str2) && !el1Var2.W0().equals(str2) && !el1Var2.X0().equals(str2) && !el1Var2.Y0().equals(str2) && !el1Var2.a1().equals(str2) && !el1Var2.b1().equals(str2) && !el1Var2.f1().equals(str2) && !el1Var2.g1().equals(str2) && !el1Var2.h1().equals(str2) && !el1Var2.i1().equals(str2) && !el1Var2.j1().equals(str2) && !el1Var2.k1().equals(str2) && !el1Var2.l1().equals(str2) && !el1Var2.m1().equals(str2) && !el1Var2.n1().equals(str2) && !el1Var2.o1().equals(str2) && !el1Var2.p1().equals(str2) && !el1Var2.q1().equals(str2) && !el1Var2.r1().equals(str2) && !el1Var2.s1().equals(str2) && !el1Var2.t1().equals(str2) && !el1Var2.u1().equals(str2) && !el1Var2.v1().equals(str2) && !el1Var2.w1().equals(str2) && !el1Var2.x1().equals(str2) && !el1Var2.y1().equals(str2) && !el1Var2.z1().equals(str2) && !el1Var2.A1().equals(str2) && !el1Var2.B1().equals(str2) && !el1Var2.C1().equals(str2) && !el1Var2.D1().equals(str2) && !el1Var2.E1().equals(str2) && !el1Var2.G1().equals(str2) && !el1Var2.H1().equals(str2) && !el1Var2.I1().equals(str2) && !el1Var2.F1().equals(str2) && !el1Var2.J1().equals(str2) && !el1Var2.K1().equals(str2) && !el1Var2.L1().equals(str2) && !el1Var2.M1().equals(str2) && !el1Var2.N1().equals(str2) && !el1Var2.O1().equals(str2) && !el1Var2.P1().equals(str2) && !el1Var2.Q1().equals(str2) && !el1Var2.R1().equals(str2) && !el1Var2.S1().equals(str2) && !el1Var2.T1().equals(str2) && !el1Var2.U1().equals(str2) && !el1Var2.V1().equals(str2) && !el1Var2.W1().equals(str2) && !el1Var2.X1().equals(str2) && !el1Var2.Y1().equals(str2) && !el1Var2.Z1().equals(str2) && !el1Var2.a2().equals(str2) && !el1Var2.b2().equals(str2)) {
            String strN = el1Var2.n();
            String str3 = lb3.f40469d;
            if (!strN.equals(str3) && !el1Var2.o().equals(str3) && !el1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (str.startsWith(rk2.f42621g.c1())) {
            return false;
        }
        synchronized (dl1.class) {
            try {
                if (!f37799q1) {
                    f37800r1 = C();
                    f37799q1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37800r1;
    }

    public final void A() {
        this.f37811k1 = null;
    }

    public final void D() {
        int i = this.f37807g1;
        if (i == -1 && this.f37808h1 == -1) {
            return;
        }
        rj3 rj3Var = this.f37811k1;
        if (rj3Var != null && rj3Var.f42611b == i && rj3Var.f42612c == this.f37808h1 && rj3Var.f42613d == this.f37809i1 && rj3Var.f42614e == this.f37810j1) {
            return;
        }
        rj3 rj3Var2 = new rj3(i, this.f37808h1, this.f37809i1, this.f37810j1);
        this.f37811k1 = rj3Var2;
        this.I0.b(rj3Var2);
    }

    @Override // yads.ok1
    public final va0 a(kk1 kk1Var, nx0 nx0Var, nx0 nx0Var2) {
        va0 va0VarA = kk1Var.a(nx0Var, nx0Var2);
        int i = va0VarA.f43979e;
        int i10 = nx0Var2.f41380r;
        bl1 bl1Var = this.M0;
        if (i10 > bl1Var.f37089a || nx0Var2.f41381s > bl1Var.f37090b) {
            i |= 256;
        }
        if (b(nx0Var2, kk1Var) > this.M0.f37091c) {
            i |= 64;
        }
        int i11 = i;
        return new va0(kk1Var.f40227a, nx0Var, nx0Var2, i11 != 0 ? 0 : va0VarA.f43978d, i11);
    }

    public final void c(long j10) {
        pa0 pa0Var = this.B0;
        pa0Var.f41860k += j10;
        pa0Var.f41861l++;
        this.f37805e1 += j10;
        this.f37806f1++;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.ok1, yads.ro
    public final boolean g() {
        jd2 jd2Var;
        if (super.g() && (this.T0 || (((jd2Var = this.Q0) != null && this.P0 == jd2Var) || this.K == null || this.f37812l1))) {
            this.X0 = -9223372036854775807L;
            return true;
        }
        if (this.X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = -9223372036854775807L;
        return false;
    }

    @Override // yads.ro
    public final void h() {
        this.f37811k1 = null;
        z();
        this.R0 = false;
        this.f37814n1 = null;
        try {
            this.B = null;
            this.C0 = -9223372036854775807L;
            this.D0 = -9223372036854775807L;
            this.E0 = 0;
            p();
        } finally {
            this.I0.a(this.B0);
        }
    }

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
    @Override // yads.ro, yads.cf2
    public final void handleMessage(int i, Object obj) {
        boolean z5;
        if (i != 1) {
            if (i == 7) {
                this.f37815o1 = (qh3) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f37813m1 != iIntValue) {
                    this.f37813m1 = iIntValue;
                    if (this.f37812l1) {
                        u();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.S0 = iIntValue2;
                fk1 fk1Var = this.K;
                if (fk1Var != null) {
                    fk1Var.setVideoScalingMode(iIntValue2);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            xh3 xh3Var = this.H0;
            int iIntValue3 = ((Integer) obj).intValue();
            if (xh3Var.f44709j == iIntValue3) {
                return;
            }
            xh3Var.f44709j = iIntValue3;
            xh3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            jd2 jd2Var = this.Q0;
            if (jd2Var != null) {
                surface2 = jd2Var;
            } else {
                kk1 kk1Var = this.R;
                surface2 = surface;
                if (kk1Var != null) {
                    surface2 = surface;
                    if (b(kk1Var)) {
                        Context context = this.G0;
                        boolean z10 = kk1Var.f40232f;
                        int i10 = jd2.f39833e;
                        if (z10) {
                            synchronized (jd2.class) {
                                try {
                                    if (!jd2.f39834f) {
                                        jd2.f39833e = tz0.a(context) ? tz0.c() ? 1 : 2 : 0;
                                        jd2.f39834f = true;
                                    }
                                    z5 = jd2.f39833e != 0;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (!z5) {
                                throw new IllegalStateException();
                            }
                        }
                        jd2 jd2VarA = new id2().a(z10 ? jd2.f39833e : 0);
                        this.Q0 = jd2VarA;
                        surface2 = jd2VarA;
                    }
                }
            }
        }
        if (this.P0 == surface2) {
            if (surface2 == null || surface2 == this.Q0) {
                return;
            }
            rj3 rj3Var = this.f37811k1;
            if (rj3Var != null) {
                this.I0.b(rj3Var);
            }
            if (this.R0) {
                this.I0.a(this.P0);
                return;
            }
            return;
        }
        this.P0 = surface2;
        xh3 xh3Var2 = this.H0;
        xh3Var2.getClass();
        Surface surface3 = surface2 instanceof jd2 ? null : surface2;
        Surface surface4 = xh3Var2.f44705e;
        if (surface4 != surface3) {
            if (lb3.f40466a >= 30 && surface4 != null && xh3Var2.f44709j != Integer.MIN_VALUE && xh3Var2.f44708h != 0.0f) {
                xh3Var2.f44708h = 0.0f;
                rh3.a(surface4, 0.0f);
            }
            xh3Var2.f44705e = surface3;
            xh3Var2.a(true);
        }
        this.R0 = false;
        int i11 = this.f42649g;
        fk1 fk1Var2 = this.K;
        if (fk1Var2 != null) {
            if (lb3.f40466a < 23 || surface2 == null || this.N0) {
                u();
                r();
            } else {
                fk1Var2.a(surface2);
            }
        }
        if (surface2 == null || surface2 == this.Q0) {
            this.f37811k1 = null;
            z();
            return;
        }
        rj3 rj3Var2 = this.f37811k1;
        if (rj3Var2 != null) {
            this.I0.b(rj3Var2);
        }
        z();
        if (i11 == 2) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        }
    }

    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.f41565m0 = false;
                this.f41579u.b();
                this.f41577t.b();
                this.f41564l0 = false;
                this.f41563k0 = false;
                u();
            } finally {
                nk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            jd2 jd2Var = this.Q0;
            if (jd2Var != null) {
                if (this.P0 == jd2Var) {
                    this.P0 = null;
                }
                jd2Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.f37804d1 = SystemClock.elapsedRealtime() * 1000;
        this.f37805e1 = 0L;
        this.f37806f1 = 0;
        this.H0.a();
    }

    @Override // yads.ro
    public final void k() {
        Surface surface;
        this.X0 = -9223372036854775807L;
        if (this.Z0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, jElapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = jElapsedRealtime;
        }
        int i = this.f37806f1;
        if (i != 0) {
            this.I0.c(i, this.f37805e1);
            this.f37805e1 = 0L;
            this.f37806f1 = 0;
        }
        xh3 xh3Var = this.H0;
        xh3Var.f44704d = false;
        th3 th3Var = xh3Var.f44702b;
        if (th3Var != null) {
            th3Var.a();
            wh3 wh3Var = xh3Var.f44703c;
            wh3Var.getClass();
            wh3Var.f44409c.sendEmptyMessage(2);
        }
        if (lb3.f40466a < 30 || (surface = xh3Var.f44705e) == null || xh3Var.f44709j == Integer.MIN_VALUE || xh3Var.f44708h == 0.0f) {
            return;
        }
        xh3Var.f44708h = 0.0f;
        rh3.a(surface, 0.0f);
    }

    @Override // yads.ok1
    public final boolean q() {
        return this.f37812l1 && lb3.f40466a < 23;
    }

    @Override // yads.ok1
    public final void s() {
        z();
    }

    @Override // yads.ok1
    public final void w() {
        super.w();
        this.f37802b1 = 0;
    }

    public final void z() {
        fk1 fk1Var;
        this.T0 = false;
        if (lb3.f40466a < 23 || !this.f37812l1 || (fk1Var = this.K) == null) {
            return;
        }
        this.f37814n1 = new cl1(this, fk1Var);
    }

    public static int a(nx0 nx0Var, kk1 kk1Var) {
        int i;
        int i10;
        int iIntValue;
        int i11 = nx0Var.f41380r;
        int i12 = nx0Var.f41381s;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = nx0Var.f41375m;
        if ("video/dolby-vision".equals(str)) {
            Pair pairB = yk1.b(nx0Var);
            str = (pairB == null || !((iIntValue = ((Integer) pairB.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        i = 4;
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i10 = i12 * i11;
                i = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i10 = i12 * i11;
                break;
            case "video/avc":
                el1 el1Var = rk2.f42621g;
                String strX = el1Var.x();
                String str2 = lb3.f40469d;
                if (!strX.equals(str2) && (!el1Var.q().equals(lb3.f40468c) || (!el1Var.J0().equals(str2) && (!el1Var.p().equals(str2) || !kk1Var.f40232f)))) {
                    i10 = ((i12 + 15) / 16) * ((i11 + 15) / 16) * 256;
                    i = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static int b(nx0 nx0Var, kk1 kk1Var) {
        if (nx0Var.f41376n != -1) {
            int size = nx0Var.f41377o.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += ((byte[]) nx0Var.f41377o.get(i)).length;
            }
            return nx0Var.f41376n + length;
        }
        return a(nx0Var, kk1Var);
    }

    @Override // yads.ok1
    public final void b(sa0 sa0Var) {
        boolean z5 = this.f37812l1;
        if (!z5) {
            this.f37802b1++;
        }
        if (lb3.f40466a >= 23 || !z5) {
            return;
        }
        long j10 = sa0Var.f42866f;
        b(j10);
        D();
        this.B0.f41855e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j10);
    }

    @Override // yads.ok1
    public final float a(float f10, nx0[] nx0VarArr) {
        float fMax = -1.0f;
        for (nx0 nx0Var : nx0VarArr) {
            float f11 = nx0Var.f41382t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // yads.ok1
    public final ArrayList a(qk1 qk1Var, nx0 nx0Var, boolean z5) {
        return yk1.a(a(qk1Var, nx0Var, z5, this.f37812l1), nx0Var);
    }

    public static r51 a(qk1 qk1Var, nx0 nx0Var, boolean z5, boolean z10) {
        String str = nx0Var.f41375m;
        if (str == null) {
            o51 o51Var = r51.f42498c;
            return um2.f43723f;
        }
        ((zl.u0) qk1Var).getClass();
        List listA = yk1.a(str, z5, z10);
        String strA = yk1.a(nx0Var);
        if (strA == null) {
            return r51.a((Collection) listA);
        }
        List listA2 = yk1.a(strA, z5, z10);
        o51 o51Var2 = r51.f42498c;
        return new n51().a(listA).a(listA2).a();
    }

    public final boolean b(kk1 kk1Var) {
        boolean z5;
        int i;
        if (lb3.f40466a >= 23 && !this.f37812l1 && !b(kk1Var.f40227a)) {
            if (kk1Var.f40232f) {
                Context context = this.G0;
                synchronized (jd2.class) {
                    try {
                        if (!jd2.f39834f) {
                            if (tz0.a(context)) {
                                i = tz0.c() ? 1 : 2;
                            } else {
                                i = 0;
                            }
                            jd2.f39833e = i;
                            jd2.f39834f = true;
                        }
                        z5 = jd2.f39833e != 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z5) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // yads.ok1
    public final ck1 a(kk1 kk1Var, nx0 nx0Var, MediaCrypto mediaCrypto, float f10) {
        bl1 bl1Var;
        Point point;
        boolean z5;
        int i;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        Pair pairB;
        int iA;
        jd2 jd2Var = this.Q0;
        if (jd2Var != null && jd2Var.f39835b != kk1Var.f40232f) {
            if (this.P0 == jd2Var) {
                this.P0 = null;
            }
            jd2Var.release();
            this.Q0 = null;
        }
        String str = kk1Var.f40229c;
        nx0[] nx0VarArr = this.i;
        nx0VarArr.getClass();
        int iMax = nx0Var.f41380r;
        int iMax2 = nx0Var.f41381s;
        int iB = b(nx0Var, kk1Var);
        if (nx0VarArr.length == 1) {
            if (iB != -1 && (iA = a(nx0Var, kk1Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            bl1Var = new bl1(iMax, iMax2, iB);
        } else {
            int length = nx0VarArr.length;
            boolean z11 = false;
            for (int i14 = 0; i14 < length; i14++) {
                nx0 nx0Var2 = nx0VarArr[i14];
                if (nx0Var.f41387y != null && nx0Var2.f41387y == null) {
                    mx0 mx0Var = new mx0(nx0Var2);
                    mx0Var.f41087w = nx0Var.f41387y;
                    nx0Var2 = new nx0(mx0Var);
                }
                if (kk1Var.a(nx0Var, nx0Var2).f43978d != 0) {
                    int i15 = nx0Var2.f41380r;
                    z11 |= i15 == -1 || nx0Var2.f41381s == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, nx0Var2.f41381s);
                    iB = Math.max(iB, b(nx0Var2, kk1Var));
                }
            }
            if (z11) {
                kh1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i16 = nx0Var.f41381s;
                int i17 = nx0Var.f41380r;
                boolean z12 = i16 > i17;
                int i18 = z12 ? i16 : i17;
                if (z12) {
                    i16 = i17;
                }
                float f11 = i16 / i18;
                int[] iArr = f37798p1;
                int i19 = 0;
                while (i19 < 9) {
                    int i20 = iArr[i19];
                    int i21 = (int) (i20 * f11);
                    if (i20 <= i18 || i21 <= i16) {
                        break;
                    }
                    int i22 = i16;
                    float f12 = f11;
                    if (lb3.f40466a >= 21) {
                        int i23 = z12 ? i21 : i20;
                        if (!z12) {
                            i20 = i21;
                        }
                        point = kk1Var.a(i23, i20);
                        z5 = z12;
                        i = i18;
                        if (kk1Var.a(point.x, point.y, nx0Var.f41382t)) {
                            break;
                        }
                        i19++;
                        i16 = i22;
                        f11 = f12;
                        z12 = z5;
                        i18 = i;
                    } else {
                        z5 = z12;
                        i = i18;
                        try {
                            int i24 = ((i20 + 15) / 16) * 16;
                            int i25 = ((i21 + 15) / 16) * 16;
                            if (i24 * i25 <= yk1.a()) {
                                int i26 = z5 ? i25 : i24;
                                if (!z5) {
                                    i24 = i25;
                                }
                                point = new Point(i26, i24);
                            } else {
                                i19++;
                                i16 = i22;
                                f11 = f12;
                                z12 = z5;
                                i18 = i;
                            }
                        } catch (tk1 unused) {
                            point = null;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    mx0 mx0Var2 = new mx0(nx0Var);
                    mx0Var2.f41080p = iMax;
                    mx0Var2.f41081q = iMax2;
                    iB = Math.max(iB, a(new nx0(mx0Var2), kk1Var));
                    kh1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            bl1Var = new bl1(iMax, iMax2, iB);
        }
        this.M0 = bl1Var;
        boolean z13 = this.L0;
        int i27 = this.f37812l1 ? this.f37813m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", nx0Var.f41380r);
        mediaFormat.setInteger("height", nx0Var.f41381s);
        List list = nx0Var.f41377o;
        for (int i28 = 0; i28 < list.size(); i28++) {
            mediaFormat.setByteBuffer(og2.a("csd-", i28), ByteBuffer.wrap((byte[]) list.get(i28)));
        }
        float f13 = nx0Var.f41382t;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        sl1.a(mediaFormat, "rotation-degrees", nx0Var.f41383u);
        mx mxVar = nx0Var.f41387y;
        if (mxVar != null) {
            sl1.a(mediaFormat, "color-transfer", mxVar.f41063d);
            sl1.a(mediaFormat, "color-standard", mxVar.f41061b);
            sl1.a(mediaFormat, "color-range", mxVar.f41062c);
            byte[] bArr = mxVar.f41064e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(nx0Var.f41375m) && (pairB = yk1.b(nx0Var)) != null) {
            sl1.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", bl1Var.f37089a);
        mediaFormat.setInteger("max-height", bl1Var.f37090b);
        sl1.a(mediaFormat, "max-input-size", bl1Var.f37091c);
        if (lb3.f40466a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
            i10 = 0;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (this.P0 == null) {
            if (b(kk1Var)) {
                if (this.Q0 == null) {
                    Context context = this.G0;
                    boolean z14 = kk1Var.f40232f;
                    int i29 = jd2.f39833e;
                    if (z14) {
                        synchronized (jd2.class) {
                            try {
                                if (jd2.f39834f) {
                                    i11 = 1;
                                } else {
                                    if (tz0.a(context)) {
                                        i13 = tz0.c() ? 1 : 2;
                                    } else {
                                        i13 = i10;
                                    }
                                    jd2.f39833e = i13;
                                    i11 = 1;
                                    jd2.f39834f = true;
                                }
                                i12 = jd2.f39833e != 0 ? i11 : i10;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i12 == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    this.Q0 = new id2().a(z14 ? jd2.f39833e : i10);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new ck1(kk1Var, mediaFormat, nx0Var, this.P0, mediaCrypto);
    }

    @Override // yads.ok1
    public final void a(sa0 sa0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = sa0Var.f42867g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s10 == 60 && s11 == 1 && b10 == 4 && b11 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    fk1 fk1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    fk1Var.a(bundle);
                }
            }
        }
    }

    @Override // yads.ok1
    public final void a(Exception exc) {
        kh1.b("MediaCodecVideoRenderer", kh1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.ok1
    public final void a(String str, long j10, long j11) {
        this.I0.a(str, j10, j11);
        this.N0 = b(str);
        kk1 kk1Var = this.R;
        kk1Var.getClass();
        this.O0 = kk1Var.a();
        if (lb3.f40466a < 23 || !this.f37812l1) {
            return;
        }
        fk1 fk1Var = this.K;
        fk1Var.getClass();
        this.f37814n1 = new cl1(this, fk1Var);
    }

    @Override // yads.ok1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.ro
    public final void a(boolean z5) {
        this.B0 = new pa0();
        on2 on2Var = this.f42646d;
        on2Var.getClass();
        boolean z10 = on2Var.f41657a;
        if (z10 && this.f37813m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f37812l1 != z10) {
            this.f37812l1 = z10;
            u();
        }
        this.I0.b(this.B0);
        this.U0 = z5;
        this.V0 = false;
    }

    @Override // yads.ok1
    public final va0 a(ox0 ox0Var) {
        va0 va0VarA = super.a(ox0Var);
        this.I0.a(ox0Var.f41759b, va0VarA);
        return va0VarA;
    }

    @Override // yads.ok1
    public final void a(nx0 nx0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        fk1 fk1Var = this.K;
        if (fk1Var != null) {
            fk1Var.setVideoScalingMode(this.S0);
        }
        if (this.f37812l1) {
            this.f37807g1 = nx0Var.f41380r;
            this.f37808h1 = nx0Var.f41381s;
        } else {
            mediaFormat.getClass();
            boolean z5 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z5) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f37807g1 = integer;
            if (z5) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f37808h1 = integer2;
        }
        float f10 = nx0Var.f41384v;
        this.f37810j1 = f10;
        if (lb3.f40466a >= 21) {
            int i = nx0Var.f41383u;
            if (i == 90 || i == 270) {
                int i10 = this.f37807g1;
                this.f37807g1 = this.f37808h1;
                this.f37808h1 = i10;
                this.f37810j1 = 1.0f / f10;
            }
        } else {
            this.f37809i1 = nx0Var.f41383u;
        }
        xh3 xh3Var = this.H0;
        xh3Var.f44706f = nx0Var.f41382t;
        lv0 lv0Var = xh3Var.f44701a;
        kv0 kv0Var = lv0Var.f40695a;
        kv0Var.f40351d = 0L;
        kv0Var.f40352e = 0L;
        kv0Var.f40353f = 0L;
        kv0Var.f40355h = 0;
        Arrays.fill(kv0Var.f40354g, false);
        kv0 kv0Var2 = lv0Var.f40696b;
        kv0Var2.f40351d = 0L;
        kv0Var2.f40352e = 0L;
        kv0Var2.f40353f = 0L;
        kv0Var2.f40355h = 0;
        Arrays.fill(kv0Var2.f40354g, false);
        lv0Var.f40697c = false;
        lv0Var.f40698d = -9223372036854775807L;
        lv0Var.f40699e = 0;
        xh3Var.b();
    }

    @Override // yads.ok1, yads.ro
    public final void a(long j10, boolean z5) {
        super.a(j10, z5);
        z();
        xh3 xh3Var = this.H0;
        xh3Var.f44712m = 0L;
        xh3Var.f44715p = -1L;
        xh3Var.f44713n = -1L;
        this.f37803c1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.f37801a1 = 0;
        if (z5) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        } else {
            this.X0 = -9223372036854775807L;
        }
    }

    @Override // yads.ok1
    public final void a(long j10) {
        super.a(j10);
        if (this.f37812l1) {
            return;
        }
        this.f37802b1--;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x030a  */
    @Override // yads.ok1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r33, long r35, yads.fk1 r37, java.nio.ByteBuffer r38, int r39, int r40, int r41, long r42, boolean r44, boolean r45, yads.nx0 r46) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dl1.a(long, long, yads.fk1, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, yads.nx0):boolean");
    }

    @Override // yads.ok1, yads.ro
    public final void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
        xh3 xh3Var = this.H0;
        xh3Var.i = f10;
        xh3Var.f44712m = 0L;
        xh3Var.f44715p = -1L;
        xh3Var.f44713n = -1L;
        xh3Var.a(false);
    }

    @Override // yads.ok1
    public final boolean a(kk1 kk1Var) {
        return this.P0 != null || b(kk1Var);
    }

    @Override // yads.ok1
    public final int a(qk1 qk1Var, nx0 nx0Var) {
        boolean z5;
        int i = 0;
        if (!RRWebVideoEvent.EVENT_TAG.equals(jt1.c(nx0Var.f41375m))) {
            return ro.a(0, 0, 0);
        }
        boolean z10 = nx0Var.f41378p != null;
        r51 r51VarA = a(qk1Var, nx0Var, z10, false);
        if (z10 && r51VarA.isEmpty()) {
            r51VarA = a(qk1Var, nx0Var, false, false);
        }
        if (r51VarA.isEmpty()) {
            return ro.a(1, 0, 0);
        }
        int i10 = nx0Var.F;
        if (i10 != 0 && i10 != 2) {
            return ro.a(2, 0, 0);
        }
        kk1 kk1Var = (kk1) r51VarA.get(0);
        boolean zA = kk1Var.a(nx0Var);
        if (zA) {
            z5 = true;
        } else {
            for (int i11 = 1; i11 < r51VarA.size(); i11++) {
                kk1 kk1Var2 = (kk1) r51VarA.get(i11);
                if (kk1Var2.a(nx0Var)) {
                    z5 = false;
                    zA = true;
                    kk1Var = kk1Var2;
                    break;
                }
            }
            z5 = true;
        }
        int i12 = zA ? 4 : 3;
        int i13 = kk1Var.b(nx0Var) ? 16 : 8;
        int i14 = kk1Var.f40233g ? 64 : 0;
        int i15 = z5 ? 128 : 0;
        if (zA) {
            r51 r51VarA2 = a(qk1Var, nx0Var, z10, true);
            if (!r51VarA2.isEmpty()) {
                kk1 kk1Var3 = (kk1) yk1.a(r51VarA2, nx0Var).get(0);
                if (kk1Var3.a(nx0Var) && kk1Var3.b(nx0Var)) {
                    i = 32;
                }
            }
        }
        return i12 | i13 | i | i14 | i15;
    }

    @Override // yads.ok1
    public final jk1 a(IllegalStateException illegalStateException, kk1 kk1Var) {
        return new al1(illegalStateException, kk1Var, this.P0);
    }
}
