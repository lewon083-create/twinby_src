package g8;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20045d;

    public k(int i, long j10, long j11, boolean z5) {
        this.f20042a = i;
        this.f20043b = j10;
        this.f20044c = j11;
        this.f20045d = z5;
    }

    public static k a(Map map) {
        int i;
        int i10 = 5;
        if (map == null) {
            return new k(5, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        if (num == null) {
            i = i10;
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                i = 1;
            } else if (iIntValue != 1) {
                i = 3;
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        i10 = 4;
                    } else if (iIntValue == 5) {
                        i10 = 6;
                    }
                    i = i10;
                }
            } else {
                i = 2;
            }
        }
        return new k(i, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }
}
