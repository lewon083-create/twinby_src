package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 implements z1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f3630z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6 f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f3633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tk0 f3634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tk0 f3635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk0 f3636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f6 f3638h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r51 f3639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public tk0 f3644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b2 f3651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a6[] f3652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long[][] f3653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3654y;

    static {
        int i = pn1.F;
    }

    public b6() {
        this(z6.A1, 16);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        r51 r51VarQ;
        t2 t2VarM = c80.m(a2Var, false, false);
        if (t2VarM != null) {
            r51VarQ = x41.q(t2VarM);
        } else {
            v41 v41Var = x41.f12018c;
            r51VarQ = r51.f9713f;
        }
        this.f3639j = r51VarQ;
        return t2VarM == null;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        if ((this.f3632b & 16) == 0) {
            b2Var = new b7(b2Var, this.f3631a);
        }
        this.f3651v = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f3637g.clear();
        this.f3643n = 0;
        this.f3645p = -1;
        this.f3646q = 0;
        this.f3647r = 0;
        this.f3648s = 0;
        this.f3649t = false;
        if (j10 == 0) {
            if (this.f3640k != 3) {
                this.f3640k = 0;
                this.f3643n = 0;
                return;
            } else {
                f6 f6Var = this.f3638h;
                f6Var.f5248a.clear();
                f6Var.f5249b = 0;
                this.i.clear();
                return;
            }
        }
        for (a6 a6Var : this.f3652w) {
            j6 j6Var = a6Var.f2781b;
            int iA = j6Var.a(j11);
            if (iA == -1) {
                iA = j6Var.b(j11);
            }
            a6Var.f2784e = iA;
            x2 x2Var = a6Var.f2783d;
            if (x2Var != null) {
                x2Var.f11977b = false;
                x2Var.f11978c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x05a6, code lost:
    
        throw com.google.android.gms.internal.ads.eb.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r38, com.google.android.gms.internal.ads.e2 r39) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b6.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r42) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b6.f(long):void");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final /* synthetic */ List j() {
        return this.f3639j;
    }

    public b6(z6 z6Var, int i) {
        this.f3631a = z6Var;
        this.f3632b = i;
        v41 v41Var = x41.f12018c;
        this.f3639j = r51.f9713f;
        this.f3640k = 0;
        this.f3638h = new f6();
        this.i = new ArrayList();
        this.f3636f = new tk0(16);
        this.f3637g = new ArrayDeque();
        this.f3633c = new tk0(rs.f10056z);
        this.f3634d = new tk0(6);
        this.f3635e = new tk0();
        this.f3645p = -1;
        this.f3651v = b2.z1;
        this.f3652w = new a6[0];
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
