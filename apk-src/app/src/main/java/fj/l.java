package fj;

import android.webkit.ValueCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f19371b;

    public /* synthetic */ l(Function1 function1, int i) {
        this.f19370a = i;
        this.f19371b = function1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f19370a) {
            case 0:
                z callback = (z) this.f19371b;
                Intrinsics.checkNotNullParameter(callback, "callback");
                kotlin.jvm.internal.k0.b(1, callback);
                callback.invoke(new ij.m((Boolean) obj));
                break;
            default:
                z callback2 = (z) this.f19371b;
                Intrinsics.checkNotNullParameter(callback2, "callback");
                kotlin.jvm.internal.k0.b(1, callback2);
                callback2.invoke(new ij.m((String) obj));
                break;
        }
    }
}
