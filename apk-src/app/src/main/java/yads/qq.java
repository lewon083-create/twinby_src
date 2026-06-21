package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu3 f42369a;

    public qq(mu3 mu3Var) {
        this.f42369a = mu3Var;
    }

    public final Intent a(Context context, String str, long j10) {
        this.f42369a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j10);
        return intent;
    }
}
