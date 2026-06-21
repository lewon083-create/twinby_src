package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Af f22438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f22439b;

    public I3(Af af2, CounterConfiguration counterConfiguration) {
        this.f22438a = af2;
        this.f22439b = counterConfiguration;
    }

    public static I3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Af af2;
        String str = Af.f22071c;
        if (bundle != null) {
            try {
                af2 = (Af) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
                af2 = null;
            }
        } else {
            af2 = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || af2 == null || !context.getPackageName().equals(af2.f22072a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || af2.f22072a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new I3(af2, counterConfigurationFromBundle);
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.f22439b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f22438a + ", mCounterConfiguration=" + this.f22439b + '}';
    }

    @NonNull
    public final Af a() {
        return this.f22438a;
    }
}
