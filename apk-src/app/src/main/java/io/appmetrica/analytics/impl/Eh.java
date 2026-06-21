package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Eh extends I3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected E8 f22293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C0511tf f22294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22296f;

    public Eh(@NonNull Af af2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e82) {
        this(af2, counterConfiguration, e82, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f22439b.toBundle(bundle);
        Af af2 = this.f22438a;
        synchronized (af2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", af2);
        }
        return bundle;
    }

    public final synchronized String d() {
        E8 e82;
        e82 = this.f22293c;
        return e82.f22284a.isEmpty() ? null : new JSONObject(e82.f22284a).toString();
    }

    public final synchronized String e() {
        return this.f22296f;
    }

    public boolean f() {
        return this.f22295e;
    }

    public Eh(@NonNull Af af2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e82, String str) {
        super(af2, counterConfiguration);
        this.f22295e = true;
        this.f22296f = str;
        this.f22293c = e82;
    }
}
