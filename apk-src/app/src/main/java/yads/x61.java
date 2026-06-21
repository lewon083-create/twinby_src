package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44609a;

    public x61(Context context) {
        this.f44609a = context;
    }

    public final File a() {
        File file = new File(this.f44609a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
