package v;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputConfiguration f34617a;

    public e(Object obj) {
        this.f34617a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Objects.equals(this.f34617a, ((e) obj).f34617a);
    }

    public final int hashCode() {
        return this.f34617a.hashCode();
    }

    public final String toString() {
        return this.f34617a.toString();
    }
}
