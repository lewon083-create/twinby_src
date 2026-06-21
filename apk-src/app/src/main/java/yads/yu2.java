package yads;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yu2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cv2 f45153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(cv2 cv2Var, mj.a aVar) {
        super(2, aVar);
        this.f45153b = cv2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new yu2(this.f45153b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yu2(this.f45153b, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        ((SharedPreferences) ((vg1) wg1.a(this.f45153b.f37518h, "YadPreferenceFile")).f44031d.getValue()).getAll();
        return Unit.f27471a;
    }
}
