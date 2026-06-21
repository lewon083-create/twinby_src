package xh;

import android.os.Bundle;
import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36138b = SentryThread.JsonKeys.MAIN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36139c = "/";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36140d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36141e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36142f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36143g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36144h = false;

    public j(String str) {
        this.f36137a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_group_id", this.f36137a);
        bundle.putString("dart_entrypoint", this.f36138b);
        bundle.putString("initial_route", this.f36139c);
        bundle.putBoolean("handle_deeplinking", this.f36140d);
        int i = this.f36141e;
        bundle.putString("flutterview_render_mode", i != 0 ? pe.a.u(i) : "surface");
        int i10 = this.f36142f;
        bundle.putString("flutterview_transparency_mode", i10 != 0 ? pe.a.v(i10) : "transparent");
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f36143g);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f36144h);
        return bundle;
    }
}
