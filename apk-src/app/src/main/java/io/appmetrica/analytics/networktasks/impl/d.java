package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f25296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25297b;

    public d(NetworkTask networkTask) {
        this.f25296a = networkTask;
        this.f25297b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f25297b.equals(((d) obj).f25297b);
    }

    public final int hashCode() {
        return this.f25297b.hashCode();
    }
}
