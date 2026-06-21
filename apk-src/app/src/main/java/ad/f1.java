package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f794f;

    public f1(Object[] objArr, int i, int i10) {
        this.f792d = objArr;
        this.f793e = i;
        this.f794f = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h5.l(i, this.f794f);
        Object obj = this.f792d[(i * 2) + this.f793e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ad.f0
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f794f;
    }
}
