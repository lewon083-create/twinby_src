package q9;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gk0;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.up;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static k2 f31921l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f31922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h2 f31923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f31924c;
    public h1 i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31925d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31927f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31928g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f31929h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ti.t0 f31930j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k9.q f31931k = new k9.q(-1, -1, null, new ArrayList(), 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f31926e = new ArrayList();

    static {
        new HashSet(Arrays.asList(k9.a.APP_OPEN_AD, k9.a.INTERSTITIAL, k9.a.REWARDED));
    }

    public static gk0 a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pp ppVar = (pp) it.next();
            map.put(ppVar.f9144b, new up(ppVar.f9145c ? 2 : 1, ppVar.f9147e, ppVar.f9146d));
        }
        return new gk0(7, map);
    }

    public static k2 d() {
        k2 k2Var;
        synchronized (k2.class) {
            try {
                if (f31921l == null) {
                    f31921l = new k2();
                }
                k2Var = f31921l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k2Var;
    }

    public final void b(Context context) {
        if (this.i == null) {
            this.i = (h1) new m(r.f31959g.f31961b, context).d(context, false);
        }
    }

    public final void c() {
        h1 h1Var = this.i;
        if (h1Var == null) {
            return;
        }
        try {
            h1Var.i();
            this.i.Q3(null, new xa.b(null));
        } catch (RemoteException e3) {
            u9.i.i("MobileAdsSettingManager initialization failed", e3);
        }
    }

    public final o9.b e() {
        synchronized (this.f31929h) {
            pa.c0.k("MobileAds.initialize() must be called prior to getting initialization status.", this.i != null);
            h1 h1Var = this.i;
            if (h1Var == null) {
                return new ni.i(8, this);
            }
            try {
                return a(h1Var.o());
            } catch (RemoteException unused) {
                u9.i.e("Unable to get Initialization status.");
                return new ni.i(8, this);
            }
        }
    }
}
