package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f11704c = xa.f12090a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11705a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11706b = false;

    public final synchronized void a(long j10, String str) {
        if (this.f11706b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f11705a.add(new va(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f11706b = true;
        ArrayList<va> arrayList = this.f11705a;
        long j10 = arrayList.size() == 0 ? 0L : ((va) arrayList.get(arrayList.size() - 1)).f11319c - ((va) arrayList.get(0)).f11319c;
        if (j10 > 0) {
            long j11 = ((va) arrayList.get(0)).f11319c;
            xa.b("(%-4d ms) %s", Long.valueOf(j10), str);
            for (va vaVar : arrayList) {
                long j12 = vaVar.f11319c;
                xa.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(vaVar.f11318b), vaVar.f11317a);
                j11 = j12;
            }
        }
    }

    public final void finalize() {
        if (this.f11706b) {
            return;
        }
        b("Request on the loose");
        xa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
