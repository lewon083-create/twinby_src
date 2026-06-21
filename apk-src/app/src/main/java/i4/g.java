package i4;

import com.google.android.gms.internal.measurement.h5;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends IOException {
    public g(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    public g(int i, long j10, long j11) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                h5.r((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j10 + ", End time: " + j11;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
