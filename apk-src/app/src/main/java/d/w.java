package d;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f15481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.p f15482b = ij.h.b(new q0(2, this));

    public w(Runnable runnable) {
        this.f15481a = runnable;
    }

    public final void a(androidx.lifecycle.u owner, s onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.p lifecycle = owner.getLifecycle();
        if (((androidx.lifecycle.w) lifecycle).f1606c == androidx.lifecycle.o.f1573b) {
            return;
        }
        r handler = onBackPressedCallback.createNavigationEventHandler$activity(new t(owner, onBackPressedCallback));
        handler.b(false);
        a6.c dispatcher = b().f15478c;
        dispatcher.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (dispatcher.f450c.add(handler)) {
            a6.g gVar = dispatcher.f449b;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (handler.f15473e != null) {
                throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
            }
            gVar.f460e.addFirst(handler);
            handler.f15473e = dispatcher;
            gVar.b();
        }
        v vVar = new v(handler, this, lifecycle);
        lifecycle.a(vVar);
        onBackPressedCallback.addCloseable$activity(vVar);
    }

    public final u b() {
        return (u) this.f15482b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "invoker");
        a6.c cVar = b().f15478c;
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        cVar.b(new a6.l(onBackInvokedDispatcher, 0), 1);
        a6.c cVar2 = b().f15478c;
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        cVar2.b(new a6.l(onBackInvokedDispatcher, 1000000), 0);
    }
}
