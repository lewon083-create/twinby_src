package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import yads.ao0;
import yads.ee2;
import yads.oe2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ao0 extends qo implements tn0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public vy2 E;
    public ne2 F;
    public lm1 G;
    public AudioTrack H;
    public Object I;
    public Surface J;
    public SurfaceHolder K;
    public boolean M;
    public TextureView N;
    public final int O;
    public int P;
    public int Q;
    public final int R;
    public final pk S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public ig0 X;
    public lm1 Y;
    public ee2 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f36795a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w73 f36796b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f36797b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne2 f36798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy f36799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qe2 f36800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ro[] f36801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v73 f36802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l53 f36803h;
    public final ho0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rf1 f36804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f36805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s63 f36806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f36807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f36808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final se f36809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f36810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final im f36811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i53 f36812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xn0 f36813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yn0 f36814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final sk f36815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yk f36816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f43 f36817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final in3 f36818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final xo3 f36819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f36820z;

    static {
        io0.a("goog.exo.exoplayer");
    }

    public ao0(sn0 sn0Var) {
        vy vyVar = new vy();
        this.f36799d = vyVar;
        try {
            kh1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + lb3.f40470e + "]");
            Context applicationContext = sn0Var.f42988a.getApplicationContext();
            se seVar = (se) sn0Var.f42995h.apply(sn0Var.f42989b);
            this.f36809o = seVar;
            pk pkVar = sn0Var.f42996j;
            this.S = pkVar;
            int i = sn0Var.f42997k;
            this.O = i;
            this.U = false;
            this.f36820z = sn0Var.f43002p;
            xn0 xn0Var = new xn0(this);
            this.f36813s = xn0Var;
            yn0 yn0Var = new yn0();
            this.f36814t = yn0Var;
            Handler handler = new Handler(sn0Var.i);
            ro[] roVarArrA = ((pe0) sn0Var.f42990c.get()).a(handler, xn0Var, xn0Var, xn0Var, xn0Var);
            this.f36801f = roVarArrA;
            ni.b(roVarArrA.length > 0);
            v73 v73Var = (v73) sn0Var.f42992e.get();
            this.f36802g = v73Var;
            im imVar = (im) sn0Var.f42994g.get();
            this.f36811q = imVar;
            this.f36808n = sn0Var.f42998l;
            zw2 zw2Var = sn0Var.f42999m;
            Looper looper = sn0Var.i;
            this.f36810p = looper;
            i53 i53Var = sn0Var.f42989b;
            this.f36812r = i53Var;
            this.f36800e = this;
            this.f36804j = new rf1(looper, i53Var, new zl.b(this));
            this.f36805k = new CopyOnWriteArraySet();
            this.f36807m = new ArrayList();
            this.E = new vy2();
            w73 w73Var = new w73(new on2[roVarArrA.length], new pp0[roVarArrA.length], r83.f42518c, null);
            this.f36796b = w73Var;
            this.f36806l = new s63();
            me2 me2VarA = new me2().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            v73Var.getClass();
            ne2 ne2VarA = me2VarA.a(true, 29).a();
            this.f36798c = ne2VarA;
            this.F = new me2().a(ne2VarA).a(4).a(10).a();
            this.f36803h = i53Var.a(looper, null);
            zl.b bVar = new zl.b(this);
            this.Z = ee2.a(w73Var);
            ((kb0) seVar).a(this, looper);
            int i10 = lb3.f40466a;
            this.i = new ho0(roVarArrA, v73Var, w73Var, (uf1) sn0Var.f42993f.get(), imVar, 0, seVar, zw2Var, sn0Var.f43000n, sn0Var.f43001o, looper, i53Var, bVar, i10 < 31 ? new af2() : wn0.a(applicationContext, this, sn0Var.f43003q));
            this.T = 1.0f;
            lm1 lm1Var = lm1.H;
            this.G = lm1Var;
            this.Y = lm1Var;
            this.f36795a0 = -1;
            if (i10 < 21) {
                this.R = k();
            } else {
                this.R = lb3.a(applicationContext);
            }
            int i11 = q20.f42140b;
            this.V = true;
            a(seVar);
            ((dc0) imVar).a(new Handler(looper), seVar);
            a(xn0Var);
            sk skVar = new sk(sn0Var.f42988a, handler, xn0Var);
            this.f36815u = skVar;
            skVar.a();
            yk ykVar = new yk(sn0Var.f42988a, handler, xn0Var);
            this.f36816v = ykVar;
            ykVar.b();
            f43 f43Var = new f43(sn0Var.f42988a, handler, xn0Var);
            this.f36817w = f43Var;
            f43Var.a(lb3.c(pkVar.f41940d));
            in3 in3Var = new in3(sn0Var.f42988a);
            this.f36818x = in3Var;
            in3Var.a();
            xo3 xo3Var = new xo3(sn0Var.f42988a);
            this.f36819y = xo3Var;
            xo3Var.a();
            this.X = a(f43Var);
            v73Var.a(pkVar);
            a(1, 10, Integer.valueOf(this.R));
            a(2, 10, Integer.valueOf(this.R));
            a(1, 3, pkVar);
            a(2, 4, Integer.valueOf(i));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.U));
            a(2, 7, yn0Var);
            a(6, 8, yn0Var);
            vyVar.d();
        } catch (Throwable th2) {
            this.f36799d.d();
            throw th2;
        }
    }

    public final void a(xn0 xn0Var) {
        this.f36805k.add(xn0Var);
    }

    public final long b() {
        r();
        r();
        if (!this.Z.f38096b.a()) {
            r();
            return lb3.b(a(this.Z));
        }
        ee2 ee2Var = this.Z;
        ee2Var.f38095a.a(ee2Var.f38096b.f43366a, this.f36806l);
        ee2 ee2Var2 = this.Z;
        if (ee2Var2.f38097c == -9223372036854775807L) {
            return lb3.b(ee2Var2.f38095a.a(e(), this.f42355a, 0L).f43590n);
        }
        return lb3.b(this.Z.f38097c) + lb3.b(this.f36806l.f42827f);
    }

    public final int c() {
        r();
        r();
        if (this.Z.f38096b.a()) {
            return this.Z.f38096b.f43367b;
        }
        return -1;
    }

    public final int d() {
        r();
        r();
        if (this.Z.f38096b.a()) {
            return this.Z.f38096b.f43368c;
        }
        return -1;
    }

    public final int e() {
        r();
        int i = i();
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final int f() {
        r();
        if (this.Z.f38095a.c()) {
            return 0;
        }
        ee2 ee2Var = this.Z;
        return ee2Var.f38095a.a(ee2Var.f38096b.f43366a);
    }

    public final long g() {
        r();
        return lb3.b(a(this.Z));
    }

    public final v63 h() {
        r();
        return this.Z.f38095a;
    }

    public final int i() {
        if (this.Z.f38095a.c()) {
            return this.f36795a0;
        }
        ee2 ee2Var = this.Z;
        return ee2Var.f38095a.a(ee2Var.f38096b.f43366a, this.f36806l).f42825d;
    }

    public final long j() {
        r();
        r();
        if (this.Z.f38096b.a()) {
            ee2 ee2Var = this.Z;
            an1 an1Var = ee2Var.f38096b;
            ee2Var.f38095a.a(an1Var.f43366a, this.f36806l);
            return lb3.b(this.f36806l.a(an1Var.f43367b, an1Var.f43368c));
        }
        r();
        v63 v63Var = this.Z.f38095a;
        if (v63Var.c()) {
            return -9223372036854775807L;
        }
        return lb3.b(v63Var.a(e(), this.f42355a, 0L).f43591o);
    }

    public final int k() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    public final boolean l() {
        r();
        return this.Z.f38096b.a();
    }

    public final void m() {
        r();
        r();
        boolean z5 = this.Z.f38105l;
        int iA = this.f36816v.a(z5, 2);
        a(iA, (!z5 || iA == 1) ? 1 : 2, z5);
        ee2 ee2Var = this.Z;
        if (ee2Var.f38099e != 1) {
            return;
        }
        ee2 ee2VarA = ee2Var.a((qn0) null);
        ee2 ee2VarA2 = ee2VarA.a(ee2VarA.f38095a.c() ? 4 : 2);
        this.A++;
        l53 l53Var = this.i.i;
        l53Var.getClass();
        k53 k53VarA = l53.a();
        k53VarA.f40078a = l53Var.f40427a.obtainMessage(0);
        k53VarA.b();
        a(ee2VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void n() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.1] [");
        sb2.append(lb3.f40470e);
        sb2.append("] [");
        synchronized (io0.class) {
            str = io0.f39599b;
        }
        sb2.append(str);
        sb2.append("]");
        kh1.c("ExoPlayerImpl", sb2.toString());
        r();
        if (lb3.f40466a < 21 && (audioTrack = this.H) != null) {
            audioTrack.release();
            this.H = null;
        }
        this.f36815u.a();
        this.f36817w.b();
        in3 in3Var = this.f36818x;
        in3Var.f39597b = false;
        in3Var.b();
        xo3 xo3Var = this.f36819y;
        xo3Var.f44779b = false;
        xo3Var.b();
        yk ykVar = this.f36816v;
        ykVar.f45071c = null;
        ykVar.a();
        if (!this.i.h()) {
            rf1 rf1Var = this.f36804j;
            rf1Var.a(10, new zf.a(14));
            rf1Var.a();
        }
        rf1 rf1Var2 = this.f36804j;
        for (qf1 qf1Var : rf1Var2.f42589d) {
            pf1 pf1Var = rf1Var2.f42588c;
            qf1Var.f42292d = true;
            if (qf1Var.f42291c) {
                pf1Var.a(qf1Var.f42289a, qf1Var.f42290b.a());
            }
        }
        rf1Var2.f42589d.clear();
        rf1Var2.f42592g = true;
        this.f36803h.f40427a.removeCallbacksAndMessages(null);
        im imVar = this.f36811q;
        se seVar = this.f36809o;
        gm gmVar = ((dc0) imVar).f37707b;
        for (fm fmVar : gmVar.f38824a) {
            if (fmVar.f38480b == seVar) {
                fmVar.f38481c = true;
                gmVar.f38824a.remove(fmVar);
            }
        }
        ee2 ee2VarA = this.Z.a(1);
        this.Z = ee2VarA;
        ee2 ee2VarA2 = ee2VarA.a(ee2VarA.f38096b);
        this.Z = ee2VarA2;
        ee2VarA2.f38109p = ee2VarA2.f38111r;
        this.Z.f38110q = 0L;
        ((kb0) this.f36809o).c();
        this.f36802g.a();
        o();
        Surface surface = this.J;
        if (surface != null) {
            surface.release();
            this.J = null;
        }
        int i = q20.f42140b;
    }

    public final void o() {
        TextureView textureView = this.N;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f36813s) {
                kh1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.N.setSurfaceTextureListener(null);
            }
            this.N = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f36813s);
            this.K = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ao0.p():void");
    }

    public final void q() {
        r();
        int i = this.Z.f38099e;
        boolean z5 = false;
        if (i != 1) {
            if (i == 2 || i == 3) {
                r();
                boolean z10 = this.Z.f38108o;
                in3 in3Var = this.f36818x;
                r();
                if (this.Z.f38105l && !z10) {
                    z5 = true;
                }
                in3Var.f39597b = z5;
                in3Var.b();
                xo3 xo3Var = this.f36819y;
                r();
                xo3Var.f44779b = this.Z.f38105l;
                xo3Var.b();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        in3 in3Var2 = this.f36818x;
        in3Var2.f39597b = false;
        in3Var2.b();
        xo3 xo3Var2 = this.f36819y;
        xo3Var2.f44779b = false;
        xo3Var2.b();
    }

    public final void r() {
        this.f36799d.b();
        if (Thread.currentThread() != this.f36810p.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f36810p.getThread().getName();
            int i = lb3.f40466a;
            Locale locale = Locale.US;
            String strF = t.z.f("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.V) {
                throw new IllegalStateException(strF);
            }
            kh1.d("ExoPlayerImpl", kh1.a(strF, this.W ? null : new IllegalStateException()));
            this.W = true;
        }
    }

    public final void a(oe2 oe2Var) {
        oe2Var.getClass();
        rf1 rf1Var = this.f36804j;
        if (rf1Var.f42592g) {
            return;
        }
        rf1Var.f42589d.add(new qf1(oe2Var));
    }

    public static void h(ee2 ee2Var, oe2 oe2Var) {
        oe2Var.onIsPlayingChanged(ee2Var.f38099e == 3 && ee2Var.f38105l && ee2Var.f38106m == 0);
    }

    public static /* synthetic */ void d(ee2 ee2Var, oe2 oe2Var) {
        boolean z5 = ee2Var.f38101g;
        oe2Var.getClass();
        oe2Var.onIsLoadingChanged(ee2Var.f38101g);
    }

    public final /* synthetic */ void c(oe2 oe2Var) {
        oe2Var.a(this.F);
    }

    public final lm1 a() {
        r();
        v63 v63Var = this.Z.f38095a;
        if (v63Var.c()) {
            return this.Y;
        }
        hm1 hm1Var = v63Var.a(e(), this.f42355a, 0L).f43581d;
        lm1 lm1Var = this.Y;
        lm1Var.getClass();
        km1 km1Var = new km1(lm1Var);
        lm1 lm1Var2 = hm1Var.f39247e;
        if (lm1Var2 != null) {
            CharSequence charSequence = lm1Var2.f40585b;
            if (charSequence != null) {
                km1Var.f40252a = charSequence;
            }
            CharSequence charSequence2 = lm1Var2.f40586c;
            if (charSequence2 != null) {
                km1Var.f40253b = charSequence2;
            }
            CharSequence charSequence3 = lm1Var2.f40587d;
            if (charSequence3 != null) {
                km1Var.f40254c = charSequence3;
            }
            CharSequence charSequence4 = lm1Var2.f40588e;
            if (charSequence4 != null) {
                km1Var.f40255d = charSequence4;
            }
            CharSequence charSequence5 = lm1Var2.f40589f;
            if (charSequence5 != null) {
                km1Var.f40256e = charSequence5;
            }
            CharSequence charSequence6 = lm1Var2.f40590g;
            if (charSequence6 != null) {
                km1Var.f40257f = charSequence6;
            }
            CharSequence charSequence7 = lm1Var2.f40591h;
            if (charSequence7 != null) {
                km1Var.f40258g = charSequence7;
            }
            sl2 sl2Var = lm1Var2.i;
            if (sl2Var != null) {
                km1Var.f40259h = sl2Var;
            }
            sl2 sl2Var2 = lm1Var2.f40592j;
            if (sl2Var2 != null) {
                km1Var.i = sl2Var2;
            }
            byte[] bArr = lm1Var2.f40593k;
            if (bArr != null) {
                Integer num = lm1Var2.f40594l;
                km1Var.f40260j = (byte[]) bArr.clone();
                km1Var.f40261k = num;
            }
            Uri uri = lm1Var2.f40595m;
            if (uri != null) {
                km1Var.f40262l = uri;
            }
            Integer num2 = lm1Var2.f40596n;
            if (num2 != null) {
                km1Var.f40263m = num2;
            }
            Integer num3 = lm1Var2.f40597o;
            if (num3 != null) {
                km1Var.f40264n = num3;
            }
            Integer num4 = lm1Var2.f40598p;
            if (num4 != null) {
                km1Var.f40265o = num4;
            }
            Boolean bool = lm1Var2.f40599q;
            if (bool != null) {
                km1Var.f40266p = bool;
            }
            Integer num5 = lm1Var2.f40600r;
            if (num5 != null) {
                km1Var.f40267q = num5;
            }
            Integer num6 = lm1Var2.f40601s;
            if (num6 != null) {
                km1Var.f40267q = num6;
            }
            Integer num7 = lm1Var2.f40602t;
            if (num7 != null) {
                km1Var.f40268r = num7;
            }
            Integer num8 = lm1Var2.f40603u;
            if (num8 != null) {
                km1Var.f40269s = num8;
            }
            Integer num9 = lm1Var2.f40604v;
            if (num9 != null) {
                km1Var.f40270t = num9;
            }
            Integer num10 = lm1Var2.f40605w;
            if (num10 != null) {
                km1Var.f40271u = num10;
            }
            Integer num11 = lm1Var2.f40606x;
            if (num11 != null) {
                km1Var.f40272v = num11;
            }
            CharSequence charSequence8 = lm1Var2.f40607y;
            if (charSequence8 != null) {
                km1Var.f40273w = charSequence8;
            }
            CharSequence charSequence9 = lm1Var2.f40608z;
            if (charSequence9 != null) {
                km1Var.f40274x = charSequence9;
            }
            CharSequence charSequence10 = lm1Var2.A;
            if (charSequence10 != null) {
                km1Var.f40275y = charSequence10;
            }
            Integer num12 = lm1Var2.B;
            if (num12 != null) {
                km1Var.f40276z = num12;
            }
            Integer num13 = lm1Var2.C;
            if (num13 != null) {
                km1Var.A = num13;
            }
            CharSequence charSequence11 = lm1Var2.D;
            if (charSequence11 != null) {
                km1Var.B = charSequence11;
            }
            CharSequence charSequence12 = lm1Var2.E;
            if (charSequence12 != null) {
                km1Var.C = charSequence12;
            }
            CharSequence charSequence13 = lm1Var2.F;
            if (charSequence13 != null) {
                km1Var.D = charSequence13;
            }
            Bundle bundle = lm1Var2.G;
            if (bundle != null) {
                km1Var.E = bundle;
            }
        }
        return new lm1(km1Var);
    }

    public final void d(oe2 oe2Var) {
        oe2Var.getClass();
        rf1 rf1Var = this.f36804j;
        for (qf1 qf1Var : rf1Var.f42589d) {
            if (qf1Var.f42289a.equals(oe2Var)) {
                pf1 pf1Var = rf1Var.f42588c;
                qf1Var.f42292d = true;
                if (qf1Var.f42291c) {
                    pf1Var.a(qf1Var.f42289a, qf1Var.f42290b.a());
                }
                rf1Var.f42589d.remove(qf1Var);
            }
        }
    }

    public static long b(ee2 ee2Var) {
        u63 u63Var = new u63();
        s63 s63Var = new s63();
        ee2Var.f38095a.a(ee2Var.f38096b.f43366a, s63Var);
        long j10 = ee2Var.f38097c;
        if (j10 == -9223372036854775807L) {
            return ee2Var.f38095a.a(s63Var.f42825d, u63Var, 0L).f43590n;
        }
        return s63Var.f42827f + j10;
    }

    public final void b(do0 do0Var) {
        l53 l53Var = this.f36803h;
        l53Var.f40427a.post(new t.v0(21, this, do0Var));
    }

    public static void b(oe2 oe2Var) {
        oe2Var.a(new qn0(2, new mp0(1), 1003, 0));
    }

    public final void b(int i) {
        for (int i10 = i - 1; i10 >= 0; i10--) {
            this.f36807m.remove(i10);
        }
        vy2 vy2Var = this.E;
        int[] iArr = new int[vy2Var.f44225b.length - i];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = vy2Var.f44225b;
            if (i11 < iArr2.length) {
                int i13 = iArr2[i11];
                if (i13 < 0 || i13 >= i) {
                    int i14 = i11 - i12;
                    if (i13 >= 0) {
                        i13 -= i;
                    }
                    iArr[i14] = i13;
                } else {
                    i12++;
                }
                i11++;
            } else {
                this.E = new vy2(iArr, new Random(vy2Var.f44224a.nextLong()));
                return;
            }
        }
    }

    public final df2 a(cf2 cf2Var) {
        int i = i();
        ho0 ho0Var = this.i;
        v63 v63Var = this.Z.f38095a;
        if (i == -1) {
            i = 0;
        }
        return new df2(ho0Var, cf2Var, v63Var, i, this.f36812r, ho0Var.f39270k);
    }

    public final long a(ee2 ee2Var) {
        if (ee2Var.f38095a.c()) {
            return lb3.a(this.f36797b0);
        }
        if (ee2Var.f38096b.a()) {
            return ee2Var.f38111r;
        }
        v63 v63Var = ee2Var.f38095a;
        an1 an1Var = ee2Var.f38096b;
        long j10 = ee2Var.f38111r;
        v63Var.a(an1Var.f43366a, this.f36806l);
        return j10 + this.f36806l.f42827f;
    }

    public final /* synthetic */ void a(oe2 oe2Var, ew0 ew0Var) {
        oe2Var.getClass();
    }

    public final void a(do0 do0Var) {
        boolean z5;
        int i = this.A - do0Var.f37860c;
        this.A = i;
        boolean z10 = true;
        if (do0Var.f37861d) {
            this.B = do0Var.f37862e;
            this.C = true;
        }
        if (do0Var.f37863f) {
            this.D = do0Var.f37864g;
        }
        if (i == 0) {
            v63 v63Var = do0Var.f37859b.f38095a;
            if (!this.Z.f38095a.c() && v63Var.c()) {
                this.f36795a0 = -1;
                this.f36797b0 = 0L;
            }
            if (!v63Var.c()) {
                List listAsList = Arrays.asList(((zf2) v63Var).f45397j);
                if (listAsList.size() == this.f36807m.size()) {
                    for (int i10 = 0; i10 < listAsList.size(); i10++) {
                        ((zn0) this.f36807m.get(i10)).f45487b = (v63) listAsList.get(i10);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j10 = -9223372036854775807L;
            if (this.C) {
                if (do0Var.f37859b.f38096b.equals(this.Z.f38096b) && do0Var.f37859b.f38098d == this.Z.f38111r) {
                    z10 = false;
                }
                if (z10) {
                    if (!v63Var.c() && !do0Var.f37859b.f38096b.a()) {
                        ee2 ee2Var = do0Var.f37859b;
                        an1 an1Var = ee2Var.f38096b;
                        long j11 = ee2Var.f38098d;
                        v63Var.a(an1Var.f43366a, this.f36806l);
                        j10 = j11 + this.f36806l.f42827f;
                    } else {
                        j10 = do0Var.f37859b.f38098d;
                    }
                }
                z5 = z10;
            } else {
                z5 = false;
            }
            long j12 = j10;
            this.C = false;
            a(do0Var.f37859b, 1, this.D, z5, this.B, j12);
        }
    }

    public static /* synthetic */ void a(ee2 ee2Var, int i, oe2 oe2Var) {
        v63 v63Var = ee2Var.f38095a;
        oe2Var.a(i);
    }

    public static /* synthetic */ void a(int i, pe2 pe2Var, pe2 pe2Var2, oe2 oe2Var) {
        oe2Var.getClass();
        oe2Var.a(pe2Var, pe2Var2, i);
    }

    public final ee2 a(ee2 ee2Var, zf2 zf2Var, Pair pair) {
        List list;
        long jA;
        if (!zf2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        v63 v63Var = ee2Var.f38095a;
        ee2 ee2VarA = ee2Var.a(zf2Var);
        if (zf2Var.c()) {
            an1 an1Var = ee2.f38094s;
            long jA2 = lb3.a(this.f36797b0);
            ee2 ee2VarA2 = ee2VarA.a(an1Var, jA2, jA2, jA2, 0L, l73.f40442e, this.f36796b, um2.f43723f).a(an1Var);
            ee2VarA2.f38109p = ee2VarA2.f38111r;
            return ee2VarA2;
        }
        Object obj = ee2VarA.f38096b.f43366a;
        int i = lb3.f40466a;
        boolean zEquals = obj.equals(pair.first);
        an1 an1Var2 = !zEquals ? new an1(pair.first) : ee2VarA.f38096b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = lb3.a(b());
        if (!v63Var.c()) {
            jA3 -= v63Var.a(obj, this.f36806l).f42827f;
        }
        if (!zEquals || jLongValue < jA3) {
            an1 an1Var3 = an1Var2;
            if (!an1Var3.a()) {
                l73 l73Var = !zEquals ? l73.f40442e : ee2VarA.f38102h;
                w73 w73Var = !zEquals ? this.f36796b : ee2VarA.i;
                if (!zEquals) {
                    o51 o51Var = r51.f42498c;
                    list = um2.f43723f;
                } else {
                    list = ee2VarA.f38103j;
                }
                ee2 ee2VarA3 = ee2VarA.a(an1Var3, jLongValue, jLongValue, jLongValue, 0L, l73Var, w73Var, list).a(an1Var3);
                ee2VarA3.f38109p = jLongValue;
                return ee2VarA3;
            }
            throw new IllegalStateException();
        }
        if (jLongValue == jA3) {
            int iA = zf2Var.a(ee2VarA.f38104k.f43366a);
            if (iA != -1 && zf2Var.a(iA, this.f36806l, false).f42825d == zf2Var.a(an1Var2.f43366a, this.f36806l).f42825d) {
                return ee2VarA;
            }
            zf2Var.a(an1Var2.f43366a, this.f36806l);
            if (an1Var2.a()) {
                jA = this.f36806l.a(an1Var2.f43367b, an1Var2.f43368c);
            } else {
                jA = this.f36806l.f42826e;
            }
            an1 an1Var4 = an1Var2;
            ee2 ee2VarA4 = ee2VarA.a(an1Var4, ee2VarA.f38111r, ee2VarA.f38111r, ee2VarA.f38098d, jA - ee2VarA.f38111r, ee2VarA.f38102h, ee2VarA.i, ee2VarA.f38103j).a(an1Var4);
            ee2VarA4.f38109p = jA;
            return ee2VarA4;
        }
        an1 an1Var5 = an1Var2;
        if (!an1Var5.a()) {
            long jMax = Math.max(0L, ee2VarA.f38110q - (jLongValue - jA3));
            long j10 = ee2VarA.f38109p;
            if (ee2VarA.f38104k.equals(ee2VarA.f38096b)) {
                j10 = jLongValue + jMax;
            }
            ee2 ee2VarA5 = ee2VarA.a(an1Var5, jLongValue, jLongValue, jLongValue, jMax, ee2VarA.f38102h, ee2VarA.i, ee2VarA.f38103j);
            ee2VarA5.f38109p = j10;
            return ee2VarA5;
        }
        throw new IllegalStateException();
    }

    public final Pair a(zf2 zf2Var, int i, long j10) {
        if (zf2Var.c()) {
            this.f36795a0 = i;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f36797b0 = j10;
            return null;
        }
        if (i == -1 || i >= zf2Var.f45394f) {
            i = zf2Var.a(false);
            j10 = lb3.b(zf2Var.a(i, this.f42355a, 0L).f43590n);
        }
        return zf2Var.a(this.f42355a, this.f36806l, i, lb3.a(j10));
    }

    public final void a(int i, int i10) {
        if (i == this.P && i10 == this.Q) {
            return;
        }
        this.P = i;
        this.Q = i10;
        rf1 rf1Var = this.f36804j;
        rf1Var.a(24, new s3.o(i, i10, 1));
        rf1Var.a();
    }

    public final void a(int i, int i10, Object obj) {
        for (ro roVar : this.f36801f) {
            if (roVar.f42644b == i) {
                df2 df2VarA = a(roVar);
                boolean z5 = df2VarA.f37757g;
                if (!z5) {
                    df2VarA.f37754d = i10;
                    if (!z5) {
                        df2VarA.f37755e = obj;
                        df2VarA.a();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void a(mo moVar) {
        r();
        List listSingletonList = Collections.singletonList(moVar);
        r();
        r();
        i();
        r();
        a(this.Z);
        int i = lb3.f40466a;
        this.A++;
        if (!this.f36807m.isEmpty()) {
            b(this.f36807m.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            in1 in1Var = new in1((mo) listSingletonList.get(i10), this.f36808n);
            arrayList.add(in1Var);
            this.f36807m.add(i10, new zn0(in1Var.f39584a.f44721o, in1Var.f39585b));
        }
        this.E = this.E.a(arrayList.size());
        zf2 zf2Var = new zf2(this.f36807m, this.E);
        if (!zf2Var.c() && -1 >= zf2Var.f45394f) {
            throw new g31();
        }
        int iA = zf2Var.a(false);
        ee2 ee2VarA = a(this.Z, zf2Var, a(zf2Var, iA, -9223372036854775807L));
        int i11 = ee2VarA.f38099e;
        if (iA != -1 && i11 != 1) {
            i11 = (zf2Var.c() || iA >= zf2Var.f45394f) ? 4 : 2;
        }
        ee2 ee2VarA2 = ee2VarA.a(i11);
        this.i.i.a(17, new co0(iA, lb3.a(-9223372036854775807L), this.E, arrayList)).b();
        a(ee2VarA2, 0, 1, (this.Z.f38096b.f43366a.equals(ee2VarA2.f38096b.f43366a) || this.Z.f38095a.c()) ? false : true, 4, a(ee2VarA2));
    }

    public final void a(boolean z5) {
        r();
        yk ykVar = this.f36816v;
        r();
        int iA = ykVar.a(z5, this.Z.f38099e);
        int i = 1;
        if (z5 && iA != 1) {
            i = 2;
        }
        a(iA, i, z5);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.J = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        ro[] roVarArr = this.f36801f;
        int length = roVarArr.length;
        int i = 0;
        while (true) {
            boolean z5 = true;
            if (i < length) {
                ro roVar = roVarArr[i];
                if (roVar.f42644b == 2) {
                    df2 df2VarA = a(roVar);
                    boolean z10 = df2VarA.f37757g;
                    if (!z10) {
                        df2VarA.f37754d = 1;
                        if (!z10) {
                            df2VarA.f37755e = surface;
                            arrayList.add(df2VarA.a());
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i++;
            } else {
                Object obj = this.I;
                if (obj == null || obj == surface) {
                    z5 = false;
                } else {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((df2) it.next()).a(this.f36820z);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (TimeoutException unused2) {
                    }
                    z5 = false;
                    Object obj2 = this.I;
                    Surface surface2 = this.J;
                    if (obj2 == surface2) {
                        surface2.release();
                        this.J = null;
                    }
                }
                this.I = surface;
                if (z5) {
                    a(new qn0(2, new mp0(3), 1003, 0));
                    return;
                }
                return;
            }
        }
    }

    public final void a(TextureView textureView) {
        r();
        if (textureView == null) {
            r();
            o();
            a((Surface) null);
            a(0, 0);
            return;
        }
        o();
        this.N = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kh1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f36813s);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(float f10) {
        r();
        int i = lb3.f40466a;
        float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        a(1, 2, Float.valueOf(this.f36816v.f45075g * fMax));
        rf1 rf1Var = this.f36804j;
        rf1Var.a(22, new s3.n(fMax, 1));
        rf1Var.a();
    }

    public final void a(qn0 qn0Var) {
        ee2 ee2Var = this.Z;
        ee2 ee2VarA = ee2Var.a(ee2Var.f38096b);
        ee2VarA.f38109p = ee2VarA.f38111r;
        ee2VarA.f38110q = 0L;
        ee2 ee2VarA2 = ee2VarA.a(1);
        if (qn0Var != null) {
            ee2VarA2 = ee2VarA2.a(qn0Var);
        }
        ee2 ee2Var2 = ee2VarA2;
        this.A++;
        l53 l53Var = this.i.i;
        l53Var.getClass();
        k53 k53VarA = l53.a();
        k53VarA.f40078a = l53Var.f40427a.obtainMessage(6);
        k53VarA.b();
        a(ee2Var2, 0, 1, ee2Var2.f38095a.c() && !this.Z.f38095a.c(), 4, a(ee2Var2));
    }

    public final void a(int i, int i10, boolean z5) {
        int i11 = 0;
        boolean z10 = z5 && i != -1;
        if (z10 && i != 1) {
            i11 = 1;
        }
        ee2 ee2Var = this.Z;
        if (ee2Var.f38105l == z10 && ee2Var.f38106m == i11) {
            return;
        }
        this.A++;
        int i12 = i11;
        boolean z11 = z10;
        ee2 ee2Var2 = new ee2(ee2Var.f38095a, ee2Var.f38096b, ee2Var.f38097c, ee2Var.f38098d, ee2Var.f38099e, ee2Var.f38100f, ee2Var.f38101g, ee2Var.f38102h, ee2Var.i, ee2Var.f38103j, ee2Var.f38104k, z11, i12, ee2Var.f38107n, ee2Var.f38109p, ee2Var.f38110q, ee2Var.f38111r, ee2Var.f38108o);
        l53 l53Var = this.i.i;
        l53Var.getClass();
        k53 k53VarA = l53.a();
        k53VarA.f40078a = l53Var.f40427a.obtainMessage(1, z11 ? 1 : 0, i12);
        k53VarA.b();
        a(ee2Var2, 0, i10, false, 5, -9223372036854775807L);
    }

    public final void a(final ee2 ee2Var, final int i, final int i10, boolean z5, int i11, long j10) {
        int i12;
        Pair pair;
        int i13;
        hm1 hm1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        int i14;
        hm1 hm1Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jB;
        long jB2;
        Object obj3;
        hm1 hm1Var3;
        Object obj4;
        int iA;
        ee2 ee2Var2 = this.Z;
        this.Z = ee2Var;
        boolean zEquals = ee2Var2.f38095a.equals(ee2Var.f38095a);
        v63 v63Var = ee2Var2.f38095a;
        v63 v63Var2 = ee2Var.f38095a;
        if (v63Var2.c() && v63Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i12 = 3;
        } else {
            i12 = 3;
            if (v63Var2.c() != v63Var.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!v63Var.a(v63Var.a(ee2Var2.f38096b.f43366a, this.f36806l).f42825d, this.f42355a, 0L).f43579b.equals(v63Var2.a(v63Var2.a(ee2Var.f38096b.f43366a, this.f36806l).f42825d, this.f42355a, 0L).f43579b)) {
                if (z5 && i11 == 0) {
                    i13 = 1;
                } else if (z5 && i11 == 1) {
                    i13 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i13 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            } else if (z5 && i11 == 0 && ee2Var2.f38096b.f43369d < ee2Var.f38096b.f43369d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        lm1 lm1VarA = this.G;
        if (zBooleanValue) {
            hm1Var = !ee2Var.f38095a.c() ? ee2Var.f38095a.a(ee2Var.f38095a.a(ee2Var.f38096b.f43366a, this.f36806l).f42825d, this.f42355a, 0L).f43581d : null;
            this.Y = lm1.H;
        } else {
            hm1Var = null;
        }
        if (zBooleanValue || !ee2Var2.f38103j.equals(ee2Var.f38103j)) {
            lm1 lm1Var = this.Y;
            lm1Var.getClass();
            km1 km1Var = new km1(lm1Var);
            List list = ee2Var.f38103j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                vs1 vs1Var = (vs1) list.get(i16);
                int i17 = 0;
                while (true) {
                    us1[] us1VarArr = vs1Var.f44117b;
                    if (i17 < us1VarArr.length) {
                        us1VarArr[i17].a(km1Var);
                        i17++;
                    }
                }
            }
            this.Y = new lm1(km1Var);
            lm1VarA = a();
        }
        boolean zEquals2 = lm1VarA.equals(this.G);
        this.G = lm1VarA;
        boolean z14 = ee2Var2.f38105l != ee2Var.f38105l;
        boolean z15 = ee2Var2.f38099e != ee2Var.f38099e;
        if (z15 || z14) {
            q();
        }
        boolean z16 = ee2Var2.f38101g != ee2Var.f38101g;
        if (!ee2Var2.f38095a.equals(ee2Var.f38095a)) {
            final int i18 = 0;
            this.f36804j.a(0, new of1() { // from class: zl.c
                @Override // yads.of1
                public final void invoke(Object obj5) {
                    switch (i18) {
                        case 0:
                            ao0.a(ee2Var, i, (oe2) obj5);
                            break;
                        default:
                            ((oe2) obj5).onPlayWhenReadyChanged(ee2Var.f38105l, i);
                            break;
                    }
                }
            });
        }
        if (z5) {
            s63 s63Var = new s63();
            if (ee2Var2.f38095a.c()) {
                z10 = zEquals2;
                z11 = z15;
                z12 = z16;
                obj = null;
                i14 = -1;
                hm1Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = ee2Var2.f38096b.f43366a;
                ee2Var2.f38095a.a(obj5, s63Var);
                int i19 = s63Var.f42825d;
                int iA2 = ee2Var2.f38095a.a(obj5);
                z10 = zEquals2;
                z11 = z15;
                z12 = z16;
                obj = ee2Var2.f38095a.a(i19, this.f42355a, 0L).f43579b;
                hm1Var2 = this.f42355a.f43581d;
                obj2 = obj5;
                i14 = i19;
                i15 = iA2;
            }
            if (i11 == 0) {
                if (ee2Var2.f38096b.a()) {
                    an1 an1Var = ee2Var2.f38096b;
                    jB = s63Var.a(an1Var.f43367b, an1Var.f43368c);
                    jB2 = b(ee2Var2);
                } else if (ee2Var2.f38096b.f43370e != -1) {
                    jB = b(this.Z);
                    jB2 = jB;
                } else {
                    j11 = s63Var.f42827f;
                    j12 = s63Var.f42826e;
                    jB = j11 + j12;
                    jB2 = jB;
                }
            } else if (ee2Var2.f38096b.a()) {
                jB = ee2Var2.f38111r;
                jB2 = b(ee2Var2);
            } else {
                j11 = s63Var.f42827f;
                j12 = ee2Var2.f38111r;
                jB = j11 + j12;
                jB2 = jB;
            }
            long jB3 = lb3.b(jB);
            long jB4 = lb3.b(jB2);
            an1 an1Var2 = ee2Var2.f38096b;
            pe2 pe2Var = new pe2(obj, i14, hm1Var2, obj2, i15, jB3, jB4, an1Var2.f43367b, an1Var2.f43368c);
            int iE = e();
            if (this.Z.f38095a.c()) {
                obj3 = null;
                hm1Var3 = null;
                obj4 = null;
                iA = -1;
            } else {
                ee2 ee2Var3 = this.Z;
                Object obj6 = ee2Var3.f38096b.f43366a;
                ee2Var3.f38095a.a(obj6, this.f36806l);
                iA = this.Z.f38095a.a(obj6);
                obj4 = obj6;
                obj3 = this.Z.f38095a.a(iE, this.f42355a, 0L).f43579b;
                hm1Var3 = this.f42355a.f43581d;
            }
            long jB5 = lb3.b(j10);
            long jB6 = this.Z.f38096b.a() ? lb3.b(b(this.Z)) : jB5;
            an1 an1Var3 = this.Z.f38096b;
            this.f36804j.a(11, new e9.d(i11, pe2Var, new pe2(obj3, iE, hm1Var3, obj4, iA, jB5, jB6, an1Var3.f43367b, an1Var3.f43368c), 3));
        } else {
            z10 = zEquals2;
            z11 = z15;
            z12 = z16;
        }
        if (zBooleanValue) {
            z13 = true;
            this.f36804j.a(1, new oc.a(hm1Var, iIntValue, 5));
        } else {
            z13 = true;
        }
        if (ee2Var2.f38100f != ee2Var.f38100f) {
            final int i20 = 0;
            this.f36804j.a(10, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    switch (i20) {
                        case 0:
                            ((oe2) obj7).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj7).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj7).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj7);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj7).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj7).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj7).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj7);
                            break;
                        default:
                            ((oe2) obj7).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
            if (ee2Var.f38100f != null) {
                final int i21 = 1;
                this.f36804j.a(10, new of1() { // from class: zl.a
                    @Override // yads.of1
                    public final void invoke(Object obj7) {
                        switch (i21) {
                            case 0:
                                ((oe2) obj7).b(ee2Var.f38100f);
                                break;
                            case 1:
                                ((oe2) obj7).a(ee2Var.f38100f);
                                break;
                            case 2:
                                ((oe2) obj7).a(ee2Var.i.f44304d);
                                break;
                            case 3:
                                ao0.d(ee2Var, (oe2) obj7);
                                break;
                            case 4:
                                ee2 ee2Var4 = ee2Var;
                                ((oe2) obj7).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                                break;
                            case 5:
                                ((oe2) obj7).onPlaybackStateChanged(ee2Var.f38099e);
                                break;
                            case 6:
                                ((oe2) obj7).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                                break;
                            case 7:
                                ao0.h(ee2Var, (oe2) obj7);
                                break;
                            default:
                                ((oe2) obj7).a(ee2Var.f38107n);
                                break;
                        }
                    }
                });
            }
        }
        w73 w73Var = ee2Var2.i;
        w73 w73Var2 = ee2Var.i;
        if (w73Var != w73Var2) {
            v73 v73Var = this.f36802g;
            Object obj7 = w73Var2.f44305e;
            ((oi1) v73Var).getClass();
            final int i22 = 2;
            this.f36804j.a(2, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i22) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (!z10) {
            this.f36804j.a(14, new yi.f0(4, this.G));
        }
        if (z12) {
            final int i23 = 3;
            this.f36804j.a(i12, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i23) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (z11 || z14) {
            final int i24 = 4;
            this.f36804j.a(-1, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i24) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (z11) {
            final int i25 = 5;
            this.f36804j.a(4, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i25) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i26 = 1;
            this.f36804j.a(5, new of1() { // from class: zl.c
                @Override // yads.of1
                public final void invoke(Object obj52) {
                    switch (i26) {
                        case 0:
                            ao0.a(ee2Var, i10, (oe2) obj52);
                            break;
                        default:
                            ((oe2) obj52).onPlayWhenReadyChanged(ee2Var.f38105l, i10);
                            break;
                    }
                }
            });
        }
        if (ee2Var2.f38106m != ee2Var.f38106m) {
            final int i27 = 6;
            this.f36804j.a(6, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i27) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (((ee2Var2.f38099e == 3 && ee2Var2.f38105l && ee2Var2.f38106m == 0) ? z13 : false) != ((ee2Var.f38099e == 3 && ee2Var.f38105l && ee2Var.f38106m == 0) ? z13 : false)) {
            final int i28 = 7;
            this.f36804j.a(7, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i28) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        if (!ee2Var2.f38107n.equals(ee2Var.f38107n)) {
            final int i29 = 8;
            this.f36804j.a(12, new of1() { // from class: zl.a
                @Override // yads.of1
                public final void invoke(Object obj72) {
                    switch (i29) {
                        case 0:
                            ((oe2) obj72).b(ee2Var.f38100f);
                            break;
                        case 1:
                            ((oe2) obj72).a(ee2Var.f38100f);
                            break;
                        case 2:
                            ((oe2) obj72).a(ee2Var.i.f44304d);
                            break;
                        case 3:
                            ao0.d(ee2Var, (oe2) obj72);
                            break;
                        case 4:
                            ee2 ee2Var4 = ee2Var;
                            ((oe2) obj72).onPlayerStateChanged(ee2Var4.f38105l, ee2Var4.f38099e);
                            break;
                        case 5:
                            ((oe2) obj72).onPlaybackStateChanged(ee2Var.f38099e);
                            break;
                        case 6:
                            ((oe2) obj72).onPlaybackSuppressionReasonChanged(ee2Var.f38106m);
                            break;
                        case 7:
                            ao0.h(ee2Var, (oe2) obj72);
                            break;
                        default:
                            ((oe2) obj72).a(ee2Var.f38107n);
                            break;
                    }
                }
            });
        }
        p();
        this.f36804j.a();
        if (ee2Var2.f38108o != ee2Var.f38108o) {
            Iterator it = this.f36805k.iterator();
            while (it.hasNext()) {
                ((xn0) ((rn0) it.next())).f44771a.q();
            }
        }
    }

    public static ig0 a(f43 f43Var) {
        return new ig0(0, f43Var.a(), f43Var.f38376d.getStreamMaxVolume(f43Var.f38379g));
    }
}
