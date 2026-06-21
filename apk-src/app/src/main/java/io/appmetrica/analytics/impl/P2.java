package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P2 implements InterfaceC0292kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f22824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f22825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5 f22826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f22827e;

    public P2(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f22823a.add(consumer);
        return this.f22824b;
    }

    public final void b() {
        this.f22824b = null;
        H5 h52 = this.f22826d;
        Context context = this.f22825c;
        synchronized (h52) {
            if (h52.f22413b) {
                try {
                    context.unregisterReceiver(h52.f22412a);
                    h52.f22413b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f22824b = intentA;
        Iterator it = this.f22823a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final synchronized void onDestroy() {
        this.f22824b = null;
        b();
        Iterator it = this.f22823a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public P2(Context context, IHandlerExecutor iHandlerExecutor, int i) {
        this.f22823a = new ArrayList();
        this.f22824b = null;
        this.f22825c = context;
        this.f22827e = iHandlerExecutor;
        this.f22826d = G5.a(new C0523u2(new O2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        H5 h52 = this.f22826d;
        Context context = this.f22825c;
        IHandlerExecutor iHandlerExecutor = this.f22827e;
        synchronized (h52) {
            intentRegisterReceiver = null;
            try {
                intentRegisterReceiver = context.registerReceiver(h52.f22412a, intentFilter, null, iHandlerExecutor.getHandler());
                h52.f22413b = true;
            } catch (Throwable unused) {
            }
        }
        return intentRegisterReceiver;
    }
}
