package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends Service implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f1613b = new ka.k(this);

    @Override // androidx.lifecycle.u
    public final p getLifecycle() {
        return (w) this.f1613b.f27324c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ka.k kVar = this.f1613b;
        kVar.getClass();
        kVar.P(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ka.k kVar = this.f1613b;
        kVar.getClass();
        kVar.P(n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ka.k kVar = this.f1613b;
        kVar.getClass();
        kVar.P(n.ON_STOP);
        kVar.P(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        ka.k kVar = this.f1613b;
        kVar.getClass();
        kVar.P(n.ON_START);
        super.onStart(intent, i);
    }
}
