package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bt extends zd1 implements vo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d00 f3875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f3876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowManager f3877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uk f3878h;
    public DisplayMetrics i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3886q;

    public bt(d00 d00Var, Context context, uk ukVar) {
        super(6, (Object) d00Var, (Object) "", false);
        this.f3880k = -1;
        this.f3881l = -1;
        this.f3883n = -1;
        this.f3884o = -1;
        this.f3885p = -1;
        this.f3886q = -1;
        this.f3875e = d00Var;
        this.f3876f = context;
        this.f3878h = ukVar;
        this.f3877g = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[PHI: r5
      0x0063: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:11:0x0042, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f3876f
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            p9.k r1 = p9.k.C
            t9.g0 r1 = r1.f31297c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = t9.g0.r(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            com.google.android.gms.internal.ads.d00 r3 = r8.f3875e
            com.google.android.gms.internal.ads.g00 r4 = r3.f4408b
            com.google.android.gms.internal.ads.j0 r5 = r4.m0()
            if (r5 == 0) goto L2a
            com.google.android.gms.internal.ads.j0 r5 = r4.m0()
            boolean r5 = r5.b()
            if (r5 != 0) goto L76
        L2a:
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.wk r6 = com.google.android.gms.internal.ads.al.f3174r0
            q9.s r7 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r7 = r7.f31970c
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            if (r5 != 0) goto L54
            com.google.android.gms.internal.ads.j0 r5 = r4.m0()
            if (r5 == 0) goto L53
            com.google.android.gms.internal.ads.j0 r5 = r4.m0()
            int r5 = r5.f6668c
            goto L54
        L53:
            r5 = r2
        L54:
            if (r3 != 0) goto L63
            com.google.android.gms.internal.ads.j0 r3 = r4.m0()
            if (r3 == 0) goto L64
            com.google.android.gms.internal.ads.j0 r2 = r4.m0()
            int r2 = r2.f6667b
            goto L64
        L63:
            r2 = r3
        L64:
            q9.r r3 = q9.r.f31959g
            u9.d r6 = r3.f31960a
            int r5 = r6.h(r0, r5)
            r8.f3885p = r5
            u9.d r3 = r3.f31960a
            int r0 = r3.h(r0, r2)
            r8.f3886q = r0
        L76:
            int r0 = r10 - r1
            int r1 = r8.f3885p
            int r2 = r8.f3886q
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> La3
            r3.<init>()     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "x"
            org.json.JSONObject r3 = r3.put(r5, r9)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "y"
            org.json.JSONObject r0 = r3.put(r5, r0)     // Catch: org.json.JSONException -> La3
            java.lang.String r3 = "width"
            org.json.JSONObject r0 = r0.put(r3, r1)     // Catch: org.json.JSONException -> La3
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> La3
            java.lang.Object r1 = r8.f12971c     // Catch: org.json.JSONException -> La3
            com.google.android.gms.internal.ads.sz r1 = (com.google.android.gms.internal.ads.sz) r1     // Catch: org.json.JSONException -> La3
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.h(r2, r0)     // Catch: org.json.JSONException -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            u9.i.f(r1, r0)
        La9:
            com.google.android.gms.internal.ads.k00 r0 = r4.f5576o
            com.google.android.gms.internal.ads.ys r0 = r0.f7078y
            if (r0 == 0) goto Lb3
            r0.f12714g = r9
            r0.f12715h = r10
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bt.D(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.i = new DisplayMetrics();
        Display defaultDisplay = this.f3877g.getDefaultDisplay();
        defaultDisplay.getMetrics(this.i);
        this.f3879j = this.i.density;
        this.f3882m = defaultDisplay.getRotation();
        u9.d dVar = q9.r.f31959g.f31960a;
        this.f3880k = Math.round(r11.widthPixels / this.i.density);
        this.f3881l = Math.round(r11.heightPixels / this.i.density);
        d00 d00Var = this.f3875e;
        g00 g00Var = d00Var.f4408b;
        Activity activityD = d00Var.d();
        if (activityD == null || activityD.getWindow() == null) {
            this.f3883n = this.f3880k;
            this.f3884o = this.f3881l;
        } else {
            t9.g0 g0Var = p9.k.C.f31297c;
            int[] iArrQ = t9.g0.q(activityD);
            this.f3883n = Math.round(iArrQ[0] / this.i.density);
            this.f3884o = Math.round(iArrQ[1] / this.i.density);
        }
        if (g00Var.m0().b()) {
            this.f3885p = this.f3880k;
            this.f3886q = this.f3881l;
        } else {
            d00Var.measure(0, 0);
        }
        C(this.f3880k, this.f3881l, this.f3883n, this.f3884o, this.f3879j, this.f3882m);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        uk ukVar = this.f3878h;
        boolean zB = ukVar.b(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zB2 = ukVar.b(intent2);
        boolean zB3 = ukVar.b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = ukVar.f10953b;
        try {
            jSONObjectPut = new JSONObject().put("sms", zB2).put("tel", zB).put("calendar", zB3).put("storePicture", ((Boolean) com.google.android.gms.internal.measurement.j4.A(context, tk.f10631c)).booleanValue() && wa.b.a(context).f33798b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e3) {
            u9.i.f("Error occurred while obtaining the MRAID capabilities.", e3);
            jSONObjectPut = null;
        }
        d00Var.h("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        d00Var.getLocationOnScreen(iArr);
        q9.r rVar = q9.r.f31959g;
        u9.d dVar2 = rVar.f31960a;
        int i = iArr[0];
        Context context2 = this.f3876f;
        D(dVar2.h(context2, i), rVar.f31960a.h(context2, iArr[1]));
        if (u9.i.l(2)) {
            u9.i.g("Dispatching Ready Event.");
        }
        try {
            ((sz) this.f12971c).h("onReadyEventReceived", new JSONObject().put("js", g00Var.f5568f.f34365b));
        } catch (JSONException e7) {
            u9.i.f("Error occurred while dispatching ready Event.", e7);
        }
    }
}
