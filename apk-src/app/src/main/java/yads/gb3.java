package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb3 f38696a;

    public gb3() {
        this(new fb3());
    }

    public final boolean a(Context context, String str) {
        try {
            this.f38696a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public gb3(fb3 fb3Var) {
        this.f38696a = fb3Var;
    }
}
