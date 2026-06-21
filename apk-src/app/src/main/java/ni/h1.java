package ni;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h1 implements Runnable {
    public static void a(String str, Throwable th2) {
        String string;
        if (th2 instanceof p) {
            p pVar = (p) th2;
            StringBuilder sb2 = new StringBuilder();
            l7.o.t(sb2, pVar.f29468b, ": Error returned from calling ", str, ": ");
            sb2.append(pVar.f29469c);
            sb2.append(" Details: ");
            sb2.append(pVar.f29470d);
            string = sb2.toString();
        } else {
            string = th2.getClass().getSimpleName() + ": Error returned from calling " + str + ": " + th2.getMessage();
        }
        Log.e("ProxyApiRegistrar", string);
    }
}
