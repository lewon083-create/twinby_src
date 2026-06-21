package ii;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21305c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f21303a = i;
        this.f21305c = obj;
        this.f21304b = obj2;
    }

    @Override // ii.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f21303a) {
            case 0:
                s7.g gVar = (s7.g) this.f21305c;
                try {
                    ((c) this.f21304b).i(((m) gVar.f32797d).decodeMessage(byteBuffer));
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) gVar.f32796c), "Failed to handle message reply", e3);
                    return;
                }
                break;
            default:
                q qVar = (q) this.f21305c;
                p pVar = (p) this.f21304b;
                try {
                    if (byteBuffer == null) {
                        pVar.a();
                    } else {
                        try {
                            pVar.success(qVar.f21319c.e(byteBuffer));
                        } catch (j e7) {
                            pVar.b(e7.f21311b, e7.getMessage(), e7.f21312c);
                        }
                    }
                } catch (RuntimeException e10) {
                    Log.e("MethodChannel#" + qVar.f21318b, "Failed to handle method call result", e10);
                    return;
                }
                break;
        }
    }
}
