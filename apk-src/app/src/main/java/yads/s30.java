package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s30 {
    public static void a(p30 p30Var) {
        if (p30Var != null) {
            try {
                p30Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
