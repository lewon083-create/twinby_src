package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bf extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3768b;

    public /* synthetic */ bf(int i, Object obj) {
        this.f3767a = i;
        this.f3768b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f3767a) {
            case 1:
                ((bx) this.f3768b).f3954p.set(true);
                break;
            case 2:
                ((ft0) this.f3768b).a(true);
                break;
            case 3:
                ((lt0) this.f3768b).b(true);
                break;
            case 4:
            default:
                super.onAvailable(network);
                break;
            case 5:
                nh.a aVar = (nh.a) this.f3768b;
                aVar.f29332d.post(new m3.c0(6, aVar, m7.a.o(((ConnectivityManager) aVar.f29330b.f28696c).getNetworkCapabilities(network))));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f3767a) {
            case 0:
                synchronized (cf.class) {
                    ((cf) this.f3768b).f4193c = networkCapabilities;
                    break;
                }
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 4:
                c21 c21Var = (c21) this.f3768b;
                synchronized (c21Var) {
                    c21Var.f4004d = networkCapabilities;
                    break;
                }
                return;
            case 5:
                nh.a aVar = (nh.a) this.f3768b;
                aVar.f29330b.getClass();
                aVar.f29332d.post(new m3.c0(6, aVar, m7.a.o(networkCapabilities)));
                return;
            case 6:
                l7.n.g().e(s7.e.i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                s7.e eVar = (s7.e) this.f3768b;
                eVar.c(eVar.f());
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f3767a) {
            case 0:
                synchronized (cf.class) {
                    ((cf) this.f3768b).f4193c = null;
                    break;
                }
                return;
            case 1:
                ((bx) this.f3768b).f3954p.set(false);
                return;
            case 2:
                ((ft0) this.f3768b).a(false);
                return;
            case 3:
                ((lt0) this.f3768b).b(false);
                return;
            case 4:
                c21 c21Var = (c21) this.f3768b;
                synchronized (c21Var) {
                    c21Var.f4004d = null;
                    break;
                }
                return;
            case 5:
                nh.a aVar = (nh.a) this.f3768b;
                aVar.f29332d.postDelayed(new io.appmetrica.analytics.impl.lp(13, aVar), 500L);
                return;
            default:
                l7.n.g().e(s7.e.i, "Network connection lost", new Throwable[0]);
                s7.e eVar = (s7.e) this.f3768b;
                eVar.c(eVar.f());
                return;
        }
    }

    public bf(bx bxVar) {
        this.f3767a = 1;
        Objects.requireNonNull(bxVar);
        this.f3768b = bxVar;
    }

    public bf(ft0 ft0Var) {
        this.f3767a = 2;
        Objects.requireNonNull(ft0Var);
        this.f3768b = ft0Var;
    }

    public bf(lt0 lt0Var) {
        this.f3767a = 3;
        Objects.requireNonNull(lt0Var);
        this.f3768b = lt0Var;
    }
}
