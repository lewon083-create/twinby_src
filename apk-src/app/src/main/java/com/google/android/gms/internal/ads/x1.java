package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11967d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zd1 f11968e = new zd1(c6.f4054o);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zd1 f11969f = new zd1(c6.f4053n);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r51 f11970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c6 f11971c = new c6(18);

    public final void a(int i, ArrayList arrayList) {
        c6 c6Var = this.f11971c;
        switch (i) {
            case 0:
                arrayList.add(new l8());
                break;
            case 1:
                arrayList.add(new n8());
                break;
            case 2:
                arrayList.add(new o8());
                break;
            case 3:
                arrayList.add(new a3());
                break;
            case 4:
                z1 z1VarP = f11968e.p(0);
                if (z1VarP == null) {
                    arrayList.add(new o3());
                } else {
                    arrayList.add(z1VarP);
                }
                break;
            case 5:
                arrayList.add(new q3());
                break;
            case 6:
                arrayList.add(new b5(new x4(0), 0, c6Var));
                break;
            case 7:
                arrayList.add(new f5());
                break;
            case 8:
                arrayList.add(new x5(c6Var, 0, r51.f9713f));
                arrayList.add(new b6(c6Var, 0));
                break;
            case 9:
                arrayList.add(new o6());
                break;
            case 10:
                arrayList.add(new l9());
                break;
            case 11:
                if (this.f11970b == null) {
                    v41 v41Var = x41.f12018c;
                    this.f11970b = r51.f9713f;
                }
                yo0 yo0Var = new yo0();
                r51 r51Var = this.f11970b;
                q8 q8Var = new q8();
                q8Var.f9364a = r51Var;
                arrayList.add(new p9(c6Var, yo0Var, q8Var));
                break;
            case 12:
                w9 w9Var = new w9();
                w9Var.f11697c = 0;
                w9Var.f11698d = -1L;
                w9Var.f11700f = -1;
                w9Var.f11701g = -1L;
                arrayList.add(w9Var);
                break;
            case 14:
                arrayList.add(new v3(1));
                break;
            case 15:
                z1 z1VarP2 = f11969f.p(new Object[0]);
                if (z1VarP2 != null) {
                    arrayList.add(z1VarP2);
                }
                break;
            case 16:
                arrayList.add(new d3(c6Var));
                break;
            case 17:
                arrayList.add(new l3(1));
                break;
            case 18:
                arrayList.add(new k3(1));
                break;
            case 19:
                arrayList.add(new l3(0));
                break;
            case 20:
                arrayList.add(new v3(0));
                break;
            case 21:
                arrayList.add(new k3(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6 A[PHI: r18
      0x01d6: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d4, B:128:0x01e2, B:131:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.google.android.gms.internal.ads.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.z1[] b(android.net.Uri r26, java.util.Map r27) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x1.b(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.z1[]");
    }

    @Override // com.google.android.gms.internal.ads.d2
    public final synchronized z1[] h() {
        return b(Uri.EMPTY, new HashMap());
    }
}
