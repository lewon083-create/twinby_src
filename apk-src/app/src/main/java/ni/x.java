package ni;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f29499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context) {
        super(context);
        this.f29499a = zVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        z zVar = this.f29499a;
        int iA = zVar.a();
        int i10 = zVar.f29508b;
        c cVar = zVar.f29507a;
        if (!t.z.a(iA, i10)) {
            cVar.f29359a.l(new y(cVar, zVar, iA));
        }
        zVar.f29508b = iA;
    }
}
