package n2;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f29010b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f29011c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f29013e;

    public e(boolean z5, c cVar) {
        this.f29012d = z5;
        this.f29013e = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        le.a aVar = (le.a) this.f29013e;
        aVar.getClass();
        Rect rect = this.f29010b;
        ((h2.f) obj).f(rect);
        aVar.getClass();
        Rect rect2 = this.f29011c;
        ((h2.f) obj2).f(rect2);
        int i = rect.top;
        int i10 = rect2.top;
        if (i < i10) {
            return -1;
        }
        if (i > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z5 = this.f29012d;
        if (i11 < i12) {
            return z5 ? 1 : -1;
        }
        if (i11 > i12) {
            return z5 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z5 ? 1 : -1;
        }
        if (i15 > i16) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
