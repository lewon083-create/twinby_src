package k3;

import ad.b1;
import android.content.Context;
import i4.q;
import java.util.HashMap;
import zc.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f26845c;

    public /* synthetic */ c(Context context, int i) {
        this.f26844b = i;
        this.f26845c = context;
    }

    @Override // zc.p
    public final Object get() {
        m4.h hVar;
        switch (this.f26844b) {
            case 0:
                return f.n(this.f26845c);
            case 1:
                return new s3.g(this.f26845c);
            case 2:
                return new q(new l6.i(this.f26845c, 19), new q4.i());
            case 3:
                return new l4.p(this.f26845c);
            default:
                Context context = this.f26845c;
                b1 b1Var = m4.h.f28638p;
                synchronized (m4.h.class) {
                    try {
                        if (m4.h.f28644v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            m4.h.f28644v = new m4.h(applicationContext, map);
                        }
                        hVar = m4.h.f28644v;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return hVar;
        }
    }
}
