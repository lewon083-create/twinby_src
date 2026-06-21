package yads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp3 f40304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40305b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vo2 f40306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40307d;

    public kp3(fp3 fp3Var) {
        this.f40304a = fp3Var;
    }

    public final void a(Context context, List list, vo2 vo2Var, Object obj) {
        if (list.isEmpty()) {
            vo2Var.onSuccess(this.f40305b);
            return;
        }
        this.f40306c = vo2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xd3 xd3Var = (xd3) it.next();
            this.f40307d++;
            fp3 fp3Var = this.f40304a;
            jp3 jp3Var = new jp3(this);
            fp3Var.getClass();
            gp3 gp3Var = new gp3(jp3Var, new hp3(context, xd3Var));
            se3 se3Var = fp3Var.f38528e;
            nu2 nu2Var = fp3Var.f38525b;
            d4 d4Var = fp3Var.f38524a;
            uc3 uc3Var = fp3Var.f38526c;
            ig3 ig3Var = fp3Var.f38527d;
            se3Var.getClass();
            cd3 cd3Var = new cd3();
            String string = xd3Var.i;
            if (string == null) {
                string = "";
            }
            Uri uri = Uri.parse(string);
            if (CollectionsKt.x((List) ba1.f36975a.getValue(), uri.getHost())) {
                string = ol2.a(uri, new bd3(cd3Var, uc3Var, d4Var, context)).toString();
            }
            String str = string;
            pp3 pp3Var = new pp3(ig3Var);
            tm3 tm3Var = new tm3(gp3Var);
            ct1 ct1VarA = ((lu3) nu2Var).a();
            hy2.f39374a.getClass();
            hy2 hy2VarA = gy2.a(context);
            gd3 gd3Var = new gd3(context, d4Var, ct1VarA, str, tm3Var, xd3Var, pp3Var, hy2VarA, new dy2(hy2VarA), new lc3(context, ct1VarA));
            gd3Var.f42672q = obj;
            se3Var.f42922a.a(gd3Var);
        }
    }
}
