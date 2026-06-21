package ad;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a1 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f899c = new z0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z0 f900d = new z0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f901b;

    public /* synthetic */ z0(int i) {
        this.f901b = i;
    }

    @Override // ad.a1
    public final a1 a() {
        switch (this.f901b) {
            case 0:
                return f900d;
            default:
                return f899c;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f901b) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f901b) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
