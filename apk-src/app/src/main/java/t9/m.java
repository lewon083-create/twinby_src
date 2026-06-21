package t9;

import android.content.Context;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.qa;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.ua;
import com.google.android.gms.internal.ads.ut;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ut {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f33633f;

    public m(Context context, c6 c6Var) {
        super(c6Var);
        this.f33633f = context;
    }

    public static sa w(Context context) {
        sa saVar = new sa(new cb(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new m(context, new c6(20)));
        saVar.a();
        return saVar;
    }

    @Override // com.google.android.gms.internal.ads.ut, com.google.android.gms.internal.ads.la
    public final oa a(qa qaVar) throws ua {
        int i = qaVar.f9373c;
        String str = qaVar.f9374d;
        if (i == 0) {
            if (Pattern.matches((String) q9.s.f31967e.f31970c.a(al.f3030h5), str)) {
                u9.d dVar = q9.r.f31959g.f31960a;
                ma.g gVar = ma.g.f28775b;
                Context context = this.f33633f;
                if (gVar.c(context, 13400000) == 0) {
                    oa oaVarA = new ma.k(context, 1).a(qaVar);
                    if (oaVarA != null) {
                        c0.m("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return oaVarA;
                    }
                    c0.m("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.a(qaVar);
    }
}
