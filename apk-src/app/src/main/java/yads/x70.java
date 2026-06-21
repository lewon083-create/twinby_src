package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gq1 f44612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hr1 f44613c;

    public x70(Context context, gq1 gq1Var, hr1 hr1Var) {
        this.f44611a = context;
        this.f44612b = gq1Var;
        this.f44613c = hr1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r18, yads.b50 r19) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.x70.a(java.util.List, yads.b50):void");
    }

    public final x80 a(Boolean bool) {
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            return new x80(this.f44611a.getString(R$string.debug_panel_yes), 0, null, 0, 14);
        }
        if (Intrinsics.a(bool, Boolean.FALSE)) {
            return new x80(this.f44611a.getString(R$string.debug_panel_no), 0, null, 0, 14);
        }
        if (bool == null) {
            return new x80(this.f44611a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14);
        }
        throw new ij.j();
    }
}
