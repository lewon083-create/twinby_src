package yads;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f37829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f37830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f37831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b92 f37832d;

    public dm0(d4 d4Var, jn jnVar, ib ibVar, b92 b92Var) {
        this.f37829a = d4Var;
        this.f37830b = jnVar;
        this.f37831c = ibVar;
        this.f37832d = b92Var;
    }

    public final String a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networks", jSONArray);
            jn jnVar = this.f37830b;
            String string = jSONObject.toString();
            jnVar.getClass();
            return jn.a(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r14, mj.a r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof yads.cm0
            if (r0 == 0) goto L13
            r0 = r15
            yads.cm0 r0 = (yads.cm0) r0
            int r1 = r0.f37440e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37440e = r1
            goto L18
        L13:
            yads.cm0 r0 = new yads.cm0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f37438c
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f37440e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yads.dm0 r14 = r0.f37437b
            com.google.android.gms.internal.measurement.h5.E(r15)
            goto Lbe
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            yads.dm0 r14 = r0.f37437b
            com.google.android.gms.internal.measurement.h5.E(r15)
            goto L98
        L3b:
            com.google.android.gms.internal.measurement.h5.E(r15)
            yads.d4 r15 = r13.f37829a
            yads.hb r15 = r15.f37615c
            java.lang.String r15 = r15.f39118a
            yads.ib r2 = r13.f37831c
            yads.hp r2 = r2.f39479a
            java.util.List r2 = r2.f39289b
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L65
            java.lang.Object r5 = r2.next()
            r7 = r5
            yads.gb r7 = (yads.gb) r7
            java.lang.String r7 = r7.f38689b
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r7, r15)
            if (r7 == 0) goto L4e
            goto L66
        L65:
            r5 = r6
        L66:
            yads.gb r5 = (yads.gb) r5
            if (r5 == 0) goto Lc5
            java.util.List r11 = r5.f38690c
            yads.d4 r15 = r13.f37829a
            yads.e00 r2 = r15.f37613a
            yads.e00 r5 = yads.e00.f37942d
            if (r2 != r5) goto L9f
            yads.e03 r15 = r15.f37616d
            yads.d03 r10 = r15.f37951a
            if (r10 == 0) goto Lc5
            yads.b92 r8 = r13.f37832d
            r0.f37437b = r13
            r0.f37440e = r4
            r8.getClass()
            ok.e r15 = hk.k0.f20682a
            ik.d r15 = mk.n.f28934a
            ik.d r15 = r15.f21368f
            yads.z82 r7 = new yads.z82
            r12 = 0
            r9 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r15 = hk.c0.t(r15, r7, r0)
            if (r15 != r1) goto L97
            goto Lbc
        L97:
            r14 = r13
        L98:
            org.json.JSONArray r15 = (org.json.JSONArray) r15
            java.lang.String r14 = r14.a(r15)
            return r14
        L9f:
            r9 = r14
            yads.b92 r8 = r13.f37832d
            r0.f37437b = r13
            r0.f37440e = r3
            r8.getClass()
            ok.e r14 = hk.k0.f20682a
            ik.d r14 = mk.n.f28934a
            ik.d r14 = r14.f21368f
            yads.z82 r7 = new yads.z82
            r12 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r15 = hk.c0.t(r14, r7, r0)
            if (r15 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            r14 = r13
        Lbe:
            org.json.JSONArray r15 = (org.json.JSONArray) r15
            java.lang.String r14 = r14.a(r15)
            return r14
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dm0.a(android.content.Context, mj.a):java.lang.Object");
    }
}
