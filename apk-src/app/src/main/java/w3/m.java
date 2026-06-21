package w3;

import ad.j0;
import com.google.android.gms.internal.measurement.h5;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.o f35076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f35077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f35079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f35080f;

    public m(j3.o oVar, List list, s sVar, List list2) {
        h5.h(!list.isEmpty());
        this.f35076b = oVar;
        this.f35077c = j0.r(list);
        this.f35079e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f35080f = sVar.a(this);
        long j10 = sVar.f35096c;
        long j11 = sVar.f35095b;
        String str = z.f28608a;
        this.f35078d = z.U(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract v3.g c();

    public abstract j d();
}
