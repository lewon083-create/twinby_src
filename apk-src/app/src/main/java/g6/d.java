package g6;

import aj.i;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import hk.c0;
import hk.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f20007a;

    public d(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f20007a = mMeasurementManager;
    }

    public static Object b(d dVar, a aVar, mj.a aVar2) {
        new l(1, nj.f.b(aVar2)).t();
        MeasurementManager measurementManager = dVar.f20007a;
        throw null;
    }

    public static Object d(d dVar, mj.a frame) {
        l lVar = new l(1, nj.f.b(frame));
        lVar.t();
        dVar.f20007a.getMeasurementApiStatus(new com.yandex.div.core.dagger.b(1), new c2.d(lVar));
        Object objS = lVar.s();
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS;
    }

    public static Object g(d dVar, Uri uri, InputEvent inputEvent, mj.a frame) {
        l lVar = new l(1, nj.f.b(frame));
        lVar.t();
        dVar.f20007a.registerSource(uri, inputEvent, new com.yandex.div.core.dagger.b(1), new c2.d(lVar));
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS == aVar ? objS : Unit.f27471a;
    }

    public static Object h(d dVar, e eVar, mj.a aVar) throws Throwable {
        Object objE = c0.e(new i(dVar, null, 3), aVar);
        return objE == nj.a.f29512b ? objE : Unit.f27471a;
    }

    public static Object j(d dVar, Uri uri, mj.a frame) {
        l lVar = new l(1, nj.f.b(frame));
        lVar.t();
        dVar.f20007a.registerTrigger(uri, new com.yandex.div.core.dagger.b(1), new c2.d(lVar));
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS == aVar ? objS : Unit.f27471a;
    }

    public static Object l(d dVar, f fVar, mj.a aVar) {
        new l(1, nj.f.b(aVar)).t();
        MeasurementManager measurementManager = dVar.f20007a;
        throw null;
    }

    public static Object n(d dVar, g gVar, mj.a aVar) {
        new l(1, nj.f.b(aVar)).t();
        MeasurementManager measurementManager = dVar.f20007a;
        throw null;
    }

    public Object a(a aVar, mj.a aVar2) {
        return b(this, aVar, aVar2);
    }

    public Object c(mj.a aVar) {
        return d(this, aVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, mj.a aVar) {
        return g(this, uri, inputEvent, aVar);
    }

    public Object f(e eVar, mj.a aVar) {
        return h(this, eVar, aVar);
    }

    public Object i(Uri uri, mj.a aVar) {
        return j(this, uri, aVar);
    }

    public Object k(f fVar, mj.a aVar) {
        return l(this, fVar, aVar);
    }

    public Object m(g gVar, mj.a aVar) {
        return n(this, gVar, aVar);
    }
}
