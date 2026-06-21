package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Comparable, Serializable {
    public abstract int a(v vVar);

    public abstract void b(StringBuilder sb2);

    public abstract void c(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            try {
                if (a((v) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
