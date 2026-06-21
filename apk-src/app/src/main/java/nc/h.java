package nc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29246a;

    public h(float f10) {
        this.f29246a = f10;
    }

    @Override // nc.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f29246a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f29246a == ((h) obj).f29246a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29246a)});
    }
}
