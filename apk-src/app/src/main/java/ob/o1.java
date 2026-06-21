package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f30328g;

    public /* synthetic */ o1(Object obj, String str, String str2, Object obj2, long j10, int i) {
        this.f30323b = i;
        this.f30324c = str;
        this.f30325d = str2;
        this.f30327f = obj2;
        this.f30326e = j10;
        this.f30328g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30323b) {
            case 0:
                String str = (String) this.f30325d;
                r1 r1Var = (r1) this.f30328g;
                String str2 = (String) this.f30324c;
                if (str2 != null) {
                    r2 r2Var = new r2((String) this.f30327f, str2, this.f30326e);
                    z3 z3Var = r1Var.f30382b;
                    z3Var.e().C();
                    String str3 = z3Var.H;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    z3Var.H = str;
                    z3Var.G = r2Var;
                } else {
                    z3 z3Var2 = r1Var.f30382b;
                    z3Var2.e().C();
                    String str4 = z3Var2.H;
                    if (str4 == null || str4.equals(str)) {
                        z3Var2.H = str;
                        z3Var2.G = null;
                    }
                }
                break;
            case 1:
                k2 k2Var = (k2) this.f30328g;
                String str5 = (String) this.f30324c;
                String str6 = (String) this.f30325d;
                k2Var.N(this.f30326e, this.f30327f, str5, str6);
                break;
            default:
                u2 u2Var = (u2) this.f30328g;
                Bundle bundle = (Bundle) this.f30324c;
                r2 r2Var2 = (r2) this.f30325d;
                r2 r2Var3 = (r2) this.f30327f;
                u2Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                e4 e4Var = ((l1) u2Var.f15951b).f30267j;
                l1.h(e4Var);
                u2Var.M(r2Var2, r2Var3, this.f30326e, true, e4Var.K("screen_view", bundle, null, false));
                break;
        }
    }

    public o1(u2 u2Var, Bundle bundle, r2 r2Var, r2 r2Var2, long j10) {
        this.f30323b = 2;
        this.f30324c = bundle;
        this.f30325d = r2Var;
        this.f30327f = r2Var2;
        this.f30326e = j10;
        Objects.requireNonNull(u2Var);
        this.f30328g = u2Var;
    }
}
