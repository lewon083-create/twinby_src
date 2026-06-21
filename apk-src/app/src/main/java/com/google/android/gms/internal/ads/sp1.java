package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sp1 extends pp1 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f10375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp1(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10375c = delegate;
    }

    @Override // com.google.android.gms.internal.ads.pp1, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f9150b.contains((Map.Entry) obj);
    }

    @Override // com.google.android.gms.internal.ads.pp1, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new rp1(this.f10375c.iterator());
    }
}
