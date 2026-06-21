package la;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.g f28091b = new sb.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f28093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28094e;

    public l(int i, int i10, Bundle bundle, int i11) {
        this.f28094e = i11;
        this.f28090a = i;
        this.f28092c = i10;
        this.f28093d = bundle;
    }

    public final boolean a() {
        switch (this.f28094e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(c7.k kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + kVar.toString());
        }
        this.f28091b.a(kVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f28091b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f28092c + " id=" + this.f28090a + " oneWay=" + a() + "}";
    }
}
