package v3;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.e f34729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.a f34730c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w3.c f34734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34735h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34736j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f34733f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f34732e = z.o(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.b f34731d = new a5.b(1);

    public l(w3.c cVar, m7.a aVar, bb.e eVar) {
        this.f34734g = cVar;
        this.f34730c = aVar;
        this.f34729b = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f34736j) {
            if (message.what != 1) {
                return false;
            }
            j jVar = (j) message.obj;
            long j10 = jVar.f34722a;
            long j11 = jVar.f34723b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f34733f;
            Long l10 = (Long) treeMap.get(lValueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
