package yads;

import android.view.View;
import android.webkit.WebView;
import io.sentry.ProfilingTraceData;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ew3 extends uw3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ew3 f38270d = new ew3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uw3
    public final void a(boolean z5) {
        Iterator it = Collections.unmodifiableCollection(qw3.f42411c.f42412a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((zv3) it.next()).f45556e;
            if (kaVar.f40127b.get() != 0) {
                lx3.f40715a.a((WebView) kaVar.f40127b.get(), "setState", z5 ? "foregrounded" : ProfilingTraceData.TRUNCATION_REASON_BACKGROUNDED, kaVar.f40126a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uw3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(qw3.f42411c.f42413b).iterator();
        while (it.hasNext()) {
            View view = (View) ((zv3) it.next()).f45555d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
