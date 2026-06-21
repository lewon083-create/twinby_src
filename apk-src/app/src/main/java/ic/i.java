package ic;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21280c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f21282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kc.d f21283f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f21278a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc.b f21279b = new dc.b(1, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21281d = true;

    public i(dc.f fVar) {
        this.f21282e = new WeakReference(null);
        this.f21282e = new WeakReference(fVar);
    }
}
