package fb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f16736f = new f(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f16737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16738e;

    public f(int i, Object[] objArr) {
        this.f16737d = objArr;
        this.f16738e = i;
    }

    @Override // fb.a
    public final Object[] a() {
        return this.f16737d;
    }

    @Override // fb.a
    public final int c() {
        return 0;
    }

    @Override // fb.a
    public final int e() {
        return this.f16738e;
    }

    @Override // fb.e, fb.a
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f16737d;
        int i = this.f16738e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j0.g.k0(i, this.f16738e);
        Object obj = this.f16737d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16738e;
    }
}
