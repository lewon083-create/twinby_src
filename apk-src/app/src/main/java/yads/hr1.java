package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39296a;

    public hr1(Context context) {
        this.f39296a = context;
    }

    public final String a(fr1 fr1Var) {
        int i = fr1Var == null ? -1 : gr1.f38859a[fr1Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.f39296a.getString(R$string.debug_panel_invalid_mediation_adapter_version);
        }
        throw new ij.j();
    }
}
