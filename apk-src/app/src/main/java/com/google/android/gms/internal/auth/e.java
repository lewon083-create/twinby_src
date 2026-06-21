package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.n4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Handler handler, int i) {
        super(handler);
        this.f13194a = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        switch (this.f13194a) {
            case 0:
                f.f13199d.set(true);
                break;
            case 1:
                p.i.incrementAndGet();
                break;
            default:
                n4.i.incrementAndGet();
                break;
        }
    }
}
