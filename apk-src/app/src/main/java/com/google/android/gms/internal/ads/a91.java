package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a91 extends h81 {
    public ed.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f2819j;

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        o(this.i);
        ScheduledFuture scheduledFuture = this.f2819j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.f2819j = null;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        ed.d dVar = this.i;
        ScheduledFuture scheduledFuture = this.f2819j;
        if (dVar == null) {
            return null;
        }
        String string = dVar.toString();
        String strG = t.z.g(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strG;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strG;
        }
        int length = strG.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb2.append(strG);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
