package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10485a;

    public t4(ArrayList arrayList) {
        this.f10485a = arrayList;
        boolean z5 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((s4) arrayList.get(0)).f10171b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((s4) arrayList.get(i)).f10170a < j10) {
                    z5 = true;
                    break;
                } else {
                    j10 = ((s4) arrayList.get(i)).f10171b;
                    i++;
                }
            }
        }
        ix.o(!z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t4.class != obj.getClass()) {
            return false;
        }
        return this.f10485a.equals(((t4) obj).f10485a);
    }

    public final int hashCode() {
        return this.f10485a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f10485a.toString());
    }
}
