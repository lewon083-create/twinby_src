package s0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f32384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f32387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f32388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32390g;

    public b(UUID uuid, int i, int i10, Rect rect, Size size, int i11, boolean z5) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f32384a = uuid;
        this.f32385b = i;
        this.f32386c = i10;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f32387d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f32388e = size;
        this.f32389f = i11;
        this.f32390g = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32384a.equals(bVar.f32384a) && this.f32385b == bVar.f32385b && this.f32386c == bVar.f32386c && this.f32387d.equals(bVar.f32387d) && this.f32388e.equals(bVar.f32388e) && this.f32389f == bVar.f32389f && this.f32390g == bVar.f32390g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f32384a.hashCode() ^ 1000003) * 1000003) ^ this.f32385b) * 1000003) ^ this.f32386c) * 1000003) ^ this.f32387d.hashCode()) * 1000003) ^ this.f32388e.hashCode()) * 1000003) ^ this.f32389f) * 1000003) ^ (this.f32390g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.f32384a + ", getTargets=" + this.f32385b + ", getFormat=" + this.f32386c + ", getCropRect=" + this.f32387d + ", getSize=" + this.f32388e + ", getRotationDegrees=" + this.f32389f + ", isMirroring=" + this.f32390g + ", shouldRespectInputCropRect=false}";
    }
}
