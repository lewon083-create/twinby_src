package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f34619a;

    public h(int i, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f34619a = new o(new OutputConfiguration(i, surface));
            return;
        }
        if (i10 >= 28) {
            this.f34619a = new n(new m(new OutputConfiguration(i, surface)));
        } else if (i10 >= 26) {
            this.f34619a = new l(new k(new OutputConfiguration(i, surface)));
        } else {
            this.f34619a = new j(new i(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f34619a.equals(((h) obj).f34619a);
    }

    public final int hashCode() {
        return this.f34619a.f34624a.hashCode();
    }

    public h(j jVar) {
        this.f34619a = jVar;
    }
}
