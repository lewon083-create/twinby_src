package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w20 f10671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10672c;

    public /* synthetic */ to(w20 w20Var, String str, int i) {
        this.f10670a = i;
        this.f10671b = w20Var;
        this.f10672c = str;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        int i = this.f10670a;
        String str = this.f10672c;
        w20 w20Var = this.f10671b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                po poVar = uo.f11011a;
                return (((Boolean) q9.s.f31967e.f31970c.a(al.f3111mb)).booleanValue() && w20Var != null && w20.b(str)) ? w20Var.a(str2, q9.r.f31959g.f31964e) : vv.d(str2);
            default:
                ((gx) w20Var.f11600e).a(new v20(w20Var, (Throwable) obj, 1));
                return vv.d(str);
        }
    }
}
