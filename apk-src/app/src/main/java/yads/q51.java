package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q51 extends r51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f42190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f42191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r51 f42192f;

    public q51(r51 r51Var, int i, int i10) {
        this.f42192f = r51Var;
        this.f42190d = i;
        this.f42191e = i10;
    }

    @Override // yads.r51, java.util.List
    /* JADX INFO: renamed from: a */
    public final r51 subList(int i, int i10) {
        pg2.a(i, i10, this.f42191e);
        r51 r51Var = this.f42192f;
        int i11 = this.f42190d;
        return r51Var.subList(i + i11, i10 + i11);
    }

    @Override // yads.l51
    public final Object[] b() {
        return this.f42192f.b();
    }

    @Override // yads.l51
    public final int c() {
        return this.f42192f.d() + this.f42190d + this.f42191e;
    }

    @Override // yads.l51
    public final int d() {
        return this.f42192f.d() + this.f42190d;
    }

    @Override // yads.l51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pg2.a(i, this.f42191e);
        return this.f42192f.get(i + this.f42190d);
    }

    @Override // yads.r51, yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.r51, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42191e;
    }

    @Override // yads.r51, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
