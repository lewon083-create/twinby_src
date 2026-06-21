package xh;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f36129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f36133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36134h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36136k;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("initial_route", this.f36130d);
        bundle.putBoolean("handle_deeplinking", this.f36131e);
        bundle.putString("app_bundle_path", this.f36132f);
        bundle.putString("dart_entrypoint", this.f36127a);
        bundle.putString("dart_entrypoint_uri", this.f36128b);
        bundle.putStringArrayList("dart_entrypoint_args", this.f36129c != null ? new ArrayList<>(this.f36129c) : null);
        t0 t0Var = this.f36133g;
        if (t0Var != null) {
            HashSet hashSet = (HashSet) t0Var.f27180c;
            bundle.putStringArray("initialization_args", (String[]) hashSet.toArray(new String[hashSet.size()]));
        }
        int i = this.f36134h;
        bundle.putString("flutterview_render_mode", i != 0 ? pe.a.u(i) : "surface");
        int i10 = this.i;
        bundle.putString("flutterview_transparency_mode", i10 != 0 ? pe.a.v(i10) : "transparent");
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f36135j);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f36136k);
        return bundle;
    }
}
