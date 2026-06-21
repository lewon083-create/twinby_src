package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 implements s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t8 f6424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f6425b = new ik0(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6426c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yo0 f6428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6431h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6433k;

    public i9(t8 t8Var) {
        this.f6424a = t8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.ik0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.t8] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    @Override // com.google.android.gms.internal.ads.s9
    public final void a(int i, tk0 tk0Var) {
        int i10;
        boolean z5;
        int i11;
        int i12;
        long jC;
        long j10;
        this.f6428e.getClass();
        int i13 = i & 1;
        ?? r32 = this.f6424a;
        int i14 = -1;
        int i15 = 2;
        ?? r72 = 0;
        int i16 = 1;
        if (i13 != 0) {
            int i17 = this.f6426c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    int i18 = this.f6432j;
                    if (i18 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i18).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i18);
                        sb2.append(" more bytes");
                        rs.r("PesReader", sb2.toString());
                    }
                    r32.b(tk0Var.f10643c == 0);
                } else {
                    rs.r("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f6426c = 1;
            this.f6427d = 0;
        }
        int i19 = i;
        while (tk0Var.B() > 0) {
            int i20 = this.f6426c;
            if (i20 != 0) {
                ?? r10 = this.f6425b;
                if (i20 != i16) {
                    if (i20 != i15) {
                        int iB = tk0Var.B();
                        int i21 = this.f6432j;
                        ?? r102 = i21 == i14 ? r72 : iB - i21;
                        if (r102 > 0) {
                            iB -= r102;
                            tk0Var.C(tk0Var.f10642b + iB);
                        }
                        r32.g(tk0Var);
                        int i22 = this.f6432j;
                        if (i22 != i14) {
                            int i23 = i22 - iB;
                            this.f6432j = i23;
                            if (i23 == 0) {
                                r32.b(r72);
                                this.f6426c = i16;
                                this.f6427d = r72;
                            }
                        }
                    } else {
                        if (b(tk0Var, r10.f6518a, Math.min(10, this.i)) && b(tk0Var, null, this.i)) {
                            r10.d(r72);
                            if (this.f6429f) {
                                r10.f(4);
                                long jH = r10.h(3);
                                r10.f(i16);
                                int iH = r10.h(15) << 15;
                                r10.f(i16);
                                long jH2 = r10.h(15);
                                r10.f(i16);
                                if (this.f6431h || !this.f6430g) {
                                    j10 = jH;
                                } else {
                                    r10.f(4);
                                    j10 = jH;
                                    long jH3 = ((long) r10.h(3)) << 30;
                                    r10.f(i16);
                                    int iH2 = r10.h(15) << 15;
                                    r10.f(i16);
                                    long jH4 = r10.h(15);
                                    r10.f(i16);
                                    this.f6428e.c(jH3 | ((long) iH2) | jH4);
                                    this.f6431h = true;
                                }
                                jC = this.f6428e.c(jH2 | (j10 << 30) | ((long) iH));
                            } else {
                                jC = -9223372036854775807L;
                            }
                            i19 |= true != this.f6433k ? 0 : 4;
                            r32.d(i19, jC);
                            this.f6426c = 3;
                            this.f6427d = 0;
                            r72 = 0;
                            i14 = -1;
                            i15 = 2;
                            i16 = 1;
                        }
                    }
                    ?? r14 = r72;
                    i10 = i15;
                    z5 = r14 == true ? 1 : 0;
                    i11 = i16;
                } else {
                    ?? r52 = r72;
                    if (b(tk0Var, r10.f6518a, 9)) {
                        r10.d(r52 == true ? 1 : 0);
                        int iH3 = r10.h(24);
                        i11 = 1;
                        if (iH3 != 1) {
                            a0.u.t(new StringBuilder(String.valueOf(iH3).length() + 30), "Unexpected start code prefix: ", iH3, "PesReader");
                            i14 = -1;
                            this.f6432j = -1;
                            i12 = 0;
                            i10 = 2;
                        } else {
                            r10.f(8);
                            int iH4 = r10.h(16);
                            r10.f(5);
                            this.f6433k = r10.g();
                            i10 = 2;
                            r10.f(2);
                            this.f6429f = r10.g();
                            this.f6430g = r10.g();
                            r10.f(6);
                            int iH5 = r10.h(8);
                            this.i = iH5;
                            if (iH4 == 0) {
                                this.f6432j = -1;
                                i12 = 2;
                                i14 = -1;
                            } else {
                                int i24 = (iH4 - 3) - iH5;
                                this.f6432j = i24;
                                if (i24 < 0) {
                                    a0.u.t(new StringBuilder(String.valueOf(i24).length() + 36), "Found negative packet payload size: ", i24, "PesReader");
                                    i14 = -1;
                                    this.f6432j = -1;
                                } else {
                                    i14 = -1;
                                }
                                i12 = 2;
                            }
                        }
                        this.f6426c = i12;
                        z5 = false;
                        this.f6427d = 0;
                    } else {
                        z5 = r52 == true ? 1 : 0;
                        i14 = -1;
                        i10 = 2;
                        i11 = 1;
                    }
                }
            } else {
                ?? r142 = r72;
                i10 = i15;
                z5 = r142 == true ? 1 : 0;
                i11 = i16;
                tk0Var.G(tk0Var.B());
            }
            int i25 = i10;
            r72 = z5;
            i15 = i25;
            i16 = i11;
        }
    }

    public final boolean b(tk0 tk0Var, byte[] bArr, int i) {
        int iMin = Math.min(tk0Var.B(), i - this.f6427d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            tk0Var.G(iMin);
        } else {
            tk0Var.H(bArr, this.f6427d, iMin);
        }
        int i10 = this.f6427d + iMin;
        this.f6427d = i10;
        return i10 == i;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void c(yo0 yo0Var, b2 b2Var, r9 r9Var) {
        this.f6428e = yo0Var;
        this.f6424a.j(b2Var, r9Var);
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void j() {
        this.f6426c = 0;
        this.f6427d = 0;
        this.f6431h = false;
        this.f6424a.h();
    }
}
