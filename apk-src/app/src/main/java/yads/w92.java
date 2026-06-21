package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa2 f44311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zo2 f44312c = yo2.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gw2 f44313d = fw2.a();

    public w92(Context context) {
        this.f44310a = context.getApplicationContext();
        this.f44311b = ba2.a(context);
    }

    public final void a(y92 y92Var) {
        pt2 pt2VarA = this.f44313d.a(this.f44310a);
        String str = pt2VarA != null ? pt2VarA.Q : null;
        String strC = ((vg1) this.f44311b.f36669a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || str.equals(strC)) {
            y92Var.a();
            return;
        }
        v92 v92Var = new v92(this, str, y92Var);
        k43 k43Var = new k43(str, v92Var, v92Var);
        k43Var.f42672q = "om_sdk_js_request_tag";
        zo2 zo2Var = this.f44312c;
        Context context = this.f44310a;
        synchronized (zo2Var) {
            u82.a(context).a(k43Var);
        }
    }
}
