package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34624a;

    public j(Object obj) {
        this.f34624a = obj;
    }

    public void a(Surface surface) {
        if (e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public void b() {
        ((i) this.f34624a).f34622c = true;
    }

    public Object c() {
        Object obj = this.f34624a;
        f2.g.b(obj instanceof i);
        return ((i) obj).f34620a;
    }

    public String d() {
        return ((i) this.f34624a).f34621b;
    }

    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return Objects.equals(this.f34624a, ((j) obj).f34624a);
    }

    public boolean f() {
        return ((i) this.f34624a).f34622c;
    }

    public void g(long j10) {
        ((i) this.f34624a).f34623d = j10;
    }

    public final int hashCode() {
        return this.f34624a.hashCode();
    }

    public void i(String str) {
        ((i) this.f34624a).f34621b = str;
    }

    public void h(int i) {
    }

    public void j(long j10) {
    }
}
