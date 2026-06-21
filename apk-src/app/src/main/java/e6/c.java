package e6;

import a6.j;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.cx0;
import g6.d;
import g6.e;
import g6.f;
import g6.g;
import hk.c0;
import hk.k0;
import i0.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16276a;

    public c(d mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f16276a = mMeasurementManager;
    }

    public static final c b(Context context) {
        d cVar;
        Object objInvoke;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        c6.c cVar2 = c6.c.f2223a;
        sb2.append(i >= 33 ? cVar2.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        if ((i >= 33 ? cVar2.a() : 0) >= 5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) j.B());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
            cVar = new g6.c(j.j(systemService));
        } else {
            c6.b bVar = c6.b.f2222a;
            if (((i == 31 || i == 32) ? bVar.a() : 0) >= 9) {
                g6.b manager = new g6.b(0, context);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("MeasurementManager", "tag");
                Intrinsics.checkNotNullParameter(manager, "manager");
                try {
                    objInvoke = manager.invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i10 = Build.VERSION.SDK_INT;
                    sb3.append((i10 == 31 || i10 == 32) ? bVar.a() : 0);
                    Log.d("MeasurementManager", sb3.toString());
                    objInvoke = null;
                }
                cVar = (d) objInvoke;
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            return new c(cVar);
        }
        return null;
    }

    public ed.d a(g6.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return o.c(c0.b(c0.a(k0.f20682a), new a(this, null, 0), 3));
    }

    public ed.d c() {
        return o.c(c0.b(c0.a(k0.f20682a), new a(this, null, 1), 3));
    }

    public ed.d d(Uri attributionSource, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return o.c(c0.b(c0.a(k0.f20682a), new b(this, attributionSource, inputEvent, null, 0), 3));
    }

    public ed.d e(e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return o.c(c0.b(c0.a(k0.f20682a), new a(this, null, 2), 3));
    }

    public ed.d f(Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return o.c(c0.b(c0.a(k0.f20682a), new cx0(this, trigger, null, 2), 3));
    }

    public ed.d g(f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return o.c(c0.b(c0.a(k0.f20682a), new a(this, null, 3), 3));
    }

    public ed.d h(g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return o.c(c0.b(c0.a(k0.f20682a), new a(this, null, 4), 3));
    }
}
