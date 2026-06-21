package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseImportantLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f25207a;

    public BaseImportantLogger(@NonNull String str) {
        this.f25207a = new c(new d(str), new a(), new b());
    }

    public void info(@NonNull String str, String str2, Object... objArr) {
        c cVar = this.f25207a;
        cVar.f25214b.getClass();
        for (String str3 : cVar.f25215c.a(a.a(str, str2, objArr))) {
            String str4 = cVar.f25213a.f25216a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
