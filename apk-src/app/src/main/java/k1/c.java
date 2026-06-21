package k1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f26800q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f26804d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bb.e f26812m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f26815p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26801a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26802b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26803c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26805e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26806f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26808h = false;
    public boolean[] i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26809j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26810k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26811l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e[] f26813n = new e[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26814o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f26807g = new b[32];

    public c() {
        s();
        bb.e eVar = new bb.e(14, false);
        eVar.f2019c = new f2.c();
        eVar.f2020d = new f2.c();
        eVar.f2021e = new e[32];
        this.f26812m = eVar;
        d dVar = new d(eVar);
        dVar.f26816f = new e[128];
        dVar.f26817g = new e[128];
        dVar.f26818h = 0;
        dVar.i = new h3.e(dVar);
        this.f26804d = dVar;
        this.f26815p = new b(eVar);
    }

    public static int n(Object obj) {
        e eVar = ((m1.c) obj).i;
        if (eVar != null) {
            return (int) (eVar.f26823f + 0.5f);
        }
        return 0;
    }

    public final e a(int i) {
        f2.c cVar = (f2.c) this.f26812m.f2020d;
        int i10 = cVar.f16569b;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = cVar.f16568a;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            cVar.f16569b = i11;
            obj = obj2;
        }
        e eVar = (e) obj;
        if (eVar == null) {
            eVar = new e(i);
            eVar.f26829m = i;
        } else {
            eVar.c();
            eVar.f26829m = i;
        }
        int i12 = this.f26814o;
        int i13 = this.f26801a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f26801a = i14;
            this.f26813n = (e[]) Arrays.copyOf(this.f26813n, i14);
        }
        e[] eVarArr = this.f26813n;
        int i15 = this.f26814o;
        this.f26814o = i15 + 1;
        eVarArr[i15] = eVar;
        return eVar;
    }

    public final void b(e eVar, e eVar2, int i, float f10, e eVar3, e eVar4, int i10, int i11) {
        b bVarL = l();
        if (eVar2 == eVar3) {
            bVarL.f26798d.g(eVar, 1.0f);
            bVarL.f26798d.g(eVar4, 1.0f);
            bVarL.f26798d.g(eVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f26798d.g(eVar, 1.0f);
            bVarL.f26798d.g(eVar2, -1.0f);
            bVarL.f26798d.g(eVar3, -1.0f);
            bVarL.f26798d.g(eVar4, 1.0f);
            if (i > 0 || i10 > 0) {
                bVarL.f26796b = (-i) + i10;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f26798d.g(eVar, -1.0f);
            bVarL.f26798d.g(eVar2, 1.0f);
            bVarL.f26796b = i;
        } else if (f10 >= 1.0f) {
            bVarL.f26798d.g(eVar4, -1.0f);
            bVarL.f26798d.g(eVar3, 1.0f);
            bVarL.f26796b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f26798d.g(eVar, f11 * 1.0f);
            bVarL.f26798d.g(eVar2, f11 * (-1.0f));
            bVarL.f26798d.g(eVar3, (-1.0f) * f10);
            bVarL.f26798d.g(eVar4, 1.0f * f10);
            if (i > 0 || i10 > 0) {
                bVarL.f26796b = (i10 * f10) + ((-i) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k1.b r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c.c(k1.b):void");
    }

    public final void d(e eVar, int i) {
        int i10 = eVar.f26821d;
        if (i10 == -1) {
            eVar.d(this, i);
            for (int i11 = 0; i11 < this.f26803c + 1; i11++) {
                e eVar2 = ((e[]) this.f26812m.f2021e)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f26795a = eVar;
            float f10 = i;
            eVar.f26823f = f10;
            bVarL.f26796b = f10;
            bVarL.f26799e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f26807g[i10];
        if (bVar.f26799e) {
            bVar.f26796b = i;
            return;
        }
        if (bVar.f26798d.d() == 0) {
            bVar.f26799e = true;
            bVar.f26796b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.f26796b = i * (-1);
            bVarL2.f26798d.g(eVar, 1.0f);
        } else {
            bVarL2.f26796b = i;
            bVarL2.f26798d.g(eVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(e eVar, e eVar2, int i, int i10) {
        if (i10 == 8 && eVar2.f26824g && eVar.f26821d == -1) {
            eVar.d(this, eVar2.f26823f + i);
            return;
        }
        b bVarL = l();
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            bVarL.f26796b = i;
        }
        if (z5) {
            bVarL.f26798d.g(eVar, 1.0f);
            bVarL.f26798d.g(eVar2, -1.0f);
        } else {
            bVarL.f26798d.g(eVar, -1.0f);
            bVarL.f26798d.g(eVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(e eVar, e eVar2, int i, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f26822e = 0;
        bVarL.b(eVar, eVar2, eVarM, i);
        if (i10 != 8) {
            bVarL.f26798d.g(j(i10), (int) (bVarL.f26798d.c(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(e eVar, e eVar2, int i, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f26822e = 0;
        bVarL.c(eVar, eVar2, eVarM, i);
        if (i10 != 8) {
            bVarL.f26798d.g(j(i10), (int) (bVarL.f26798d.c(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f26799e) {
            bVar.f26795a.d(this, bVar.f26796b);
        } else {
            b[] bVarArr = this.f26807g;
            int i10 = this.f26810k;
            bVarArr[i10] = bVar;
            e eVar = bVar.f26795a;
            eVar.f26821d = i10;
            this.f26810k = i10 + 1;
            eVar.e(this, bVar);
        }
        if (this.f26802b) {
            int i11 = 0;
            while (i11 < this.f26810k) {
                if (this.f26807g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f26807g[i11];
                if (bVar2 != null && bVar2.f26799e) {
                    bVar2.f26795a.d(this, bVar2.f26796b);
                    ((f2.c) this.f26812m.f2019c).b(bVar2);
                    this.f26807g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i = this.f26810k;
                        if (i12 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f26807g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        e eVar2 = bVar3.f26795a;
                        if (eVar2.f26821d == i12) {
                            eVar2.f26821d = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i) {
                        this.f26807g[i13] = null;
                    }
                    this.f26810k = i - 1;
                    i11--;
                }
                i11++;
            }
            this.f26802b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f26810k; i++) {
            b bVar = this.f26807g[i];
            bVar.f26795a.f26823f = bVar.f26796b;
        }
    }

    public final e j(int i) {
        if (this.f26809j + 1 >= this.f26806f) {
            o();
        }
        e eVarA = a(4);
        float[] fArr = eVarA.i;
        int i10 = this.f26803c + 1;
        this.f26803c = i10;
        this.f26809j++;
        eVarA.f26820c = i10;
        eVarA.f26822e = i;
        ((e[]) this.f26812m.f2021e)[i10] = eVarA;
        d dVar = this.f26804d;
        dVar.i.f20375c = eVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[eVarA.f26822e] = 1.0f;
        dVar.j(eVarA);
        return eVarA;
    }

    public final e k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f26809j + 1 >= this.f26806f) {
            o();
        }
        if (!(obj instanceof m1.c)) {
            return null;
        }
        m1.c cVar = (m1.c) obj;
        e eVar = cVar.i;
        if (eVar == null) {
            cVar.k();
            eVar = cVar.i;
        }
        int i = eVar.f26820c;
        bb.e eVar2 = this.f26812m;
        if (i != -1 && i <= this.f26803c && ((e[]) eVar2.f2021e)[i] != null) {
            return eVar;
        }
        if (i != -1) {
            eVar.c();
        }
        int i10 = this.f26803c + 1;
        this.f26803c = i10;
        this.f26809j++;
        eVar.f26820c = i10;
        eVar.f26829m = 1;
        ((e[]) eVar2.f2021e)[i10] = eVar;
        return eVar;
    }

    public final b l() {
        Object obj;
        bb.e eVar = this.f26812m;
        f2.c cVar = (f2.c) eVar.f2019c;
        int i = cVar.f16569b;
        if (i > 0) {
            int i10 = i - 1;
            Object[] objArr = cVar.f16568a;
            obj = objArr[i10];
            objArr[i10] = null;
            cVar.f16569b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(eVar);
        }
        bVar.f26795a = null;
        bVar.f26798d.b();
        bVar.f26796b = 0.0f;
        bVar.f26799e = false;
        return bVar;
    }

    public final e m() {
        if (this.f26809j + 1 >= this.f26806f) {
            o();
        }
        e eVarA = a(3);
        int i = this.f26803c + 1;
        this.f26803c = i;
        this.f26809j++;
        eVarA.f26820c = i;
        ((e[]) this.f26812m.f2021e)[i] = eVarA;
        return eVarA;
    }

    public final void o() {
        int i = this.f26805e * 2;
        this.f26805e = i;
        this.f26807g = (b[]) Arrays.copyOf(this.f26807g, i);
        bb.e eVar = this.f26812m;
        eVar.f2021e = (e[]) Arrays.copyOf((e[]) eVar.f2021e, this.f26805e);
        int i10 = this.f26805e;
        this.i = new boolean[i10];
        this.f26806f = i10;
        this.f26811l = i10;
    }

    public final void p() {
        d dVar = this.f26804d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f26808h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f26810k; i++) {
            if (!this.f26807g[i].f26799e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f26810k) {
                break;
            }
            b bVar = this.f26807g[i];
            int i10 = 1;
            if (bVar.f26795a.f26829m != 1) {
                float f10 = 0.0f;
                if (bVar.f26796b < 0.0f) {
                    boolean z5 = false;
                    int i11 = 0;
                    while (!z5) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f26810k) {
                            b bVar2 = this.f26807g[i14];
                            if (bVar2.f26795a.f26829m != i10 && !bVar2.f26799e && bVar2.f26796b < f10) {
                                int iD = bVar2.f26798d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    e eVarE = bVar2.f26798d.e(i16);
                                    float fC = bVar2.f26798d.c(eVarE);
                                    if (fC > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = eVarE.f26825h[i17] / fC;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = eVarE.f26820c;
                                                i12 = i14;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f26807g[i12];
                            bVar3.f26795a.f26821d = -1;
                            bVar3.g(((e[]) this.f26812m.f2021e)[i13]);
                            e eVar = bVar3.f26795a;
                            eVar.f26821d = i12;
                            eVar.e(this, bVar3);
                        } else {
                            z5 = true;
                        }
                        if (i11 > this.f26809j / 2) {
                            z5 = true;
                        }
                        f10 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(k1.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.f26809j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f26809j
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            k1.e r6 = r1.f26795a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.i
            int r6 = r6.f26820c
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.i
            k1.e r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.i
            int r8 = r6.f26820c
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.f26810k
            if (r9 >= r11) goto L97
            k1.b[] r11 = r0.f26807g
            r11 = r11[r9]
            k1.e r12 = r11.f26795a
            int r12 = r12.f26829m
            if (r12 != r5) goto L54
            goto L92
        L54:
            boolean r12 = r11.f26799e
            if (r12 == 0) goto L59
            goto L92
        L59:
            k1.a r12 = r11.f26798d
            int r13 = r12.f26793h
            r15 = -1
            if (r13 != r15) goto L61
            goto L7a
        L61:
            r2 = 0
        L62:
            if (r13 == r15) goto L7a
            int r5 = r12.f26786a
            if (r2 >= r5) goto L7a
            int[] r5 = r12.f26790e
            r5 = r5[r13]
            int r14 = r6.f26820c
            if (r5 != r14) goto L72
            r14 = 1
            goto L7b
        L72:
            int[] r5 = r12.f26791f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L62
        L7a:
            r14 = 0
        L7b:
            if (r14 == 0) goto L92
            k1.a r2 = r11.f26798d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L92
            float r5 = r11.f26796b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L92
            r8 = r5
            r10 = r9
        L92:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            k1.b[] r2 = r0.f26807g
            r2 = r2[r10]
            k1.e r5 = r2.f26795a
            r5.f26821d = r7
            r2.g(r6)
            k1.e r5 = r2.f26795a
            r5.f26821d = r10
            r5.e(r0, r2)
            goto Lad
        Lac:
            r3 = 1
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c.r(k1.b):void");
    }

    public final void s() {
        for (int i = 0; i < this.f26810k; i++) {
            b bVar = this.f26807g[i];
            if (bVar != null) {
                ((f2.c) this.f26812m.f2019c).b(bVar);
            }
            this.f26807g[i] = null;
        }
    }

    public final void t() {
        bb.e eVar;
        int i = 0;
        while (true) {
            eVar = this.f26812m;
            e[] eVarArr = (e[]) eVar.f2021e;
            if (i >= eVarArr.length) {
                break;
            }
            e eVar2 = eVarArr[i];
            if (eVar2 != null) {
                eVar2.c();
            }
            i++;
        }
        f2.c cVar = (f2.c) eVar.f2020d;
        e[] eVarArr2 = this.f26813n;
        int length = this.f26814o;
        cVar.getClass();
        if (length > eVarArr2.length) {
            length = eVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            e eVar3 = eVarArr2[i10];
            int i11 = cVar.f16569b;
            Object[] objArr = cVar.f16568a;
            if (i11 < objArr.length) {
                objArr[i11] = eVar3;
                cVar.f16569b = i11 + 1;
            }
        }
        this.f26814o = 0;
        Arrays.fill((e[]) eVar.f2021e, (Object) null);
        this.f26803c = 0;
        d dVar = this.f26804d;
        dVar.f26818h = 0;
        dVar.f26796b = 0.0f;
        this.f26809j = 1;
        for (int i12 = 0; i12 < this.f26810k; i12++) {
            b bVar = this.f26807g[i12];
        }
        s();
        this.f26810k = 0;
        this.f26815p = new b(eVar);
    }
}
