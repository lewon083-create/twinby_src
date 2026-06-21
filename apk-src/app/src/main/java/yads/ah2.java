package yads;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ah2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m83 f36716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lv f36717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f36718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vg2 f36719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf0 f36720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av f36721f;

    public /* synthetic */ ah2(d4 d4Var, nu2 nu2Var, v9 v9Var, m83 m83Var, lv lvVar) {
        this(m83Var, lvVar, new a1(), new vg2(), new uf0(d4Var, nu2Var, v9Var), new av());
    }

    public final void a(ug2 ug2Var, uu uuVar, boolean z5) {
        this.f36721f.getClass();
        String strA = av.a(uuVar);
        jj.i builder = new jj.i();
        builder.put("click_url", ab3.a(ug2Var.f43651b));
        builder.put("deeplink_package_name", ug2Var.f43650a);
        builder.put("deeplink_success", Boolean.valueOf(z5));
        if (z5) {
            builder.put("click_destination", strA);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(builder.b());
        lv lvVar = this.f36717b;
        eo2 eo2Var = eo2.f38213w;
        go2 go2VarA = lvVar.a(eo2Var, linkedHashMapM);
        lvVar.f40692d.a(go2VarA);
        lvVar.f40694f.a(eo2Var, go2VarA.f38839b, do2.f37869a, null);
    }

    public ah2(m83 m83Var, lv lvVar, a1 a1Var, vg2 vg2Var, uf0 uf0Var, av avVar) {
        this.f36716a = m83Var;
        this.f36717b = lvVar;
        this.f36718c = a1Var;
        this.f36719d = vg2Var;
        this.f36720e = uf0Var;
        this.f36721f = avVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r7, yads.ug2 r8, mj.a r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yads.yg2
            if (r0 == 0) goto L13
            r0 = r9
            yads.yg2 r0 = (yads.yg2) r0
            int r1 = r0.f45053g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45053g = r1
            goto L18
        L13:
            yads.yg2 r0 = new yads.yg2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f45051e
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f45053g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yads.uu r7 = r0.f45050d
            yads.ug2 r8 = r0.f45049c
            yads.ah2 r0 = r0.f45048b
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: java.lang.Exception -> L71
            goto L62
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.google.android.gms.internal.measurement.h5.E(r9)
            yads.uu r9 = new yads.uu
            r9.<init>(r8)
            yads.vg2 r2 = r6.f36719d     // Catch: java.lang.Exception -> L6f
            r2.getClass()     // Catch: java.lang.Exception -> L6f
            android.content.Intent r2 = yads.vg2.a(r7, r8)     // Catch: java.lang.Exception -> L6f
            yads.bb0 r4 = r8.f43654e     // Catch: java.lang.Exception -> L6f
            yads.bb0 r5 = yads.bb0.f36982d     // Catch: java.lang.Exception -> L6f
            if (r4 != r5) goto L5d
            yads.uf0 r4 = r6.f36720e     // Catch: java.lang.Exception -> L6f
            r0.f45048b = r6     // Catch: java.lang.Exception -> L6f
            r0.f45049c = r8     // Catch: java.lang.Exception -> L6f
            r0.f45050d = r9     // Catch: java.lang.Exception -> L6f
            r0.f45053g = r3     // Catch: java.lang.Exception -> L6f
            java.lang.Object r7 = r4.a(r7, r2, r0)     // Catch: java.lang.Exception -> L6f
            if (r7 != r1) goto L60
            return r1
        L5d:
            r7.startActivity(r2)     // Catch: java.lang.Exception -> L6f
        L60:
            r0 = r6
            r7 = r9
        L62:
            yads.m83 r9 = r0.f36716a     // Catch: java.lang.Exception -> L71
            java.util.List r1 = r8.f43655f     // Catch: java.lang.Exception -> L71
            r9.a(r1, r7)     // Catch: java.lang.Exception -> L71
            r0.a(r8, r7, r3)     // Catch: java.lang.Exception -> L71
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L6f:
            r0 = r6
            r7 = r9
        L71:
            yads.m83 r9 = r0.f36716a
            java.util.List r1 = r8.f43656g
            r9.a(r1, r7)
            r9 = 0
            r0.a(r8, r7, r9)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ah2.a(android.content.Context, yads.ug2, mj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0087 -> B:35:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, java.util.List r9, mj.a r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof yads.zg2
            if (r0 == 0) goto L13
            r0 = r10
            yads.zg2 r0 = (yads.zg2) r0
            int r1 = r0.f45410h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45410h = r1
            goto L18
        L13:
            yads.zg2 r0 = new yads.zg2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f45408f
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f45410h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            yads.ug2 r8 = r0.f45407e
            java.util.Iterator r9 = r0.f45406d
            android.content.Context r2 = r0.f45405c
            yads.ah2 r5 = r0.f45404b
            com.google.android.gms.internal.measurement.h5.E(r10)
            goto L8a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.google.android.gms.internal.measurement.h5.E(r10)
            android.app.Activity r10 = yads.j1.a()
            if (r10 == 0) goto L43
            r8 = r10
            goto L67
        L43:
            yads.a1 r10 = r7.f36718c
            r10.getClass()
            r10 = 0
            r2 = r8
        L4a:
            boolean r5 = r2 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L63
            int r5 = r10 + 1
            r6 = 10
            if (r10 >= r6) goto L63
            boolean r10 = r2 instanceof android.app.Activity
            if (r10 == 0) goto L5b
            android.app.Activity r2 = (android.app.Activity) r2
            goto L64
        L5b:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            r10 = r5
            goto L4a
        L63:
            r2 = r3
        L64:
            if (r2 == 0) goto L67
            r8 = r2
        L67:
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r2 = r8
        L6d:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L93
            java.lang.Object r8 = r9.next()
            yads.ug2 r8 = (yads.ug2) r8
            r0.f45404b = r5
            r0.f45405c = r2
            r0.f45406d = r9
            r0.f45407e = r8
            r0.f45410h = r4
            java.lang.Object r10 = r5.a(r2, r8, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6d
            return r8
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ah2.a(android.content.Context, java.util.List, mj.a):java.lang.Object");
    }
}
