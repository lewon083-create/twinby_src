package uh;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f34476c;

    public /* synthetic */ a(r rVar, int i) {
        this.f34475b = i;
        this.f34476c = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* JADX INFO: renamed from: apply */
    public final Object mo625apply(Object obj) {
        switch (this.f34475b) {
            case 0:
                return r.b(this.f34476c, (LocationManager) obj);
            default:
                return r.a(this.f34476c, (LocationManager) obj);
        }
    }
}
