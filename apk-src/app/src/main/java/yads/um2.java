package yads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class um2 extends r51 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final um2 f43723f = new um2(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f43724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f43725e;

    public um2(int i, Object[] objArr) {
        this.f43724d = objArr;
        this.f43725e = i;
    }

    @Override // yads.r51, yads.l51
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.f43724d, 0, objArr, i, this.f43725e);
        return i + this.f43725e;
    }

    @Override // yads.l51
    public final Object[] b() {
        return this.f43724d;
    }

    @Override // yads.l51
    public final int c() {
        return this.f43725e;
    }

    @Override // yads.l51
    public final int d() {
        return 0;
    }

    @Override // yads.l51
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pg2.a(i, this.f43725e);
        Object obj = this.f43724d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43725e;
    }
}
