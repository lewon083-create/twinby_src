package g2;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f19864a;

    public h(DisplayCutout displayCutout) {
        this.f19864a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f19864a, ((h) obj).f19864a);
    }

    public final int hashCode() {
        return this.f19864a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f19864a + "}";
    }
}
