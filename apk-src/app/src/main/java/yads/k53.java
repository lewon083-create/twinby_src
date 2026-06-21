package yads;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f40078a;

    public final void a() {
        this.f40078a = null;
        ArrayList arrayList = l53.f40426b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f40078a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
