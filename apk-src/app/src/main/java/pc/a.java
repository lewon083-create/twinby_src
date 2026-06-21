package pc;

import android.os.Handler;
import android.os.Message;
import y8.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw e.a(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw e.a(message.obj);
    }
}
