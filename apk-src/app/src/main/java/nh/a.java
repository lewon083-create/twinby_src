package nh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.bf;
import ii.g;
import ii.h;
import m3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends BroadcastReceiver implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7.a f29330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f29331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f29332d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bf f29333e;

    public a(Context context, m7.a aVar) {
        this.f29330b = aVar;
    }

    @Override // ii.h
    public final void e(Object obj, g gVar) {
        this.f29331c = gVar;
        bf bfVar = new bf(5, this);
        this.f29333e = bfVar;
        m7.a aVar = this.f29330b;
        ((ConnectivityManager) aVar.f28696c).registerDefaultNetworkCallback(bfVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) aVar.f28696c;
        this.f29332d.post(new c0(6, this, m7.a.o(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // ii.h
    public final void k(Object obj) {
        bf bfVar = this.f29333e;
        if (bfVar != null) {
            ((ConnectivityManager) this.f29330b.f28696c).unregisterNetworkCallback(bfVar);
            this.f29333e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g gVar = this.f29331c;
        if (gVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f29330b.f28696c;
            gVar.b(m7.a.o(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
