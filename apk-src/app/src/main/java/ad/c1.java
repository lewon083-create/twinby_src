package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f775d;

    public c1(d1 d1Var) {
        this.f775d = d1Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d1 d1Var = this.f775d;
        h5.l(i, d1Var.f783g);
        Object[] objArr = d1Var.f782f;
        int i10 = i * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // ad.f0
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f775d.f783g;
    }
}
