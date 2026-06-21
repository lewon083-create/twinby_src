package s7;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.ads.bf;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public static final String i = n.i("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f32792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bf f32793h;

    public e(Context context, x7.a aVar) {
        super(context, aVar);
        this.f32792g = (ConnectivityManager) this.f32788b.getSystemService("connectivity");
        this.f32793h = new bf(6, this);
    }

    @Override // s7.d
    public final Object a() {
        return f();
    }

    @Override // s7.d
    public final void d() {
        String str = i;
        try {
            n.g().e(str, "Registering network callback", new Throwable[0]);
            this.f32792g.registerDefaultNetworkCallback(this.f32793h);
        } catch (IllegalArgumentException | SecurityException e3) {
            n.g().f(str, "Received exception while registering network callback", e3);
        }
    }

    @Override // s7.d
    public final void e() {
        String str = i;
        try {
            n.g().e(str, "Unregistering network callback", new Throwable[0]);
            this.f32792g.unregisterNetworkCallback(this.f32793h);
        } catch (IllegalArgumentException | SecurityException e3) {
            n.g().f(str, "Received exception while unregistering network callback", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q7.a f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.f32792g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r5 = r3
            goto L3b
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = r2
            goto L3b
        L2b:
            l7.n r6 = l7.n.g()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = s7.e.i
            java.lang.String r8 = "Unable to validate active network"
            r6.f(r5, r8, r7)
            goto L29
        L3b:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L48
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L48
            r2 = r3
        L48:
            q7.a r1 = new q7.a
            r1.<init>()
            r1.f31779a = r4
            r1.f31780b = r5
            r1.f31781c = r0
            r1.f31782d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.e.f():q7.a");
    }
}
