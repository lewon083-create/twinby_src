package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0051ba f22369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22370b;

    public G1() {
        this(new C0051ba());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f22369a.getClass();
            strA = Ka.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f22370b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f22370b = true;
    }

    public G1(C0051ba c0051ba) {
        this.f22370b = false;
        this.f22369a = c0051ba;
    }
}
