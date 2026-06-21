package ob;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f29954b;

    public b1(z3 z3Var) {
        this.f29954b = z3Var.f30615m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f29953a) {
            case 0:
                l1 l1Var = this.f29954b;
                boolean z5 = false;
                try {
                    ti.b bVarA = wa.b.a(l1Var.f30260b);
                    if (bVarA == null) {
                        s0 s0Var = l1Var.f30265g;
                        l1.k(s0Var);
                        s0Var.f30418o.f("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        l1Var = l1Var;
                    } else {
                        int i = bVarA.d(128, "com.android.vending").versionCode;
                        l1Var = i;
                        if (i >= 80837300) {
                            z5 = true;
                            l1Var = i;
                        }
                    }
                    break;
                } catch (Exception e3) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30418o.g(e3, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z5;
            default:
                s0 s0Var3 = this.f29954b.f30265g;
                l1.k(s0Var3);
                return Log.isLoggable(s0Var3.M(), 3);
        }
    }

    public b1(ci.e eVar, l1 l1Var) {
        this.f29954b = l1Var;
    }
}
