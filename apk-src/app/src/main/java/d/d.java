package d;

import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f15440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f15441c;

    public /* synthetic */ d(w wVar, n nVar) {
        this.f15440b = wVar;
        this.f15441c = nVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.n.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f15441c.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f15440b.c(onBackInvokedDispatcher);
        }
    }
}
