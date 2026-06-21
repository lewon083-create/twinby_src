package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class no0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f8390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f8391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mo0 f8392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ep0 f8393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u9.a f8394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f8395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bs0 f8396h;
    public final hq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ed.d f8397j;

    public no0(Context context, Executor executor, n10 n10Var, ep0 ep0Var, mo0 mo0Var, hq0 hq0Var, u9.a aVar) {
        this.f8389a = context;
        this.f8390b = executor;
        this.f8391c = n10Var;
        this.f8393e = ep0Var;
        this.f8392d = mo0Var;
        this.i = hq0Var;
        this.f8394f = aVar;
        this.f8395g = new FrameLayout(context);
        this.f8396h = n10Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(q9.d3 r10, java.lang.String r11, com.google.android.gms.internal.ads.gr r12, com.google.android.gms.internal.ads.al0 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.no0.a(q9.d3, java.lang.String, com.google.android.gms.internal.ads.gr, com.google.android.gms.internal.ads.al0):boolean");
    }

    public final synchronized p10 b(cp0 cp0Var) {
        ko0 ko0Var = (ko0) cp0Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.m9)).booleanValue()) {
            a60 a60Var = new a60();
            a60Var.f2786a = this.f8389a;
            a60Var.f2787b = ko0Var.f7275a;
            a60 a60Var2 = new a60(a60Var);
            f80 f80Var = new f80();
            mo0 mo0Var = this.f8392d;
            Executor executor = this.f8390b;
            ((HashSet) f80Var.f5268l).add(new s80(mo0Var, executor));
            f80Var.c(mo0Var, executor);
            g80 g80Var = new g80(f80Var);
            p10 p10Var = new p10(this.f8391c.f8104b, 0);
            p10Var.f8882f = a60Var2;
            p10Var.f8881e = g80Var;
            return p10Var;
        }
        mo0 mo0Var2 = this.f8392d;
        mo0 mo0Var3 = new mo0(mo0Var2.f7956b);
        mo0Var3.i = mo0Var2;
        f80 f80Var2 = new f80();
        Executor executor2 = this.f8390b;
        f80Var2.a(mo0Var3, executor2);
        ((HashSet) f80Var2.f5264g).add(new s80(mo0Var3, executor2));
        ((HashSet) f80Var2.f5270n).add(new s80(mo0Var3, executor2));
        ((HashSet) f80Var2.f5269m).add(new s80(mo0Var3, executor2));
        ((HashSet) f80Var2.f5268l).add(new s80(mo0Var3, executor2));
        f80Var2.c(mo0Var3, executor2);
        f80Var2.f5271o = mo0Var3;
        a60 a60Var3 = new a60();
        a60Var3.f2786a = this.f8389a;
        a60Var3.f2787b = ko0Var.f7275a;
        a60 a60Var4 = new a60(a60Var3);
        g80 g80Var2 = new g80(f80Var2);
        p10 p10Var2 = new p10(this.f8391c.f8104b, 0);
        p10Var2.f8882f = a60Var4;
        p10Var2.f8881e = g80Var2;
        return p10Var2;
    }
}
