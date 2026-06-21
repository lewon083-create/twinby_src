package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f11862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ym1 f11863c;

    public wo1(bn1 bn1Var) {
        if (!(bn1Var instanceof xo1)) {
            this.f11862b = null;
            this.f11863c = (ym1) bn1Var;
            return;
        }
        xo1 xo1Var = (xo1) bn1Var;
        ArrayDeque arrayDeque = new ArrayDeque(xo1Var.f12226h);
        this.f11862b = arrayDeque;
        arrayDeque.push(xo1Var);
        bn1 bn1Var2 = xo1Var.f12223e;
        while (bn1Var2 instanceof xo1) {
            xo1 xo1Var2 = (xo1) bn1Var2;
            this.f11862b.push(xo1Var2);
            bn1Var2 = xo1Var2.f12223e;
        }
        this.f11863c = (ym1) bn1Var2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ym1 next() {
        ym1 ym1Var;
        ym1 ym1Var2 = this.f11863c;
        if (ym1Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f11862b;
            ym1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            bn1 bn1Var = ((xo1) arrayDeque.pop()).f12224f;
            while (bn1Var instanceof xo1) {
                xo1 xo1Var = (xo1) bn1Var;
                arrayDeque.push(xo1Var);
                bn1Var = xo1Var.f12223e;
            }
            ym1Var = (ym1) bn1Var;
        } while (ym1Var.n() == 0);
        this.f11863c = ym1Var;
        return ym1Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11863c != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
