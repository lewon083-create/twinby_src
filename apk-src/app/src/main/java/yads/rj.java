package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rj extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f42610a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(tj tjVar, Looper looper) {
        super(looper);
        this.f42610a = tjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f42610a.a(message);
    }
}
