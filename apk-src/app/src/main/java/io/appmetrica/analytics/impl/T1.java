package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class T1 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22982a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C0653z7 f22983b = null;

    public final void a(@NonNull C0653z7 c0653z7) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f22983b = c0653z7;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC0029ae) it.next()).consume(c0653z7);
        }
    }

    public final void b() {
        C0071c4.l().f23539e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0071c4.l().f23539e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        S1 s12 = new S1(dataString);
        synchronized (this) {
            try {
                C0653z7 c0653z7 = this.f22983b;
                if (c0653z7 == null) {
                    this.f22982a.add(s12);
                } else {
                    ((A9) C0071c4.l().f23537c.a()).f22059b.post(new Q1(s12, c0653z7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f22982a);
        this.f22982a.clear();
        return arrayList;
    }
}
