package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vo1 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wo1 f11433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d61 f11434d;

    public vo1(xo1 xo1Var) {
        super(1);
        this.f11433c = new wo1(xo1Var);
        this.f11434d = b();
    }

    @Override // com.google.android.gms.internal.ads.d61
    public final byte a() {
        d61 d61Var = this.f11434d;
        if (d61Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = d61Var.a();
        if (!this.f11434d.hasNext()) {
            this.f11434d = b();
        }
        return bA;
    }

    public final wm1 b() {
        wo1 wo1Var = this.f11433c;
        if (wo1Var.hasNext()) {
            return new wm1(wo1Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11434d != null;
    }
}
