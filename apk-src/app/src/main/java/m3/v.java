package m3;

import android.os.Handler;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f28600b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f28601a;

    public v(Handler handler) {
        this.f28601a = handler;
    }

    public static u b() {
        u uVar;
        ArrayList arrayList = f28600b;
        synchronized (arrayList) {
            try {
                uVar = arrayList.isEmpty() ? new u() : (u) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public final u a(int i, Object obj) {
        u uVarB = b();
        uVarB.f28599a = this.f28601a.obtainMessage(i, obj);
        return uVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f28601a.post(runnable);
    }

    public final void d(int i) {
        h5.h(i != 0);
        this.f28601a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.f28601a.sendEmptyMessage(i);
    }
}
