package f5;

import com.google.android.gms.internal.measurement.h5;
import j3.a0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16660a;

    public b(ArrayList arrayList) {
        this.f16660a = arrayList;
        boolean z5 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f16658b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i)).f16657a < j10) {
                    z5 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i)).f16658b;
                    i++;
                }
            }
        }
        h5.h(!z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f16660a.equals(((b) obj).f16660a);
    }

    public final int hashCode() {
        return this.f16660a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f16660a;
    }
}
