package nc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f29205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29206b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f29205a;
            f10 += ((b) cVar).f29206b;
        }
        this.f29205a = cVar;
        this.f29206b = f10;
    }

    @Override // nc.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f29205a.a(rectF) + this.f29206b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29205a.equals(bVar.f29205a) && this.f29206b == bVar.f29206b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29205a, Float.valueOf(this.f29206b)});
    }
}
