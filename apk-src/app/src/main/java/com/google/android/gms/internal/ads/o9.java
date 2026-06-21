package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2[] f8641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yd1 f8642d;

    public o9(List list, int i) {
        this.f8639a = i;
        switch (i) {
            case 1:
                this.f8640b = list;
                this.f8641c = new w2[list.size()];
                yd1 yd1Var = new yd1(new cf(4, this));
                this.f8642d = yd1Var;
                yd1Var.g(3);
                break;
            default:
                this.f8640b = list;
                this.f8641c = new w2[list.size()];
                this.f8642d = new yd1(new ox0(4, this));
                break;
        }
    }

    public final void a(b2 b2Var, r9 r9Var) {
        switch (this.f8639a) {
            case 0:
                int i = 0;
                while (true) {
                    w2[] w2VarArr = this.f8641c;
                    if (i < w2VarArr.length) {
                        r9Var.f();
                        r9Var.g();
                        w2 w2VarO = b2Var.O(r9Var.f9763d, 3);
                        jx1 jx1Var = (jx1) this.f8640b.get(i);
                        String str = jx1Var.f6975m;
                        boolean z5 = true;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z5 = false;
                        }
                        ix.e0(z5, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = jx1Var.f6964a;
                        if (str2 == null) {
                            r9Var.g();
                            str2 = (String) r9Var.f9764e;
                        }
                        ow1 ow1Var = new ow1();
                        ow1Var.f8822a = str2;
                        ow1Var.d("video/mp2t");
                        ow1Var.e(str);
                        ow1Var.f8826e = jx1Var.f6968e;
                        ow1Var.f8825d = jx1Var.f6967d;
                        ow1Var.I = jx1Var.J;
                        ow1Var.f8835o = jx1Var.f6978p;
                        w2VarO.e(new jx1(ow1Var));
                        w2VarArr[i] = w2VarO;
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    w2[] w2VarArr2 = this.f8641c;
                    if (i10 < w2VarArr2.length) {
                        r9Var.f();
                        r9Var.g();
                        w2 w2VarO2 = b2Var.O(r9Var.f9763d, 3);
                        jx1 jx1Var2 = (jx1) this.f8640b.get(i10);
                        String str3 = jx1Var2.f6975m;
                        boolean z10 = true;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        }
                        ix.e0(z10, "Invalid closed caption MIME type provided: %s", str3);
                        ow1 ow1Var2 = new ow1();
                        r9Var.g();
                        ow1Var2.f8822a = (String) r9Var.f9764e;
                        ow1Var2.d("video/mp2t");
                        ow1Var2.e(str3);
                        ow1Var2.f8826e = jx1Var2.f6968e;
                        ow1Var2.f8825d = jx1Var2.f6967d;
                        ow1Var2.I = jx1Var2.J;
                        ow1Var2.f8835o = jx1Var2.f6978p;
                        w2VarO2.e(new jx1(ow1Var2));
                        w2VarArr2[i10] = w2VarO2;
                        i10++;
                    }
                    break;
                }
                break;
        }
    }

    public void b(long j10, tk0 tk0Var) {
        if (tk0Var.B() < 9) {
            return;
        }
        int iB = tk0Var.b();
        int iB2 = tk0Var.b();
        int iK = tk0Var.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            this.f8642d.h(j10, tk0Var);
        }
    }
}
