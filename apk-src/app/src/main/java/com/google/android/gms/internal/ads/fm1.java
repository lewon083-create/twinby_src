package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fm1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f5391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f5392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f5393f;

    public fm1(hm1 hm1Var) {
        this.f5389b = 0;
        Objects.requireNonNull(hm1Var);
        this.f5393f = hm1Var;
        this.f5391d = (gm1) hm1Var.f6191f.i;
        this.f5392e = null;
        this.f5390c = hm1Var.f6190e;
    }

    public gm1 a() {
        gm1 gm1Var = (gm1) this.f5391d;
        oe.j jVar = (oe.j) this.f5393f;
        if (gm1Var == jVar.f30661f) {
            throw new NoSuchElementException();
        }
        if (jVar.f30660e != this.f5390c) {
            throw new ConcurrentModificationException();
        }
        this.f5391d = (gm1) gm1Var.i;
        this.f5392e = gm1Var;
        return gm1Var;
    }

    public gm1 b() {
        hm1 hm1Var = (hm1) this.f5393f;
        gm1 gm1Var = (gm1) this.f5391d;
        if (gm1Var == hm1Var.f6191f) {
            throw new NoSuchElementException();
        }
        if (hm1Var.f6190e != this.f5390c) {
            throw new ConcurrentModificationException();
        }
        this.f5391d = (gm1) gm1Var.i;
        this.f5392e = gm1Var;
        return gm1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5389b) {
            case 0:
                if (((gm1) this.f5391d) != ((hm1) this.f5393f).f6191f) {
                }
                break;
            default:
                if (((gm1) this.f5391d) != ((oe.j) this.f5393f).f30661f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f5389b) {
            case 0:
                return b();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5389b) {
            case 0:
                gm1 gm1Var = (gm1) this.f5392e;
                if (gm1Var == null) {
                    throw new IllegalStateException();
                }
                hm1 hm1Var = (hm1) this.f5393f;
                hm1Var.b(gm1Var, true);
                this.f5392e = null;
                this.f5390c = hm1Var.f6190e;
                return;
            default:
                oe.j jVar = (oe.j) this.f5393f;
                gm1 gm1Var2 = (gm1) this.f5392e;
                if (gm1Var2 == null) {
                    throw new IllegalStateException();
                }
                jVar.c(gm1Var2, true);
                this.f5392e = null;
                this.f5390c = jVar.f30660e;
                return;
        }
    }

    public fm1(oe.j jVar) {
        this.f5389b = 1;
        this.f5393f = jVar;
        this.f5391d = (gm1) jVar.f30661f.i;
        this.f5392e = null;
        this.f5390c = jVar.f30660e;
    }
}
