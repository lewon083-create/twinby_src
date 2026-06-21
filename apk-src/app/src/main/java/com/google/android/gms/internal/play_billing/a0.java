package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient c0 f14131d;

    public a0(c0 c0Var) {
        this.f14131d = c0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14131d.contains(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final boolean g() {
        return this.f14131d.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        c0 c0Var = this.f14131d;
        d3.h(i, c0Var.size());
        return c0Var.get((c0Var.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.play_billing.c0, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f14131d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.c0, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f14131d.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.c0
    public final c0 o() {
        return this.f14131d;
    }

    @Override // com.google.android.gms.internal.play_billing.c0, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final c0 subList(int i, int i10) {
        c0 c0Var = this.f14131d;
        d3.y(i, i10, c0Var.size());
        return c0Var.subList(c0Var.size() - i10, c0Var.size() - i).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14131d.size();
    }
}
