package yads;

import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class og3 implements bk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd3 f41536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj3 f41537b;

    public og3(xd3 xd3Var, zj3 zj3Var) {
        this.f41536a = xd3Var;
        this.f41537b = zj3Var;
    }

    @Override // yads.bk3
    public final void a() {
    }

    @Override // yads.bk3
    public final void h() {
        this.f41537b.a(this.f41536a, "render_impression");
    }

    @Override // yads.bk3
    public final void i() {
        this.f41537b.a(new ie3(this.f41536a), "renderingStart");
    }

    @Override // yads.bk3
    public final void n() {
        this.f41537b.a(this.f41536a, "impression");
    }

    @Override // yads.bk3
    public final void a(float f10) {
    }

    @Override // yads.bk3
    public final void a(float f10, long j10) {
    }

    @Override // yads.bk3
    public final void a(View view, List list) {
    }

    @Override // yads.bk3
    public final void a(ak3 ak3Var) {
    }

    @Override // yads.bk3
    public final void a(mf3 mf3Var) {
        int i;
        switch (mf3Var.f40908a.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i = 405;
                break;
            case 7:
                i = 402;
                break;
            case 8:
            case 12:
            case 28:
                i = VKApiCodes.CODE_MSG_SEND_RECIPIENT_BLACKLISTED;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i = 400;
                break;
            case 19:
                i = 401;
                break;
            case 23:
                i = 403;
                break;
            case 29:
            case 31:
                i = VKApiCodes.CODE_MSG_SEND_RECIPIENT_FORBID_GROUPS_MSGS;
                break;
            case 30:
                i = VKApiCodes.CODE_MSG_SEND_VIOLATION_OF_PRIVACY_SETTINGS;
                break;
            default:
                throw new ij.j();
        }
        Map mapC = kotlin.collections.i0.c(new Pair("[ERRORCODE]", String.valueOf(i)));
        zj3 zj3Var = this.f41537b;
        xd3 xd3Var = this.f41536a;
        zj3Var.getClass();
        List list = (List) xd3Var.a().get("error");
        if (list != null) {
            zj3Var.f45442a.a(list, mapC);
        }
    }

    @Override // yads.bk3
    public final void b() {
    }

    @Override // yads.bk3
    public final void c() {
    }

    @Override // yads.bk3
    public final void d() {
    }

    @Override // yads.bk3
    public final void f() {
    }

    @Override // yads.bk3
    public final void g() {
    }

    @Override // yads.bk3
    public final void j() {
    }

    @Override // yads.bk3
    public final void k() {
    }

    @Override // yads.bk3
    public final void l() {
    }

    @Override // yads.bk3
    public final void m() {
    }
}
