package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1563b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1565d;

    public g(DefaultLifecycleObserver defaultLifecycleObserver, s sVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f1564c = defaultLifecycleObserver;
        this.f1565d = sVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u source, n event) {
        switch (this.f1563b) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f1564c;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (f.f1562a[event.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(source);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(source);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(source);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(source);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(source);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new ij.j();
                }
                s sVar = (s) this.f1565d;
                if (sVar != null) {
                    sVar.d(source, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == n.ON_START) {
                    ((p) this.f1564c).b(this);
                    ((o6.e) this.f1565d).d();
                    return;
                }
                return;
            default:
                HashMap map = ((c) this.f1565d).f1540a;
                List list = (List) map.get(event);
                Object obj = this.f1564c;
                c.a(list, source, event, obj);
                c.a((List) map.get(n.ON_ANY), source, event, obj);
                return;
        }
    }

    public g(t tVar) {
        this.f1564c = tVar;
        e eVar = e.f1559c;
        Class<?> cls = tVar.getClass();
        c cVar = (c) eVar.f1560a.get(cls);
        this.f1565d = cVar == null ? eVar.a(cls, null) : cVar;
    }

    public g(p pVar, o6.e eVar) {
        this.f1564c = pVar;
        this.f1565d = eVar;
    }
}
