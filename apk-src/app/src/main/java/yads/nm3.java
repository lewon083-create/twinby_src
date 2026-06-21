package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nm3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f41295c = om3.f41652a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41296a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41297b = false;

    public final synchronized void a(String str, long j10) {
        if (this.f41297b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f41296a.add(new mm3(str, j10, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.f41297b) {
            return;
        }
        a();
    }

    public final synchronized void a() {
        long j10;
        this.f41297b = true;
        if (this.f41296a.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((mm3) this.f41296a.get(0)).f40968a;
            ArrayList arrayList = this.f41296a;
            j10 = ((mm3) arrayList.get(arrayList.size() - 1)).f40968a - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((mm3) this.f41296a.get(0)).f40968a;
        Iterator it = this.f41296a.iterator();
        while (it.hasNext()) {
            long j13 = ((mm3) it.next()).f40968a;
        }
    }
}
