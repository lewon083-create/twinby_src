package t3;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f33465c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.d f33467b;

    static {
        new j("");
        f33465c = new j("preload");
    }

    public j(String str) {
        m4.d dVar;
        this.f33466a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new m4.d();
            dVar.f28630b = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            dVar = null;
        }
        this.f33467b = dVar;
    }

    public final synchronized LogSessionId a() {
        m4.d dVar;
        dVar = this.f33467b;
        dVar.getClass();
        return (LogSessionId) dVar.f28630b;
    }
}
