package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5899c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterable f5900d;

    public /* synthetic */ gs1(Iterable iterable, int i) {
        this.f5898b = i;
        this.f5900d = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5898b) {
            case 0:
                int i = this.f5899c;
                hs1 hs1Var = (hs1) this.f5900d;
                return i < hs1Var.f6239b.size() || hs1Var.f6240c.hasNext();
            default:
                return this.f5899c < ((vl.b) this.f5900d).f34909b;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5898b) {
            case 0:
                int i = this.f5899c;
                hs1 hs1Var = (hs1) this.f5900d;
                List list = hs1Var.f6239b;
                if (i >= list.size()) {
                    list.add(hs1Var.f6240c.next());
                    return next();
                }
                int i10 = this.f5899c;
                this.f5899c = i10 + 1;
                return list.get(i10);
            default:
                vl.b bVar = (vl.b) this.f5900d;
                String[] strArr = bVar.f34910c;
                int i11 = this.f5899c;
                vl.a aVar = new vl.a(strArr[i11], bVar.f34911d[i11], bVar);
                this.f5899c++;
                return aVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5898b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                vl.b bVar = (vl.b) this.f5900d;
                int i = this.f5899c;
                int i10 = i - 1;
                this.f5899c = i10;
                int i11 = bVar.f34909b;
                if (i10 >= i11) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    String[] strArr = bVar.f34910c;
                    System.arraycopy(strArr, i, strArr, i10, i12);
                    String[] strArr2 = bVar.f34911d;
                    System.arraycopy(strArr2, i, strArr2, i10, i12);
                }
                int i13 = bVar.f34909b - 1;
                bVar.f34909b = i13;
                bVar.f34910c[i13] = null;
                bVar.f34911d[i13] = null;
                return;
        }
    }
}
