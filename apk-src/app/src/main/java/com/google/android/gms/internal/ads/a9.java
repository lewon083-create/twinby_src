package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a9 implements t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9 f2807a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2811e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2 f2814h;
    public z8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2815j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2817l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f2812f = new boolean[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9 f2808b = new h9(7, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9 f2809c = new h9(8, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9 f2810d = new h9(6, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2816k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tk0 f2818m = new tk0();

    public a9(o9 o9Var) {
        this.f2807a = o9Var;
    }

    public final void a(int i, long j10, long j11) {
        if (!this.f2815j) {
            this.f2808b.f(i);
            this.f2809c.f(i);
        }
        this.f2810d.f(i);
        z8 z8Var = this.i;
        boolean z5 = this.f2817l;
        z8Var.f12909d = i;
        z8Var.f12911f = j11;
        z8Var.f12910e = j10;
        z8Var.f12915k = z5;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void b(boolean z5) {
        this.f2814h.getClass();
        String str = cq0.f4293a;
        if (z5) {
            this.f2807a.f8642d.i(0);
            c(0, 0, this.f2811e, this.f2816k);
            a(9, this.f2811e, this.f2816k);
            c(0, 0, this.f2811e, this.f2816k);
        }
    }

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
    public final void c(int i, int i10, long j10, long j11) {
        yd1 yd1Var = this.f2807a.f8642d;
        boolean z5 = true;
        if (!this.f2815j) {
            h9 h9Var = this.f2808b;
            h9Var.h(i10);
            h9 h9Var2 = this.f2809c;
            h9Var2.h(i10);
            if (this.f2815j) {
                if (h9Var.f6055c) {
                    o11 o11VarB = rs.B(h9Var.f6056d, 4, h9Var.f6057e);
                    yd1Var.g(o11VarB.f8579m);
                    this.i.f12907b.append(o11VarB.f8571d, o11VarB);
                    h9Var.e();
                } else if (h9Var2.f6055c) {
                    y2 y2Var = new y2(4, h9Var2.f6057e, 1, h9Var2.f6056d);
                    int iE = y2Var.E();
                    y2Var.E();
                    y2Var.v();
                    y2Var.B();
                    this.i.f12908c.append(iE, new mp0(iE));
                    h9Var2.e();
                }
            } else if (h9Var.f6055c && h9Var2.f6055c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(h9Var.f6056d, h9Var.f6057e));
                arrayList.add(Arrays.copyOf(h9Var2.f6056d, h9Var2.f6057e));
                o11 o11VarB2 = rs.B(h9Var.f6056d, 4, h9Var.f6057e);
                y2 y2Var2 = new y2(4, h9Var2.f6057e, 1, h9Var2.f6056d);
                int iE2 = y2Var2.E();
                y2Var2.E();
                y2Var2.v();
                y2Var2.B();
                mp0 mp0Var = new mp0(iE2);
                int i11 = o11VarB2.f8568a;
                int i12 = o11VarB2.f8569b;
                int i13 = o11VarB2.f8570c;
                byte[] bArr = ea0.f4892a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                w2 w2Var = this.f2814h;
                ow1 ow1Var = new ow1();
                ow1Var.f8822a = this.f2813g;
                ow1Var.d("video/mp2t");
                ow1Var.e("video/avc");
                ow1Var.i = str;
                ow1Var.f8839s = o11VarB2.f8572e;
                ow1Var.f8840t = o11VarB2.f8573f;
                ow1Var.B = new rm1(o11VarB2.f8576j, o11VarB2.f8577k, o11VarB2.f8578l, o11VarB2.f8575h + 8, o11VarB2.i + 8, null);
                ow1Var.f8845y = o11VarB2.f8574g;
                ow1Var.f8835o = arrayList;
                int i14 = o11VarB2.f8579m;
                ow1Var.f8834n = i14;
                w2Var.e(new jx1(ow1Var));
                this.f2815j = true;
                yd1Var.g(i14);
                this.i.f12907b.append(o11VarB2.f8571d, o11VarB2);
                this.i.f12908c.append(iE2, mp0Var);
                h9Var.e();
                h9Var2.e();
            }
        }
        h9 h9Var3 = this.f2810d;
        if (h9Var3.h(i10)) {
            int iC = rs.c(h9Var3.f6057e, h9Var3.f6056d);
            byte[] bArr2 = h9Var3.f6056d;
            tk0 tk0Var = this.f2818m;
            tk0Var.z(iC, bArr2);
            tk0Var.E(4);
            yd1Var.h(j11, tk0Var);
        }
        z8 z8Var = this.i;
        boolean z10 = this.f2815j;
        if (z8Var.f12909d == 9) {
            if (z10 && z8Var.f12912g) {
                long j12 = z8Var.f12910e;
                int i15 = i + ((int) (j10 - j12));
                long j13 = z8Var.i;
                if (j13 != -9223372036854775807L) {
                    long j14 = z8Var.f12913h;
                    if (j12 != j14) {
                        z8Var.f12906a.c(j13, z8Var.f12914j ? 1 : 0, (int) (j12 - j14), i15, null);
                    }
                }
            }
            z8Var.f12913h = z8Var.f12910e;
            z8Var.i = z8Var.f12911f;
            z8Var.f12914j = false;
            z8Var.f12912g = true;
        }
        boolean z11 = z8Var.f12915k;
        boolean z12 = z8Var.f12914j;
        int i16 = z8Var.f12909d;
        if (i16 != 5 && (!z11 || i16 != 1)) {
            z5 = false;
        }
        boolean z13 = z12 | z5;
        z8Var.f12914j = z13;
        z8Var.f12909d = 24;
        if (z13) {
            this.f2817l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void d(int i, long j10) {
        this.f2816k = j10;
        int i10 = i & 2;
        this.f2817l = (i10 != 0) | this.f2817l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // com.google.android.gms.internal.ads.t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.tk0 r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.w2 r2 = r12.f2814h
            r2.getClass()
            java.lang.String r2 = com.google.android.gms.internal.ads.cq0.f4293a
            int r2 = r13.f10642b
            int r7 = r13.f10643c
            byte[] r8 = r13.f10641a
            long r3 = r12.f2811e
            int r5 = r13.B()
            long r5 = (long) r5
            long r3 = r3 + r5
            r12.f2811e = r3
            com.google.android.gms.internal.ads.w2 r3 = r12.f2814h
            int r4 = r13.B()
            r3.a(r4, r13)
        L20:
            boolean[] r1 = r12.f2812f
            int r1 = com.google.android.gms.internal.ads.rs.N(r8, r2, r7, r1)
            com.google.android.gms.internal.ads.h9 r3 = r12.f2810d
            com.google.android.gms.internal.ads.h9 r4 = r12.f2809c
            com.google.android.gms.internal.ads.h9 r5 = r12.f2808b
            if (r1 == r7) goto L71
            int r6 = r1 + 3
            r6 = r8[r6]
            r9 = r6 & 31
            r6 = 3
            if (r1 <= 0) goto L40
            int r10 = r1 + (-1)
            r11 = r8[r10]
            if (r11 != 0) goto L40
            r6 = 4
        L3e:
            r11 = r6
            goto L42
        L40:
            r10 = r1
            goto L3e
        L42:
            int r1 = r10 - r2
            if (r1 <= 0) goto L53
            boolean r6 = r12.f2815j
            if (r6 != 0) goto L50
            r5.g(r8, r2, r10)
            r4.g(r8, r2, r10)
        L50:
            r3.g(r8, r2, r10)
        L53:
            int r2 = r7 - r10
            long r3 = r12.f2811e
            long r5 = (long) r2
            long r3 = r3 - r5
            if (r1 >= 0) goto L5d
            int r1 = -r1
            goto L5e
        L5d:
            r1 = 0
        L5e:
            long r5 = r12.f2816k
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            r0.c(r1, r2, r3, r5)
            r2 = r3
            long r4 = r12.f2816k
            r1 = r9
            r0.a(r1, r2, r4)
            int r2 = r10 + r11
            goto L20
        L71:
            boolean r1 = r12.f2815j
            if (r1 != 0) goto L7b
            r5.g(r8, r2, r7)
            r4.g(r8, r2, r7)
        L7b:
            r3.g(r8, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a9.g(com.google.android.gms.internal.ads.tk0):void");
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void h() {
        this.f2811e = 0L;
        this.f2817l = false;
        this.f2816k = -9223372036854775807L;
        rs.O(this.f2812f);
        this.f2808b.e();
        this.f2809c.e();
        this.f2810d.e();
        this.f2807a.f8642d.i(0);
        z8 z8Var = this.i;
        if (z8Var != null) {
            z8Var.f12912g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f2813g = (String) r9Var.f9764e;
        r9Var.g();
        w2 w2VarO = b2Var.O(r9Var.f9763d, 2);
        this.f2814h = w2VarO;
        this.i = new z8(w2VarO);
        this.f2807a.a(b2Var, r9Var);
    }
}
