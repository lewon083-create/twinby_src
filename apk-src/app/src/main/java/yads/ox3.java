package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ox3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ox3 f41764d = new ox3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f41765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41766b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41767c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z5, boolean z10) {
        if ((z10 || z5) == (this.f41767c || this.f41766b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(qw3.f42411c.f42412a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((zv3) it.next()).f45556e;
            boolean z11 = z10 || z5;
            if (kaVar.f40127b.get() != 0) {
                lx3.f40715a.a((WebView) kaVar.f40127b.get(), "setDeviceLockState", z11 ? "locked" : "unlocked");
            }
        }
    }

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f41765a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f41766b, zIsDeviceLocked);
        this.f41767c = zIsDeviceLocked;
    }
}
