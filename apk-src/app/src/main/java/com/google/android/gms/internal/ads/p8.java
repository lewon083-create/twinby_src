package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements t8 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f8955x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8956a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2 f8963h;
    public w2 i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8968n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8972r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8974t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w2 f8976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f8977w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f8957b = new ik0(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f8958c = new tk0(Arrays.copyOf(f8955x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8969o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8970p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8973s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8975u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8964j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8965k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8966l = 256;

    public p8(int i, String str, String str2, boolean z5) {
        this.f8956a = z5;
        this.f8959d = str;
        this.f8960e = i;
        this.f8961f = str2;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void d(int i, long j10) {
        this.f8975u = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x029d, code lost:
    
        r20.f8971q = (r9 & 8) >> 3;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
    
        if (r5 == ((r9 & 1) ^ 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ad, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ae, code lost:
    
        r20.f8967m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        if (r20.f8968n != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b4, code lost:
    
        r20.f8964j = r5;
        r20.f8965k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ba, code lost:
    
        r20.f8964j = r16;
        r20.f8965k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c1, code lost:
    
        r21.E(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0221, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.tk0 r21) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p8.g(com.google.android.gms.internal.ads.tk0):void");
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void h() {
        this.f8975u = -9223372036854775807L;
        this.f8968n = false;
        this.f8964j = 0;
        this.f8965k = 0;
        this.f8966l = 256;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f8962g = (String) r9Var.f9764e;
        r9Var.g();
        w2 w2VarO = b2Var.O(r9Var.f9763d, 1);
        this.f8963h = w2VarO;
        this.f8976v = w2VarO;
        if (!this.f8956a) {
            this.i = new y1();
            return;
        }
        r9Var.f();
        r9Var.g();
        w2 w2VarO2 = b2Var.O(r9Var.f9763d, 5);
        this.i = w2VarO2;
        ow1 ow1Var = new ow1();
        r9Var.g();
        ow1Var.f8822a = (String) r9Var.f9764e;
        ow1Var.d(this.f8961f);
        ow1Var.e("application/id3");
        w2VarO2.e(new jx1(ow1Var));
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void b(boolean z5) {
    }
}
