package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu1 implements td0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ zu1 f13124c = new zu1(27);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zu1 f13125d = new zu1(28);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zu1 f13126e = new zu1(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13127b;

    public /* synthetic */ zu1(int i) {
        this.f13127b = i;
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public void mo0a(Object obj) {
        long jT;
        switch (this.f13127b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
            default:
                iw1 iw1Var = (iw1) obj;
                nw1 nw1Var = iw1Var.f6633b;
                if (iw1Var.equals(nw1Var.f8469h)) {
                    nw1Var.L = true;
                    break;
                }
                break;
            case 27:
                iw1 iw1Var2 = (iw1) obj;
                iw1Var2.getClass();
                nw1.X.getAndDecrement();
                pp0 pp0Var = iw1Var2.f6633b.f8472l;
                if (pp0Var != null) {
                    int i = iw1Var2.f6632a.f10409a;
                    zu1 zu1Var = new zu1(26);
                    g1 g1Var = ((pw1) pp0Var.f9149c).B0;
                    Handler handler = g1Var.f5590a;
                    if (handler != null) {
                        handler.post(new tv1(g1Var, zu1Var, 1));
                    }
                }
                break;
            case 28:
                iw1 iw1Var3 = (iw1) obj;
                nw1 nw1Var2 = iw1Var3.f6633b;
                if (iw1Var3.equals(nw1Var2.f8469h) && nw1Var2.f8472l != null) {
                    rh0 rh0Var = nw1Var2.f8474n;
                    int i10 = rh0Var.f9938c;
                    if (i10 != -1) {
                        long j10 = ((sv1) rh0Var.f9941f).f10412d / i10;
                        ew1 ew1Var = nw1Var2.f8478r;
                        ew1Var.getClass();
                        jT = cq0.t(ew1Var.f5109a.getSampleRate(), j10);
                    } else {
                        jT = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - nw1Var2.S;
                    pp0 pp0Var2 = nw1Var2.f8472l;
                    int i11 = ((sv1) nw1Var2.f8474n.f9941f).f10412d;
                    g1 g1Var2 = ((pw1) pp0Var2.f9149c).B0;
                    long jR = cq0.r(jT);
                    Handler handler2 = g1Var2.f5590a;
                    if (handler2 != null) {
                        handler2.post(new tv1(g1Var2, i11, jR, jElapsedRealtime));
                    }
                }
                break;
        }
    }
}
