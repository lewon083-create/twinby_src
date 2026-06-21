package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f15439c;

    public /* synthetic */ c(n nVar, int i) {
        this.f15438b = i;
        this.f15439c = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15438b) {
            case 0:
                this.f15439c.reportFullyDrawn();
                return Unit.f27471a;
            case 1:
                return n.c(this.f15439c);
            case 2:
                a6.a aVar = new a6.a();
                this.f15439c.getNavigationEventDispatcher().a(aVar);
                return aVar;
            case 3:
                n nVar = this.f15439c;
                return new t0(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            default:
                n nVar2 = this.f15439c;
                w wVar = new w(new b(nVar2, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar2.getLifecycle().a(new d(wVar, nVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a0.d(21, nVar2, wVar));
                    }
                }
                return wVar;
        }
    }
}
