package f6;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import c6.b;
import c6.c;
import com.google.android.gms.internal.ads.cx0;
import ed.d;
import h6.e;
import h6.f;
import h6.h;
import hk.c0;
import hk.k0;
import i0.o;
import kotlin.jvm.internal.Intrinsics;
import mk.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16663a;

    public a(h mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f16663a = mTopicsManager;
    }

    public static final a a(Context context) {
        h fVar;
        Object objInvoke;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Build.VERSION.SDK_INT;
        c cVar = c.f2223a;
        if ((i >= 33 ? cVar.a() : 0) >= 11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) e.m());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
            fVar = new f(e.d(systemService), 2);
        } else {
            if ((i >= 33 ? cVar.a() : 0) >= 5) {
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService2 = context.getSystemService((Class<Object>) e.m());
                Intrinsics.checkNotNullExpressionValue(systemService2, "context.getSystemService…opicsManager::class.java)");
                fVar = new f(e.d(systemService2), 4);
            } else {
                if ((i >= 33 ? cVar.a() : 0) == 4) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Object systemService3 = context.getSystemService((Class<Object>) e.m());
                    Intrinsics.checkNotNullExpressionValue(systemService3, "context.getSystemService…opicsManager::class.java)");
                    fVar = new f(e.d(systemService3), 3);
                } else {
                    b bVar = b.f2222a;
                    if (((i == 31 || i == 32) ? bVar.a() : 0) >= 11) {
                        g6.b manager = new g6.b(1, context);
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter("TopicsManager", "tag");
                        Intrinsics.checkNotNullParameter(manager, "manager");
                        try {
                            objInvoke2 = manager.invoke(context);
                        } catch (NoClassDefFoundError unused) {
                            StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                            int i10 = Build.VERSION.SDK_INT;
                            sb2.append((i10 == 31 || i10 == 32) ? bVar.a() : 0);
                            Log.d("TopicsManager", sb2.toString());
                            objInvoke2 = null;
                        }
                        fVar = (h) objInvoke2;
                    } else {
                        if (((i == 31 || i == 32) ? bVar.a() : 0) >= 9) {
                            g6.b manager2 = new g6.b(2, context);
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter("TopicsManager", "tag");
                            Intrinsics.checkNotNullParameter(manager2, "manager");
                            try {
                                objInvoke = manager2.invoke(context);
                            } catch (NoClassDefFoundError unused2) {
                                StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                                int i11 = Build.VERSION.SDK_INT;
                                sb3.append((i11 == 31 || i11 == 32) ? bVar.a() : 0);
                                Log.d("TopicsManager", sb3.toString());
                                objInvoke = null;
                            }
                            fVar = (h) objInvoke;
                        } else {
                            fVar = null;
                        }
                    }
                }
            }
        }
        if (fVar != null) {
            return new a(fVar);
        }
        return null;
    }

    public d b(h6.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ok.e eVar = k0.f20682a;
        return o.c(c0.b(c0.a(n.f28934a), new cx0(this, request, null, 3), 3));
    }
}
