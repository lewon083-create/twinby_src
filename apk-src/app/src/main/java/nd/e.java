package nd;

import android.graphics.Point;
import android.view.Display;
import java.util.concurrent.Callable;
import m3.c0;
import yads.vs2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29316e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f29313b = i;
        this.f29314c = obj;
        this.f29315d = obj2;
        this.f29316e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f29313b) {
            case 0:
                return ((f) this.f29314c).f29317b.submit(new c0(5, (Callable) this.f29315d, (m4.d) this.f29316e));
            default:
                return vs2.a((Display) this.f29314c, (Point) this.f29315d, (vs2) this.f29316e);
        }
    }
}
