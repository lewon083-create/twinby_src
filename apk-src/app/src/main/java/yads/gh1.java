package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh1 f38760a = new bh1();

    public final Location a(List list) {
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f38760a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j10 = bh1.f37026a;
                boolean z5 = time > j10;
                boolean z10 = time < (-j10);
                boolean z11 = time > 0;
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                boolean z12 = accuracy > 0;
                boolean z13 = accuracy < 0;
                boolean z14 = ((long) accuracy) > 200;
                boolean zA = Intrinsics.a(location2.getProvider(), location.getProvider());
                if (!z5 && (z10 || (!z13 && ((!z11 || z12) && (!z11 || z14 || !zA))))) {
                }
            }
            location = location2;
        }
        return location;
    }
}
