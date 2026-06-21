package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s31 f44590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi2 f44591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m41 f44592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ek0 f44593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f44594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44595f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x31(Context context, s31 s31Var, oi2 oi2Var) {
        v82 v82Var = y82.f44950d;
        this(context, s31Var, oi2Var, v82Var.a(context).b(), v82Var.a(context).a(), fw2.a());
    }

    public final void a(w41 w41Var, u31 u31Var) {
        oi2 oi2Var = this.f44591b;
        oi2Var.getClass();
        String str = w41Var.f44279g;
        ni2 ni2Var = str != null ? new ni2(str, new b03(w41Var.f44273a, w41Var.f44274b)) : null;
        Bitmap bitmap = ni2Var != null ? (Bitmap) oi2Var.f41548c.get(ni2Var) : null;
        u31Var.a(bitmap != null ? new BitmapDrawable(this.f44594e, bitmap) : null);
        if (this.f44595f) {
            this.f44593d.a(w41Var.f44275c, new w31(u31Var));
        } else {
            b(w41Var, u31Var);
        }
    }

    public final void b(w41 w41Var, u31 u31Var) {
        zl.s sVar = new zl.s(12, u31Var, this);
        Bitmap bitmapA = this.f44591b.a(w41Var);
        if (bitmapA != null) {
            sVar.b(bitmapA);
            return;
        }
        oi2 oi2Var = this.f44591b;
        oi2Var.getClass();
        String str = w41Var.f44279g;
        ni2 ni2Var = str != null ? new ni2(str, new b03(w41Var.f44273a, w41Var.f44274b)) : null;
        sVar.b(ni2Var != null ? (Bitmap) oi2Var.f41548c.get(ni2Var) : null);
        if (this.f44590a.a()) {
            String str2 = w41Var.f44275c;
            this.f44592c.a(str2, new v31(this, str2, sVar), w41Var.f44273a, w41Var.f44274b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x31(android.content.Context r1, yads.s31 r2, yads.oi2 r3, yads.m41 r4, yads.ek0 r5, yads.gw2 r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.f44590a = r2
            r0.f44591b = r3
            r0.f44592c = r4
            r0.f44593d = r5
            android.content.res.Resources r3 = r1.getResources()
            r0.f44594e = r3
            boolean r2 = r2.a()
            if (r2 == 0) goto L25
            yads.pt2 r1 = r6.a(r1)
            if (r1 == 0) goto L25
            boolean r1 = r1.d()
            r2 = 1
            if (r1 != r2) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r0.f44595f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.x31.<init>(android.content.Context, yads.s31, yads.oi2, yads.m41, yads.ek0, yads.gw2):void");
    }

    public static final void a(u31 u31Var, x31 x31Var, Bitmap bitmap) {
        u31Var.a(bitmap != null ? new BitmapDrawable(x31Var.f44594e, bitmap) : null);
    }
}
