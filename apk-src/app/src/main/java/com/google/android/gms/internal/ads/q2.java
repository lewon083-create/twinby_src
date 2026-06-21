package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x41 f9293c;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public q2(Uri uri, x41 x41Var) {
        List list = Collections.EMPTY_LIST;
        this.f9291a = uri;
        ArrayList arrayList = ra.f9768a;
        this.f9292b = list;
        this.f9293c = x41Var;
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (x41Var.size() <= 0) {
            x41.x(0, objArr);
        } else {
            x41Var.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f9291a.equals(q2Var.f9291a) && this.f9292b.equals(q2Var.f9292b) && this.f9293c.equals(q2Var.f9293c);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.f9293c.hashCode() + a0.u.i(this.f9292b, this.f9291a.hashCode() * 923521, VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
