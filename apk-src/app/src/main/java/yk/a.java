package yk;

import android.os.Build;
import ei.b;
import hi.g;
import ii.n;
import ii.o;
import ii.p;
import ii.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements b, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f45750b;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        q qVar = new q(aVar.f16383c, "flutter_native_splash");
        this.f45750b = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f45750b.b(null);
    }

    @Override // ii.o
    public final void onMethodCall(n nVar, p pVar) {
        if (!nVar.f21315a.equals("getPlatformVersion")) {
            ((g) pVar).a();
            return;
        }
        ((g) pVar).success("Android " + Build.VERSION.RELEASE);
    }
}
