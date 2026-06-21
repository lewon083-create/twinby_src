package yads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ym2 extends r51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f45115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f45116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f45117f;

    public ym2(Object[] objArr, int i, int i10) {
        this.f45115d = objArr;
        this.f45116e = i;
        this.f45117f = i10;
    }

    @Override // yads.l51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pg2.a(i, this.f45117f);
        Object obj = this.f45115d[(i * 2) + this.f45116e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45117f;
    }
}
