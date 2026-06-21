package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn1 f11858e;

    public wm1(bn1 bn1Var) {
        super(1);
        this.f11858e = bn1Var;
        this.f11856c = 0;
        this.f11857d = bn1Var.n();
    }

    @Override // com.google.android.gms.internal.ads.d61
    public final byte a() {
        int i = this.f11856c;
        if (i >= this.f11857d) {
            throw new NoSuchElementException();
        }
        this.f11856c = i + 1;
        return this.f11858e.g(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11856c < this.f11857d;
    }
}
