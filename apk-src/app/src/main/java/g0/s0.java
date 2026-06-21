package g0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final g i = new g("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f19743j = new g("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f19744k = new g("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f19746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r2 f19751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f19752h;

    public s0(ArrayList arrayList, u1 u1Var, int i10, boolean z5, ArrayList arrayList2, boolean z10, r2 r2Var, v vVar) {
        this.f19745a = arrayList;
        this.f19746b = u1Var;
        this.f19747c = i10;
        this.f19749e = Collections.unmodifiableList(arrayList2);
        this.f19750f = z10;
        this.f19751g = r2Var;
        this.f19752h = vVar;
        this.f19748d = z5;
    }

    public final Range a() {
        Range range = (Range) this.f19746b.g(f19744k, n.f19676h);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Object obj = this.f19751g.f19735a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int c() {
        Integer num = (Integer) this.f19746b.g(x2.D, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int d() {
        Integer num = (Integer) this.f19746b.g(x2.E, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
