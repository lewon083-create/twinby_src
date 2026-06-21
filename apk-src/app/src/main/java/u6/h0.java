package u6;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f34284a;

    public h0(ViewGroup viewGroup) {
        this.f34284a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && ((h0) obj).f34284a.equals(this.f34284a);
    }

    public final int hashCode() {
        return this.f34284a.hashCode();
    }
}
