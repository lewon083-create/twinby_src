package k1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f26798d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f26795a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26796b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26797c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26799e = false;

    public b(bb.e eVar) {
        this.f26798d = new a(this, eVar);
    }

    public final void a(c cVar, int i) {
        this.f26798d.g(cVar.j(i), 1.0f);
        this.f26798d.g(cVar.j(i), -1.0f);
    }

    public final void b(e eVar, e eVar2, e eVar3, int i) {
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            this.f26796b = i;
        }
        if (z5) {
            this.f26798d.g(eVar, 1.0f);
            this.f26798d.g(eVar2, -1.0f);
            this.f26798d.g(eVar3, -1.0f);
        } else {
            this.f26798d.g(eVar, -1.0f);
            this.f26798d.g(eVar2, 1.0f);
            this.f26798d.g(eVar3, 1.0f);
        }
    }

    public final void c(e eVar, e eVar2, e eVar3, int i) {
        boolean z5 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z5 = true;
            }
            this.f26796b = i;
        }
        if (z5) {
            this.f26798d.g(eVar, 1.0f);
            this.f26798d.g(eVar2, -1.0f);
            this.f26798d.g(eVar3, 1.0f);
        } else {
            this.f26798d.g(eVar, -1.0f);
            this.f26798d.g(eVar2, 1.0f);
            this.f26798d.g(eVar3, -1.0f);
        }
    }

    public e d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f26795a == null && this.f26796b == 0.0f && this.f26798d.d() == 0;
    }

    public final e f(boolean[] zArr, e eVar) {
        int i;
        int iD = this.f26798d.d();
        e eVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f11 = this.f26798d.f(i10);
            if (f11 < 0.0f) {
                e eVarE = this.f26798d.e(i10);
                if ((zArr == null || !zArr[eVarE.f26820c]) && eVarE != eVar && (((i = eVarE.f26829m) == 3 || i == 4) && f11 < f10)) {
                    f10 = f11;
                    eVar2 = eVarE;
                }
            }
        }
        return eVar2;
    }

    public final void g(e eVar) {
        e eVar2 = this.f26795a;
        if (eVar2 != null) {
            this.f26798d.g(eVar2, -1.0f);
            this.f26795a.f26821d = -1;
            this.f26795a = null;
        }
        float fH = this.f26798d.h(eVar, true) * (-1.0f);
        this.f26795a = eVar;
        if (fH == 1.0f) {
            return;
        }
        this.f26796b /= fH;
        a aVar = this.f26798d;
        int i = aVar.f26793h;
        for (int i10 = 0; i != -1 && i10 < aVar.f26786a; i10++) {
            float[] fArr = aVar.f26792g;
            fArr[i] = fArr[i] / fH;
            i = aVar.f26791f[i];
        }
    }

    public final void h(c cVar, e eVar, boolean z5) {
        if (eVar.f26824g) {
            float fC = this.f26798d.c(eVar);
            this.f26796b = (eVar.f26823f * fC) + this.f26796b;
            this.f26798d.h(eVar, z5);
            if (z5) {
                eVar.b(this);
            }
            if (this.f26798d.d() == 0) {
                this.f26799e = true;
                cVar.f26802b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z5) {
        a aVar = this.f26798d;
        aVar.getClass();
        float fC = aVar.c(bVar.f26795a);
        aVar.h(bVar.f26795a, z5);
        a aVar2 = bVar.f26798d;
        int iD = aVar2.d();
        for (int i = 0; i < iD; i++) {
            e eVarE = aVar2.e(i);
            aVar.a(eVarE, aVar2.c(eVarE) * fC, z5);
        }
        this.f26796b = (bVar.f26796b * fC) + this.f26796b;
        if (z5) {
            bVar.f26795a.b(this);
        }
        if (this.f26795a == null || this.f26798d.d() != 0) {
            return;
        }
        this.f26799e = true;
        cVar.f26802b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            k1.e r0 = r10.f26795a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            k1.e r1 = r10.f26795a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r1)
            float r1 = r10.f26796b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = pe.a.j(r0)
            float r1 = r10.f26796b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            k1.a r5 = r10.f26798d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            k1.a r6 = r10.f26798d
            k1.e r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            k1.a r7 = r10.f26798d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.google.android.gms.internal.ads.om1.x(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.b.toString():java.lang.String");
    }
}
