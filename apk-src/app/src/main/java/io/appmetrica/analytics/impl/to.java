package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class to implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D8 f24820a;

    public to() {
        this(new D8());
    }

    @Override // io.appmetrica.analytics.impl.so
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C0264jh c0264jh) {
        if (!((Y4) c0264jh.f24161l).B() && !TextUtils.isEmpty(o82.f22776b)) {
            try {
                JSONObject jSONObject = new JSONObject(o82.f22776b);
                jSONObject.remove("preloadInfo");
                o82.f22776b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f24820a.a(o82, c0264jh);
    }

    public to(D8 d82) {
        this.f24820a = d82;
    }
}
