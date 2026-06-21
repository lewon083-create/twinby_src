package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g51 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Iterator f5662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5663g;

    public g51() {
        super(0);
        this.f5660d = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        g31 g31Var;
        Object next;
        Set set;
        ix.k0(this.f5660d != 4);
        int i = this.f5660d;
        int i10 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f5660d = 4;
            switch (this.f5661e) {
                case 0:
                    do {
                        Iterator it = this.f5662f;
                        if (!it.hasNext()) {
                            this.f5660d = 3;
                            next = null;
                        } else {
                            g31Var = (g31) this.f5663g;
                            next = it.next();
                        }
                        break;
                    } while (!g31Var.a(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f5662f;
                        if (!it2.hasNext()) {
                            this.f5660d = 3;
                            next = null;
                        } else {
                            set = (Set) this.f5663g;
                            next = it2.next();
                        }
                        break;
                    } while (!set.contains(next));
                    break;
            }
            this.f5659c = next;
            if (this.f5660d != 3) {
                this.f5660d = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d61, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5660d = 2;
        Object obj = this.f5659c;
        this.f5659c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g51(z51 z51Var, Set set, Set set2) {
        this();
        this.f5661e = 1;
        this.f5663g = set2;
        this.f5662f = set.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g51(Iterator it, g31 g31Var) {
        this();
        this.f5661e = 0;
        this.f5662f = it;
        this.f5663g = g31Var;
    }
}
