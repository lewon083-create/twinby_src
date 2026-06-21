package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v60 implements e80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v60 f11253c = new v60(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v60 f11254d = new v60(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v60 f11255e = new v60(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v60 f11256f = new v60(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v60 f11257g = new v60(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v60 f11258h = new v60(5);
    public static final /* synthetic */ v60 i = new v60(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v60 f11259j = new v60(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ v60 f11260k = new v60(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ v60 f11261l = new v60(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ v60 f11262m = new v60(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ v60 f11263n = new v60(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ v60 f11264o = new v60(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ v60 f11265p = new v60(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ v60 f11266q = new v60(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ v60 f11267r = new v60(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ v60 f11268s = new v60(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v60 f11269t = new v60(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v60 f11270u = new v60(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v60 f11271v = new v60(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v60 f11272w = new v60(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v60 f11273x = new v60(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ v60 f11274y = new v60(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ v60 f11275z = new v60(23);
    public static final /* synthetic */ v60 A = new v60(24);
    public static final /* synthetic */ v60 B = new v60(25);
    public static final /* synthetic */ v60 C = new v60(27);
    public static final /* synthetic */ v60 D = new v60(28);
    public static final /* synthetic */ v60 E = new v60(29);

    public /* synthetic */ v60(int i10) {
        this.f11276b = i10;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public final void mo7a(Object obj) {
        int i10;
        int i11;
        switch (this.f11276b) {
            case 0:
                ((i60) obj).w();
                return;
            case 1:
                ((i60) obj).N();
                return;
            case 2:
                ((i60) obj).i();
                return;
            case 3:
                ((i60) obj).c();
                return;
            case 4:
                ((i60) obj).H();
                return;
            case 5:
                ((z60) obj).k();
                return;
            case 6:
                ((ea.a) obj).g();
                return;
            case 7:
                ((e70) obj).e();
                return;
            case 8:
                ((s9.l) obj).w1();
                return;
            case 9:
                ((s9.l) obj).X1();
                return;
            case 10:
                ((s9.l) obj).D0();
                return;
            case 11:
                ((s9.l) obj).A2();
                return;
            case 12:
                ((s9.l) obj).d3();
                return;
            case 13:
                ((s9.l) obj).L1();
                return;
            case 14:
                ((s9.l) obj).i2();
                return;
            case 15:
                ((s9.l) obj).T0();
                return;
            case 16:
                ((s9.l) obj).p1();
                return;
            case 17:
                ((s9.l) obj).m();
                return;
            case 18:
                ((k70) obj).n();
                return;
            case 19:
                sk0 sk0Var = (sk0) ((l70) obj);
                synchronized (sk0Var) {
                    so0 so0Var = sk0Var.f10315c;
                    if (so0Var.d()) {
                        so0Var.c();
                        return;
                    }
                    y70 y70Var = so0Var.f10363j;
                    n70 n70Var = so0Var.f10362h;
                    synchronized (y70Var) {
                        i10 = y70Var.f12534c;
                    }
                    n70Var.G1(i10);
                    return;
                }
            case 20:
                sk0 sk0Var2 = (sk0) ((l70) obj);
                synchronized (sk0Var2) {
                    try {
                        if (!sk0Var2.f10315c.d()) {
                            so0 so0Var2 = sk0Var2.f10315c;
                            y70 y70Var2 = so0Var2.f10363j;
                            n70 n70Var2 = so0Var2.f10362h;
                            synchronized (y70Var2) {
                                i11 = y70Var2.f12533b;
                            }
                            n70Var2.F1(i11);
                            return;
                        }
                        hq0 hq0Var = sk0Var2.f10319g;
                        q9.g3 g3VarH = hq0Var.f6213b;
                        x30 x30Var = sk0Var2.f10321j;
                        if (x30Var != null && hq0Var.f6227q) {
                            g3VarH = fs1.h(sk0Var2.f10314b, Collections.singletonList(x30Var.f11997o));
                        }
                        synchronized (sk0Var2) {
                            hq0 hq0Var2 = sk0Var2.f10319g;
                            hq0Var2.f6213b = g3VarH;
                            hq0Var2.f6227q = sk0Var2.f10318f.f31887o;
                            hq0Var.f6226p = true;
                            try {
                                sk0Var2.l4(hq0Var.f6212a);
                            } catch (RemoteException unused) {
                                u9.i.h("Failed to refresh the banner ad.");
                            }
                            sk0Var2.f10319g.f6226p = false;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
            case 21:
                ((u70) obj).a();
                return;
            case 22:
                ((w70) obj).r();
                return;
            case 23:
                ((w70) obj).g();
                return;
            case 24:
                ((a80) obj).r();
                return;
            case 25:
                ((d80) obj).a();
                return;
            case 26:
                ((k80) obj).F("MalformedJson");
                return;
            case 27:
                ((k80) obj).i();
                return;
            case 28:
                ((k80) obj).c();
                return;
            default:
                ((m80) obj).k();
                return;
        }
    }
}
