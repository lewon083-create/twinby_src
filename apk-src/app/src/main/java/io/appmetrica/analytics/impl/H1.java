package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class H1 {
    public static Intent a(Context context) {
        C0034aj c0034aj;
        C0071c4.l().f23554u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(H7.f22415b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Af.f22071c).build());
        C0071c4 c0071c4L = C0071c4.l();
        synchronized (c0071c4L) {
            try {
                if (c0071c4L.f23548o == null) {
                    C0034aj c0034aj2 = new C0034aj();
                    c0071c4L.f23548o = c0034aj2;
                    c0071c4L.f23542h.a(c0034aj2);
                }
                c0034aj = c0071c4L.f23548o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScreenInfo screenInfoB = c0034aj.b(context);
        return data.putExtra("screen_size", screenInfoB != null ? AbstractC0207hb.a(screenInfoB) : null);
    }
}
