package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gz1[] f3420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bu1 f3424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3425h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gx1[] f3426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f3427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xj0 f3428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public au1 f3429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public mz1 f3430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f3431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3432p;

    public au1(gx1[] gx1VarArr, long j10, b bVar, i iVar, xj0 xj0Var, bu1 bu1Var, g gVar) {
        this.f3426j = gx1VarArr;
        this.f3432p = j10;
        this.f3427k = bVar;
        this.f3428l = xj0Var;
        hy1 hy1Var = bu1Var.f3906a;
        this.f3419b = hy1Var.f6299a;
        this.f3424g = bu1Var;
        this.f3430n = mz1.f8054d;
        this.f3431o = gVar;
        this.f3420c = new gz1[2];
        this.i = new boolean[2];
        long j11 = bu1Var.f3907b;
        long j12 = bu1Var.f3909d;
        xj0Var.getClass();
        int i = qu1.f9594k;
        Pair pair = (Pair) hy1Var.f6299a;
        Object obj = pair.first;
        hy1 hy1VarA = hy1Var.a(pair.second);
        iu1 iu1Var = (iu1) ((HashMap) xj0Var.f12163f).get(obj);
        iu1Var.getClass();
        ((HashSet) xj0Var.i).add(iu1Var);
        hu1 hu1Var = (hu1) ((HashMap) xj0Var.f12165h).get(iu1Var);
        if (hu1Var != null) {
            hu1Var.f6265a.o(hu1Var.f6266b);
        }
        iu1Var.f6619c.add(hy1VarA);
        ay1 ay1VarC = iu1Var.f6617a.c(hy1VarA, iVar, j11);
        ((IdentityHashMap) xj0Var.f12162e).put(ay1VarC, iu1Var);
        xj0Var.u();
        this.f3418a = j12 != -9223372036854775807L ? new px1(ay1VarC, j12) : ay1VarC;
    }

    public final long a() {
        return this.f3424g.f3907b + this.f3432p;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public final boolean b() {
        if (this.f3422e) {
            return !this.f3423f || this.f3418a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f3422e) {
            return b() || d() - this.f3424g.f3907b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public final long d() {
        if (!this.f3422e) {
            return this.f3424g.f3907b;
        }
        long jF = this.f3423f ? this.f3418a.f() : Long.MIN_VALUE;
        return jF == Long.MIN_VALUE ? this.f3424g.f3910e : jF;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    public final void e(ci ciVar) {
        this.f3422e = true;
        this.f3430n = this.f3418a.g();
        g gVarF = f(ciVar);
        bu1 bu1Var = this.f3424g;
        long jMax = bu1Var.f3907b;
        long j10 = bu1Var.f3910e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jG = g(gVarF, jMax, false, new boolean[2]);
        long j11 = this.f3432p;
        bu1 bu1Var2 = this.f3424g;
        this.f3432p = (bu1Var2.f3907b - jG) + j11;
        this.f3424g = bu1Var2.a(jG);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.g f(com.google.android.gms.internal.ads.ci r34) {
        /*
            Method dump skipped, instruction units count: 2109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.au1.f(com.google.android.gms.internal.ads.ci):com.google.android.gms.internal.ads.g");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    public final long g(g gVar, long j10, boolean z5, boolean[] zArr) {
        gx1[] gx1VarArr;
        int i = 0;
        while (true) {
            boolean z10 = true;
            if (i >= gVar.f5552b) {
                break;
            }
            if (z5 || !gVar.d(this.f3431o, i)) {
                z10 = false;
            }
            this.i[i] = z10;
            i++;
        }
        int i10 = 0;
        while (true) {
            gx1VarArr = this.f3426j;
            if (i10 >= 2) {
                break;
            }
            gx1VarArr[i10].getClass();
            i10++;
        }
        l();
        this.f3431o = gVar;
        if (this.f3429m == null) {
            int i11 = 0;
            while (true) {
                g gVar2 = this.f3431o;
                if (i11 >= gVar2.f5552b) {
                    break;
                }
                gVar2.b(i11);
                d dVar = ((d[]) this.f3431o.f5554d)[i11];
                i11++;
            }
        }
        d[] dVarArr = (d[]) gVar.f5554d;
        ?? r52 = this.f3418a;
        boolean[] zArr2 = this.i;
        gz1[] gz1VarArr = this.f3420c;
        long jB = r52.b(dVarArr, zArr2, gz1VarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            gx1VarArr[i12].getClass();
        }
        this.f3423f = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (gz1VarArr[i13] != null) {
                ix.k0(gVar.b(i13));
                gx1VarArr[i13].getClass();
                this.f3423f = true;
            } else {
                ix.k0(dVarArr[i13] == null);
            }
        }
        return jB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h() {
        l();
        ?? r02 = this.f3418a;
        try {
            boolean z5 = r02 instanceof px1;
            xj0 xj0Var = this.f3428l;
            if (z5) {
                xj0Var.o(((px1) r02).f9201b);
            } else {
                xj0Var.o(r02);
            }
        } catch (RuntimeException e3) {
            rs.H("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    public final au1 i() {
        return this.f3429m;
    }

    public final mz1 j() {
        return this.f3430n;
    }

    public final g k() {
        return this.f3431o;
    }

    public final void l() {
        if (this.f3429m != null) {
            return;
        }
        int i = 0;
        while (true) {
            g gVar = this.f3431o;
            if (i >= gVar.f5552b) {
                return;
            }
            gVar.b(i);
            d dVar = ((d[]) this.f3431o.f5554d)[i];
            i++;
        }
    }
}
