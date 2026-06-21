package pl;

import java.io.File;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31524a = 0;

    static {
        char c8 = File.separatorChar;
        ql.a aVar = new ql.a();
        PrintWriter printWriter = new PrintWriter(aVar);
        try {
            printWriter.println();
            aVar.toString();
            printWriter.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    printWriter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
