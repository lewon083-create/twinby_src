package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f9573b;

    public qp1(Iterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9573b = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9573b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f9573b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
