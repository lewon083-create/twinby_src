package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f13226b;

    public h(Context context, w wVar) {
        this.f13225a = context;
        this.f13226b = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f13225a.equals(hVar.f13225a) && this.f13226b.equals(hVar.f13226b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13225a.hashCode() ^ 1000003) * 1000003) ^ this.f13226b.hashCode();
    }

    public final String toString() {
        return t.z.f("FlagsContext{context=", this.f13225a.toString(), ", hermeticFileOverrides=", this.f13226b.toString(), "}");
    }
}
