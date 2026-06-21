package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ho0 implements Handler.Callback, qm1, u73, jn1, ce0, bf2 {
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public go0 L;
    public long M;
    public int N;
    public boolean O;
    public qn0 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ro[] f39262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f39263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ro[] f39264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v73 f39265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w73 f39266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uf1 f39267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final im f39268h;
    public final l53 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f39269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f39270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u63 f39271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s63 f39272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f39273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f39274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final de0 f39275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f39276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xv f39277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final eo0 f39278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vm1 f39279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kn1 f39280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tf1 f39281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f39282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zw2 f39283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ee2 f39284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public do0 f39285z;
    public boolean G = false;
    public boolean B = false;
    public long Q = -9223372036854775807L;

    public ho0(ro[] roVarArr, v73 v73Var, w73 w73Var, uf1 uf1Var, im imVar, int i, se seVar, zw2 zw2Var, yd0 yd0Var, long j10, Looper looper, i53 i53Var, eo0 eo0Var, af2 af2Var) {
        this.f39278s = eo0Var;
        this.f39262b = roVarArr;
        this.f39265e = v73Var;
        this.f39266f = w73Var;
        this.f39267g = uf1Var;
        this.f39268h = imVar;
        this.F = i;
        this.f39283x = zw2Var;
        this.f39281v = yd0Var;
        this.f39282w = j10;
        this.f39277r = i53Var;
        zd0 zd0Var = (zd0) uf1Var;
        this.f39273n = zd0Var.a();
        this.f39274o = zd0Var.b();
        ee2 ee2VarA = ee2.a(w73Var);
        this.f39284y = ee2VarA;
        this.f39285z = new do0(ee2VarA);
        this.f39264d = new ro[roVarArr.length];
        for (int i10 = 0; i10 < roVarArr.length; i10++) {
            roVarArr[i10].a(i10, af2Var);
            this.f39264d[i10] = roVarArr[i10].b();
        }
        this.f39275p = new de0(this, i53Var);
        this.f39276q = new ArrayList();
        this.f39263c = oy2.a();
        this.f39271l = new u63();
        this.f39272m = new s63();
        v73Var.a(this, imVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f39279t = new vm1(seVar, handler);
        this.f39280u = new kn1(this, seVar, handler, af2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f39269j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f39270k = looper2;
        this.i = i53Var.a(looper2, this);
    }

    public final void a(co0 co0Var, int i) throws Throwable {
        this.f39285z.a(1);
        kn1 kn1Var = this.f39280u;
        if (i == -1) {
            i = kn1Var.f40280b.size();
        }
        a(kn1Var.a(i, co0Var.f37451a, co0Var.f37452b), false);
    }

    public final long b() {
        sm1 sm1Var = this.f39279t.i;
        if (sm1Var == null) {
            return 0L;
        }
        long jMax = sm1Var.f42984o;
        if (!sm1Var.f42974d) {
            return jMax;
        }
        int i = 0;
        while (true) {
            ro[] roVarArr = this.f39262b;
            if (i >= roVarArr.length) {
                return jMax;
            }
            if (b(roVarArr[i])) {
                ro roVar = this.f39262b[i];
                if (roVar.f42650h != sm1Var.f42973c[i]) {
                    continue;
                } else {
                    long j10 = roVar.f42652k;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
            i++;
        }
    }

    public final void c(rm1 rm1Var) throws qn0 {
        sm1 sm1Var = this.f39279t.f44081j;
        if (sm1Var == null || sm1Var.f42971a != rm1Var) {
            return;
        }
        float f10 = this.f39275p.getPlaybackParameters().f38745b;
        v63 v63Var = this.f39284y.f38095a;
        sm1Var.f42974d = true;
        l73 trackGroups = sm1Var.f42971a.getTrackGroups();
        sm1Var.f42982m = trackGroups;
        w73 w73VarA = sm1Var.f42979j.a(sm1Var.i, trackGroups, sm1Var.f42976f.f43715a, v63Var);
        for (pp0 pp0Var : w73VarA.f44303c) {
            if (pp0Var != null) {
                pp0Var.a(f10);
            }
        }
        um1 um1Var = sm1Var.f42976f;
        long jMax = um1Var.f43716b;
        long j10 = um1Var.f43719e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = sm1Var.a(w73VarA, jMax, false, new boolean[sm1Var.i.length]);
        long j11 = sm1Var.f42984o;
        um1 um1Var2 = sm1Var.f42976f;
        long j12 = um1Var2.f43716b;
        sm1Var.f42984o = (j12 - jA) + j11;
        if (jA != j12) {
            um1Var2 = new um1(um1Var2.f43715a, jA, um1Var2.f43717c, um1Var2.f43718d, um1Var2.f43719e, um1Var2.f43720f, um1Var2.f43721g, um1Var2.f43722h, um1Var2.i);
        }
        sm1Var.f42976f = um1Var2;
        a(sm1Var.f42983n);
        if (sm1Var == this.f39279t.f44080h) {
            b(sm1Var.f42976f.f43716b);
            a(new boolean[this.f39262b.length]);
            ee2 ee2Var = this.f39284y;
            an1 an1Var = ee2Var.f38096b;
            long j13 = sm1Var.f42976f.f43716b;
            this.f39284y = a(an1Var, j13, ee2Var.f38097c, j13, false, 5);
        }
        d();
    }

    public final void d() {
        int i;
        sm1 sm1Var = this.f39279t.f44081j;
        if (sm1Var != null) {
            if ((!sm1Var.f42974d ? 0L : sm1Var.f42971a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                sm1 sm1Var2 = this.f39279t.f44081j;
                long jA = a(sm1Var2.f42974d ? sm1Var2.f42971a.getNextLoadPositionUs() : 0L);
                if (sm1Var2 != this.f39279t.f44080h) {
                    long j10 = sm1Var2.f42976f.f43716b;
                }
                uf1 uf1Var = this.f39267g;
                float f10 = this.f39275p.getPlaybackParameters().f38745b;
                zd0 zd0Var = (zd0) uf1Var;
                ib0 ib0Var = zd0Var.f45378a;
                synchronized (ib0Var) {
                    i = ib0Var.f39484e * ib0Var.f39481b;
                }
                boolean z5 = i >= zd0Var.f45386j;
                long jMin = zd0Var.f45379b;
                if (f10 > 1.0f) {
                    int i10 = lb3.f40466a;
                    if (f10 != 1.0f) {
                        jMin = Math.round(jMin * ((double) f10));
                    }
                    jMin = Math.min(jMin, zd0Var.f45380c);
                }
                if (jA < Math.max(jMin, 500000L)) {
                    z = zd0Var.f45384g || !z5;
                    zd0Var.f45387k = z;
                    if (!z && jA < 500000) {
                        kh1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (jA >= zd0Var.f45380c || z5) {
                    zd0Var.f45387k = false;
                }
                z = zd0Var.f45387k;
            }
        }
        this.E = z;
        if (z) {
            sm1 sm1Var3 = this.f39279t.f44081j;
            long j11 = this.M;
            if (sm1Var3.f42981l != null) {
                throw new IllegalStateException();
            }
            sm1Var3.f42971a.continueLoading(j11 - sm1Var3.f42984o);
        }
        n();
    }

    public final void e() throws Throwable {
        a(this.f39280u.a(), true);
    }

    public final void f() {
        this.f39285z.a(1);
        throw null;
    }

    public final void g() {
        this.f39285z.a(1);
        a(false, false, false, true);
        ((zd0) this.f39267g).a(false);
        b(this.f39284y.f38095a.c() ? 4 : 2);
        kn1 kn1Var = this.f39280u;
        dc0 dc0Var = (dc0) this.f39268h;
        dc0Var.getClass();
        if (kn1Var.f40288k) {
            throw new IllegalStateException();
        }
        kn1Var.f40289l = dc0Var;
        for (int i = 0; i < kn1Var.f40280b.size(); i++) {
            in1 in1Var = (in1) kn1Var.f40280b.get(i);
            kn1Var.a(in1Var);
            kn1Var.i.add(in1Var);
        }
        kn1Var.f40288k = true;
        this.i.f40427a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.A && this.f39269j.isAlive()) {
            this.i.f40427a.sendEmptyMessage(7);
            a(new zl.j(1, this), this.f39282w);
            return this.A;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z5;
        sm1 sm1Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((go0) message.obj);
                    break;
                case 4:
                    a((ge2) message.obj);
                    break;
                case 5:
                    this.f39283x = (zw2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((rm1) message.obj);
                    break;
                case 9:
                    b((rm1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    df2 df2Var = (df2) message.obj;
                    df2Var.getClass();
                    if (df2Var.f37756f != this.f39270k) {
                        this.i.a(15, df2Var).b();
                    } else {
                        a(df2Var);
                        int i = this.f39284y.f38099e;
                        if (i == 3 || i == 2) {
                            this.i.f40427a.sendEmptyMessage(2);
                        }
                    }
                    break;
                case 15:
                    c((df2) message.obj);
                    break;
                case 16:
                    ge2 ge2Var = (ge2) message.obj;
                    a(ge2Var, ge2Var.f38745b, true, false);
                    break;
                case 17:
                    a((co0) message.obj);
                    break;
                case 18:
                    a((co0) message.obj, message.arg1);
                    break;
                case 19:
                    a2.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (vy2) message.obj);
                    break;
                case 21:
                    a((vy2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e3) {
            qn0 qn0Var = new qn0(2, e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? VKApiCodes.CODE_PHONE_ALREADY_USED : 1000, 0);
            kh1.b("ExoPlayerImplInternal", kh1.a("Playback error", qn0Var));
            a(true, false);
            this.f39284y = this.f39284y.a(qn0Var);
        } catch (mk0 e7) {
            a(e7, e7.f40934b);
        } catch (q30 e10) {
            a(e10, e10.f42160b);
        } catch (qb2 e11) {
            int i10 = e11.f42243c;
            if (i10 == 1) {
                i = e11.f42242b ? 3001 : 3003;
            } else if (i10 == 4) {
                i = e11.f42242b ? 3002 : 3004;
            }
            a(e11, i);
        } catch (zo e12) {
            a(e12, 1002);
        } catch (IOException e13) {
            a(e13, 2000);
        } catch (qn0 e14) {
            e = e14;
            if (e.f42344d == 1 && (sm1Var = this.f39279t.i) != null) {
                an1 an1Var = sm1Var.f42976f.f43715a;
                String message2 = e.getMessage();
                int i11 = lb3.f40466a;
                e = new qn0(message2, e.getCause(), e.f37741b, e.f42344d, e.f42345e, e.f42346f, e.f42347g, e.f42348h, an1Var, e.f37742c, e.f42349j);
            }
            if (e.f42349j && this.P == null) {
                kh1.d("ExoPlayerImplInternal", kh1.a("Recoverable renderer error", e));
                this.P = e;
                l53 l53Var = this.i;
                k53 k53VarA = l53Var.a(25, e);
                Handler handler = l53Var.f40427a;
                Message message3 = k53VarA.f40078a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                k53VarA.a();
                z5 = false;
            } else {
                qn0 qn0Var2 = this.P;
                if (qn0Var2 != null) {
                    qn0Var2.addSuppressed(e);
                    e = this.P;
                }
                kh1.b("ExoPlayerImplInternal", kh1.a("Playback error", e));
                z5 = false;
                a(true, false);
                this.f39284y = this.f39284y.a(e);
            }
        }
        z5 = false;
        do0 do0Var = this.f39285z;
        ee2 ee2Var = this.f39284y;
        boolean z10 = do0Var.f37858a | (do0Var.f37859b != ee2Var ? true : z5);
        do0Var.f37858a = z10;
        do0Var.f37859b = ee2Var;
        if (!z10) {
            return true;
        }
        ((zl.b) this.f39278s).b(do0Var);
        this.f39285z = new do0(this.f39284y);
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        ((zd0) this.f39267g).a(true);
        b(1);
        this.f39269j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void j() throws qn0 {
        int i;
        boolean z5;
        float f10 = this.f39275p.getPlaybackParameters().f38745b;
        vm1 vm1Var = this.f39279t;
        sm1 sm1Var = vm1Var.f44080h;
        sm1 sm1Var2 = vm1Var.i;
        boolean z10 = true;
        for (sm1 sm1Var3 = sm1Var; sm1Var3 != null && sm1Var3.f42974d; sm1Var3 = sm1Var3.f42981l) {
            w73 w73VarA = sm1Var3.f42979j.a(sm1Var3.i, sm1Var3.f42982m, sm1Var3.f42976f.f43715a, this.f39284y.f38095a);
            boolean z11 = false;
            for (pp0 pp0Var : w73VarA.f44303c) {
                if (pp0Var != null) {
                    pp0Var.a(f10);
                }
            }
            w73 w73Var = sm1Var3.f42983n;
            if (w73Var != null && w73Var.f44303c.length == w73VarA.f44303c.length) {
                for (int i10 = 0; i10 < w73VarA.f44303c.length; i10++) {
                    if (lb3.a(w73VarA.f44302b[i10], w73Var.f44302b[i10]) && lb3.a(w73VarA.f44303c[i10], w73Var.f44303c[i10])) {
                    }
                }
                if (sm1Var3 == sm1Var2) {
                    z10 = false;
                }
            }
            if (z10) {
                vm1 vm1Var2 = this.f39279t;
                sm1 sm1Var4 = vm1Var2.f44080h;
                boolean zA = vm1Var2.a(sm1Var4);
                boolean[] zArr = new boolean[this.f39262b.length];
                long jA = sm1Var4.a(w73VarA, this.f39284y.f38111r, zA, zArr);
                ee2 ee2Var = this.f39284y;
                if (ee2Var.f38099e == 4 || jA == ee2Var.f38111r) {
                    z5 = false;
                } else {
                    z5 = false;
                    z11 = true;
                }
                ee2 ee2Var2 = this.f39284y;
                boolean z12 = z5;
                i = 4;
                this.f39284y = a(ee2Var2.f38096b, jA, ee2Var2.f38097c, ee2Var2.f38098d, z11, 5);
                if (z11) {
                    b(jA);
                }
                boolean[] zArr2 = new boolean[this.f39262b.length];
                ?? r8 = z12;
                while (true) {
                    ro[] roVarArr = this.f39262b;
                    if (r8 >= roVarArr.length) {
                        break;
                    }
                    ro roVar = roVarArr[r8];
                    boolean zB = b(roVar);
                    zArr2[r8] = zB;
                    ps2 ps2Var = sm1Var4.f42973c[r8];
                    if (zB) {
                        if (ps2Var != roVar.f42650h) {
                            a(roVar);
                        } else if (zArr[r8]) {
                            long j10 = this.M;
                            roVar.f42653l = z12;
                            roVar.f42652k = j10;
                            roVar.a(j10, z12);
                        }
                    }
                    r8++;
                }
                a(zArr2);
            } else {
                i = 4;
                this.f39279t.a(sm1Var3);
                if (sm1Var3.f42974d) {
                    sm1Var3.a(w73VarA, Math.max(sm1Var3.f42976f.f43716b, this.M - sm1Var3.f42984o), false, new boolean[sm1Var3.i.length]);
                }
            }
            a(true);
            if (this.f39284y.f38099e != i) {
                d();
                o();
                this.i.f40427a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        sm1 sm1Var = this.f39279t.f44080h;
        this.C = sm1Var != null && sm1Var.f42976f.f43722h && this.B;
    }

    public final boolean l() {
        ee2 ee2Var = this.f39284y;
        return ee2Var.f38105l && ee2Var.f38106m == 0;
    }

    public final void m() {
        int i;
        de0 de0Var = this.f39275p;
        de0Var.f37739g = false;
        m33 m33Var = de0Var.f37734b;
        if (m33Var.f40766c) {
            m33Var.a(m33Var.a());
            m33Var.f40766c = false;
        }
        for (ro roVar : this.f39262b) {
            if (b(roVar) && (i = roVar.f42649g) == 2) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                roVar.f42649g = 1;
                roVar.k();
            }
        }
    }

    public final void n() {
        sm1 sm1Var = this.f39279t.f44081j;
        boolean z5 = this.E || (sm1Var != null && sm1Var.f42971a.isLoading());
        ee2 ee2Var = this.f39284y;
        if (z5 != ee2Var.f38101g) {
            this.f39284y = new ee2(ee2Var.f38095a, ee2Var.f38096b, ee2Var.f38097c, ee2Var.f38098d, ee2Var.f38099e, ee2Var.f38100f, z5, ee2Var.f38102h, ee2Var.i, ee2Var.f38103j, ee2Var.f38104k, ee2Var.f38105l, ee2Var.f38106m, ee2Var.f38107n, ee2Var.f38109p, ee2Var.f38110q, ee2Var.f38111r, ee2Var.f38108o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.o():void");
    }

    public final void e(boolean z5) throws qn0 {
        this.G = z5;
        vm1 vm1Var = this.f39279t;
        v63 v63Var = this.f39284y.f38095a;
        vm1Var.f44079g = z5;
        if (!vm1Var.a(v63Var)) {
            b(true);
        }
        a(false);
    }

    public static void a(df2 df2Var) {
        synchronized (df2Var) {
        }
        try {
            df2Var.f37751a.handleMessage(df2Var.f37754d, df2Var.f37755e);
        } finally {
            df2Var.a(true);
        }
    }

    public final void b(rm1 rm1Var) {
        rm1 rm1Var2;
        sm1 sm1Var = this.f39279t.f44081j;
        if (sm1Var == null || (rm1Var2 = sm1Var.f42971a) != rm1Var) {
            return;
        }
        long j10 = this.M;
        if (sm1Var.f42981l == null) {
            if (sm1Var.f42974d) {
                rm1Var2.reevaluateBuffer(j10 - sm1Var.f42984o);
            }
            d();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(ro roVar) {
        if (b(roVar)) {
            de0 de0Var = this.f39275p;
            if (roVar == de0Var.f37736d) {
                de0Var.f37737e = null;
                de0Var.f37736d = null;
                de0Var.f37738f = true;
            }
            int i = roVar.f42649g;
            if (i == 2) {
                if (i == 2) {
                    roVar.f42649g = 1;
                    roVar.k();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (roVar.f42649g == 1) {
                ox0 ox0Var = roVar.f42645c;
                ox0Var.f41758a = null;
                ox0Var.f41759b = null;
                roVar.f42649g = 0;
                roVar.f42650h = null;
                roVar.i = null;
                roVar.f42653l = false;
                roVar.h();
                this.K--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static boolean b(ro roVar) {
        return roVar.f42649g != 0;
    }

    public final void b(df2 df2Var) {
        try {
            a(df2Var);
        } catch (qn0 e3) {
            kh1.b("ExoPlayerImplInternal", kh1.a("Unexpected error delivering message on external thread.", e3));
            throw new RuntimeException(e3);
        }
    }

    public final void b(long j10) {
        sm1 sm1Var = this.f39279t.f44080h;
        long j11 = j10 + (sm1Var == null ? 1000000000000L : sm1Var.f42984o);
        this.M = j11;
        this.f39275p.f37734b.a(j11);
        for (ro roVar : this.f39262b) {
            if (b(roVar)) {
                long j12 = this.M;
                roVar.f42653l = false;
                roVar.f42652k = j12;
                roVar.a(j12, false);
            }
        }
        for (sm1 sm1Var2 = this.f39279t.f44080h; sm1Var2 != null; sm1Var2 = sm1Var2.f42981l) {
            for (pp0 pp0Var : sm1Var2.f42983n.f44303c) {
                if (pp0Var != null) {
                    pp0Var.h();
                }
            }
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.A);
    }

    public final void c(df2 df2Var) {
        Looper looper = df2Var.f37756f;
        if (!looper.getThread().isAlive()) {
            kh1.d("TAG", "Trying to send message on a dead thread.");
            df2Var.a(false);
        } else {
            ((i53) this.f39277r).getClass();
            new Handler(looper, null).post(new zl.n(3, this, df2Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x05c9, code lost:
    
        if (r8 >= r4.f45386j) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x061f A[PHI: r13
      0x061f: PHI (r13v3 boolean) = (r13v2 boolean), (r13v2 boolean), (r13v4 boolean), (r13v2 boolean), (r13v2 boolean) binds: [B:311:0x04f9, B:323:0x051d, B:374:0x05cc, B:315:0x0509, B:321:0x0519] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184 A[EDGE_INSN: B:532:0x0184->B:74:0x0184 BREAK  A[LOOP:8: B:84:0x019a->B:101:0x01d2], EDGE_INSN: B:534:0x0184->B:74:0x0184 BREAK  A[LOOP:8: B:84:0x019a->B:101:0x01d2], EDGE_INSN: B:535:0x0184->B:74:0x0184 BREAK  A[LOOP:8: B:84:0x019a->B:101:0x01d2], EDGE_INSN: B:536:0x0184->B:74:0x0184 BREAK  A[LOOP:8: B:84:0x019a->B:101:0x01d2]] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v85, types: [yads.w73] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30, types: [yads.w73] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83, types: [int] */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72, types: [int] */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v31, types: [yads.pp0[]] */
    /* JADX WARN: Type inference failed for: r6v32, types: [yads.pp0] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [int] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [yads.w73] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws yads.qn0 {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.a():void");
    }

    public final void c(boolean z5) {
        if (z5 == this.J) {
            return;
        }
        this.J = z5;
        if (z5 || !this.f39284y.f38108o) {
            return;
        }
        this.i.f40427a.sendEmptyMessage(2);
    }

    public final void d(boolean z5) throws qn0 {
        this.B = z5;
        k();
        if (this.C) {
            vm1 vm1Var = this.f39279t;
            if (vm1Var.i != vm1Var.f44080h) {
                b(true);
                a(false);
            }
        }
    }

    public final void b(boolean z5) throws qn0 {
        an1 an1Var = this.f39279t.f44080h.f42976f.f43715a;
        long jA = a(an1Var, this.f39284y.f38111r, true, false);
        if (jA != this.f39284y.f38111r) {
            ee2 ee2Var = this.f39284y;
            this.f39284y = a(an1Var, jA, ee2Var.f38097c, ee2Var.f38098d, z5, 5);
        }
    }

    public final void b(int i) {
        ee2 ee2Var = this.f39284y;
        if (ee2Var.f38099e != i) {
            if (i != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f39284y = ee2Var.a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean[] r22) throws yads.qn0 {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.a(boolean[]):void");
    }

    public final long a(v63 v63Var, Object obj, long j10) {
        long jElapsedRealtime;
        v63Var.a(v63Var.a(obj, this.f39272m).f42825d, this.f39271l, 0L);
        u63 u63Var = this.f39271l;
        if (u63Var.f43584g != -9223372036854775807L && u63Var.a()) {
            u63 u63Var2 = this.f39271l;
            if (u63Var2.f43586j) {
                long j11 = u63Var2.f43585h;
                int i = lb3.f40466a;
                if (j11 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return lb3.a(jElapsedRealtime - this.f39271l.f43584g) - (j10 + this.f39272m.f42827f);
            }
        }
        return -9223372036854775807L;
    }

    public final Pair a(v63 v63Var) {
        long j10 = 0;
        if (v63Var.c()) {
            return Pair.create(ee2.f38094s, 0L);
        }
        Pair pairA = v63Var.a(this.f39271l, this.f39272m, v63Var.a(this.G), -9223372036854775807L);
        an1 an1VarA = this.f39279t.a(v63Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (an1VarA.a()) {
            v63Var.a(an1VarA.f43366a, this.f39272m);
            if (an1VarA.f43368c == this.f39272m.a(an1VarA.f43367b)) {
                j10 = this.f39272m.f42829h.f38024d;
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(an1VarA, Long.valueOf(j10));
    }

    public final long a(long j10) {
        sm1 sm1Var = this.f39279t.f44081j;
        if (sm1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.M - sm1Var.f42984o));
    }

    public final void a(IOException iOException, int i) {
        qn0 qn0Var = new qn0(0, iOException, i, 0);
        sm1 sm1Var = this.f39279t.f44080h;
        if (sm1Var != null) {
            an1 an1Var = sm1Var.f42976f.f43715a;
            String message = qn0Var.getMessage();
            int i10 = lb3.f40466a;
            qn0Var = new qn0(message, qn0Var.getCause(), qn0Var.f37741b, qn0Var.f42344d, qn0Var.f42345e, qn0Var.f42346f, qn0Var.f42347g, qn0Var.f42348h, an1Var, qn0Var.f37742c, qn0Var.f42349j);
        }
        kh1.b("ExoPlayerImplInternal", kh1.a("Playback error", qn0Var));
        a(false, false);
        this.f39284y = this.f39284y.a(qn0Var);
    }

    public final void a(boolean z5) {
        long j10;
        sm1 sm1Var = this.f39279t.f44081j;
        an1 an1Var = sm1Var == null ? this.f39284y.f38096b : sm1Var.f42976f.f43715a;
        boolean zEquals = this.f39284y.f38104k.equals(an1Var);
        if (!zEquals) {
            this.f39284y = this.f39284y.a(an1Var);
        }
        ee2 ee2Var = this.f39284y;
        if (sm1Var == null) {
            j10 = ee2Var.f38111r;
        } else if (!sm1Var.f42974d) {
            j10 = sm1Var.f42976f.f43716b;
        } else {
            long bufferedPositionUs = sm1Var.f42975e ? sm1Var.f42971a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? sm1Var.f42976f.f43719e : bufferedPositionUs;
        }
        ee2Var.f38109p = j10;
        ee2 ee2Var2 = this.f39284y;
        ee2Var2.f38110q = a(ee2Var2.f38109p);
        if ((!zEquals || z5) && sm1Var != null && sm1Var.f42974d) {
            a(sm1Var.f42983n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
    /* JADX WARN: Type inference failed for: r0v33, types: [yads.ee2] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v13, types: [yads.v63] */
    /* JADX WARN: Type inference failed for: r2v18, types: [yads.ee2] */
    /* JADX WARN: Type inference failed for: r2v25, types: [yads.v63] */
    /* JADX WARN: Type inference failed for: r37v0, types: [yads.ho0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.v63 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.a(yads.v63, boolean):void");
    }

    public final void a(ge2 ge2Var, float f10, boolean z5, boolean z10) {
        ge2 ge2Var2;
        int i;
        if (z5) {
            if (z10) {
                this.f39285z.a(1);
            }
            ee2 ee2Var = this.f39284y;
            ee2 ee2Var2 = new ee2(ee2Var.f38095a, ee2Var.f38096b, ee2Var.f38097c, ee2Var.f38098d, ee2Var.f38099e, ee2Var.f38100f, ee2Var.f38101g, ee2Var.f38102h, ee2Var.i, ee2Var.f38103j, ee2Var.f38104k, ee2Var.f38105l, ee2Var.f38106m, ge2Var, ee2Var.f38109p, ee2Var.f38110q, ee2Var.f38111r, ee2Var.f38108o);
            ge2Var2 = ge2Var;
            this.f39284y = ee2Var2;
        } else {
            ge2Var2 = ge2Var;
        }
        float f11 = ge2Var2.f38745b;
        sm1 sm1Var = this.f39279t.f44080h;
        while (true) {
            i = 0;
            if (sm1Var == null) {
                break;
            }
            pp0[] pp0VarArr = sm1Var.f42983n.f44303c;
            int length = pp0VarArr.length;
            while (i < length) {
                pp0 pp0Var = pp0VarArr[i];
                if (pp0Var != null) {
                    pp0Var.a(f11);
                }
                i++;
            }
            sm1Var = sm1Var.f42981l;
        }
        ro[] roVarArr = this.f39262b;
        int length2 = roVarArr.length;
        while (i < length2) {
            ro roVar = roVarArr[i];
            if (roVar != null) {
                roVar.a(f10, ge2Var2.f38745b);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ee2 a(yads.an1 r26, long r27, long r29, long r31, boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.a(yads.an1, long, long, long, boolean, int):yads.ee2");
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        this.i.a(9, (rm1) ux2Var).b();
    }

    @Override // yads.qm1
    public final void a(rm1 rm1Var) {
        this.i.a(8, rm1Var).b();
    }

    public final void a(int i, int i10, vy2 vy2Var) throws Throwable {
        this.f39285z.a(1);
        kn1 kn1Var = this.f39280u;
        kn1Var.getClass();
        if (i >= 0 && i <= i10 && i10 <= kn1Var.f40280b.size()) {
            kn1Var.f40287j = vy2Var;
            kn1Var.a(i, i10);
            a(kn1Var.a(), false);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[PHI: r4 r5 r7
      0x00da: PHI (r4v4 yads.an1) = (r4v3 yads.an1), (r4v10 yads.an1) binds: [B:39:0x00af, B:41:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r5v2 long) = (r5v1 long), (r5v10 long) binds: [B:39:0x00af, B:41:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:39:0x00af, B:41:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ho0.a(boolean, boolean, boolean, boolean):void");
    }

    public final void a(v63 v63Var, v63 v63Var2) {
        if (v63Var.c() && v63Var2.c()) {
            return;
        }
        int size = this.f39276q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f39276q);
        } else {
            a2.a(this.f39276q.get(size));
            throw null;
        }
    }

    public static Pair a(v63 v63Var, go0 go0Var, boolean z5, int i, boolean z10, u63 u63Var, s63 s63Var) {
        Pair pairA;
        v63 v63Var2;
        Object objA;
        v63 v63Var3 = go0Var.f38835a;
        if (v63Var.c()) {
            return null;
        }
        boolean zC = v63Var3.c();
        v63 v63Var4 = v63Var3;
        if (zC) {
            v63Var4 = v63Var;
        }
        try {
            pairA = v63Var4.a(u63Var, s63Var, go0Var.f38836b, go0Var.f38837c);
            v63Var2 = v63Var4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (v63Var.equals(v63Var2)) {
            return pairA;
        }
        if (v63Var.a(pairA.first) != -1) {
            return (v63Var2.a(pairA.first, s63Var).f42828g && v63Var2.a(s63Var.f42825d, u63Var, 0L).f43592p == v63Var2.a(pairA.first)) ? v63Var.a(u63Var, s63Var, v63Var.a(pairA.first, s63Var).f42825d, go0Var.f38837c) : pairA;
        }
        if (z5 && (objA = a(u63Var, s63Var, i, z10, pairA.first, v63Var2, v63Var)) != null) {
            return v63Var.a(u63Var, s63Var, v63Var.a(objA, s63Var).f42825d, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(u63 u63Var, s63 s63Var, int i, boolean z5, Object obj, v63 v63Var, v63 v63Var2) {
        int iA = v63Var.a(obj);
        int iA2 = v63Var.a();
        int i10 = 0;
        int iA3 = iA;
        int iA4 = -1;
        while (i10 < iA2 && iA4 == -1) {
            u63 u63Var2 = u63Var;
            s63 s63Var2 = s63Var;
            int i11 = i;
            boolean z10 = z5;
            v63 v63Var3 = v63Var;
            iA3 = v63Var3.a(iA3, s63Var2, u63Var2, i11, z10);
            if (iA3 == -1) {
                break;
            }
            iA4 = v63Var2.a(v63Var3.a(iA3));
            i10++;
            v63Var = v63Var3;
            s63Var = s63Var2;
            u63Var = u63Var2;
            i = i11;
            z5 = z10;
        }
        if (iA4 == -1) {
            return null;
        }
        return v63Var2.a(iA4);
    }

    public final void a(go0 go0Var) throws Throwable {
        long jLongValue;
        an1 an1VarA;
        long j10;
        boolean z5;
        long j11;
        boolean z10;
        an1 an1Var;
        long j12;
        long jA;
        long j13;
        ee2 ee2Var;
        int i;
        ee2 ee2Var2;
        an1 an1Var2;
        v63 v63Var;
        long j14;
        an1 an1Var3;
        boolean z11;
        long j15;
        this.f39285z.a(1);
        Pair pairA = a(this.f39284y.f38095a, go0Var, true, this.F, this.G, this.f39271l, this.f39272m);
        if (pairA == null) {
            Pair pairA2 = a(this.f39284y.f38095a);
            an1VarA = (an1) pairA2.first;
            jLongValue = ((Long) pairA2.second).longValue();
            z5 = !this.f39284y.f38095a.c();
            j11 = -9223372036854775807L;
            j10 = 0;
        } else {
            Object obj = pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            long j16 = go0Var.f38837c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            an1VarA = this.f39279t.a(this.f39284y.f38095a, obj, jLongValue);
            if (an1VarA.a()) {
                this.f39284y.f38095a.a(an1VarA.f43366a, this.f39272m);
                jLongValue = this.f39272m.a(an1VarA.f43367b) == an1VarA.f43368c ? this.f39272m.f42829h.f38024d : 0L;
                j10 = 0;
            } else {
                j10 = 0;
                if (go0Var.f38837c != -9223372036854775807L) {
                    z5 = false;
                }
                j11 = j16;
            }
            z5 = true;
            j11 = j16;
        }
        try {
            if (this.f39284y.f38095a.c()) {
                this.L = go0Var;
            } else if (pairA == null) {
                if (this.f39284y.f38099e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (an1VarA.equals(this.f39284y.f38096b)) {
                    try {
                        sm1 sm1Var = this.f39279t.f44080h;
                        jA = (sm1Var == null || !sm1Var.f42974d || jLongValue == j10) ? jLongValue : sm1Var.f42971a.a(jLongValue, this.f39283x);
                        if (lb3.b(jA) != lb3.b(this.f39284y.f38111r) || ((i = (ee2Var = this.f39284y).f38099e) != 2 && i != 3)) {
                            z10 = z5;
                            j13 = j11;
                            an1Var = an1VarA;
                        }
                        long j17 = ee2Var.f38111r;
                        this.f39284y = a(an1VarA, j17, j11, j17, z5, 2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z5;
                        an1Var = an1VarA;
                        j12 = jLongValue;
                        this.f39284y = a(an1Var, j12, j11, j12, z10, 2);
                        throw th;
                    }
                }
                z10 = z5;
                j13 = j11;
                an1Var = an1VarA;
                jA = jLongValue;
                try {
                    boolean z12 = this.f39284y.f38099e == 4;
                    vm1 vm1Var = this.f39279t;
                    long jA2 = a(an1Var, jA, vm1Var.f44080h != vm1Var.i, z12);
                    boolean z13 = z10 | (jLongValue != jA2);
                    try {
                        ee2Var2 = this.f39284y;
                        an1Var2 = an1Var;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        v63Var = ee2Var2.f38095a;
                        j14 = j13;
                    } catch (Throwable th4) {
                        th = th4;
                        an1Var = an1Var2;
                        j11 = j13;
                        z10 = z13;
                        j12 = jA2;
                        this.f39284y = a(an1Var, j12, j11, j12, z10, 2);
                        throw th;
                    }
                    try {
                        a(v63Var, an1Var2, v63Var, ee2Var2.f38096b, j14);
                        an1Var3 = an1Var2;
                        j11 = j14;
                        z11 = z13;
                        j15 = jA2;
                        this.f39284y = a(an1Var3, j15, j11, j15, z11, 2);
                    } catch (Throwable th5) {
                        th = th5;
                        an1Var = an1Var2;
                        j11 = j14;
                        z10 = z13;
                        j12 = jA2;
                        this.f39284y = a(an1Var, j12, j11, j12, z10, 2);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j11 = j13;
                    j12 = jLongValue;
                    this.f39284y = a(an1Var, j12, j11, j12, z10, 2);
                    throw th;
                }
            }
            z11 = z5;
            an1Var3 = an1VarA;
            j15 = jLongValue;
            this.f39284y = a(an1Var3, j15, j11, j15, z11, 2);
        } catch (Throwable th7) {
            th = th7;
            z10 = z5;
        }
    }

    public final long a(an1 an1Var, long j10, boolean z5, boolean z10) throws qn0 {
        vm1 vm1Var;
        long jSeekToUs;
        long j11;
        sm1 sm1Var;
        m();
        this.D = false;
        if (z10 || this.f39284y.f38099e == 3) {
            b(2);
        }
        sm1 sm1Var2 = this.f39279t.f44080h;
        sm1 sm1Var3 = sm1Var2;
        while (sm1Var3 != null && !an1Var.equals(sm1Var3.f42976f.f43715a)) {
            sm1Var3 = sm1Var3.f42981l;
        }
        if (z5 || sm1Var2 != sm1Var3 || (sm1Var3 != null && j10 + sm1Var3.f42984o < 0)) {
            for (ro roVar : this.f39262b) {
                a(roVar);
            }
            if (sm1Var3 != null) {
                while (true) {
                    vm1Var = this.f39279t;
                    if (vm1Var.f44080h == sm1Var3) {
                        break;
                    }
                    vm1Var.a();
                }
                vm1Var.a(sm1Var3);
                sm1Var3.f42984o = 1000000000000L;
                a(new boolean[this.f39262b.length]);
            }
        }
        if (sm1Var3 != null) {
            this.f39279t.a(sm1Var3);
            if (!sm1Var3.f42974d) {
                um1 um1Var = sm1Var3.f42976f;
                if (j10 == um1Var.f43716b) {
                    sm1Var = sm1Var3;
                    j11 = j10;
                } else {
                    sm1Var = sm1Var3;
                    j11 = j10;
                    um1Var = new um1(um1Var.f43715a, j11, um1Var.f43717c, um1Var.f43718d, um1Var.f43719e, um1Var.f43720f, um1Var.f43721g, um1Var.f43722h, um1Var.i);
                }
                sm1Var.f42976f = um1Var;
            } else {
                sm1 sm1Var4 = sm1Var3;
                j11 = j10;
                if (sm1Var4.f42975e) {
                    jSeekToUs = sm1Var4.f42971a.seekToUs(j11);
                    sm1Var4.f42971a.discardBuffer(jSeekToUs - this.f39273n, this.f39274o);
                }
                b(jSeekToUs);
                d();
            }
            jSeekToUs = j11;
            b(jSeekToUs);
            d();
        } else {
            this.f39279t.b();
            b(j10);
            jSeekToUs = j10;
        }
        a(false);
        this.i.f40427a.sendEmptyMessage(2);
        return jSeekToUs;
    }

    public static void a(ro roVar, long j10) {
        roVar.f42653l = true;
        if (roVar instanceof d63) {
            d63 d63Var = (d63) roVar;
            if (d63Var.f42653l) {
                d63Var.B = j10;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void a(boolean z5, AtomicBoolean atomicBoolean) {
        if (this.H != z5) {
            this.H = z5;
            if (!z5) {
                for (ro roVar : this.f39262b) {
                    if (!b(roVar) && this.f39263c.remove(roVar)) {
                        if (roVar.f42649g == 0) {
                            ox0 ox0Var = roVar.f42645c;
                            ox0Var.f41758a = null;
                            ox0Var.f41759b = null;
                            roVar.i();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void a(co0 co0Var) throws Throwable {
        this.f39285z.a(1);
        if (co0Var.f37453c != -1) {
            this.L = new go0(new zf2(co0Var.f37451a, co0Var.f37452b), co0Var.f37453c, co0Var.f37454d);
        }
        kn1 kn1Var = this.f39280u;
        List list = co0Var.f37451a;
        vy2 vy2Var = co0Var.f37452b;
        kn1Var.a(0, kn1Var.f40280b.size());
        a(kn1Var.a(kn1Var.f40280b.size(), list, vy2Var), false);
    }

    public final void a(boolean z5, int i, boolean z10, int i10) {
        this.f39285z.a(z10 ? 1 : 0);
        do0 do0Var = this.f39285z;
        do0Var.f37858a = true;
        do0Var.f37863f = true;
        do0Var.f37864g = i10;
        ee2 ee2Var = this.f39284y;
        this.f39284y = new ee2(ee2Var.f38095a, ee2Var.f38096b, ee2Var.f38097c, ee2Var.f38098d, ee2Var.f38099e, ee2Var.f38100f, ee2Var.f38101g, ee2Var.f38102h, ee2Var.i, ee2Var.f38103j, ee2Var.f38104k, z5, i, ee2Var.f38107n, ee2Var.f38109p, ee2Var.f38110q, ee2Var.f38111r, ee2Var.f38108o);
        this.D = false;
        for (sm1 sm1Var = this.f39279t.f44080h; sm1Var != null; sm1Var = sm1Var.f42981l) {
            for (pp0 pp0Var : sm1Var.f42983n.f44303c) {
                if (pp0Var != null) {
                    pp0Var.a(z5);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i11 = this.f39284y.f38099e;
        if (i11 != 3) {
            if (i11 == 2) {
                this.i.f40427a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.D = false;
        de0 de0Var = this.f39275p;
        de0Var.f37739g = true;
        m33 m33Var = de0Var.f37734b;
        if (!m33Var.f40766c) {
            ((i53) m33Var.f40765b).getClass();
            m33Var.f40768e = SystemClock.elapsedRealtime();
            m33Var.f40766c = true;
        }
        for (ro roVar : this.f39262b) {
            if (b(roVar)) {
                if (roVar.f42649g == 1) {
                    roVar.f42649g = 2;
                    roVar.j();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.i.f40427a.sendEmptyMessage(2);
    }

    public final void a(ge2 ge2Var) {
        this.f39275p.a(ge2Var);
        ge2 playbackParameters = this.f39275p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f38745b, true, true);
    }

    public final void a(int i) throws qn0 {
        this.F = i;
        vm1 vm1Var = this.f39279t;
        v63 v63Var = this.f39284y.f38095a;
        vm1Var.f44078f = i;
        if (!vm1Var.a(v63Var)) {
            b(true);
        }
        a(false);
    }

    public final void a(vy2 vy2Var) throws Throwable {
        this.f39285z.a(1);
        kn1 kn1Var = this.f39280u;
        int size = kn1Var.f40280b.size();
        if (vy2Var.f44225b.length != size) {
            vy2Var = new vy2(new int[0], new Random(vy2Var.f44224a.nextLong())).a(size);
        }
        kn1Var.f40287j = vy2Var;
        a(kn1Var.a(), false);
    }

    public final boolean a(v63 v63Var, an1 an1Var) {
        if (!an1Var.a() && !v63Var.c()) {
            v63Var.a(v63Var.a(an1Var.f43366a, this.f39272m).f42825d, this.f39271l, 0L);
            if (this.f39271l.a()) {
                u63 u63Var = this.f39271l;
                if (u63Var.f43586j && u63Var.f43584g != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(boolean z5, boolean z10) {
        a(z5 || !this.H, false, true, false);
        this.f39285z.a(z10 ? 1 : 0);
        ((zd0) this.f39267g).a(true);
        b(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(w73 w73Var) {
        uf1 uf1Var = this.f39267g;
        ro[] roVarArr = this.f39262b;
        pp0[] pp0VarArr = w73Var.f44303c;
        zd0 zd0Var = (zd0) uf1Var;
        int iMax = zd0Var.f45383f;
        if (iMax == -1) {
            int i = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i < roVarArr.length) {
                    if (pp0VarArr[i] != null) {
                        switch (roVarArr[i].f42644b) {
                            case -2:
                                i11 = 0;
                                i10 += i11;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 1:
                                i10 += i11;
                                break;
                            case 2:
                                i11 = 131072000;
                                i10 += i11;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i11 = 131072;
                                i10 += i11;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i10);
                }
            }
        }
        zd0Var.f45386j = iMax;
        zd0Var.f45378a.a(iMax);
    }

    public final void a(v63 v63Var, an1 an1Var, v63 v63Var2, an1 an1Var2, long j10) {
        if (!a(v63Var, an1Var)) {
            ge2 ge2Var = an1Var.a() ? ge2.f38744e : this.f39284y.f38107n;
            if (this.f39275p.getPlaybackParameters().equals(ge2Var)) {
                return;
            }
            this.f39275p.a(ge2Var);
            return;
        }
        v63Var.a(v63Var.a(an1Var.f43366a, this.f39272m).f42825d, this.f39271l, 0L);
        tf1 tf1Var = this.f39281v;
        am1 am1Var = this.f39271l.f43588l;
        int i = lb3.f40466a;
        yd0 yd0Var = (yd0) tf1Var;
        yd0Var.getClass();
        yd0Var.f45014d = lb3.a(am1Var.f36773b);
        yd0Var.f45017g = lb3.a(am1Var.f36774c);
        yd0Var.f45018h = lb3.a(am1Var.f36775d);
        float f10 = am1Var.f36776e;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        yd0Var.f45020k = f10;
        float f11 = am1Var.f36777f;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        yd0Var.f45019j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            yd0Var.f45014d = -9223372036854775807L;
        }
        yd0Var.a();
        if (j10 != -9223372036854775807L) {
            yd0 yd0Var2 = (yd0) this.f39281v;
            yd0Var2.f45015e = a(v63Var, an1Var.f43366a, j10);
            yd0Var2.a();
        } else {
            if (lb3.a(!v63Var2.c() ? v63Var2.a(v63Var2.a(an1Var2.f43366a, this.f39272m).f42825d, this.f39271l, 0L).f43579b : null, this.f39271l.f43579b)) {
                return;
            }
            yd0 yd0Var3 = (yd0) this.f39281v;
            yd0Var3.f45015e = -9223372036854775807L;
            yd0Var3.a();
        }
    }

    public final synchronized void a(b53 b53Var, long j10) {
        ((i53) this.f39277r).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z5 = false;
        while (!((Boolean) b53Var.get()).booleanValue() && j10 > 0) {
            try {
                this.f39277r.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z5 = true;
            }
            ((i53) this.f39277r).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }
}
