package s;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputConfiguration f32370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageReader f32371c;

    public d(OutputConfiguration value, ImageReader imageReader) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f32370b = value;
        this.f32371c = imageReader;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.f32371c;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f32370b, dVar.f32370b) && Intrinsics.a(this.f32371c, dVar.f32371c);
    }

    public final int hashCode() {
        int iHashCode = this.f32370b.hashCode() * 31;
        ImageReader imageReader = this.f32371c;
        return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.f32370b + ", backingImageReader=" + this.f32371c + ')';
    }
}
