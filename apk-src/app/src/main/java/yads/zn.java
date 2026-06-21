package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zn implements xc2, oo, wo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f45467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f45468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nu2 f45469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hk.a0 f45470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8 f45471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f45472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ua3 f45473h;
    public final rx2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yf1 f45474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final cv2 f45475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t01 f45476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hh2 f45477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q43 f45478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final up2 f45479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yc2 f45480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4 f45481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5 f45482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f45483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f45484t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v9 f45485v;

    public /* synthetic */ zn(Context context, w5 w5Var, d4 d4Var, nu2 nu2Var, hk.a0 a0Var) {
        this(context, w5Var, d4Var, nu2Var, a0Var, new t8(d4Var, nu2Var, context), new Handler(Looper.getMainLooper()), new sb(), new rx2(), new yf1(context, d4Var), new cv2(context, nu2Var, a0Var, w5Var, null, null, 2097136), new t01(nu2Var, d4Var), new hh2(nu2Var, d4Var), p43.a(), new up2(), yc2.f44998h.a(context), new o4(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(yads.zn r4, yads.ua3 r5, mj.a r6) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof yads.rn
            if (r0 == 0) goto L16
            r0 = r6
            yads.rn r0 = (yads.rn) r0
            int r1 = r0.f42637f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f42637f = r1
            goto L1b
        L16:
            yads.rn r0 = new yads.rn
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f42635d
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f42637f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yads.ua3 r5 = r0.f42634c
            yads.zn r4 = r0.f42633b
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            com.google.android.gms.internal.measurement.h5.E(r6)
            yads.cv2 r6 = r4.f45475k
            yads.s61 r2 = yads.s61.f42817d
            r0.f42633b = r4
            r0.f42634c = r5
            r0.f42637f = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            yads.tu2 r6 = (yads.tu2) r6
            boolean r0 = r6 instanceof yads.su2
            if (r0 == 0) goto L94
            yads.d4 r0 = r4.f45468c
            yads.su2 r6 = (yads.su2) r6
            yads.rd r1 = r6.f43083a
            yads.qx r0 = r0.f37614b
            r0.f42415b = r1
            yads.km0 r6 = r6.f43084b
            r0.f42414a = r6
            yads.gw2 r6 = yads.fw2.a()
            android.content.Context r0 = r4.f45466a
            yads.pt2 r6 = r6.a(r0)
            r0 = 0
            if (r6 == 0) goto L6e
            yads.hp r6 = r6.f42019a0
            goto L6f
        L6e:
            r6 = r0
        L6f:
            r1 = 3
            if (r6 == 0) goto L84
            yads.w5 r2 = r4.f45467b
            yads.v5 r3 = yads.v5.f43876g
            r2.a(r3, r0)
            hk.a0 r2 = r4.f45470e
            yads.un r3 = new yads.un
            r3.<init>(r4, r5, r6, r0)
            hk.c0.m(r2, r0, r3, r1)
            goto L9f
        L84:
            monitor-enter(r4)
            hk.a0 r6 = r4.f45470e     // Catch: java.lang.Throwable -> L91
            yads.qn r2 = new yads.qn     // Catch: java.lang.Throwable -> L91
            r2.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> L91
            hk.c0.m(r6, r0, r2, r1)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r4)
            goto L9f
        L91:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L94:
            boolean r5 = r6 instanceof yads.ru2
            if (r5 == 0) goto L9f
            yads.ru2 r6 = (yads.ru2) r6
            yads.l4 r5 = r6.f42732a
            r4.b(r5)
        L9f:
            kotlin.Unit r4 = kotlin.Unit.f27471a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zn.a(yads.zn, yads.ua3, mj.a):java.lang.Object");
    }

    public abstract pn a(String str, String str2);

    public abstract void a(l4 l4Var);

    public void b(l4 l4Var) {
        String str;
        nc1.c(l4Var.f40420c, new Object[0]);
        a(z5.f45254f);
        fo2 fo2Var = fo2.f38519d;
        sq1 sq1Var = this.f45468c.f37622k;
        if (sq1Var == null || (str = sq1Var.f43050b) == null) {
            str = do2.f37869a;
        }
        this.f45467b.a(v5.f43872c, new ac(fo2Var, str), null);
        this.f45467b.a(v5.f43874e);
        this.f45478n.a(ke1.f40176b, this);
        a(l4Var);
    }

    public final synchronized void c(g9 g9Var) {
        a(g9Var, this.f45473h);
    }

    public final d4 e() {
        return this.f45468c;
    }

    public final Context g() {
        return this.f45466a;
    }

    public final nu2 h() {
        return this.f45469d;
    }

    public final void k() {
        String str;
        fo2 fo2Var = fo2.f38518c;
        sq1 sq1Var = this.f45468c.f37622k;
        if (sq1Var == null || (str = sq1Var.f43050b) == null) {
            str = do2.f37869a;
        }
        this.f45467b.a(v5.f43872c, new ac(fo2Var, str), null);
        this.f45467b.a(v5.f43874e);
        this.f45478n.a(ke1.f40176b, this);
        a(z5.f45253e);
        this.f45484t = SystemClock.elapsedRealtime();
    }

    public abstract l4 o();

    public zn(Context context, w5 w5Var, d4 d4Var, nu2 nu2Var, hk.a0 a0Var, t8 t8Var, Handler handler, ua3 ua3Var, rx2 rx2Var, yf1 yf1Var, cv2 cv2Var, t01 t01Var, hh2 hh2Var, q43 q43Var, up2 up2Var, yc2 yc2Var, o4 o4Var) {
        this.f45466a = context;
        this.f45467b = w5Var;
        this.f45468c = d4Var;
        this.f45469d = nu2Var;
        this.f45470e = a0Var;
        this.f45471f = t8Var;
        this.f45472g = handler;
        this.f45473h = ua3Var;
        this.i = rx2Var;
        this.f45474j = yf1Var;
        this.f45475k = cv2Var;
        this.f45476l = t01Var;
        this.f45477m = hh2Var;
        this.f45478n = q43Var;
        this.f45479o = up2Var;
        this.f45480p = yc2Var;
        this.f45481q = o4Var;
        this.f45482r = z5.f45251c;
    }

    @Override // yads.wo2
    public final void b() {
        this.f45467b.a(v5.f43886r);
        this.f45467b.a(v5.f43887s, null);
    }

    public final synchronized void a(z5 z5Var) {
        Objects.toString(z5Var);
        this.f45482r = z5Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        if (lm3Var instanceof h4) {
            b(n4.a(this.f45468c, ((h4) lm3Var).f39017c));
        }
    }

    @Override // yads.xc2
    public void a(tc2 tc2Var) {
        Objects.toString(tc2Var);
    }

    public final synchronized void a(g9 g9Var, ua3 ua3Var) {
        try {
            a(z5.f45252d);
            this.f45468c.f37617e = g9Var;
            l4 l4VarO = o();
            if (l4VarO == null) {
                hk.c0.m(this.f45470e, null, new yn(this, ua3Var, null), 3);
            } else {
                b(l4VarO);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
