package w1;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f34985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f34986b;

    public i(Resources resources, Resources.Theme theme) {
        this.f34985a = resources;
        this.f34986b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f34985a.equals(iVar.f34985a) && Objects.equals(this.f34986b, iVar.f34986b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34985a, this.f34986b);
    }
}
