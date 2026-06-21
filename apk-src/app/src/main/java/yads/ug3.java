package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip3 f43659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg3 f43660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f43661d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ug3(Context context, d4 d4Var, nu2 nu2Var, ig3 ig3Var, uc3 uc3Var) {
        Context applicationContext = context.getApplicationContext();
        this(applicationContext, new ip3(applicationContext, d4Var, nu2Var, uc3Var, ig3Var), new sg3());
    }

    public ug3(Context context, ip3 ip3Var, sg3 sg3Var) {
        this.f43658a = context;
        this.f43659b = ip3Var;
        this.f43660c = sg3Var;
        this.f43661d = new ArrayList();
    }
}
