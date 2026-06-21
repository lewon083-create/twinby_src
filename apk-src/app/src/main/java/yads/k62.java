package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk.a0 f40084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke0 f40085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iv0 f40086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final az1 f40087d;

    public k62(hk.a0 a0Var, ke0 ke0Var, iv0 iv0Var, az1 az1Var) {
        this.f40084a = a0Var;
        this.f40085b = ke0Var;
        this.f40086c = iv0Var;
        this.f40087d = az1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r18, android.content.Context r19, yads.ty1 r20, yads.z30 r21, mj.a r22) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r22
            boolean r3 = r2 instanceof yads.h62
            if (r3 == 0) goto L1a
            r3 = r2
            yads.h62 r3 = (yads.h62) r3
            int r4 = r3.f39044h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f39044h = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            yads.h62 r3 = new yads.h62
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r9.f39042f
            nj.a r3 = nj.a.f29512b
            int r4 = r9.f39044h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4f
            if (r4 == r6) goto L3e
            if (r4 != r5) goto L36
            java.lang.Object r1 = r9.f39038b
            yads.ty1 r1 = (yads.ty1) r1
            com.google.android.gms.internal.measurement.h5.E(r2)
            return r1
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            boolean r1 = r9.f39041e
            yads.z30 r4 = r9.f39040d
            android.content.Context r6 = r9.f39039c
            java.lang.Object r7 = r9.f39038b
            yads.k62 r7 = (yads.k62) r7
            com.google.android.gms.internal.measurement.h5.E(r2)
            r12 = r6
            r11 = r7
        L4d:
            r15 = r4
            goto L6f
        L4f:
            com.google.android.gms.internal.measurement.h5.E(r2)
            yads.az1 r2 = r0.f40087d
            r9.f39038b = r0
            r9.f39039c = r1
            r4 = r21
            r9.f39040d = r4
            r7 = r18
            r9.f39041e = r7
            r9.f39044h = r6
            r6 = r20
            java.lang.Object r2 = r2.a(r1, r6, r9)
            if (r2 != r3) goto L6b
            goto La4
        L6b:
            r11 = r0
            r12 = r1
            r1 = r7
            goto L4d
        L6f:
            r14 = r2
            yads.ty1 r14 = (yads.ty1) r14
            r2 = 0
            if (r14 != 0) goto L76
            return r2
        L76:
            if (r1 != 0) goto L79
            goto La5
        L79:
            yads.v9 r13 = r14.f43487b
            boolean r1 = r13.E
            if (r1 == 0) goto L8d
            hk.a0 r1 = r11.f40084a
            yads.i62 r10 = new yads.i62
            r16 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3 = 3
            hk.c0.m(r1, r2, r10, r3)
            return r14
        L8d:
            boolean r1 = r13.f43952x
            if (r1 == 0) goto La5
            r9.f39038b = r14
            r9.f39039c = r2
            r9.f39040d = r2
            r9.f39044h = r5
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r1 = r4.a(r5, r6, r7, r8, r9)
            if (r1 != r3) goto La5
        La4:
            return r3
        La5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k62.a(boolean, android.content.Context, yads.ty1, yads.z30, mj.a):java.lang.Object");
    }

    public /* synthetic */ k62(d4 d4Var, nu2 nu2Var, Context context, w5 w5Var, hk.a0 a0Var) {
        this(a0Var, new ke0(context, w5Var), new iv0(context, w5Var), new az1(context, d4Var, nu2Var));
    }

    public final Object a(Context context, v9 v9Var, ty1 ty1Var, z30 z30Var, mj.a frame) {
        hk.l lVar = new hk.l(1, nj.f.b(frame));
        lVar.t();
        j62 j62Var = new j62(lVar);
        boolean zA = qr0.a(context, pr0.f41996c);
        s62[] s62VarArr = s62.f42822b;
        if ("first_video_preloading_strategy".equals(v9Var.f43950v) && zA) {
            iv0 iv0Var = this.f40086c;
            synchronized (iv0Var.f39651d) {
                try {
                    f12 f12Var = ty1Var.f43486a;
                    g72 g72Var = iv0Var.f39650c;
                    g72Var.getClass();
                    List listG = ek.u.g(ek.u.e(ek.u.e(ek.u.f(ek.u.c(CollectionsKt.w(f12Var.f38323a), new d72(g72Var)), e72.f38042b), b72.f36949b), c72.f37306b));
                    if (listG.isEmpty()) {
                        j62Var.a();
                    } else {
                        gv0 gv0Var = new gv0(iv0Var.f39648a, j62Var, iv0Var.f39649b, CollectionsKt.z(listG).iterator(), z30Var);
                        iv0Var.f39648a.a(v5.f43884p, null);
                        Pair pair = (Pair) CollectionsKt.D(listG);
                        iv0Var.f39649b.a((String) pair.f27469b, gv0Var, (String) pair.f27470c);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            this.f40085b.a(ty1Var, j62Var, z30Var);
        }
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS == aVar ? objS : Unit.f27471a;
    }
}
