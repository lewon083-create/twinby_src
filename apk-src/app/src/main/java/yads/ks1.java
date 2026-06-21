package yads;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ks1 {
    public static long a(Context context, long j10, long j11) {
        long availableBlocks;
        if (j10 > j11) {
            j10 = j11;
        }
        try {
            StatFs statFs = new StatFs(vg0.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException unused) {
            availableBlocks = j10;
        }
        long j12 = 100;
        long j13 = (((long) 2) * availableBlocks) / j12;
        long j14 = (availableBlocks * ((long) 50)) / j12;
        if (j10 > j14) {
            j10 = j14;
        }
        if (j13 <= j11) {
            j11 = j13;
        }
        return j11 < j10 ? j10 : j11;
    }
}
