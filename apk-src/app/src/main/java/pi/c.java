package pi;

import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.messaging.FirebaseMessaging;
import ge.l;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fd.g f31477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.g f31478d;

    public /* synthetic */ c(fd.g gVar, qi.f fVar, sb.g gVar2) {
        this.f31476b = 2;
        this.f31477c = gVar;
        this.f31478d = gVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31476b;
        sb.g gVar = this.f31478d;
        fd.g gVar2 = this.f31477c;
        switch (i) {
            case 0:
                HashMap map = d.f31479d;
                try {
                    gVar2.a();
                    String str = gVar2.f16759b;
                    gVar2.a();
                    e eVarC = d.c(gVar2.f16760c);
                    Boolean boolValueOf = Boolean.valueOf(gVar2.k());
                    Map map2 = (Map) b4.b(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar2));
                    f fVar = new f();
                    if (str == null) {
                        throw new IllegalStateException("Nonnull field \"name\" is null.");
                    }
                    fVar.f31495a = str;
                    fVar.f31496b = eVarC;
                    fVar.f31497c = boolValueOf;
                    if (map2 == null) {
                        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                    }
                    fVar.f31498d = map2;
                    gVar.b(fVar);
                    return;
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
            case 1:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(gVar2, gVar);
                return;
            case 2:
                try {
                    ge.e eVarC2 = ((l) gVar2.c(l.class)).c();
                    Intrinsics.checkNotNullExpressionValue(eVarC2, "getInstance(...)");
                    HashMap map3 = new HashMap(qi.f.a(eVarC2));
                    HashMap mapB = eVarC2.b();
                    Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                    map3.put("parameters", qi.f.d(mapB));
                    gVar.b(map3);
                    return;
                } catch (Exception e7) {
                    gVar.a(e7);
                    return;
                }
            default:
                try {
                    HashMap map4 = new HashMap();
                    gVar2.a();
                    if (gVar2.f16759b.equals("[DEFAULT]")) {
                        map4.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.c().f14769e.j()));
                    }
                    gVar.b(map4);
                    return;
                } catch (Exception e10) {
                    gVar.a(e10);
                    return;
                }
        }
    }

    public /* synthetic */ c(fd.g gVar, sb.g gVar2, int i) {
        this.f31476b = i;
        this.f31477c = gVar;
        this.f31478d = gVar2;
    }

    public /* synthetic */ c(d dVar, fd.g gVar, sb.g gVar2) {
        this.f31476b = 0;
        this.f31477c = gVar;
        this.f31478d = gVar2;
    }
}
