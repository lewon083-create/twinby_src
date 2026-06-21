package s3;

import android.os.Build;
import com.google.android.gms.internal.measurement.j4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface l extends j3.j0 {
    public static final int Z1;

    static {
        String str = m3.z.f28608a;
        String strX = j4.x(Build.DEVICE);
        Z1 = (strX.contains("emulator") || strX.contains("emu64a") || strX.contains("emu64x") || strX.contains("generic")) ? 30000 : 10000;
    }
}
