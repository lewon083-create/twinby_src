package yh;

import android.content.Context;
import com.google.android.gms.internal.ads.gn0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.q;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45623a = new ArrayList();

    public d(Context context, String[] strArr) {
        ci.e eVar = (ci.e) u7.f.q().f34322c;
        if (eVar.f2293b) {
            return;
        }
        eVar.d(context.getApplicationContext());
        eVar.a(context.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(gn0 gn0Var) {
        FlutterEngine flutterEngine;
        Context context = (Context) gn0Var.f5875d;
        zh.a aVar = (zh.a) gn0Var.f5877f;
        String str = (String) gn0Var.f5876e;
        ArrayList arrayList = (ArrayList) gn0Var.f5878g;
        q qVar = new q();
        boolean z5 = gn0Var.f5873b;
        boolean z10 = gn0Var.f5874c;
        if (aVar == null) {
            ci.e eVar = (ci.e) u7.f.q().f34322c;
            if (!eVar.f2293b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new zh.a((String) ((ci.b) eVar.f2295d).f2282c, SentryThread.JsonKeys.MAIN);
        }
        ArrayList arrayList2 = this.f45623a;
        if (arrayList2.size() == 0) {
            flutterEngine = new FlutterEngine(context, null, qVar, null, z5, z10);
            if (str != null) {
                ((ii.q) flutterEngine.i.f491c).a("setInitialRoute", str, null);
            }
            flutterEngine.f25543c.c(aVar, arrayList);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList2.get(0);
            if (!flutterEngine2.f25541a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            flutterEngine = new FlutterEngine(context, flutterEngine2.f25541a.spawn(aVar.f46273c, aVar.f46272b, str, arrayList, FlutterEngine.f25539x), qVar, null, z5, z10);
        }
        arrayList2.add(flutterEngine);
        flutterEngine.f25560u.add(new c(this, flutterEngine));
        return flutterEngine;
    }
}
