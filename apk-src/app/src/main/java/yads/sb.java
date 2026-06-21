package yads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sb implements ua3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gm0 f42874a = new gm0();

    @Override // yads.ua3
    public final String a(Context context, d4 d4Var, rx2 rx2Var) {
        return this.f42874a.a(context, new zu0(wu0.a(context, d4Var, rx2Var)).toString());
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
        return ta3.f43253b;
    }
}
