package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fd2 implements za3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n83 f38418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i83 f38419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zo2 f38420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be0 f38421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f38422e;

    public /* synthetic */ fd2(Context context, d4 d4Var, nu2 nu2Var, n83 n83Var) {
        this(context, n83Var, new i83(context, d4Var, nu2Var), yo2.a(), new be0());
    }

    @Override // yads.za3
    public final void a(String str, Map map) {
        dd2 dd2Var = new dd2(this.f38422e, this.f38421d.a(str, map), new ed2(str, fw2.a().a(this.f38422e), this.f38419b, this.f38418a));
        zo2 zo2Var = this.f38420c;
        Context context = this.f38422e;
        synchronized (zo2Var) {
            u82.a(context).a(dd2Var);
        }
    }

    public fd2(Context context, n83 n83Var, i83 i83Var, zo2 zo2Var, be0 be0Var) {
        this.f38418a = n83Var;
        this.f38419b = i83Var;
        this.f38420c = zo2Var;
        this.f38421d = be0Var;
        this.f38422e = context.getApplicationContext();
    }
}
