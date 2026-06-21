package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b1 f768f = new b1(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f770e;

    public b1(int i, Object[] objArr) {
        this.f769d = objArr;
        this.f770e = i;
    }

    @Override // ad.j0, ad.f0
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f769d;
        int i10 = this.f770e;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // ad.f0
    public final Object[] e() {
        return this.f769d;
    }

    @Override // ad.f0
    public final int f() {
        return this.f770e;
    }

    @Override // ad.f0
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h5.l(i, this.f770e);
        Object obj = this.f769d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ad.f0
    public final boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f770e;
    }
}
