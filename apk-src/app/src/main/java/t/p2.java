package t;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.i f33220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.i f33221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0.c f33222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33223d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33224e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0.e2 f33227h;
    public a0.l2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ka.k f33228j;

    public p2(u.i iVar, j0.i iVar2) {
        boolean z5;
        this.f33225f = false;
        this.f33226g = false;
        this.f33220a = iVar;
        this.f33221b = iVar2;
        int[] iArr = (int[]) iVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        } else {
            z5 = false;
        }
        this.f33225f = z5;
        this.f33226g = w.a.f34941a.i(ZslDisablerQuirk.class) != null;
        this.f33222c = new p0.c(3, new qg.a(28));
    }

    public final void a() {
        a0.e2 e2Var = this.f33227h;
        if (e2Var != null) {
            e2Var.h();
            this.f33227h = null;
        }
        ka.k kVar = this.f33228j;
        if (kVar != null) {
            ((AtomicBoolean) kVar.f27325d).set(false);
            this.f33228j = null;
        }
        while (true) {
            p0.c cVar = this.f33222c;
            if (cVar.g()) {
                break;
            } else {
                ((a0.r1) cVar.b()).close();
            }
        }
        a0.l2 l2Var = this.i;
        if (l2Var != null) {
            l2Var.a();
            this.i = null;
        }
    }
}
