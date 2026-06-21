package gl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static int a(int i, int i10, int i11) throws IOException {
        if ((i10 & 8) != 0) {
            i--;
        }
        if (i11 <= i) {
            return i - i11;
        }
        throw new IOException(a0.u.j(i11, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
