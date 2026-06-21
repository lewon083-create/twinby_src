package vi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34862b;

    public a(Integer num, ArrayList arrayList) {
        this.f34861a = num;
        this.f34862b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f34861a, aVar.f34861a) && Objects.equals(this.f34862b, aVar.f34862b);
    }

    public final int hashCode() {
        return Objects.hash(this.f34861a, this.f34862b);
    }
}
