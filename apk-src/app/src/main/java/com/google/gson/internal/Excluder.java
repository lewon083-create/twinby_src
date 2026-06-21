package com.google.gson.internal;

import com.google.android.gms.internal.ads.om1;
import com.google.gson.reflect.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.k;
import me.w;
import me.x;
import oe.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements x, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Excluder f14917d = new Excluder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14919c;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f14918b = list;
        this.f14919c = list;
    }

    @Override // me.x
    public final w a(k kVar, a aVar) {
        boolean z5;
        boolean z10;
        boolean zB = b(aVar.getRawType());
        if (zB) {
            z5 = true;
        } else {
            c(true);
            z5 = false;
        }
        if (zB) {
            z10 = true;
        } else {
            c(false);
            z10 = false;
        }
        if (z5 || z10) {
            return new e(this, z10, z5, kVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final void c(boolean z5) {
        Iterator it = (z5 ? this.f14918b : this.f14919c).iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }
}
