package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vb2 implements ua3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq1 f43986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm0 f43987b = new gm0();

    public vb2(jq1 jq1Var) {
        this.f43986a = jq1Var;
    }

    @Override // yads.ua3
    public final String a(Context context, d4 d4Var, rx2 rx2Var) {
        Map map = this.f43986a.f39931c;
        vu0 vu0VarA = wu0.a(context, d4Var, rx2Var);
        if (map != null) {
            vu0VarA.i.putAll(map);
        }
        return this.f43987b.a(context, new zu0(vu0VarA).toString());
    }

    @Override // yads.ua3
    public final String a(d4 d4Var) {
        String str = d4Var.f37614b.f42414a.f40249e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // yads.ua3
    public final ta3 a() {
        return ta3.f43254c;
    }
}
