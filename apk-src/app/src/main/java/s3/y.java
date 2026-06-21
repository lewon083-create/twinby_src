package s3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.st1;
import com.google.android.gms.internal.ads.tr0;
import com.google.android.gms.internal.ads.uv1;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.measurement.h5;
import i4.e1;
import i4.j1;
import io.appmetrica.analytics.impl.lp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends e1.d0 implements l {
    public final tr0 A;
    public final fd.b B;
    public final long C;
    public final yd1 D;
    public final e1.c E;
    public final ka.k F;
    public final r3.b G;
    public final r3.b H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final b1 M;
    public final c1 N;
    public e1 O;
    public final k P;
    public j3.g0 Q;
    public j3.z R;
    public j3.o S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public m3.q Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public j3.d f32687a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f32688b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4.v f32689c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f32690c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.g0 f32691d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f32692d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.f f32693e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f32694e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f32695f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f32696f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f32697g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f32698g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a[] f32699h;
    public j3.y0 h0;
    public final a[] i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public j3.z f32700i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l4.u f32701j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public u0 f32702j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.v f32703k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f32704k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f32705l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f32706l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f32707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yf0 f32708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f32709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j3.m0 f32710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f32711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f32712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i4.b0 f32713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t3.d f32714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Looper f32715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m4.e f32716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m3.t f32717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f32718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f32719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b7 f32720z;

    static {
        j3.y.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(j jVar) {
        Handler.Callback callback;
        super(1);
        this.f32693e = new m3.f();
        try {
            m3.b.j("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + m3.z.f28608a + "]");
            Context context = jVar.f32559a;
            Looper looper = jVar.f32565g;
            m3.t tVar = jVar.f32560b;
            this.f32695f = context.getApplicationContext();
            this.f32714t = new t3.d(tVar);
            this.f32696f0 = jVar.f32566h;
            this.f32687a0 = jVar.i;
            this.Y = jVar.f32567j;
            this.f32690c0 = false;
            this.C = jVar.f32573p;
            t tVar2 = new t(this);
            this.f32718x = tVar2;
            this.f32719y = new u();
            a[] aVarArrA = ((g) jVar.f32561c.get()).a(new Handler(looper), tVar2, tVar2, tVar2, tVar2);
            this.f32699h = aVarArrA;
            h5.r(aVarArrA.length > 0);
            this.i = new a[aVarArrA.length];
            int i = 0;
            while (true) {
                a[] aVarArr = this.i;
                if (i >= aVarArr.length) {
                    break;
                }
                int i10 = this.f32699h[i].f32431c;
                aVarArr[i] = null;
                i++;
            }
            this.f32701j = (l4.u) jVar.f32563e.get();
            this.f32713s = (i4.b0) jVar.f32562d.get();
            this.f32716v = (m4.e) jVar.f32564f.get();
            this.f32712r = jVar.f32568k;
            this.N = jVar.f32569l;
            this.M = jVar.f32570m;
            this.f32715u = looper;
            this.f32717w = tVar;
            this.f32697g = this;
            this.f32708n = new yf0(new CopyOnWriteArraySet(), looper, looper.getThread(), tVar, (m3.l) new qg.a(this), true);
            this.f32709o = new CopyOnWriteArraySet();
            this.f32711q = new ArrayList();
            this.O = new e1();
            this.P = k.f32597a;
            a[] aVarArr2 = this.f32699h;
            this.f32689c = new l4.v(new a1[aVarArr2.length], new l4.r[aVarArr2.length], j3.u0.f26401b, null);
            this.f32710p = new j3.m0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i11 = 0; i11 < 20; i11++) {
                int i12 = iArr[i11];
                h5.r(!false);
                sparseBooleanArray.append(i12, true);
            }
            this.f32701j.getClass();
            h5.r(!false);
            sparseBooleanArray.append(29, true);
            h5.r(!false);
            j3.m mVar = new j3.m(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = mVar.f26273a;
            this.f32691d = new j3.g0(mVar);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i13 = 0; i13 < sparseBooleanArray2.size(); i13++) {
                h5.l(i13, sparseBooleanArray2.size());
                int iKeyAt = sparseBooleanArray2.keyAt(i13);
                h5.r(!false);
                sparseBooleanArray3.append(iKeyAt, true);
            }
            h5.r(!false);
            sparseBooleanArray3.append(4, true);
            h5.r(!false);
            sparseBooleanArray3.append(10, true);
            h5.r(!false);
            this.Q = new j3.g0(new j3.m(sparseBooleanArray3));
            this.f32703k = this.f32717w.a(this.f32715u, null);
            p pVar = new p(this);
            this.f32705l = pVar;
            this.f32702j0 = u0.k(this.f32689c);
            this.f32714t.A(this.f32697g, this.f32715u);
            t3.j jVar2 = new t3.j(jVar.f32580w);
            e0 e0Var = new e0(this.f32695f, this.f32699h, this.i, this.f32701j, this.f32689c, new f(), this.f32716v, this.I, this.f32714t, this.N, jVar.f32571n, jVar.f32572o, this.f32715u, this.f32717w, pVar, jVar2, this.P, this.f32719y, jVar.f32581x);
            m3.v vVar = e0Var.i;
            this.f32707m = e0Var;
            Looper looper2 = e0Var.f32509k;
            this.f32688b0 = 1.0f;
            this.I = 0;
            j3.z zVar = j3.z.B;
            this.R = zVar;
            this.f32700i0 = zVar;
            this.f32704k0 = -1;
            ad.p pVar2 = l3.c.f27790b;
            this.f32692d0 = true;
            t3.d dVar = this.f32714t;
            yf0 yf0Var = this.f32708n;
            dVar.getClass();
            yf0Var.a(dVar);
            m4.e eVar = this.f32716v;
            Handler handler = new Handler(this.f32715u);
            t3.d dVar2 = this.f32714t;
            m4.h hVar = (m4.h) eVar;
            hVar.getClass();
            dVar2.getClass();
            m4.d dVar3 = hVar.f28647c;
            dVar3.getClass();
            CopyOnWriteArrayList<m4.c> copyOnWriteArrayList = (CopyOnWriteArrayList) dVar3.f28630b;
            for (m4.c cVar : copyOnWriteArrayList) {
                if (cVar.f28628b == dVar2) {
                    cVar.f28629c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new m4.c(handler, dVar2));
            this.f32709o.add(this.f32718x);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                callback = null;
                this.f32717w.a(e0Var.f32509k, null).c(new fj.x0(this.f32695f, jVar.f32578u, this, jVar2));
            } else {
                callback = null;
            }
            Handler.Callback callback2 = callback;
            yd1 yd1Var = new yd1(0, looper2, this.f32715u, this.f32717w, new p(this));
            this.D = yd1Var;
            yd1Var.c(new lp(26, this));
            b7 b7Var = new b7(jVar.f32559a, looper2, jVar.f32565g, this.f32718x, this.f32717w);
            this.f32720z = b7Var;
            b7Var.c();
            boolean z5 = (jVar.f32574q == Integer.MAX_VALUE || jVar.f32575r == Integer.MAX_VALUE || jVar.f32576s == Integer.MAX_VALUE || jVar.f32577t == Integer.MAX_VALUE) ? false : true;
            tr0 tr0Var = new tr0(context, looper2, this.f32717w);
            this.A = tr0Var;
            if (tr0Var.f10701b != z5) {
                tr0Var.f10701b = z5;
                tr0Var.b(z5, tr0Var.f10702c);
            }
            m3.t tVar3 = this.f32717w;
            fd.b bVar = new fd.b();
            new l7.i(context.getApplicationContext());
            tVar3.a(looper2, callback2);
            tVar3.a(Looper.getMainLooper(), callback2);
            this.B = bVar;
            int i15 = j3.i.f26249c;
            this.h0 = j3.y0.f26415d;
            this.Z = m3.q.f28592c;
            this.F = i14 >= 34 ? new ka.k(this, context) : callback2;
            this.G = new r3.b(1);
            this.H = new r3.b(1);
            this.E = new e1.c(this, this.f32718x, this.f32717w, jVar.f32574q, jVar.f32575r, jVar.f32576s, jVar.f32577t);
            vVar.a(38, this.M).b();
            j3.d dVar4 = this.f32687a0;
            vVar.getClass();
            m3.u uVarB = m3.v.b();
            uVarB.f28599a = vVar.f28601a.obtainMessage(31, 0, 0, dVar4);
            uVarB.b();
            b0(1, 3, this.f32687a0);
            b0(2, 4, Integer.valueOf(this.Y));
            b0(2, 5, 0);
            b0(1, 9, Boolean.valueOf(this.f32690c0));
            b0(6, 8, this.f32719y);
            b0(-1, 16, Integer.valueOf(this.f32696f0));
            this.f32693e.c();
        } catch (Throwable th2) {
            this.f32693e.c();
            throw th2;
        }
    }

    public static long R(u0 u0Var) {
        j3.n0 n0Var = new j3.n0();
        j3.m0 m0Var = new j3.m0();
        u0Var.f32657a.g(u0Var.f32658b.f20861a, m0Var);
        long j10 = u0Var.f32659c;
        return j10 == -9223372036854775807L ? u0Var.f32657a.m(m0Var.f26276c, n0Var, 0L).f26318l : m0Var.f26278e + j10;
    }

    public static u0 T(u0 u0Var, int i) {
        u0 u0VarH = u0Var.h(i);
        return (i == 1 || i == 4) ? u0VarH.b(false) : u0VarH;
    }

    public final j3.z D() {
        j3.o0 o0VarM = M();
        if (o0VarM.p()) {
            return this.f32700i0;
        }
        j3.x xVar = o0VarM.m(I(), (j3.n0) this.f15951b, 0L).f26310c;
        w6 w6VarA = this.f32700i0.a();
        j3.z zVar = xVar.f26409d;
        if (zVar != null) {
            ad.j0 j0Var = zVar.A;
            byte[] bArr = zVar.f26424f;
            CharSequence charSequence = zVar.f26419a;
            if (charSequence != null) {
                w6VarA.f11655a = charSequence;
            }
            CharSequence charSequence2 = zVar.f26420b;
            if (charSequence2 != null) {
                w6VarA.f11656b = charSequence2;
            }
            CharSequence charSequence3 = zVar.f26421c;
            if (charSequence3 != null) {
                w6VarA.f11657c = charSequence3;
            }
            CharSequence charSequence4 = zVar.f26422d;
            if (charSequence4 != null) {
                w6VarA.f11658d = charSequence4;
            }
            CharSequence charSequence5 = zVar.f26423e;
            if (charSequence5 != null) {
                w6VarA.f11659e = charSequence5;
            }
            if (bArr != null) {
                Integer num = zVar.f26425g;
                w6VarA.f11660f = bArr == null ? null : (byte[]) bArr.clone();
                w6VarA.f11661g = num;
            }
            Integer num2 = zVar.f26426h;
            if (num2 != null) {
                w6VarA.f11662h = num2;
            }
            Integer num3 = zVar.i;
            if (num3 != null) {
                w6VarA.i = num3;
            }
            Integer num4 = zVar.f26427j;
            if (num4 != null) {
                w6VarA.f11663j = num4;
            }
            Boolean bool = zVar.f26428k;
            if (bool != null) {
                w6VarA.f11664k = bool;
            }
            Integer num5 = zVar.f26429l;
            if (num5 != null) {
                w6VarA.f11665l = num5;
            }
            Integer num6 = zVar.f26430m;
            if (num6 != null) {
                w6VarA.f11665l = num6;
            }
            Integer num7 = zVar.f26431n;
            if (num7 != null) {
                w6VarA.f11666m = num7;
            }
            Integer num8 = zVar.f26432o;
            if (num8 != null) {
                w6VarA.f11667n = num8;
            }
            Integer num9 = zVar.f26433p;
            if (num9 != null) {
                w6VarA.f11668o = num9;
            }
            Integer num10 = zVar.f26434q;
            if (num10 != null) {
                w6VarA.f11669p = num10;
            }
            Integer num11 = zVar.f26435r;
            if (num11 != null) {
                w6VarA.f11670q = num11;
            }
            CharSequence charSequence6 = zVar.f26436s;
            if (charSequence6 != null) {
                w6VarA.f11671r = charSequence6;
            }
            CharSequence charSequence7 = zVar.f26437t;
            if (charSequence7 != null) {
                w6VarA.f11672s = charSequence7;
            }
            CharSequence charSequence8 = zVar.f26438u;
            if (charSequence8 != null) {
                w6VarA.f11673t = charSequence8;
            }
            Integer num12 = zVar.f26439v;
            if (num12 != null) {
                w6VarA.f11674u = num12;
            }
            Integer num13 = zVar.f26440w;
            if (num13 != null) {
                w6VarA.f11675v = num13;
            }
            CharSequence charSequence9 = zVar.f26441x;
            if (charSequence9 != null) {
                w6VarA.f11676w = charSequence9;
            }
            CharSequence charSequence10 = zVar.f26442y;
            if (charSequence10 != null) {
                w6VarA.f11677x = charSequence10;
            }
            Integer num14 = zVar.f26443z;
            if (num14 != null) {
                w6VarA.f11678y = num14;
            }
            if (!j0Var.isEmpty()) {
                w6VarA.f11679z = ad.j0.r(j0Var);
            }
        }
        return new j3.z(w6VarA);
    }

    public final long E() {
        n0();
        if (S()) {
            u0 u0Var = this.f32702j0;
            return u0Var.f32666k.equals(u0Var.f32658b) ? m3.z.Z(this.f32702j0.f32672q) : O();
        }
        n0();
        if (this.f32702j0.f32657a.p()) {
            return this.f32706l0;
        }
        u0 u0Var2 = this.f32702j0;
        long j10 = 0;
        if (u0Var2.f32666k.f20864d != u0Var2.f32658b.f20864d) {
            return m3.z.Z(u0Var2.f32657a.m(I(), (j3.n0) this.f15951b, 0L).f26319m);
        }
        long j11 = u0Var2.f32672q;
        if (this.f32702j0.f32666k.b()) {
            u0 u0Var3 = this.f32702j0;
            u0Var3.f32657a.g(u0Var3.f32666k.f20861a, this.f32710p).d(this.f32702j0.f32666k.f20862b);
        } else {
            j10 = j11;
        }
        u0 u0Var4 = this.f32702j0;
        j3.o0 o0Var = u0Var4.f32657a;
        Object obj = u0Var4.f32666k.f20861a;
        j3.m0 m0Var = this.f32710p;
        o0Var.g(obj, m0Var);
        return m3.z.Z(j10 + m0Var.f26278e);
    }

    public final long F(u0 u0Var) {
        i4.c0 c0Var = u0Var.f32658b;
        long j10 = u0Var.f32659c;
        j3.o0 o0Var = u0Var.f32657a;
        if (!c0Var.b()) {
            return m3.z.Z(L(u0Var));
        }
        Object obj = u0Var.f32658b.f20861a;
        j3.m0 m0Var = this.f32710p;
        o0Var.g(obj, m0Var);
        if (j10 == -9223372036854775807L) {
            return m3.z.Z(o0Var.m(N(u0Var), (j3.n0) this.f15951b, 0L).f26318l);
        }
        return m3.z.Z(j10) + m3.z.Z(m0Var.f26278e);
    }

    public final int G() {
        n0();
        if (S()) {
            return this.f32702j0.f32658b.f20862b;
        }
        return -1;
    }

    public final int H() {
        n0();
        if (S()) {
            return this.f32702j0.f32658b.f20863c;
        }
        return -1;
    }

    public final int I() {
        n0();
        int iN = N(this.f32702j0);
        if (iN == -1) {
            return 0;
        }
        return iN;
    }

    public final int J() {
        n0();
        if (!this.f32702j0.f32657a.p()) {
            u0 u0Var = this.f32702j0;
            return u0Var.f32657a.b(u0Var.f32658b.f20861a);
        }
        int i = this.f32704k0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long K() {
        n0();
        return m3.z.Z(L(this.f32702j0));
    }

    public final long L(u0 u0Var) {
        if (u0Var.f32657a.p()) {
            return m3.z.M(this.f32706l0);
        }
        long jL = u0Var.f32671p ? u0Var.l() : u0Var.f32674s;
        if (u0Var.f32658b.b()) {
            return jL;
        }
        j3.o0 o0Var = u0Var.f32657a;
        Object obj = u0Var.f32658b.f20861a;
        j3.m0 m0Var = this.f32710p;
        o0Var.g(obj, m0Var);
        return jL + m0Var.f26278e;
    }

    public final j3.o0 M() {
        n0();
        return this.f32702j0.f32657a;
    }

    public final int N(u0 u0Var) {
        return u0Var.f32657a.p() ? this.f32704k0 : u0Var.f32657a.g(u0Var.f32658b.f20861a, this.f32710p).f26276c;
    }

    public final long O() {
        n0();
        if (!S()) {
            j3.o0 o0VarM = M();
            if (o0VarM.p()) {
                return -9223372036854775807L;
            }
            return m3.z.Z(o0VarM.m(I(), (j3.n0) this.f15951b, 0L).f26319m);
        }
        u0 u0Var = this.f32702j0;
        i4.c0 c0Var = u0Var.f32658b;
        j3.o0 o0Var = u0Var.f32657a;
        Object obj = c0Var.f20861a;
        j3.m0 m0Var = this.f32710p;
        o0Var.g(obj, m0Var);
        return m3.z.Z(m0Var.a(c0Var.f20862b, c0Var.f20863c));
    }

    public final boolean P() {
        n0();
        return this.f32702j0.f32667l;
    }

    public final int Q() {
        n0();
        return this.f32702j0.f32661e;
    }

    public final boolean S() {
        n0();
        return this.f32702j0.f32658b.b();
    }

    public final u0 U(u0 u0Var, j3.o0 o0Var, Pair pair) {
        List list;
        h5.h(o0Var.p() || pair != null);
        j3.o0 o0Var2 = u0Var.f32657a;
        long jF = F(u0Var);
        u0 u0VarJ = u0Var.j(o0Var);
        if (o0Var.p()) {
            i4.c0 c0Var = u0.f32656u;
            long jM = m3.z.M(this.f32706l0);
            u0 u0VarC = u0VarJ.d(c0Var, jM, jM, jM, 0L, j1.f20934d, this.f32689c, ad.b1.f768f).c(c0Var);
            u0VarC.f32672q = u0VarC.f32674s;
            return u0VarC;
        }
        Object obj = u0VarJ.f32658b.f20861a;
        boolean zEquals = obj.equals(pair.first);
        i4.c0 c0Var2 = !zEquals ? new i4.c0(pair.first) : u0VarJ.f32658b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM2 = m3.z.M(jF);
        if (!o0Var2.p()) {
            jM2 -= o0Var2.g(obj, this.f32710p).f26278e;
            if (zEquals && jM2 - jLongValue == 1 && jM2 == o0Var2.g(obj, this.f32710p).f26277d) {
                jM2--;
            }
        }
        if (!zEquals || jLongValue < jM2) {
            i4.c0 c0Var3 = c0Var2;
            h5.r(!c0Var3.b());
            j1 j1Var = !zEquals ? j1.f20934d : u0VarJ.f32664h;
            l4.v vVar = !zEquals ? this.f32689c : u0VarJ.i;
            if (zEquals) {
                list = u0VarJ.f32665j;
            } else {
                ad.h0 h0Var = ad.j0.f818c;
                list = ad.b1.f768f;
            }
            u0 u0VarC2 = u0VarJ.d(c0Var3, jLongValue, jLongValue, jLongValue, 0L, j1Var, vVar, list).c(c0Var3);
            u0VarC2.f32672q = jLongValue;
            return u0VarC2;
        }
        if (jLongValue != jM2) {
            i4.c0 c0Var4 = c0Var2;
            h5.r(!c0Var4.b());
            long jMax = Math.max(0L, u0VarJ.f32673r - (jLongValue - jM2));
            long j10 = u0VarJ.f32672q;
            if (u0VarJ.f32666k.equals(u0VarJ.f32658b)) {
                j10 = jLongValue + jMax;
            }
            u0 u0VarD = u0VarJ.d(c0Var4, jLongValue, jLongValue, jLongValue, jMax, u0VarJ.f32664h, u0VarJ.i, u0VarJ.f32665j);
            u0VarD.f32672q = j10;
            return u0VarD;
        }
        int iB = o0Var.b(u0VarJ.f32666k.f20861a);
        if (iB != -1 && o0Var.f(iB, this.f32710p, false).f26276c == o0Var.g(c0Var2.f20861a, this.f32710p).f26276c) {
            return u0VarJ;
        }
        o0Var.g(c0Var2.f20861a, this.f32710p);
        long jA = c0Var2.b() ? this.f32710p.a(c0Var2.f20862b, c0Var2.f20863c) : this.f32710p.f26277d;
        i4.c0 c0Var5 = c0Var2;
        u0 u0VarC3 = u0VarJ.d(c0Var5, u0VarJ.f32674s, u0VarJ.f32674s, u0VarJ.f32660d, jA - u0VarJ.f32674s, u0VarJ.f32664h, u0VarJ.i, u0VarJ.f32665j).c(c0Var5);
        u0VarC3.f32672q = jA;
        return u0VarC3;
    }

    public final Pair V(j3.o0 o0Var, int i, long j10) {
        if (o0Var.p()) {
            this.f32704k0 = i;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f32706l0 = j10;
            return null;
        }
        if (i == -1 || i >= o0Var.o()) {
            i = o0Var.a(false);
            j10 = m3.z.Z(o0Var.m(i, (j3.n0) this.f15951b, 0L).f26318l);
        }
        return o0Var.i((j3.n0) this.f15951b, this.f32710p, i, m3.z.M(j10));
    }

    public final void W(int i, int i10) {
        m3.q qVar = this.Z;
        if (i == qVar.f28593a && i10 == qVar.f28594b) {
            return;
        }
        this.Z = new m3.q(i, i10);
        this.f32708n.e(24, new o(i, i10, 0));
        b0(2, 14, new m3.q(i, i10));
    }

    public final void X() {
        n0();
        u0 u0Var = this.f32702j0;
        if (u0Var.f32661e != 1) {
            return;
        }
        u0 u0VarF = u0Var.f(null);
        u0 u0VarT = T(u0VarF, u0VarF.f32657a.p() ? 4 : 2);
        this.J++;
        m3.v vVar = this.f32707m.i;
        vVar.getClass();
        m3.u uVarB = m3.v.b();
        uVarB.f28599a = vVar.f28601a.obtainMessage(29);
        uVarB.b();
        l0(u0VarT, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void Y() {
        String str;
        boolean zB;
        Context context;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.9.2] [");
        sb2.append(m3.z.f28608a);
        sb2.append("] [");
        HashSet hashSet = j3.y.f26413a;
        synchronized (j3.y.class) {
            str = j3.y.f26414b;
        }
        sb2.append(str);
        sb2.append("]");
        m3.b.j("ExoPlayerImpl", sb2.toString());
        n0();
        this.f32720z.c();
        this.A.c(false);
        this.B.c(false);
        ka.k kVar = this.F;
        if (kVar != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) kVar.f27324c).get()) != null) {
            context.unregisterDeviceIdChangeListener((w) kVar.f27325d);
        }
        e1.c cVar = this.E;
        ((m3.v) cVar.f15913f).f28601a.removeCallbacksAndMessages(null);
        ((y) cVar.f15908a).Z((m3.r) cVar.f15909b);
        e0 e0Var = this.f32707m;
        if (e0Var.K || !e0Var.f32509k.getThread().isAlive()) {
            zB = true;
        } else {
            e0Var.K = true;
            m3.f fVar = new m3.f(e0Var.f32515q);
            e0Var.i.a(7, fVar).b();
            zB = fVar.b(e0Var.f32520v);
        }
        if (!zB) {
            this.f32708n.e(10, new qg.a(10));
        }
        this.f32708n.d();
        this.f32703k.f28601a.removeCallbacksAndMessages(null);
        m4.e eVar = this.f32716v;
        t3.d dVar = this.f32714t;
        CopyOnWriteArrayList<m4.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((m4.h) eVar).f28647c.f28630b;
        for (m4.c cVar2 : copyOnWriteArrayList) {
            if (cVar2.f28628b == dVar) {
                cVar2.f28629c = true;
                copyOnWriteArrayList.remove(cVar2);
            }
        }
        u0 u0Var = this.f32702j0;
        if (u0Var.f32671p) {
            this.f32702j0 = u0Var.a();
        }
        u0 u0VarT = T(this.f32702j0, 1);
        this.f32702j0 = u0VarT;
        u0 u0VarC = u0VarT.c(u0VarT.f32658b);
        this.f32702j0 = u0VarC;
        u0VarC.f32672q = u0VarC.f32674s;
        this.f32702j0.f32673r = 0L;
        t3.d dVar2 = this.f32714t;
        m3.v vVar = dVar2.f33424h;
        vVar.getClass();
        vVar.c(new t.a0(5, dVar2));
        a0();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        ad.p pVar = l3.c.f27790b;
        this.f32698g0 = true;
    }

    public final void Z(j3.h0 h0Var) {
        n0();
        h0Var.getClass();
        yf0 yf0Var = this.f32708n;
        yf0Var.f();
        CopyOnWriteArraySet<m3.m> copyOnWriteArraySet = (CopyOnWriteArraySet) yf0Var.f12613f;
        for (m3.m mVar : copyOnWriteArraySet) {
            if (mVar.f28572a.equals(h0Var)) {
                m3.l lVar = (m3.l) yf0Var.f12612e;
                mVar.f28575d = true;
                if (lVar != null && mVar.f28574c) {
                    mVar.f28574c = false;
                    lVar.b(mVar.f28572a, mVar.f28573b.b());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    public final void a0() {
        TextureView textureView = this.X;
        t tVar = this.f32718x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != tVar) {
                m3.b.s("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(tVar);
            this.V = null;
        }
    }

    public final void b0(int i, int i10, Object obj) {
        e0 e0Var;
        a[] aVarArr = this.f32699h;
        int length = aVarArr.length;
        int i11 = 0;
        while (true) {
            e0Var = this.f32707m;
            if (i11 >= length) {
                break;
            }
            a aVar = aVarArr[i11];
            if (i == -1 || aVar.f32431c == i) {
                int iN = N(this.f32702j0);
                j3.o0 o0Var = this.f32702j0.f32657a;
                if (iN == -1) {
                    iN = 0;
                }
                x0 x0Var = new x0(e0Var, aVar, o0Var, iN, e0Var.f32509k);
                h5.r(!x0Var.f32686f);
                x0Var.f32683c = i10;
                h5.r(!x0Var.f32686f);
                x0Var.f32684d = obj;
                x0Var.b();
            }
            i11++;
        }
        for (a aVar2 : this.i) {
            if (aVar2 != null && (i == -1 || aVar2.f32431c == i)) {
                int iN2 = N(this.f32702j0);
                j3.o0 o0Var2 = this.f32702j0.f32657a;
                if (iN2 == -1) {
                    iN2 = 0;
                }
                x0 x0Var2 = new x0(e0Var, aVar2, o0Var2, iN2, e0Var.f32509k);
                h5.r(!x0Var2.f32686f);
                x0Var2.f32683c = i10;
                h5.r(!x0Var2.f32686f);
                x0Var2.f32684d = obj;
                x0Var2.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.y.c0(java.util.List):void");
    }

    public final void d0(boolean z5) {
        n0();
        k0(1, z5);
    }

    public final void e0(Surface surface) {
        Object obj = this.T;
        boolean zB = true;
        boolean z5 = (obj == null || obj == surface) ? false : true;
        long j10 = z5 ? this.C : -9223372036854775807L;
        e0 e0Var = this.f32707m;
        if (!e0Var.K && e0Var.f32509k.getThread().isAlive()) {
            m3.f fVar = new m3.f(e0Var.f32515q);
            e0Var.i.a(30, new Pair(surface, fVar)).b();
            if (j10 != -9223372036854775807L) {
                zB = fVar.b(j10);
            }
        }
        if (z5) {
            Object obj2 = this.T;
            Surface surface2 = this.U;
            if (obj2 == surface2) {
                surface2.release();
                this.U = null;
            }
        }
        this.T = surface;
        if (zB) {
            return;
        }
        i0(new i(2, new oc("Detaching surface timed out."), 1003));
    }

    public final void f0(Surface surface) {
        n0();
        a0();
        e0(surface);
        int i = surface == null ? 0 : -1;
        W(i, i);
    }

    public final void g0(TextureView textureView) {
        n0();
        if (textureView == null) {
            n0();
            a0();
            e0(null);
            W(0, 0);
            return;
        }
        a0();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            m3.b.s("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f32718x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            e0(null);
            W(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            e0(surface);
            this.U = surface;
            W(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void h0(float f10) {
        n0();
        float fI = m3.z.i(f10, 0.0f, 1.0f);
        if (this.f32688b0 == fI) {
            return;
        }
        this.f32688b0 = fI;
        this.f32707m.i.a(32, Float.valueOf(fI)).b();
        this.f32708n.e(22, new n(fI, 0));
    }

    public final void i0(i iVar) {
        u0 u0Var = this.f32702j0;
        u0 u0VarC = u0Var.c(u0Var.f32658b);
        u0VarC.f32672q = u0VarC.f32674s;
        u0VarC.f32673r = 0L;
        u0 u0VarT = T(u0VarC, 1);
        if (iVar != null) {
            u0VarT = u0VarT.f(iVar);
        }
        u0 u0Var2 = u0VarT;
        this.J++;
        m3.v vVar = this.f32707m.i;
        vVar.getClass();
        m3.u uVarB = m3.v.b();
        uVarB.f28599a = vVar.f28601a.obtainMessage(6);
        uVarB.b();
        l0(u0Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void j0() {
        int iK;
        int iE;
        j3.g0 g0Var = this.Q;
        String str = m3.z.f28608a;
        y yVar = this.f32697g;
        boolean zS = yVar.S();
        j3.n0 n0Var = (j3.n0) yVar.f15951b;
        j3.o0 o0VarM = yVar.M();
        boolean z5 = false;
        boolean z10 = !o0VarM.p() && o0VarM.m(yVar.I(), n0Var, 0L).f26315h;
        j3.o0 o0VarM2 = yVar.M();
        if (o0VarM2.p()) {
            iK = -1;
        } else {
            int I = yVar.I();
            yVar.n0();
            int i = yVar.I;
            if (i == 1) {
                i = 0;
            }
            yVar.n0();
            iK = o0VarM2.k(I, i);
        }
        boolean z11 = iK != -1;
        j3.o0 o0VarM3 = yVar.M();
        if (o0VarM3.p()) {
            iE = -1;
        } else {
            int I2 = yVar.I();
            yVar.n0();
            int i10 = yVar.I;
            if (i10 == 1) {
                i10 = 0;
            }
            yVar.n0();
            iE = o0VarM3.e(I2, i10, false);
        }
        boolean z12 = iE != -1;
        j3.o0 o0VarM4 = yVar.M();
        boolean z13 = !o0VarM4.p() && o0VarM4.m(yVar.I(), n0Var, 0L).a();
        j3.o0 o0VarM5 = yVar.M();
        boolean z14 = !o0VarM5.p() && o0VarM5.m(yVar.I(), n0Var, 0L).i;
        boolean zP = yVar.M().p();
        a0.b1 b1Var = new a0.b1(22);
        uv1 uv1Var = (uv1) b1Var.f45c;
        SparseBooleanArray sparseBooleanArray = this.f32691d.f26248a.f26273a;
        uv1Var.getClass();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            h5.l(i11, sparseBooleanArray.size());
            uv1Var.a(sparseBooleanArray.keyAt(i11));
        }
        boolean z15 = !zS;
        b1Var.l(4, z15);
        b1Var.l(5, z10 && !zS);
        b1Var.l(6, z11 && !zS);
        b1Var.l(7, !zP && (z11 || !z13 || z10) && !zS);
        b1Var.l(8, z12 && !zS);
        b1Var.l(9, !zP && (z12 || (z13 && z14)) && !zS);
        b1Var.l(10, z15);
        b1Var.l(11, z10 && !zS);
        if (z10 && !zS) {
            z5 = true;
        }
        b1Var.l(12, z5);
        j3.g0 g0Var2 = new j3.g0(uv1Var.b());
        this.Q = g0Var2;
        if (g0Var2.equals(g0Var)) {
            return;
        }
        this.f32708n.c(13, new p(this));
    }

    public final void k0(int i, boolean z5) {
        u0 u0VarA = this.f32702j0;
        int i10 = u0VarA.f32669n;
        int i11 = (i10 != 1 || z5) ? 0 : 1;
        if (u0VarA.f32667l == z5 && i10 == i11 && u0VarA.f32668m == i) {
            return;
        }
        this.J++;
        if (u0VarA.f32671p) {
            u0VarA = u0VarA.a();
        }
        u0 u0VarE = u0VarA.e(i, i11, z5);
        m3.v vVar = this.f32707m.i;
        vVar.getClass();
        m3.u uVarB = m3.v.b();
        uVarB.f28599a = vVar.f28601a.obtainMessage(1, z5 ? 1 : 0, i | (i11 << 4));
        uVarB.b();
        l0(u0VarE, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void l0(final u0 u0Var, int i, boolean z5, int i10, long j10, int i11) {
        Pair pair;
        int i12;
        j3.x xVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        Object obj;
        j3.x xVar2;
        Object obj2;
        long j11;
        long j12;
        long jR;
        long jR2;
        Object obj3;
        j3.x xVar3;
        Object obj4;
        u0 u0Var2 = this.f32702j0;
        this.f32702j0 = u0Var;
        boolean zEquals = u0Var2.f32657a.equals(u0Var.f32657a);
        j3.n0 n0Var = (j3.n0) this.f15951b;
        j3.m0 m0Var = this.f32710p;
        j3.o0 o0Var = u0Var2.f32657a;
        i4.c0 c0Var = u0Var2.f32658b;
        j3.o0 o0Var2 = u0Var.f32657a;
        i4.c0 c0Var2 = u0Var.f32658b;
        if (o0Var2.p() && o0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o0Var2.p() != o0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (o0Var.m(o0Var.g(c0Var.f20861a, m0Var).f26276c, n0Var, 0L).f26308a.equals(o0Var2.m(o0Var2.g(c0Var2.f20861a, m0Var).f26276c, n0Var, 0L).f26308a)) {
            pair = (z5 && i10 == 0 && c0Var.f20864d < c0Var2.f20864d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z5 && i10 == 0) {
                i12 = 1;
            } else if (z5 && i10 == 1) {
                i12 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i12 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            xVar = !u0Var.f32657a.p() ? u0Var.f32657a.m(u0Var.f32657a.g(u0Var.f32658b.f20861a, this.f32710p).f26276c, (j3.n0) this.f15951b, 0L).f26310c : null;
            this.f32700i0 = j3.z.B;
        } else {
            xVar = null;
        }
        if (zBooleanValue || !u0Var2.f32665j.equals(u0Var.f32665j)) {
            w6 w6VarA = this.f32700i0.a();
            List list = u0Var.f32665j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                j3.b0 b0Var = (j3.b0) list.get(i15);
                int i16 = 0;
                while (true) {
                    j3.a0[] a0VarArr = b0Var.f26216a;
                    if (i16 < a0VarArr.length) {
                        a0VarArr[i16].b(w6VarA);
                        i16++;
                    }
                }
            }
            this.f32700i0 = new j3.z(w6VarA);
        }
        j3.z zVarD = D();
        boolean zEquals2 = zVarD.equals(this.R);
        this.R = zVarD;
        boolean z13 = u0Var2.f32667l != u0Var.f32667l;
        boolean z14 = u0Var2.f32661e != u0Var.f32661e;
        if (z14 || z13) {
            m0();
        }
        boolean z15 = u0Var2.f32663g != u0Var.f32663g;
        if (!zEquals) {
            this.f32708n.c(0, new oc.a(u0Var, i, 1));
        }
        if (z5) {
            j3.m0 m0Var2 = new j3.m0();
            if (u0Var2.f32657a.p()) {
                z10 = zBooleanValue;
                z11 = zEquals2;
                z12 = z14;
                i13 = i11;
                i14 = i13;
                obj = null;
                xVar2 = null;
                obj2 = null;
            } else {
                Object obj5 = u0Var2.f32658b.f20861a;
                u0Var2.f32657a.g(obj5, m0Var2);
                int i17 = m0Var2.f26276c;
                int iB = u0Var2.f32657a.b(obj5);
                z10 = zBooleanValue;
                z11 = zEquals2;
                z12 = z14;
                obj = u0Var2.f32657a.m(i17, (j3.n0) this.f15951b, 0L).f26308a;
                xVar2 = ((j3.n0) this.f15951b).f26310c;
                obj2 = obj5;
                i13 = i17;
                i14 = iB;
            }
            if (i10 == 0) {
                if (u0Var2.f32658b.b()) {
                    i4.c0 c0Var3 = u0Var2.f32658b;
                    jR = m0Var2.a(c0Var3.f20862b, c0Var3.f20863c);
                    jR2 = R(u0Var2);
                } else if (u0Var2.f32658b.f20865e != -1) {
                    jR = R(this.f32702j0);
                    jR2 = jR;
                } else {
                    j11 = m0Var2.f26278e;
                    j12 = m0Var2.f26277d;
                    jR = j11 + j12;
                    jR2 = jR;
                }
            } else if (u0Var2.f32658b.b()) {
                jR = u0Var2.f32674s;
                jR2 = R(u0Var2);
            } else {
                j11 = m0Var2.f26278e;
                j12 = u0Var2.f32674s;
                jR = j11 + j12;
                jR2 = jR;
            }
            long jZ = m3.z.Z(jR);
            long jZ2 = m3.z.Z(jR2);
            i4.c0 c0Var4 = u0Var2.f32658b;
            j3.i0 i0Var = new j3.i0(obj, i13, xVar2, obj2, i14, jZ, jZ2, c0Var4.f20862b, c0Var4.f20863c);
            j3.n0 n0Var2 = (j3.n0) this.f15951b;
            int I = I();
            int iJ = J();
            if (this.f32702j0.f32657a.p()) {
                obj3 = null;
                xVar3 = null;
                obj4 = null;
            } else {
                u0 u0Var3 = this.f32702j0;
                Object obj6 = u0Var3.f32658b.f20861a;
                u0Var3.f32657a.g(obj6, this.f32710p);
                iJ = this.f32702j0.f32657a.b(obj6);
                Object obj7 = this.f32702j0.f32657a.m(I, n0Var2, 0L).f26308a;
                xVar3 = n0Var2.f26310c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i18 = iJ;
            long jZ3 = m3.z.Z(j10);
            long jZ4 = this.f32702j0.f32658b.b() ? m3.z.Z(R(this.f32702j0)) : jZ3;
            i4.c0 c0Var5 = this.f32702j0.f32658b;
            this.f32708n.c(11, new e9.d(i10, i0Var, new j3.i0(obj3, I, xVar3, obj4, i18, jZ3, jZ4, c0Var5.f20862b, c0Var5.f20863c), 1));
        } else {
            z10 = zBooleanValue;
            z11 = zEquals2;
            z12 = z14;
        }
        if (z10) {
            this.f32708n.c(1, new oc.a(xVar, iIntValue, 2));
        }
        if (u0Var2.f32662f != u0Var.f32662f) {
            final int i19 = 7;
            this.f32708n.c(10, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj8) {
                    j3.h0 h0Var = (j3.h0) obj8;
                    switch (i19) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
            if (u0Var.f32662f != null) {
                final int i20 = 8;
                this.f32708n.c(10, new m3.k() { // from class: s3.m
                    @Override // m3.k, yads.of1
                    public final void invoke(Object obj8) {
                        j3.h0 h0Var = (j3.h0) obj8;
                        switch (i20) {
                            case 0:
                                u0 u0Var4 = u0Var;
                                boolean z16 = u0Var4.f32663g;
                                h0Var.getClass();
                                h0Var.onIsLoadingChanged(u0Var4.f32663g);
                                break;
                            case 1:
                                u0 u0Var5 = u0Var;
                                h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                                break;
                            case 2:
                                h0Var.onPlaybackStateChanged(u0Var.f32661e);
                                break;
                            case 3:
                                u0 u0Var6 = u0Var;
                                h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                                break;
                            case 4:
                                h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                                break;
                            case 5:
                                h0Var.onIsPlayingChanged(u0Var.m());
                                break;
                            case 6:
                                h0Var.d(u0Var.f32670o);
                                break;
                            case 7:
                                h0Var.a(u0Var.f32662f);
                                break;
                            case 8:
                                h0Var.onPlayerError(u0Var.f32662f);
                                break;
                            default:
                                h0Var.q(u0Var.i.f27922d);
                                break;
                        }
                    }
                });
            }
        }
        l4.v vVar = u0Var2.i;
        l4.v vVar2 = u0Var.i;
        if (vVar != vVar2) {
            l4.u uVar = this.f32701j;
            Object obj8 = vVar2.f27923e;
            uVar.getClass();
            final int i21 = 9;
            this.f32708n.c(2, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i21) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (!z11) {
            this.f32708n.c(14, new ni.x0(27, this.R));
        }
        if (z15) {
            final int i22 = 0;
            this.f32708n.c(3, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i22) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (z12 || z13) {
            final int i23 = 1;
            this.f32708n.c(-1, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i23) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (z12) {
            final int i24 = 2;
            this.f32708n.c(4, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i24) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (z13 || u0Var2.f32668m != u0Var.f32668m) {
            final int i25 = 3;
            this.f32708n.c(5, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i25) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (u0Var2.f32669n != u0Var.f32669n) {
            final int i26 = 4;
            this.f32708n.c(6, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i26) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (u0Var2.m() != u0Var.m()) {
            final int i27 = 5;
            this.f32708n.c(7, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i27) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        if (!u0Var2.f32670o.equals(u0Var.f32670o)) {
            final int i28 = 6;
            this.f32708n.c(12, new m3.k() { // from class: s3.m
                @Override // m3.k, yads.of1
                public final void invoke(Object obj82) {
                    j3.h0 h0Var = (j3.h0) obj82;
                    switch (i28) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            boolean z16 = u0Var4.f32663g;
                            h0Var.getClass();
                            h0Var.onIsLoadingChanged(u0Var4.f32663g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            h0Var.onPlayerStateChanged(u0Var5.f32667l, u0Var5.f32661e);
                            break;
                        case 2:
                            h0Var.onPlaybackStateChanged(u0Var.f32661e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            h0Var.onPlayWhenReadyChanged(u0Var6.f32667l, u0Var6.f32668m);
                            break;
                        case 4:
                            h0Var.onPlaybackSuppressionReasonChanged(u0Var.f32669n);
                            break;
                        case 5:
                            h0Var.onIsPlayingChanged(u0Var.m());
                            break;
                        case 6:
                            h0Var.d(u0Var.f32670o);
                            break;
                        case 7:
                            h0Var.a(u0Var.f32662f);
                            break;
                        case 8:
                            h0Var.onPlayerError(u0Var.f32662f);
                            break;
                        default:
                            h0Var.q(u0Var.i.f27922d);
                            break;
                    }
                }
            });
        }
        j0();
        this.f32708n.b();
        if (u0Var2.f32671p != u0Var.f32671p) {
            Iterator it = this.f32709o.iterator();
            while (it.hasNext()) {
                ((t) it.next()).f32648b.m0();
            }
        }
    }

    public final void m0() {
        int iQ = Q();
        fd.b bVar = this.B;
        tr0 tr0Var = this.A;
        boolean z5 = false;
        if (iQ != 1) {
            if (iQ == 2 || iQ == 3) {
                n0();
                boolean z10 = this.f32702j0.f32671p;
                if (P() && !z10) {
                    z5 = true;
                }
                tr0Var.c(z5);
                bVar.c(P());
                return;
            }
            if (iQ != 4) {
                throw new IllegalStateException();
            }
        }
        tr0Var.c(false);
        bVar.c(false);
    }

    public final void n0() {
        this.f32693e.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f32715u;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = m3.z.f28608a;
            Locale locale = Locale.US;
            String strF = t.z.f("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f32692d0) {
                throw new IllegalStateException(strF);
            }
            m3.b.t("ExoPlayerImpl", strF, this.f32694e0 ? null : new IllegalStateException());
            this.f32694e0 = true;
        }
    }

    @Override // e1.d0
    public final void w(int i, long j10) {
        n0();
        if (i == -1) {
            return;
        }
        h5.h(i >= 0);
        j3.o0 o0Var = this.f32702j0.f32657a;
        if (o0Var.p() || i < o0Var.o()) {
            t3.d dVar = this.f32714t;
            if (!dVar.i) {
                t3.a aVarU = dVar.u();
                dVar.i = true;
                dVar.z(aVarU, -1, new t3.b(16));
            }
            this.J++;
            if (S()) {
                m3.b.s("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                st1 st1Var = new st1(2, this.f32702j0);
                st1Var.d(1);
                y yVar = this.f32705l.f32624b;
                yVar.f32703k.c(new m3.c0(23, yVar, st1Var));
                return;
            }
            u0 u0VarH = this.f32702j0;
            int i10 = u0VarH.f32661e;
            if (i10 == 3 || (i10 == 4 && !o0Var.p())) {
                u0VarH = this.f32702j0.h(2);
            }
            int I = I();
            u0 u0VarU = U(u0VarH, o0Var, V(o0Var, i, j10));
            this.f32707m.i.a(3, new d0(o0Var, i, m3.z.M(j10))).b();
            l0(u0VarU, 0, true, 1, L(u0VarU), I);
        }
    }
}
