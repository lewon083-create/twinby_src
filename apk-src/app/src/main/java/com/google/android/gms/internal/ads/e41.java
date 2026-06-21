package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e41 extends x31 implements ListIterator {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad.l f4833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(ad.l lVar) {
        super(lVar);
        this.f4833f = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ad.l lVar = this.f4833f;
        boolean zIsEmpty = lVar.isEmpty();
        a();
        ((ListIterator) this.f12005c).add(obj);
        ((m51) lVar.f830h).f7786f++;
        if (zIsEmpty) {
            lVar.g();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f12005c).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f12005c).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f12005c).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f12005c).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f12005c).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(ad.l lVar, int i) {
        super(lVar, ((List) lVar.f826d).listIterator(i));
        this.f4833f = lVar;
    }
}
