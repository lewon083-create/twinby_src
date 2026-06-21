package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tw3 f42758c;

    public rw3(tw3 tw3Var, float f10) {
        this.f42758c = tw3Var;
        this.f42757b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        mx3 mx3Var = this.f42758c.f43459b.f45182e;
        float f10 = this.f42757b;
        mx3Var.f41100a = f10;
        if (mx3Var.f41104e == null) {
            mx3Var.f41104e = qw3.f42411c;
        }
        Iterator it = Collections.unmodifiableCollection(mx3Var.f41104e.f42413b).iterator();
        while (it.hasNext()) {
            ka kaVar = ((zv3) it.next()).f45556e;
            lx3.f40715a.a((WebView) kaVar.f40127b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f40126a);
        }
    }
}
