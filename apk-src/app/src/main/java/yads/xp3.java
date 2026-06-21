package yads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xp3 {
    public static final ep2 a(Context context, int i) {
        fs2 fs2VarA = es2.a();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory sSLSocketFactoryA = fs2VarA.a(applicationContext);
        m82.a(applicationContext);
        ep2 ep2Var = new ep2(new c92(), new xo(new b21(new st1(sSLSocketFactoryA, new em2(), new i82(), new a21(), new f21()), ne.a()), new gr()), i);
        ep2Var.a();
        return ep2Var;
    }
}
