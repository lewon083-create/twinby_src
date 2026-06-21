package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f8198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f8199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f8200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f8201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f8202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f8203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f8204h;

    public n50(d10 d10Var, ls1 ls1Var, k10 k10Var, d60 d60Var, ls1 ls1Var2, qs1 qs1Var, ls1 ls1Var3) {
        this.f8197a = 2;
        this.f8198b = d10Var;
        this.f8199c = ls1Var;
        this.f8200d = k10Var;
        this.f8204h = d60Var;
        this.f8203g = ls1Var2;
        this.f8201e = qs1Var;
        this.f8202f = ls1Var3;
    }

    public qi0 a() {
        return new qi0((s10) ((ns1) this.f8199c).f8433a, (Context) ((ls1) this.f8200d).j(), (Executor) this.f8198b.j(), (yc0) ((ls1) this.f8201e).j(), ((d60) this.f8204h).a(), (c31) ((ls1) this.f8202f).j(), (qd0) ((ls1) this.f8203g).j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f8197a) {
            case 0:
                return new m50(((d10) this.f8198b).a(), ((d60) this.f8204h).a(), ((j10) this.f8199c).a(), ((a10) this.f8200d).j(), (se0) this.f8201e.j(), (bs0) this.f8202f.j(), (ff0) this.f8203g.j());
            case 1:
                return new md0(((d10) this.f8198b).a(), (nq0) this.f8199c.j(), (sd0) this.f8200d.j(), ((y40) this.f8202f).b(), ((y40) this.f8203g).a(), (kh0) this.f8201e.j(), (String) ((ms1) this.f8204h).j());
            case 2:
                return new qd0(((d10) this.f8198b).a(), (wd0) this.f8199c.j(), ((k10) this.f8200d).j(), ((d60) this.f8204h).a(), (String) ((ls1) this.f8203g).j(), (String) this.f8201e.j(), (xe) this.f8202f.j());
            case 3:
                return a();
            case 4:
                m10 m10Var = (m10) ((ns1) this.f8200d).f8433a;
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new dj0(m10Var, gxVar, ((aw) this.f8201e).b(), (qq0) this.f8198b.j(), (nc0) ((ls1) this.f8202f).j(), (qd0) ((ls1) this.f8203g).j(), ((j10) this.f8199c).a(), (Context) ((ls1) this.f8204h).j(), new fp(15));
            case 5:
                return new qo0((n10) this.f8198b.j(), (Context) ((ns1) this.f8201e).f8433a, (String) ((ns1) this.f8202f).f8433a, (no0) ((ls1) this.f8203g).j(), (mo0) ((ls1) this.f8204h).j(), ((j10) this.f8199c).a(), (sd0) this.f8200d.j());
            case 6:
                return new so0((Context) ((ns1) this.f8200d).f8433a, (Executor) this.f8198b.j(), (q9.g3) ((ns1) this.f8201e).f8433a, (n10) this.f8199c.j(), (uk0) ((ls1) this.f8202f).j(), (wk0) ((ls1) this.f8203g).j(), new hq0(), (y70) ((ls1) this.f8204h).j());
            case 7:
                return new qt0(((d10) this.f8198b).a(), ((j10) this.f8199c).a(), (ScheduledExecutorService) ((ls1) this.f8200d).j(), (mr0) ((ls1) this.f8201e).j(), oq0.l(((c10) this.f8202f).f3994b.a()), (ua.a) ((ls1) this.f8203g).j(), (dt0) ((ls1) this.f8204h).j());
            case 8:
                return new rx0((py0) ((ls1) this.f8198b).j(), (gz0) ((ls1) this.f8199c).j(), (z11) ((ls1) this.f8200d).j(), (j21) ((ls1) this.f8201e).j(), (fy0) ((ls1) this.f8202f).j(), ls1.b((ls1) this.f8203g), (ux0) ((ns1) this.f8204h).f8433a);
            case 9:
                return new hz0((ExecutorService) this.f8198b.j(), ls1.b((ls1) this.f8202f), ls1.b(this.f8199c), (z11) this.f8200d.j(), ls1.b((ls1) this.f8203g), (vx0) this.f8204h, (ux0) this.f8201e.j());
            case 10:
                Context context = (Context) this.f8198b.j();
                ExecutorService executorService = (ExecutorService) this.f8199c.j();
                nz0 nz0Var = (nz0) this.f8200d.j();
                vz0 vz0Var = (vz0) ((ls1) this.f8204h).j();
                File file = (File) this.f8201e.j();
                j21 j21Var = (j21) this.f8202f.j();
                ux0 ux0Var = (ux0) this.f8203g.j();
                d51 d51VarP = d51.p(new yz0("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", Context.class), new yz0("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", new Class[0]), new yz0("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", NetworkCapabilities.class, Long.class, Long.class), new yz0("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", String.class), new yz0("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", View.class, Activity.class), new yz0("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", DisplayMetrics.class, View.class), new yz0("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", Long[].class, Integer.class), new yz0("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", new Class[0]), new yz0("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", Context.class, Integer.class), new yz0("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", Integer.class, Context.class, Boolean.class), new yz0("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", Context.class), new yz0("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", Context.class), new yz0("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", MotionEvent.class, DisplayMetrics.class), new yz0("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=", MotionEvent.class, DisplayMetrics.class));
                gr.G(d51VarP);
                return new wz0(context, executorService, nz0Var, vz0Var, file, j21Var, ux0Var.R(), d51VarP);
            case 11:
                return new d01((jd) ((ns1) this.f8202f).f8433a, (wz0) this.f8198b.j(), (Map) ((ns1) this.f8203g).f8433a, (Context) this.f8199c.j(), (by0) ((ns1) this.f8204h).f8433a, (ux0) this.f8200d.j(), (j21) this.f8201e.j());
            default:
                return new j11((Context) this.f8198b.j(), ls1.b((ls1) this.f8201e), (m11) ((ls1) this.f8202f).j(), (j21) this.f8199c.j(), (ExecutorService) this.f8200d.j(), (b11) ((ls1) this.f8203g).j(), (dv0) ((ls1) this.f8204h).j());
        }
    }

    public n50(d10 d10Var, ls1 ls1Var, ls1 ls1Var2, y40 y40Var, y40 y40Var2, ls1 ls1Var3, ms1 ms1Var) {
        this.f8197a = 1;
        this.f8198b = d10Var;
        this.f8199c = ls1Var;
        this.f8200d = ls1Var2;
        this.f8202f = y40Var;
        this.f8203g = y40Var2;
        this.f8201e = ls1Var3;
        this.f8204h = ms1Var;
    }

    public n50(ns1 ns1Var, aw awVar, qs1 qs1Var, ls1 ls1Var, ls1 ls1Var2, qs1 qs1Var2, ls1 ls1Var3) {
        this.f8197a = 4;
        this.f8200d = ns1Var;
        this.f8201e = awVar;
        this.f8198b = qs1Var;
        this.f8202f = ls1Var;
        this.f8203g = ls1Var2;
        this.f8199c = qs1Var2;
        this.f8204h = ls1Var3;
    }

    public n50(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, vx0 vx0Var, ns1 ns1Var2) {
        this.f8197a = 9;
        this.f8198b = ns1Var;
        this.f8202f = ls1Var;
        this.f8199c = ls1Var2;
        this.f8200d = ls1Var3;
        this.f8203g = ls1Var4;
        this.f8204h = vx0Var;
        this.f8201e = ns1Var2;
    }

    public n50(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ns1 ns1Var2, ls1 ls1Var4, ls1 ls1Var5) {
        this.f8197a = 12;
        this.f8198b = ns1Var;
        this.f8201e = ls1Var;
        this.f8202f = ls1Var2;
        this.f8199c = ls1Var3;
        this.f8200d = ns1Var2;
        this.f8203g = ls1Var4;
        this.f8204h = ls1Var5;
    }

    public n50(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4) {
        this.f8197a = 6;
        this.f8200d = ns1Var;
        this.f8198b = ls1Var;
        this.f8201e = ns1Var2;
        this.f8199c = ns1Var3;
        this.f8202f = ls1Var2;
        this.f8203g = ls1Var3;
        this.f8204h = ls1Var4;
    }

    public n50(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ns1 ns1Var3, ns1 ns1Var4, ns1 ns1Var5, ls1 ls1Var2) {
        this.f8197a = 11;
        this.f8202f = ns1Var;
        this.f8198b = ls1Var;
        this.f8203g = ns1Var2;
        this.f8199c = ns1Var3;
        this.f8204h = ns1Var4;
        this.f8200d = ns1Var5;
        this.f8201e = ls1Var2;
    }

    public n50(ns1 ns1Var, ls1 ls1Var, qs1 qs1Var, ls1 ls1Var2, d60 d60Var, ls1 ls1Var3, ls1 ls1Var4) {
        this.f8197a = 3;
        this.f8199c = ns1Var;
        this.f8200d = ls1Var;
        this.f8198b = qs1Var;
        this.f8201e = ls1Var2;
        this.f8204h = d60Var;
        this.f8202f = ls1Var3;
        this.f8203g = ls1Var4;
    }

    public n50(ns1 ns1Var, ns1 ns1Var2, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ns1 ns1Var3) {
        this.f8197a = 10;
        this.f8198b = ns1Var;
        this.f8199c = ns1Var2;
        this.f8200d = ls1Var;
        this.f8204h = ls1Var2;
        this.f8201e = ls1Var3;
        this.f8202f = ls1Var4;
        this.f8203g = ns1Var3;
    }

    public n50(ns1 ns1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var, ls1 ls1Var2, j10 j10Var, ls1 ls1Var3) {
        this.f8197a = 5;
        this.f8198b = ns1Var;
        this.f8201e = ns1Var2;
        this.f8202f = ns1Var3;
        this.f8203g = ls1Var;
        this.f8204h = ls1Var2;
        this.f8199c = j10Var;
        this.f8200d = ls1Var3;
    }

    public n50(qs1 qs1Var, d60 d60Var, qs1 qs1Var2, qs1 qs1Var3, qs1 qs1Var4, qs1 qs1Var5, qs1 qs1Var6) {
        this.f8197a = 0;
        this.f8198b = qs1Var;
        this.f8204h = d60Var;
        this.f8199c = qs1Var2;
        this.f8200d = qs1Var3;
        this.f8201e = qs1Var4;
        this.f8202f = qs1Var5;
        this.f8203g = qs1Var6;
    }

    public /* synthetic */ n50(qs1 qs1Var, qs1 qs1Var2, ls1 ls1Var, ls1 ls1Var2, qs1 qs1Var3, ls1 ls1Var3, Object obj, int i) {
        this.f8197a = i;
        this.f8198b = qs1Var;
        this.f8199c = qs1Var2;
        this.f8200d = ls1Var;
        this.f8201e = ls1Var2;
        this.f8202f = qs1Var3;
        this.f8203g = ls1Var3;
        this.f8204h = (qs1) obj;
    }
}
