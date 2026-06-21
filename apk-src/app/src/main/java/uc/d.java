package uc;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sb.g f34445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Handler handler, sb.g gVar) {
        super(handler);
        this.f34445b = gVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f34445b.d(null);
    }
}
