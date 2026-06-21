package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 extends h71 {
    public Task i;

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        Task task = this.i;
        return task == null ? "" : task.toString();
    }
}
