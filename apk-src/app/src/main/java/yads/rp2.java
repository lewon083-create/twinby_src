package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rp2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sp2 f42688c;

    public rp2(sp2 sp2Var) {
        this.f42688c = sp2Var;
    }

    public final /* synthetic */ void a() {
        sp2 sp2Var = this.f42688c;
        if (sp2Var.f43043f != null) {
            sp2Var.a();
        }
    }

    public final void b() {
        sp2 sp2Var = this.f42688c;
        if (sp2Var.f43043f == null || (sp2Var.f43042e & 3) == 0) {
            return;
        }
        sp2Var.a();
    }

    public final void c() {
        this.f42688c.f43041d.post(new zl.w0(this, 0));
    }

    public final void d() {
        this.f42688c.f43041d.post(new zl.w0(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z5) {
        if (z5) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.f42686a && this.f42687b == zHasCapability) {
            if (zHasCapability) {
                d();
            }
        } else {
            this.f42686a = true;
            this.f42687b = zHasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
