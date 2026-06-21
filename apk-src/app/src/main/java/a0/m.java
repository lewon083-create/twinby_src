package a0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f167f;

    public m(Rect rect, int i, int i10, boolean z5, Matrix matrix, boolean z10) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f162a = rect;
        this.f163b = i;
        this.f164c = i10;
        this.f165d = z5;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f166e = matrix;
        this.f167f = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f162a.equals(mVar.f162a) && this.f163b == mVar.f163b && this.f164c == mVar.f164c && this.f165d == mVar.f165d && this.f166e.equals(mVar.f166e) && this.f167f == mVar.f167f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f162a.hashCode() ^ 1000003) * 1000003) ^ this.f163b) * 1000003) ^ this.f164c) * 1000003) ^ (this.f165d ? 1231 : 1237)) * 1000003) ^ this.f166e.hashCode()) * 1000003) ^ (this.f167f ? 1231 : 1237);
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f162a + ", getRotationDegrees=" + this.f163b + ", getTargetRotation=" + this.f164c + ", hasCameraTransform=" + this.f165d + ", getSensorToBufferTransform=" + this.f166e + ", isMirroring=" + this.f167f + "}";
    }
}
