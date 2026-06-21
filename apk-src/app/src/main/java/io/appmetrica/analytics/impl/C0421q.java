package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0421q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f24597a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0396p enumC0396p) {
        if (activity != null && this.f24597a.get(activity) == enumC0396p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f24597a.put(activity, enumC0396p);
        return true;
    }
}
