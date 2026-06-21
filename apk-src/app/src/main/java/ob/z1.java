package ob;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.b7;
import io.sentry.protocol.App;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f30602c;

    public /* synthetic */ z1(k2 k2Var, int i) {
        this.f30601b = i;
        this.f30602c = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30601b) {
            case 0:
                this.f30602c.Z();
                break;
            case 1:
                k1 k1Var = this.f30602c.f30232s;
                l1 l1Var = k1Var.f30217b;
                i1 i1Var = l1Var.f30266h;
                k2 k2Var = l1Var.f30271n;
                z0 z0Var = l1Var.f30264f;
                l1.k(i1Var);
                i1Var.C();
                if (k1Var.c()) {
                    if (k1Var.b()) {
                        l1.h(z0Var);
                        z0Var.f30598x.e(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        l1.i(k2Var);
                        k2Var.J("auto", "_cmpx", bundle);
                    } else {
                        l1.h(z0Var);
                        b7 b7Var = z0Var.f30598x;
                        String strD = b7Var.d();
                        if (TextUtils.isEmpty(strD)) {
                            s0 s0Var = l1Var.f30265g;
                            l1.k(s0Var);
                            s0Var.f30412h.f("Cache still valid but referrer not found");
                        } else {
                            long jF = z0Var.f30599y.f() / 3600000;
                            Uri uri = Uri.parse(strD);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jF - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? App.TYPE : (String) obj;
                            l1.i(k2Var);
                            k2Var.J(str2, "_cmp", (Bundle) pair.second);
                        }
                        b7Var.e(null);
                    }
                    l1.h(z0Var);
                    z0Var.f30599y.g(0L);
                    break;
                }
                break;
            case 2:
                k2 k2Var2 = this.f30602c;
                k2Var2.C();
                l1 l1Var2 = (l1) k2Var2.f15951b;
                z0 z0Var2 = l1Var2.f30264f;
                s0 s0Var2 = l1Var2.f30265g;
                l1.h(z0Var2);
                x0 x0Var = z0Var2.f30595u;
                if (x0Var.a()) {
                    l1.k(s0Var2);
                    s0Var2.f30417n.f("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    y0 y0Var = z0Var2.f30596v;
                    long jF2 = y0Var.f();
                    y0Var.g(1 + jF2);
                    if (jF2 >= 5) {
                        l1.k(s0Var2);
                        s0Var2.f30413j.f("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        x0Var.b(true);
                    } else {
                        if (k2Var2.f30234u == null) {
                            k2Var2.f30234u = new a2(k2Var2, l1Var2, 3);
                        }
                        k2Var2.f30234u.b(0L);
                    }
                }
                break;
            default:
                this.f30602c.Z();
                break;
        }
    }
}
