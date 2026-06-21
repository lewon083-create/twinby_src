package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i51 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i51 f6381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i51[] f6382c;

    static {
        i51 i51Var = new i51("INSTANCE", 0);
        f6381b = i51Var;
        f6382c = new i51[]{i51Var};
    }

    public static i51[] values() {
        return (i51[]) f6382c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ix.l0("no calls to next() since the last call to remove()", false);
    }
}
