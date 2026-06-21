package hk;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj.a f20690e;

    public l1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f20690e = nj.f.a(function2, this, this);
    }

    @Override // hk.k1
    public final void N() {
        try {
            mj.a aVarB = nj.f.b(this.f20690e);
            ij.k kVar = ij.m.f21341c;
            mk.a.g(Unit.f27471a, aVarB);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            resumeWith(h5.s(th2));
            throw th2;
        }
    }
}
