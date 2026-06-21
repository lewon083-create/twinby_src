package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f5223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Collection f5224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Map f5225d;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        Map map = this.f5225d;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f5225d = mapB;
        return mapB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f41) {
            return d().equals(((f41) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
