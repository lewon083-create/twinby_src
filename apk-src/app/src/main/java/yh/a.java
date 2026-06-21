package yh;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f45620a;

    public a(FlutterEngine flutterEngine) {
        this.f45620a = flutterEngine;
    }

    @Override // yh.b
    public final void b() {
        FlutterEngine flutterEngine = this.f45620a;
        Iterator it = flutterEngine.f25560u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        q qVar = flutterEngine.f25557r;
        SparseArray sparseArray = qVar.f25738m;
        while (sparseArray.size() > 0) {
            qVar.f25749x.s(sparseArray.keyAt(0));
        }
        p pVar = flutterEngine.f25558s;
        SparseArray sparseArray2 = pVar.f25719j;
        while (sparseArray2.size() > 0) {
            pVar.f25726q.s(sparseArray2.keyAt(0));
        }
        flutterEngine.f25549j.f20600e = null;
    }

    @Override // yh.b
    public final void a() {
    }
}
