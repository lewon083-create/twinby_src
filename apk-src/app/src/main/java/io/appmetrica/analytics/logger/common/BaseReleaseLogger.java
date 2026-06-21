package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f25208d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f25210b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f25211c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f25211c = new c(new d(str), new a(), new b());
        this.f25209a = str2;
    }

    public static void init(@NonNull Context context) {
        f25208d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f25210b) {
            c cVar = this.f25211c;
            String prefix = getPrefix();
            cVar.f25214b.getClass();
            for (String str2 : cVar.f25215c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f25213a.f25216a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f25208d + this.f25209a;
    }

    public void info(String str, Object... objArr) {
        if (this.f25210b) {
            c cVar = this.f25211c;
            String prefix = getPrefix();
            cVar.f25214b.getClass();
            for (String str2 : cVar.f25215c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f25213a.f25216a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z5) {
        this.f25210b = z5;
    }

    public void warning(String str, Object... objArr) {
        if (this.f25210b) {
            c cVar = this.f25211c;
            String prefix = getPrefix();
            cVar.f25214b.getClass();
            for (String str2 : cVar.f25215c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f25213a.f25216a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th2, String str, Object... objArr) {
        if (this.f25210b) {
            c cVar = this.f25211c;
            String prefix = getPrefix();
            cVar.f25214b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f25215c.a(a.a(prefix, sb2.toString(), objArr))) {
                String str3 = cVar.f25213a.f25216a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
